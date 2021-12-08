package pert3;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		char[] nama = {'N','A','M','A'};
//		nama[3] = ':';
//		String elvin = "Elvin";
//		char[] testconvert = elvin.toCharArray();
//		
//		
//		
//		for (int i = 0; i < nama.length; i++) {
//			System.out.println(nama[i]);
//		}
//		
//		System.out.println("=========================");
//		for (char c : testconvert) {
//			System.out.println(c);
//		}
		
		Vector<String> arrdinamic = new Vector<String>();
		arrdinamic.add("Budi"); // 0
		arrdinamic.add("Andi"); // 1
		arrdinamic.add("Dodi"); // 2
		
//		for (int i = 0; i < arrdinamic.size(); i++) {
//			System.out.println("no. " + (i+1));
//			System.out.println(arrdinamic.get(i));
//		}
//		
//		System.out.println("========================\n");
		
		int ind = 1;
		for (String string : arrdinamic) {
			System.out.println("no." + ind);
			System.out.println(string);
			ind++;
		}
//		==========================================================
		arrdinamic.set(1, "Indra");
//		arrdinamic.remove(arrdinamic.indexOf("Dodi"));
//		arrdinamic.removeAll(arrdinamic);
		arrdinamic.add(2, "elvin");
		
//		==========================================================

		System.out.println("\n======================================\n");
		int ind1 = 1;
		
		if (arrdinamic.isEmpty()) {
			System.out.println("ini kosong");
		} else {
		for (String string : arrdinamic) {
			System.out.println("no." + ind1);
			System.out.println(string);
			ind1++;
		}
		}
		
		arrdinamic.add("Julia");
		arrdinamic.add("Julia");
		arrdinamic.add("Julia");
		arrdinamic.add("Julia");
		arrdinamic.add("Julia");
		
		System.out.println(arrdinamic.size());
		System.out.println(arrdinamic.capacity());
		arrdinamic.add("Julia");
		arrdinamic.add("Julia");
		arrdinamic.add("Julia");
		
		System.out.println(arrdinamic.size());
		System.out.println(arrdinamic.capacity());
		
		
		int[][] angka = new int[2][2];
		
		angka[0][0] = 1;
		angka[0][1] = 2;
		angka[1][0] = 3;
		angka[1][1] = 4;
		
		for (int i = 0; i < angka.length; i++) {
			for (int j = 0; j < angka[i].length; j++) {
				System.out.println(angka[i][j]);
				System.out.println("=====");
			}
		}
		
		
		
		Vector<Vector<String>> vec2d = new Vector<Vector<String>>();
			Vector<String> vec1d = new Vector<String>();
		vec2d.add(vec1d);
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
