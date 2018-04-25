class Test{
	class Inner{
		public void fun(){
			System.out.println("hello world!");
		}
	}
	public static void main(String[] args){
		Test t = new Test();
		Inner i = t.new Inner();
		i.fun();
	}
}