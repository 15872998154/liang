import java.util.Scanner;
class Test{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int count = 0;
		int count = in.nextInt();
		int[] arr = new int[count];
		for(int i = 0;i < arr.length;i++){
			arr[i] = in.nextInt();
		}
		if(isSorted(arr)){
			System.out.println("Is sorted");
		}
		else{
			System.out.println("Not sorted");

		}
	}

	public static boolean isSorted(int[] list){
		for(int i = 0;i < list.length-1; i++){
			
			if(list[i] > list[i+1]){
				return false;
			}
		}
		return true;
	}
}