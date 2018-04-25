import java.util.Date;
class Test{
	public static void main(String[] args) {
		Date d = new Date(10000);
		Date d1 = new Date(100000);
		Date d2 = new Date(10000000);
		Date d3 = new Date(100000000);
		Date d4 = new Date(1000000000);
		// Date d5 = new Date(10000000000);

		System.out.println(d.toString());
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println(d4.toString());
		// System.out.println(d5.toString());
		// System.out.println(d.toString());
	}
}