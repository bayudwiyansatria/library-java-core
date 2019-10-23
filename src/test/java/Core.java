import java.util.Arrays;
import java.util.Optional;

public class Core {
	public void myLambda(){
		int[][] arrays = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
	}

	public void noLamda(){
		int[][] arrays = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
		for (int i = 0; i<arrays.length; i++) {
			for(int j=0; i<arrays[0].length; i++){
				System.out.println(arrays[i][j]);
			}
		}
	}

	public void parallel(){
		int[][] arrays = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}, {1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
	}

	public static void main (String[] args){
		long StartTime = System.currentTimeMillis();
		new Core().myLambda();
		long EndTime = System.currentTimeMillis();
		float sec = (EndTime - StartTime) / 1000F; System.out.println(sec + " seconds");

		StartTime = System.currentTimeMillis();
		new Core().noLamda();
		EndTime = System.currentTimeMillis();
		sec = (EndTime - StartTime) / 1000F; System.out.println(sec + " seconds");
	}
}
