import java.util.Arrays;
class Test{
	
	public static void main(String[] args) {
		int cabinet = 100;//柜子
		int s = 100;//stu
		boolean[] arr = new boolean[100];
		for(int i =0; i < s; i++ ){
			for(int j = i;j < cabinet;j+=(i+1)){
				arr[j]=!arr[j];
			}
		}
		// int[] arr2 = new int[]{1,2,3};
 	// 	System.out.println(Arrays.toString(arr2));
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==true){
				System.out.print(i+" ");

			}
		}
	}
}