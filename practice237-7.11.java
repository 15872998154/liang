import java.util.Scanner;
class Test{
	
	public static void main(String[] args) {
		System.out.print("Enter ten numbers:");
		double[] x = new double[10];//定义数组 
		
		Scanner in = new Scanner(System.in);//new 系统输入对象
		
		for (int i = 0;i < 10; i++) {
			x[i] = in.nextDouble();
		}

		mean(x);
		deviation(x);
	}

	public static double mean(double[] x){
		double sum = 0.0,avg = 0;
		

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		avg = sum/x.length; 
		
		System.out.println("The mean is "+ avg);
		
		return avg;
		
	}

	public static double deviation(double[] x){
		double sum = 0.0;

		for(int i = 0; i < x.length; i++ ){
			sum += ((x[i]-mean(x))*(x[i]-mean(x)));
		}

		double standard_deviation = sum/((x.length-1)*1.0);

		System.out.println("The standard deviation is "+standard_deviation);

		return standard_deviation;
	}


}