package movieDiscounts;

import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		double ticketPrice = 7, ticketDiscount;
		int age, numTicket;
		
		System.out.print("¿Cual es tu edad? ");
		age = enter.nextInt();
		

		if(age > 0 && age < 150) {
			if(age < 5) {
				System.out.println("El precio del boleto es de: "+ (ticketPrice - (ticketPrice * 0.6)) + " euros");
			}else if(age > 60) {
				System.out.println("El precio del boleto es de: "+ (ticketPrice - (ticketPrice * 0.55)) + " euros");
			}else if(age > 4 && age < 61) {
				System.out.println("El precio del boleto es de: "+ ticketPrice + " euros");
				
				System.out.println("¿Cuantos voletos quiere?");
				numTicket = enter.nextInt();
				
				if(numTicket > 1) {
					System.out.println("El precio de cada boleto es de: "+ (ticketPrice - (ticketPrice * 0.3)) + " euros");
				}else {
					System.out.println("El precio del boleto es de: "+ ticketPrice + " euros");
				}
				
			}
		}else {
			System.out.println("Esta fuera del rango");
		}
		
	}

}
