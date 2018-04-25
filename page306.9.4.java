import java.util.Random;
class Test{
	public static void main(String[] args) {
		Random d = new Random(1000);
		Random d2 = new Random(1000);
		for (int i = 0; i<50 ; i++ ) {
			System.out.print(d.nextInt(100)+" ");
			System.out.print(d2.nextInt(100)+" ");

		}
	}
}