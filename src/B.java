import java.util.Optional;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = new String[5];
		name[2] = "Jordan";
		for(String str:name)
		{
			Optional<String> checkNull = Optional.ofNullable(str);
			//print data by method reference
	//		checkNull.ifPresent(System.out::println);
	//		checkNull.ifPresent((a) -> System.out.println(a));
//			System.out.println(checkNull.get());
		}

	}

}
