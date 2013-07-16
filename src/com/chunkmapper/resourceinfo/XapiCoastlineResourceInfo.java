package com.chunkmapper.resourceinfo;

import geocode.core;

import java.io.File;

import com.chunkmapper.Utila;


public class XapiCoastlineResourceInfo extends ResourceInfo {
	public static final String FORMAT_URL = "http://www.overpass-api.de/api/xapi?way[natural=coastline][bbox=%s,%s,%s,%s]";
	public static final File CACHE_DIRECTORY = new File(Utila.CACHE, "xapiboundaries");
	static {
		if (!CACHE_DIRECTORY.exists())
			CACHE_DIRECTORY.mkdirs();
	}

	public XapiCoastlineResourceInfo(int regionx, int regionz) {
		super(getAddress(regionx, regionz), CACHE_DIRECTORY, "f_" + regionx + "_" + regionz + ".xml", regionx, regionz);
		// TODO Auto-generated constructor stub
	}
	private static String getAddress(int regionx, int regionz) {
		final double REGION_WIDTH_IN_DEGREES = 512 / 3600.;
		double lon1 = regionx * REGION_WIDTH_IN_DEGREES;
		double lon2 = lon1 + REGION_WIDTH_IN_DEGREES;
		double lat2 = -regionz * REGION_WIDTH_IN_DEGREES;
		double lat1 = lat2 - REGION_WIDTH_IN_DEGREES;

		return String.format(FORMAT_URL, lon1, lat1, lon2, lat2);
	}


	public static void main(String[] args) {
		double[] latlon = core.placeToCoords("cape reinga");
		int regionx = (int) Math.floor(latlon[1] * 3600 / 512);
		int regionz = (int) Math.floor(latlon[0] * 3600 / -512);
		XapiCoastlineResourceInfo info = new XapiCoastlineResourceInfo(regionx, regionz);
		
		System.out.println(info.url);
	}
	/**
	 * @param args
	 */

}