package tutionratecalc;
import java.util.Scanner;
public class tutionratecalc {
	private static Scanner user_input;
	public static void main(String[] args) {
		user_input = new Scanner(System.in);
		double tuition2;
		double tuition3;
		double tuition4;
		double Given_Tuition;
		double total;
		double Inc_Rate_1;
		double Inc_Rate_2;		
		double Inc_Rate_3;		
		System.out.print("actual tuition: ");
		Given_Tuition = user_input.nextDouble();
		System.out.print("% Inc 1: ");
		Inc_Rate_1 = user_input.nextDouble();
		System.out.print("% Inc 2: ");
		Inc_Rate_2 = user_input.nextDouble();
		System.out.print("% Inc 3: ");
		Inc_Rate_3 = user_input.nextDouble();
		tuition2 = ((Inc_Rate_1/100)+1)*Given_Tuition;		
		tuition3 = ((Inc_Rate_2/100)+1)*tuition2;		
		tuition4 = ((Inc_Rate_3/100)+1)*tuition3;		
		total = Given_Tuition + tuition2 + tuition3 +tuition4;
		System.out.print("total cost: "+total);
	}
}
