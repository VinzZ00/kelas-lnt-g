package pert6;

import java.util.Scanner;
import java.util.Vector;


public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
		float panjang = (float) 5.34;
		float lebar = (float) 6;
		
		persegi<Float,Float> persegi1 = null;
		persegi<Integer, Integer> persegi2 = null;
		
		try {
			persegi1 = new persegi<Float, Float>(panjang, lebar, "Persegi");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			try {
				persegi2 = new persegi<Integer, Integer>(8,10, "Persegi");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			int choose;
			persegi<Integer, Integer> persegi = null;
		do {
			System.out.println("hAllo!!");
			System.out.println("masukan panjang dan lebar persegi anda");
			int panjang2 = sc.nextInt(); sc.nextLine();
			int lebar2 = sc.nextInt(); sc.nextLine();
			try {
				persegi = new persegi<Integer, Integer>(panjang2, lebar2, "Persegi");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("1. get keliling");
			System.out.println("2. get luas");
			System.out.println("3. exit");
			
			choose = sc.nextInt(); sc.nextLine();
			
			switch (choose) {
			case 1:
				System.out.printf("Keliling persegi = %d\n", persegi.keliling());
				break;

			case 2:				
				System.out.printf("Luas persegi = %d\n" , persegi.luas());
				break;
			}
			
		} while (choose != 3);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
