public class task1 {
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter degree of number: ");
		int b = Integer.parseInt(System.console().readLine());
		if (a > 0 & b > 0) {
			var result = Math.pow(a, b);
			System.out.println(result);
		} else {
			System.out.println("Result is not defined");
		}

	}
}