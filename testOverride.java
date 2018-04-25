class Test{
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d1 = new Dog();
		System.out.println(d.equals(d1));
		d.eat();
		System.out.println(d);

	}
}

class Animal {

	 double weight = 0;

	public void eat() {
		System.out.println("Animal eat");
	}

	public String toString(){
		// System.out.println(this.weight);
		return weight + "";
	}

}

class Dog extends Animal {
	Dog(){
		weight = 10;
	}
	public boolean equals(Object o){
		if ()
	}

	public void eat() {
		System.out.println("Dog eat");
	}
}