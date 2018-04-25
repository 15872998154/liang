class Test{

	public static void main(String[] args){
		for (int i=1;i<=4 ;i++ ) {
			for (int j=1;j<=7 ;j++ ) {
				if((j==i)||(i+j)==8){
					System.out.print("V");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}