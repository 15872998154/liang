import java.util.Scanner;
class Test{

	public static void main(String[] args) {
			System.out.print("input First Matrix:");
			
			double[][] matrix1 = getMatrix();
			
			System.out.print("input Second Matrix:");
			
			double[][] matrix2 = getMatrix();

			double[][] arr = multiplyMatrix(matrix1,matrix2);

			for (int i =0 ; i< arr.length; i++ ) {
				for (int j =0; j<arr[i].length ; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
	}

	public static double[][] getMatrix() {
		Scanner in = new Scanner(System.in);
		
		double[][] arr = new double[3][];

		for (int i = 0; i < arr.length ; i++) {
			arr[i] = new double[3];
			for (int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = in.nextDouble();
			}
		}

		return arr;

	}

	public static double[][] multiplyMatrix(double[][] mat1,double[][] mat2){
		double[][] arr = new double[3][];
		
		// int sum = 0

		for (int i = 0 ; i< arr.length ; i++) {
			arr[i] = new double[3];
		}

		for (int i =0 ; i< mat1.length ; i++ ) {
		 	for (int j = 0; j<mat1[i].length ; j++) {
		 		arr [i][j] = 0;
		 		for (int k = 0 ; k<mat1.length ; k++ ) {
		 			arr[i][j] += mat1[i][k]*mat2[k][j];
		 		}
		 	}
		}

		return arr; 

	}  

}