class Test{
	
	public static void main(String[] args) {
		try{
			int  i = 1/0;
		}
		catch(ArithmeticException e){
			System.out.println("zz");
		}catch(Exception ae){
			System.out.println("aa");
		}

	}	
}