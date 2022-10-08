package javaodev4;

import java.util.Random;

public class Matris {
	
	
	
	static int[][] ciz(int satir, int sutun, int min, int max) {
		int[][] m = new int[satir][sutun];
		Random r = new Random();
		int i,j;
		
		for(i=0; i<satir; i++) {
			for(j=0; j< sutun; j++) {
				m[i][j] = r.nextInt(max-min)+min;
			}
		}
		
		return m;
			
	}
	

	


}
