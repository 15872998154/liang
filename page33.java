import java.util.Scanner;
class Test{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double average = (number1+number2+number3)/3;
		System.out.println("average is "+average);
	}



}