import java.util.Scanner;

public class Cost {

	static double cost;
	static double tax;
	static double payment;

	static double getCost() {
		return cost;
	}

	static double getTax() {
		return tax;
	}

	static double getPayment() {
		return payment;
	}

	static void setCost(double x) {
		cost=x;
	}

	static void setTax(double x) {
		tax=x;
	}

	static void setPayment(double x) {
		payment=x;
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		double SalesValue=0;

		System.out.print("Cost? ");
		setCost(scanner.nextDouble());
		scanner.nextLine();

		System.out.println("Cost of Item: "+cost);

		System.out.print("Tax? ");
		setTax(scanner.nextDouble());
		scanner.nextLine();

		System.out.println("Tax: "+tax);

		SalesValue=getCost()+getTax()*getCost();

		System.out.println("Sales Value: "+SalesValue);

		System.out.print("Payment? ");
		setPayment(scanner.nextDouble());
		scanner.nextLine();

		System.out.print("Change: "+(getPayment()-SalesValue));

		scanner.close();
	}
}
