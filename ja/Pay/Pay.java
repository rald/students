import java.util.Scanner;

public class Pay {

	double hoursWorked;
	double rateOfPayPerHour;
	double withHoldingRate;
	double grossPay; // hw*rph
	double netPay;

	Pay() {}

	double computeNetPay(double h,double r,double w) {
		double g=h*r;
		return g-g*w;
	}

	double computeNetPay(double h,double r) {
		double w=0.10;
		double g=h*r;
		return g-g*w;
	}

	double computeNetPay(double h) {
		double w=0.10;
		double r=5.65;
		double g=h*r;
		return g-g*w;
	}


	public static void main(String args[]) {-
		Scanner scanner = new Scanner(System.in);

		Pay pay = new Pay();

		System.out.print("Enter hours worked: ");
		pay.hoursWorked=scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Enter rate of pay per hour (zero for 5.65%): ");
		pay.rateOfPayPerHour=scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Enter witholding rate (zero for 10%): ");
		pay.withHoldingRate=scanner.nextDouble();
		scanner.nextLine();

		if(pay.rateOfPayPerHour==0 && pay.withHoldingRate==0) {
			pay.netPay=pay.computeNetPay(pay.hoursWorked);
		} else if(pay.rateOfPayPerHour!=0 && pay.withHoldingRate==0) {
			pay.netPay=pay.computeNetPay(pay.hoursWorked,pay.rateOfPayPerHour);
		} else {
			pay.netPay=pay.computeNetPay(pay.hoursWorked,pay.rateOfPayPerHour,pay.withHoldingRate);
		}

		System.out.println("net pay: "+pay.netPay);

	}
}

