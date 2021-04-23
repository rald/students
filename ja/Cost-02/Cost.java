import java.util.Scanner;

public class Cost {

	double cost;
	double tax;
	double payment;

	double getCost() {
		return cost;
	}

	double getTax() {
		return tax;
	}

	double getPayment() {
		return payment;
	}

	void setCost(double x) {
		cost=x;
	}

	void setTax(double x) {
		tax=x;
	}

	void setPayment(double x) {
		payment=x;
	}

	public static void main(String args[]) {

		Cost item = new Cost();

		Scanner scanner = new Scanner(System.in);

		double SalesValue=0;

		System.out.print("Cost? ");
		item.setCost(scanner.nextDouble());
		scanner.nextLine();

		System.out.println("Cost of Item: "+item.getCost());

		System.out.print("Tax? ");
		item.setTax(scanner.nextDouble());
		scanner.nextLine();

		System.out.println("Tax: "+item.getTax());

		SalesValue=item.getCost()+item.getTax()*item.getCost();

		System.out.println("Sales Value: "+SalesValue);

		System.out.print("Payment? ");
		item.setPayment(scanner.nextDouble());
		scanner.nextLine();

		System.out.println("Change: "+(item.getPayment()-SalesValue));

		scanner.close();
	}
}
