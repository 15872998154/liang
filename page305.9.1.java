class Test{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.set(4,40);
		r2.set(3.5,35.9);
		System.out.println(r1.getWidth()+"  "+r1.getHeight()+"  "+r1.getArea()+"  " +r1.getPrimeter());
		System.out.println(r2.getWidth()+"  "+r2.getHeight()+"  "+r2.getArea()+"  " +r2.getPrimeter());
	}
}

class Rectangle{
	private double width = 1;
	
	private double height = 1;
	
	Rectangle(){
		this.width = 1;
		this.height =1;
	}

	public void set (double w,double h){//set方法
		this.width = w;
		this.height =h;
	}

	public double getHeight(){
		return height;
	}

	public double getWidth(){
		return width;
	}

	public double getArea(){
		return width*height;
	}

	public double getPrimeter(){
		return 2*(width+height);
	}
}