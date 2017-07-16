package basic.lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		MyFunctionalInterface2 fi2;

		fi = () -> {
			String str = "fitst method call";
			System.out.println(str);
		};

		fi.method();

		fi = () -> {
			System.out.println("second method call");
		};
		fi.method();

		fi = () -> System.out.println("third method call");
		fi.method();

		System.out.println("----------------------------------");

		fi2 = (x) -> {
			int result = x + 5;
			System.out.println("first result: " + result);
		};
		fi2.method(2);

		fi2 = (x) -> {
			System.out.println("second result: " + x * 5);
		};
		fi2.method(2);

		fi2 = x -> System.out.println("third result: " + x * 5);
		fi2.method(2);
	}

}
