package commissionCalculator;

import java.util.Scanner;

public class CommissionCalculator {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		float buy;
		
		System.out.print("Introduce la venta: ");
		buy = enter.nextFloat();
		
		if (buy >= 10000 && buy<1000) {
			System.out.println("La comision es del 30%, al final paga: "+ (buy-(buy*0.3)));
		}else if (buy >5000 & buy < 10000) {
			System.out.println("La comision es del 20%, al final paga: " + (buy-(buy*0.2)));
		}else if (buy > 1000 && buy < 5000) {
			System.out.println("La comision es del 10%, al final paga: " + (buy-(buy*0.1)));
		}else if (buy<0) {
			System.out.println("No puede ser nagativo");
		}else {
			System.out.println("No aplica");
		}

	}

}
