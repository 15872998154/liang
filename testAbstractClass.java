class Test{
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(20,10);
		Circle c = new Circle(4);
		fun(r);
		fun(c);
		
	}
	public static void fun(Shape sh){
		sh.area();
		sh.premeter();
	}

}

abstract class  Shape {

	public abstract void premeter();
	public abstract  void area();
}

class Rectangle extends Shape {
	double  width = 0;
	double  height = 0;
	Rectangle(double width ,double height ){
		this.width = width;
		this.height = height;
	}

	public void area(){
		System.out.println("Area :" + (width * height));
	}

	public void premeter(){
		System.out.println("Rectangle :" + 2*(width + height ));
	}
}

class Circle extends Shape{
	double radius = 0;
	Circle(double r){
		this.radius = r;
	}

	public void area(){
		System.out.println("area :"+ (3.14 * radius *radius));
	}

	public void premeter(){
		System.out.println("premeter :"+ (2 * 3.14 * radius));

	}
}