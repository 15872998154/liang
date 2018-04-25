import java.util.GregorianCalendar;
import java.util.Date;
 // imprt java.util.Date;
class Test{
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.get(g.MONTH));
		System.out.println(g.get(g.YEAR));
		System.out.println(g.get(g.DAY_OF_MONTH));
		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(g.MONTH));
		System.out.println(g.get(g.YEAR));
		System.out.println(g.get(g.DAY_OF_MONTH));

	}
}