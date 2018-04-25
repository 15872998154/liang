class Test1{

	public static void main(String[] args){
		int count=312032486;
		for (int second=1;second<=5*365*24*3600 ;second++ ) {
			if(second%7==0){
				count+=1;				
			}
			if(second%13==0){
				count-=1;
			}
			if(second%45==0){
				count+=1;
			}
		}
		System.out.println(count);
	}
}