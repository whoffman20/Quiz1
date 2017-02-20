package QB_Rating;

import java.util.Scanner;

public class QBR_Equation {
	public static void main(String [] args)
	{

	}
	public static double QBR() {
		Scanner input = new Scanner(System.in);
		String e = "Enter number of";

		System.out.println(e + "completions");
		int c = input.nextInt();

		System.out.println(e + "pass attempts");
		int a = input.nextInt();

		System.out.println(e + "passing yards");
		int y = input.nextInt();

		System.out.println(e + "touchdown passes");
		int td = input.nextInt();

		System.out.println(e + "interceptions");
		int i = input.nextInt();

		input.close();
		
		double one = ((c / a) - .3) * 5;
		double two = ((y / a) - 3 * .25);
		double three = (td / a) * 20;
		double four = 2.375 - ((i / a) * 25);
		return ((one + two + three + four) / 6) * 100;
	}

}