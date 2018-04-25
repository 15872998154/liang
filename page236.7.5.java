import java.util.Set;
import java.util.HashSet;
class Test{

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		java.util.Scanner in = new java.util.Scanner(System.in);
		for(int i = 0;i < 10; i++){
			s.add(in.nextInt());
		}
		for(Integer value: s ){
			System.out.print(value+" ");
		}
	}

}