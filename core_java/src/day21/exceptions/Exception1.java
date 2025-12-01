package day21.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int n1 = 50;

		String n2 = null;

		try {
			n2.length();
			System.out.println(n1 / Integer.parseInt(n2));
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}

		String numberStr = "5S";

		try {
			int num = Integer.parseInt(numberStr);
			System.out.println("Integer = " + num);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			
			nfe.printStackTrace();
		}

	}

}