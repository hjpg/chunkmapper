
package com.chunkmapper.mapper2;
public class MapColors {
	public static final int[][] colors = new int[256][4];
	public static final double[] brightness = new double[256];
	static {
		colors[0][0] = 255; colors[0][1] = 255; colors[0][2] = 255; colors[0][3] = 0;
		colors[1][0] = 128; colors[1][1] = 128; colors[1][2] = 128; colors[1][3] = 255;
		colors[2][0] = 102; colors[2][1] = 142; colors[2][2] = 62; colors[2][3] = 255;
		colors[3][0] = 134; colors[3][1] = 96; colors[3][2] = 67; colors[3][3] = 255;
		colors[4][0] = 115; colors[4][1] = 115; colors[4][2] = 115; colors[4][3] = 255;
		colors[5][0] = 157; colors[5][1] = 128; colors[5][2] = 79; colors[5][3] = 255;
		colors[6][0] = 120; colors[6][1] = 120; colors[6][2] = 120; colors[6][3] = 0;
		colors[7][0] = 84; colors[7][1] = 84; colors[7][2] = 84; colors[7][3] = 255;
		colors[8][0] = 38; colors[8][1] = 92; colors[8][2] = 225; colors[8][3] = 36;
		colors[9][0] = 38; colors[9][1] = 92; colors[9][2] = 225; colors[9][3] = 36;
		colors[10][0] = 255; colors[10][1] = 90; colors[10][2] = 0; colors[10][3] = 255;
		colors[11][0] = 255; colors[11][1] = 90; colors[11][2] = 0; colors[11][3] = 255;
		colors[12][0] = 220; colors[12][1] = 212; colors[12][2] = 160; colors[12][3] = 255;
		colors[13][0] = 136; colors[13][1] = 126; colors[13][2] = 126; colors[13][3] = 255;
		colors[14][0] = 143; colors[14][1] = 140; colors[14][2] = 125; colors[14][3] = 255;
		colors[15][0] = 136; colors[15][1] = 130; colors[15][2] = 127; colors[15][3] = 255;
		colors[16][0] = 115; colors[16][1] = 115; colors[16][2] = 115; colors[16][3] = 255;
		colors[17][0] = 102; colors[17][1] = 81; colors[17][2] = 51; colors[17][3] = 255;
		colors[18][0] = 54; colors[18][1] = 135; colors[18][2] = 40; colors[18][3] = 180;
		colors[20][0] = 255; colors[20][1] = 255; colors[20][2] = 255; colors[20][3] = 40;
		colors[21][0] = 102; colors[21][1] = 112; colors[21][2] = 134; colors[21][3] = 255;
		colors[22][0] = 29; colors[22][1] = 71; colors[22][2] = 165; colors[22][3] = 255;
		colors[23][0] = 107; colors[23][1] = 107; colors[23][2] = 107; colors[23][3] = 255;
		colors[24][0] = 218; colors[24][1] = 210; colors[24][2] = 158; colors[24][3] = 255;
		colors[25][0] = 100; colors[25][1] = 67; colors[25][2] = 50; colors[25][3] = 255;
		colors[26][0] = 175; colors[26][1] = 116; colors[26][2] = 116; colors[26][3] = 254;
		colors[27][0] = 160; colors[27][1] = 134; colors[27][2] = 72; colors[27][3] = 250;
		colors[28][0] = 120; colors[28][1] = 114; colors[28][2] = 92; colors[28][3] = 250;
		colors[29][0] = 106; colors[29][1] = 102; colors[29][2] = 95; colors[29][3] = 255;
		colors[30][0] = 220; colors[30][1] = 220; colors[30][2] = 220; colors[30][3] = 190;
		colors[31][0] = 110; colors[31][1] = 166; colors[31][2] = 68; colors[31][3] = 254;
		colors[32][0] = 123; colors[32][1] = 79; colors[32][2] = 25; colors[32][3] = 254;
		colors[33][0] = 106; colors[33][1] = 102; colors[33][2] = 95; colors[33][3] = 255;
		colors[34][0] = 153; colors[34][1] = 129; colors[34][2] = 89; colors[34][3] = 255;
		colors[35][0] = 222; colors[35][1] = 222; colors[35][2] = 222; colors[35][3] = 255;
		colors[37][0] = 255; colors[37][1] = 255; colors[37][2] = 0; colors[37][3] = 254;
		colors[38][0] = 255; colors[38][1] = 0; colors[38][2] = 0; colors[38][3] = 254;
		colors[39][0] = 128; colors[39][1] = 100; colors[39][2] = 0; colors[39][3] = 254;
		colors[40][0] = 140; colors[40][1] = 12; colors[40][2] = 12; colors[40][3] = 254;
		colors[41][0] = 231; colors[41][1] = 165; colors[41][2] = 45; colors[41][3] = 255;
		colors[42][0] = 191; colors[42][1] = 191; colors[42][2] = 191; colors[42][3] = 255;
		colors[43][0] = 200; colors[43][1] = 200; colors[43][2] = 200; colors[43][3] = 255;
		colors[44][0] = 200; colors[44][1] = 200; colors[44][2] = 200; colors[44][3] = 254;
		colors[45][0] = 170; colors[45][1] = 86; colors[45][2] = 62; colors[45][3] = 255;
		colors[46][0] = 160; colors[46][1] = 83; colors[46][2] = 65; colors[46][3] = 255;
		colors[48][0] = 90; colors[48][1] = 108; colors[48][2] = 90; colors[48][3] = 255;
		colors[49][0] = 26; colors[49][1] = 11; colors[49][2] = 43; colors[49][3] = 255;
		colors[50][0] = 245; colors[50][1] = 220; colors[50][2] = 50; colors[50][3] = 200;
		colors[51][0] = 255; colors[51][1] = 170; colors[51][2] = 30; colors[51][3] = 200;
		colors[52][0] = 20; colors[52][1] = 170; colors[52][2] = 200; colors[52][3] = 255;
		colors[53][0] = 157; colors[53][1] = 128; colors[53][2] = 79; colors[53][3] = 255;
		colors[54][0] = 125; colors[54][1] = 91; colors[54][2] = 38; colors[54][3] = 255;
		colors[55][0] = 200; colors[55][1] = 10; colors[55][2] = 10; colors[55][3] = 200;
		colors[56][0] = 129; colors[56][1] = 140; colors[56][2] = 143; colors[56][3] = 255;
		colors[57][0] = 45; colors[57][1] = 166; colors[57][2] = 152; colors[57][3] = 255;
		colors[58][0] = 114; colors[58][1] = 88; colors[58][2] = 56; colors[58][3] = 255;
		colors[59][0] = 146; colors[59][1] = 192; colors[59][2] = 0; colors[59][3] = 255;
		colors[60][0] = 95; colors[60][1] = 58; colors[60][2] = 30; colors[60][3] = 255;
		colors[61][0] = 96; colors[61][1] = 96; colors[61][2] = 96; colors[61][3] = 255;
		colors[62][0] = 96; colors[62][1] = 96; colors[62][2] = 96; colors[62][3] = 255;
		colors[63][0] = 111; colors[63][1] = 91; colors[63][2] = 54; colors[63][3] = 255;
		colors[64][0] = 136; colors[64][1] = 109; colors[64][2] = 67; colors[64][3] = 255;
		colors[65][0] = 181; colors[65][1] = 140; colors[65][2] = 64; colors[65][3] = 32;
		colors[66][0] = 140; colors[66][1] = 134; colors[66][2] = 72; colors[66][3] = 250;
		colors[67][0] = 115; colors[67][1] = 115; colors[67][2] = 115; colors[67][3] = 255;
		colors[71][0] = 191; colors[71][1] = 191; colors[71][2] = 191; colors[71][3] = 255;
		colors[73][0] = 131; colors[73][1] = 107; colors[73][2] = 107; colors[73][3] = 255;
		colors[74][0] = 131; colors[74][1] = 107; colors[74][2] = 107; colors[74][3] = 255;
		colors[75][0] = 181; colors[75][1] = 100; colors[75][2] = 44; colors[75][3] = 254;
		colors[76][0] = 255; colors[76][1] = 0; colors[76][2] = 0; colors[76][3] = 254;
		colors[78][0] = 245; colors[78][1] = 246; colors[78][2] = 245; colors[78][3] = 254;
		colors[79][0] = 125; colors[79][1] = 173; colors[79][2] = 255; colors[79][3] = 159;
		colors[80][0] = 250; colors[80][1] = 250; colors[80][2] = 250; colors[80][3] = 255;
		colors[81][0] = 25; colors[81][1] = 120; colors[81][2] = 25; colors[81][3] = 255;
		colors[82][0] = 151; colors[82][1] = 157; colors[82][2] = 169; colors[82][3] = 255;
		colors[83][0] = 183; colors[83][1] = 234; colors[83][2] = 150; colors[83][3] = 255;
		colors[84][0] = 100; colors[84][1] = 67; colors[84][2] = 50; colors[84][3] = 255;
		colors[85][0] = 137; colors[85][1] = 112; colors[85][2] = 65; colors[85][3] = 225;
		colors[86][0] = 197; colors[86][1] = 120; colors[86][2] = 23; colors[86][3] = 255;
		colors[87][0] = 110; colors[87][1] = 53; colors[87][2] = 51; colors[87][3] = 255;
		colors[88][0] = 84; colors[88][1] = 64; colors[88][2] = 51; colors[88][3] = 255;
		colors[89][0] = 137; colors[89][1] = 112; colors[89][2] = 64; colors[89][3] = 255;
		colors[90][0] = 0; colors[90][1] = 42; colors[90][2] = 255; colors[90][3] = 127;
		colors[91][0] = 185; colors[91][1] = 133; colors[91][2] = 28; colors[91][3] = 255;
		colors[92][0] = 228; colors[92][1] = 205; colors[92][2] = 206; colors[92][3] = 255;
		colors[93][0] = 151; colors[93][1] = 147; colors[93][2] = 147; colors[93][3] = 255;
		colors[94][0] = 161; colors[94][1] = 147; colors[94][2] = 147; colors[94][3] = 255;
		colors[95][0] = 125; colors[95][1] = 91; colors[95][2] = 38; colors[95][3] = 255;
		colors[96][0] = 126; colors[96][1] = 93; colors[96][2] = 45; colors[96][3] = 240;
		colors[97][0] = 128; colors[97][1] = 128; colors[97][2] = 128; colors[97][3] = 255;
		colors[98][0] = 122; colors[98][1] = 122; colors[98][2] = 122; colors[98][3] = 255;
		colors[99][0] = 141; colors[99][1] = 106; colors[99][2] = 83; colors[99][3] = 255;
		colors[100][0] = 182; colors[100][1] = 37; colors[100][2] = 36; colors[100][3] = 255;
		colors[101][0] = 109; colors[101][1] = 108; colors[101][2] = 106; colors[101][3] = 254;
		colors[102][0] = 255; colors[102][1] = 255; colors[102][2] = 255; colors[102][3] = 40;
		colors[103][0] = 151; colors[103][1] = 153; colors[103][2] = 36; colors[103][3] = 255;
		colors[104][0] = 115; colors[104][1] = 170; colors[104][2] = 73; colors[104][3] = 254;
		colors[105][0] = 115; colors[105][1] = 170; colors[105][2] = 73; colors[105][3] = 254;
		colors[106][0] = 51; colors[106][1] = 130; colors[106][2] = 36; colors[106][3] = 180;
		colors[107][0] = 137; colors[107][1] = 112; colors[107][2] = 65; colors[107][3] = 225;
		colors[108][0] = 170; colors[108][1] = 86; colors[108][2] = 62; colors[108][3] = 255;
		colors[109][0] = 122; colors[109][1] = 122; colors[109][2] = 122; colors[109][3] = 255;
		colors[110][0] = 140; colors[110][1] = 115; colors[110][2] = 119; colors[110][3] = 255;
		colors[111][0] = 85; colors[111][1] = 124; colors[111][2] = 60; colors[111][3] = 254;
		colors[112][0] = 54; colors[112][1] = 24; colors[112][2] = 30; colors[112][3] = 255;
		colors[113][0] = 54; colors[113][1] = 24; colors[113][2] = 30; colors[113][3] = 225;
		colors[114][0] = 54; colors[114][1] = 24; colors[114][2] = 30; colors[114][3] = 255;
		colors[115][0] = 112; colors[115][1] = 8; colors[115][2] = 28; colors[115][3] = 254;
		colors[116][0] = 103; colors[116][1] = 64; colors[116][2] = 59; colors[116][3] = 255;
		colors[117][0] = 124; colors[117][1] = 103; colors[117][2] = 81; colors[117][3] = 255;
		colors[118][0] = 55; colors[118][1] = 55; colors[118][2] = 55; colors[118][3] = 255;
		colors[119][0] = 18; colors[119][1] = 16; colors[119][2] = 27; colors[119][3] = 127;
		colors[120][0] = 89; colors[120][1] = 117; colors[120][2] = 96; colors[120][3] = 255;
		colors[121][0] = 221; colors[121][1] = 223; colors[121][2] = 165; colors[121][3] = 255;
		colors[122][0] = 20; colors[122][1] = 18; colors[122][2] = 29; colors[122][3] = 255;
		colors[123][0] = 70; colors[123][1] = 43; colors[123][2] = 26; colors[123][3] = 255;
		colors[124][0] = 119; colors[124][1] = 89; colors[124][2] = 55; colors[124][3] = 255;
		colors[125][0] = 156; colors[125][1] = 127; colors[125][2] = 78; colors[125][3] = 255;
		colors[126][0] = 156; colors[126][1] = 127; colors[126][2] = 78; colors[126][3] = 254;
		colors[127][0] = 145; colors[127][1] = 80; colors[127][2] = 30; colors[127][3] = 200;
		colors[128][0] = 218; colors[128][1] = 210; colors[128][2] = 158; colors[128][3] = 255;
		colors[129][0] = 109; colors[129][1] = 128; colors[129][2] = 116; colors[129][3] = 255;
		colors[130][0] = 18; colors[130][1] = 16; colors[130][2] = 27; colors[130][3] = 255;
		colors[131][0] = 138; colors[131][1] = 129; colors[131][2] = 113; colors[131][3] = 255;
		colors[132][0] = 129; colors[132][1] = 129; colors[132][2] = 129; colors[132][3] = 107;
		colors[133][0] = 81; colors[133][1] = 217; colors[133][2] = 117; colors[133][3] = 255;
		colors[134][0] = 103; colors[134][1] = 77; colors[134][2] = 46; colors[134][3] = 255;
		colors[135][0] = 195; colors[135][1] = 179; colors[135][2] = 123; colors[135][3] = 255;
		colors[136][0] = 154; colors[136][1] = 110; colors[136][2] = 77; colors[136][3] = 255;
		colors[201][0] = 218; colors[201][1] = 210; colors[201][2] = 158; colors[201][3] = 254;
		colors[202][0] = 157; colors[202][1] = 128; colors[202][2] = 79; colors[202][3] = 254;
		colors[203][0] = 115; colors[203][1] = 115; colors[203][2] = 115; colors[203][3] = 254;
		colors[204][0] = 170; colors[204][1] = 86; colors[204][2] = 62; colors[204][3] = 254;
		colors[205][0] = 122; colors[205][1] = 122; colors[205][2] = 122; colors[205][3] = 254;
		colors[208][0] = 200; colors[208][1] = 200; colors[208][2] = 200; colors[208][3] = 254;
		colors[209][0] = 218; colors[209][1] = 210; colors[209][2] = 158; colors[209][3] = 254;
		colors[210][0] = 157; colors[210][1] = 128; colors[210][2] = 79; colors[210][3] = 254;
		colors[211][0] = 115; colors[211][1] = 115; colors[211][2] = 115; colors[211][3] = 254;
		colors[212][0] = 170; colors[212][1] = 86; colors[212][2] = 62; colors[212][3] = 254;
		colors[213][0] = 122; colors[213][1] = 122; colors[213][2] = 122; colors[213][3] = 254;
		colors[214][0] = 103; colors[214][1] = 77; colors[214][2] = 46; colors[214][3] = 254;
		colors[215][0] = 195; colors[215][1] = 179; colors[215][2] = 123; colors[215][3] = 254;
		colors[216][0] = 154; colors[216][1] = 110; colors[216][2] = 77; colors[216][3] = 254;
		colors[221][0] = 157; colors[221][1] = 128; colors[221][2] = 79; colors[221][3] = 254;
		colors[222][0] = 103; colors[222][1] = 77; colors[222][2] = 46; colors[222][3] = 255;
		colors[223][0] = 195; colors[223][1] = 179; colors[223][2] = 123; colors[223][3] = 255;
		colors[224][0] = 154; colors[224][1] = 110; colors[224][2] = 77; colors[224][3] = 255;
		colors[226][0] = 103; colors[226][1] = 77; colors[226][2] = 46; colors[226][3] = 255;
		colors[227][0] = 195; colors[227][1] = 179; colors[227][2] = 123; colors[227][3] = 255;
		colors[228][0] = 154; colors[228][1] = 110; colors[228][2] = 77; colors[228][3] = 255;
		colors[229][0] = 44; colors[229][1] = 84; colors[229][2] = 44; colors[229][3] = 160;
		colors[230][0] = 85; colors[230][1] = 124; colors[230][2] = 60; colors[230][3] = 170;
		colors[231][0] = 44; colors[231][1] = 135; colors[231][2] = 50; colors[231][3] = 175;
		colors[237][0] = 70; colors[237][1] = 50; colors[237][2] = 32; colors[237][3] = 255;
		colors[238][0] = 206; colors[238][1] = 206; colors[238][2] = 201; colors[238][3] = 255;
		colors[239][0] = 122; colors[239][1] = 91; colors[239][2] = 51; colors[239][3] = 255;
		colors[240][0] = 244; colors[240][1] = 137; colors[240][2] = 54; colors[240][3] = 255;
		colors[241][0] = 200; colors[241][1] = 75; colors[241][2] = 210; colors[241][3] = 255;
		colors[242][0] = 120; colors[242][1] = 158; colors[242][2] = 241; colors[242][3] = 255;
		colors[243][0] = 204; colors[243][1] = 200; colors[243][2] = 28; colors[243][3] = 255;
		colors[244][0] = 59; colors[244][1] = 210; colors[244][2] = 47; colors[244][3] = 255;
		colors[245][0] = 237; colors[245][1] = 141; colors[245][2] = 164; colors[245][3] = 255;
		colors[246][0] = 76; colors[246][1] = 76; colors[246][2] = 76; colors[246][3] = 255;
		colors[247][0] = 168; colors[247][1] = 172; colors[247][2] = 172; colors[247][3] = 255;
		colors[248][0] = 39; colors[248][1] = 116; colors[248][2] = 149; colors[248][3] = 255;
		colors[249][0] = 133; colors[249][1] = 53; colors[249][2] = 195; colors[249][3] = 255;
		colors[250][0] = 38; colors[250][1] = 51; colors[250][2] = 160; colors[250][3] = 255;
		colors[251][0] = 85; colors[251][1] = 51; colors[251][2] = 27; colors[251][3] = 255;
		colors[252][0] = 55; colors[252][1] = 77; colors[252][2] = 24; colors[252][3] = 255;
		colors[253][0] = 173; colors[253][1] = 44; colors[253][2] = 40; colors[253][3] = 255;
		colors[254][0] = 32; colors[254][1] = 27; colors[254][2] = 27; colors[254][3] = 255;


		for (int i = 0; i < 256; i++) {
			brightness[i] = colors[i][1] * 0.236 + colors[i][2] * 0.601 + colors[i][3] * 0.163;
		}
	}
}