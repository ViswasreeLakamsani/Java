package heightConverter;

import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter height in inches to convert to feet");
		double height=scan.nextDouble();
		
		HeightConverter converter = new HeightConverter();

		System.out.printf("%.2f",converter.convertInchesToFeet(height));

		

	}

}
