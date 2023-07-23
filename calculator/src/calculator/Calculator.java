package calculator;


public class Calculator {

	public static void main(String[] args) {
		
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		double res=journeyCalculator.calculateDistance(70.0, 1.5);
		System.out.printf("%.2f",res);
	}

}
