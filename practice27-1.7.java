class Practice1{
	
	public static void main(String[] args){
		int flag=1;
		double sum=0;
		for (int i=1;i<=11 ;i+=2 ) {
			sum=sum+((flag*1.0)/i);
			flag*=-1;
		}
		System.out.println(sum);
	}

}