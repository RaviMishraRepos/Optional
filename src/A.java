import java.util.Optional;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// without optional class
//		String[] name = new String[5];
//		System.out.println(name[0]);   // null
//		System.out.println(name[0].toLowerCase());  // nullpointerException

		// Use Optional CLass
		String[] n = new String[5];
		Optional<String> checkNull = Optional.ofNullable(n[0]);
		if (checkNull.isPresent()) {
			System.out.println(n[0].toLowerCase());
		} else {
			System.out.println("Not found String");
		}
	}

}
