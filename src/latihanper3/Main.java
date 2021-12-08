package latihanper3;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		Vector<Vector<String>> students = new Vector<Vector<String>>();
		int choose;
		do {
			System.out.println("1. add");
			System.out.println("2. view");
			System.out.println("3. update");
			System.out.println("4. delete");
			System.out.println("5. remove all");
			System.out.println("6. exit");
			
			System.out.print("Choose >> ");
			choose = sc.nextInt(); sc.nextLine();
		
		switch (choose) {
		case 1:
			String nama;
			String domisili;
			
			System.out.println("masukan nama anda");
			nama = sc.nextLine();
			
			System.out.println("masukan domisili anda");
			domisili = sc.nextLine();
			
			Vector<String> student = new Vector<String>();
			student.add(nama);
			student.add(domisili);
			
			students.add(student);
			
			break;

		case 2:
			
			if (students.isEmpty()) {
				System.out.println("tak ada data");
			} else {
				for (Vector<String> vector : students) {
					System.out.println("Nama " + vector.get(0));
					System.out.println("domisili " + vector.get(1));
				}
			}
			
			break;
			
		case 3:
			
			if (students.isEmpty()) {
				System.out.println("Tak ada data");
			} else {
				int ind1 = 1;
				for (Vector<String> vector : students) {
					System.out.println("no. " + ind1);
					System.out.println("Nama " + vector.get(0));
					System.out.println("domisili " + vector.get(1));
					ind1++;
				}
				System.out.println("Input the index who you want to update");
				int input1 = sc.nextInt(); sc.nextLine();
				
				Vector<String> temp = students.get((input1-1));
				
				for (int i = 0; i < temp.size(); i++) {
					System.out.println("No. 1");
					System.out.println("nama : " + temp.get(0));
					System.out.println("no. 2");
					System.out.println("domisili " + temp.get(1));
				}
				System.out.println("input the index what you want to update");
				int input2 = sc.nextInt(); sc.nextLine();
				System.out.println("to be what?");
				String penganti = sc.nextLine();
				
				temp.set((input2-1), penganti);
				
				students.set((input1-1), temp); 
			}
				break;
			
			case 4:
				if (students.isEmpty()) {
					System.out.println("Tak ada data");
				} else {
					int ind1 = 1;
					for (Vector<String> vector : students) {
						System.out.println("no. " + ind1);
						System.out.println("Nama " + vector.get(0));
						System.out.println("domisili " + vector.get(1));
						ind1++;
					}
					System.out.println("input who you will delete");
					int input1 = sc.nextInt();
					
					students.remove((input1-1));
			}
				break;
				
			case 5:
				
				students.removeAll(students);
				break;
		}
		

			
		} while (choose != 6);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
