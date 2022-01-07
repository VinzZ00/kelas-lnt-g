package latihanpert2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose;
		String elvin = "Elvin";
		
//		alt + shift + z

		int random = rand.nextInt(20);
		System.out.println(random);
		int input;
		String input2;
		do {
			input = sc.nextInt();sc.nextLine();
			input2 = String.valueOf(input);
			System.out.println("Input no. Hp");
		} while (input2.length() < 12);
		
		do {
			System.out.println("Happy petshop");
			System.out.println("=============");
			System.out.println("1. Buy new pet");
			System.out.println("2. Exit");
			System.out.print("Choose Menu >> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch (choose) {
			case 1:
				input();
				
				break;
			}
			
		} while (choose != 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public void input() {
		String category, type, address;
		int price = 0;
		int addprice;
		String payment;
		int pembayaran;
		
		do {
			System.out.print("Choose pet category you want? [Mammals | Reptile] : ");
			category = sc.nextLine();
		} while (!(category.equals("Mammals") || category.equals("Reptile")));
		
		if (category.equals("Reptile")) {
			do {
				System.out.print("Choose pet type you want [Python | Iguana | Turtle] : ");
				type = sc.nextLine();
			} while (!(type.equals("Python") || type.equals("Iguana") || type.equals("Turtle")));
		} else {
		
		do {
			System.out.print("Choose pet type you want [Dog | Cat | Hamster] : ");
			type = sc.nextLine();
		} while (!(type.equals("Dog") || type.equals("Cat") || type.equals("Hamster")));
		
		}
		
		do { 
			System.out.print("Input your address to send the pet [Must end with street & min. 2 word] :");
			address = sc.nextLine();
		} while (!(address.endsWith("street") && address.contains(" ") && !address.startsWith(" ")));
		
		if (type.equals("Dog")) {
			price += 250;
		} else if (type.equals("Cat")) {
			price += 200;
		} else if (type.equals("Hamster")) {
			price += 150;
		} else if (type.equals("Iguana")) {
			price += 400;
		} else if (type.equals("Python")) {
			price += 450;
		} else {
			price += 300;
		}
		
		if (category.equals("Mammals")) {
			addprice = price/10;   // 10% = 10/100 => 1x/10
			price += addprice;
		} else {
			addprice = price/5;
			price += addprice;
		}
		
		System.out.println("Payment Detail");
		System.out.println("=================================");
		System.out.println("Pet Category " + category);
		System.out.println("Pet type " + type);
		System.out.println("Address " + address);
		System.out.println("=================================");
		System.out.println("Total payment : " + price);
		
		do {
			do {
				System.out.print("Input your money : $");
				payment = sc.nextLine();
			} while (payment.startsWith(" "));
			pembayaran = Integer.valueOf(payment);
		} while (pembayaran < price);
		System.out.println("Payment Success, your Change is $" + (pembayaran - price));
		sc.nextLine();
	}
	private void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}
