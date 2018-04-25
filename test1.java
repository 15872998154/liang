class Test{

	static int sum = 0;
	public static void main(String[] args) {
		//2+22+222+2222+2222.... pow(2,n) 递归
		fun(3);
		System.out.println(Test.sum);
	}

	public static int  fun(int n ){
		int result;
		if(n==1){
			result = 2;
			sum += result;
		}
			
		else{
			result = fun(n-1)*10+2;
			sum += result;
		}
		return result;	
	}

}