package com.chunkmapper;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.chunkmapper.admin.FeedbackManager;
import com.chunkmapper.admin.MyLogger;


public abstract class Tasker {
	private final ExecutorService executorService;
	private LinkedBlockingQueue<Point> taskQueue = new LinkedBlockingQueue<Point>();
	protected final HashSet<Point> pointsAdded = new HashSet<Point>();

	public void shutdownNow() {
		executorService.shutdownNow();
		MyLogger.LOGGER.info("shut down " + this.getClass().toString());
	}
	public void blockingShutdownNow() {
		executorService.shutdownNow();
		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			MyLogger.LOGGER.info(MyLogger.printException(e));
		}
		MyLogger.LOGGER.info("shut down " + this.getClass().toString());
	}
	public synchronized void addTask(int regionx, int regionz) {
		Point p = new Point(regionx, regionz);
		if (!pointsAdded.contains(p)) {
			pointsAdded.add(p);
			taskQueue.add(p);
		}
	}
	protected Point getTask() throws InterruptedException {
		return taskQueue.take();
	}
	protected void addTask(Point p) throws InterruptedException {
		taskQueue.add(p);
	}


	public Tasker(int numThreads) {
		executorService = Executors.newFixedThreadPool(numThreads, new ThreadFactory() {
			@Override
			public Thread newThread(Runnable arg0) {
				Thread t = new Thread(arg0);
//				t.setPriority(Thread.MIN_PRIORITY);
				// TODO Auto-generated method stub
				return t;
			}

		});
		for (int i = 0; i < numThreads; i++) {
			executorService.execute(new Runnable() {
				public void run() {

					while(true) {
						Point task = null;
						try {
							task = getTask();
							doTask(task);
						} catch (InterruptedException e) {
							MyLogger.LOGGER.info(MyLogger.printException(e));
							return;
						} catch (UnknownHostException e) {
							ManagingThread.setNetworkProblems();
							MyLogger.LOGGER.warning(MyLogger.printException(e));
							try {
								Thread.sleep(1000);
								addTask(task);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								MyLogger.LOGGER.info(MyLogger.printException(e));
								return;
							}
						} catch (SocketException e) {
							ManagingThread.setNetworkProblems();
							MyLogger.LOGGER.warning(MyLogger.printException(e));
							try {
								Thread.sleep(1000);
								addTask(task);
							} catch (InterruptedException e1) {
								MyLogger.LOGGER.info(MyLogger.printException(e));
								return;
							}
						} catch (Exception e) {
							MyLogger.LOGGER.warning(MyLogger.printException(e));
							try {
								Thread.sleep(1000);
								addTask(task);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								MyLogger.LOGGER.info(MyLogger.printException(e));
								return;
							}

						} catch (Error e) {
							MyLogger.LOGGER.severe(MyLogger.printException(e));
						}
					}
				}
			});
		}
	}
	protected abstract void doTask(Point p) throws Exception;


}
