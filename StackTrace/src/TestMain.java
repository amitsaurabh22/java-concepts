public class TestMain {

	public static void main(String[] args) {

		method1();

	}

	private static void method1() {
		method2();

	}

	private static void method2() {
		method3();

	}

	private static void method3() {
		StackTraceElement[] ab = Thread.currentThread().getStackTrace();
		for (StackTraceElement stackTraceElement : ab) {
			System.out.println(stackTraceElement.getMethodName());
		}

	}

}
