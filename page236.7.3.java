import java.util.Scanner;
class Test{
	
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		Scanner in = new Scanner(System.in);
		
		int t_number = in.nextInt();
		
		while( t_number != 0){
			arr[t_number]++;
			t_number = in.nextInt();
		}
		
		for(int i = 0;i<arr.length; i++){
			if(arr[i] != 0){
				if(arr[i] > 1){
					System.out.println(i+" occurs " +arr[i]+" times");
				}
				else{
					System.out.println(i+" occurs " +arr[i]+" time");
					// Syse
				}
			} 
		}
	}
}