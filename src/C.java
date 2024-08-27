import java.util.Optional;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = new String[5];
		name[2] = "Jordan";
		for (String str : name) {
//			String result = Optional.ofNullable(str)
//					.orElse("No Data Found");
//			System.out.println(result);

//			String result = Optional.ofNullable(str)
//					.orElseThrow();
//			System.out.println(result);

//			Optional<String> checkNull = Optional.empty();

		}

		Optional<String> checkNull = Optional.of(name[0]);
		try {
			checkNull.ifPresentOrElse(System.out::println, () -> {
				System.out.println("Data not found");
			});
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
