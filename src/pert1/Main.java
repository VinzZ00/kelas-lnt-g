package pert1;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		String a = "Hallo World";
		boolean startwith = a.startsWith("Hallo");
		boolean endwith = a.endsWith("Worlds");
		boolean contains = a.contains("allo");
		System.out.println("Ini contains " + contains);
		
		System.out.println("Ini adalah string " + a);
		
		String concata = "ini adalah ";
		String concatb = "Method Concat java";
		String[] Split = concatb.split(" ");
		System.out.println(Split[0]);
		System.out.println(Split.length);
		System.out.println(concata + concatb);
		String concat = concata.concat(concatb);
		System.out.println("\n" + concat);
		boolean eq = a.equals("Hallo World");
		System.out.println("Ini eq " + eq); 
		
		boolean eqig = a.equalsIgnoreCase("hAllo wORLD");
		System.out.println("ini eqig " + eqig);
		
		System.out.println(startwith);
		System.out.println(endwith);
//		System.out.println(a.charAt(1));
//		a = "Pallo";
		a = "P" + a.substring(1,3);
		System.out.println(a);
		
		int angka1 = 1;
		int angka2 = 2;
		boolean cek = angka1 == angka2;
		
//		a.equals(anObject);
//		a.equalsIgnoreCase(anotherString);
		
//		int b = a.length();
//		System.out.println(a.length());
//		System.out.println(b);
		
//		char[] string = {'H', 'a' , 'L' , 'L', 'O'};
//		String parse = String.valueOf(string); 
//		System.out.println("ini yang normal " + parse);
//		
//		String lower = parse.toLowerCase();
//		System.out.println(lower);
//		
//		String upper = lower.toUpperCase();
//		System.out.println(upper);
		
//		string[0] = 'P';
//		System.out.println(String.valueOf(string));
//		System.out.println(string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
