package pert5;

import java.util.Scanner;
import java.util.Vector;

public class Zoo {

	Scanner sc = new Scanner(System.in);
	
	public Zoo() {
		// TODO Auto-generated constructor stub
		System.out.println("Hallo, tolong masukan nama anda");
		String nama = sc.nextLine();
		
		Vector<Hewan> hewan = new Vector<>();
		
		int choose;
		do {
			Burung burung1 = new Burung(2, 2, "rumah", "Kakaktua");
			burung1.suara();
			System.out.println("Selamat datang Mr. " + nama);
			System.out.println("Apa yang ingin anda lakukan??");
			System.out.println("1. Input Kucing");
			System.out.println("2. Input Burung");
			System.out.println("3. Input Ikan");
			System.out.println("4. View");
			System.out.println("5. exit");
			System.out.println(">>  ");
			choose = sc.nextInt();
			sc.nextLine();
			String habitat;
			int jumlahkaki, jumlahmata;
			switch (choose) {
			case 1:
				String jenisKucing;
				System.out.println("Masukan jenis kucingnya");
				jenisKucing = sc.nextLine();

				System.out.println("Masukan habitatnya");
				habitat = sc.nextLine();

				System.out.println("Masukan jumlah kakinya");
				jumlahkaki = sc.nextInt();
				sc.nextLine();

				System.out.println("Masukan jumlah mata");
				jumlahmata = sc.nextInt();
				sc.nextLine();

				hewan.add(new Kucing(jenisKucing, jumlahkaki, jumlahmata, habitat));
				break;

			case 2:
				String jenisBurung;

				System.out.println("Masukan jenis burung");
				jenisBurung = sc.nextLine();

				System.out.println("Masukan habitatnya");
				habitat = sc.nextLine();

				System.out.println("Masukan jumlah kakinya");
				jumlahkaki = sc.nextInt();
				sc.nextLine();

				System.out.println("Masukan jumlah mata");
				jumlahmata = sc.nextInt();
				sc.nextLine();

				hewan.add(new Burung(jumlahkaki, jumlahmata, habitat, jenisBurung));
				break;

			case 3:
				String jenisIkan;

				System.out.println("Masukan jenis Ikan");
				jenisIkan = sc.nextLine();

				System.out.println("Masukan habitatnya");
				habitat = sc.nextLine();

				System.out.println("Masukan jumlah kakinya");
				jumlahkaki = sc.nextInt();
				sc.nextLine();

				System.out.println("Masukan jumlah mata");
				jumlahmata = sc.nextInt();
				sc.nextLine();

				hewan.add(new Ikan(jumlahkaki, jumlahmata, habitat, jenisIkan));
				break;

			case 4:
				
				System.out.println(hewan.get(0).getClass());
				for (Hewan hewan2 : hewan) {
					if (hewan2 instanceof Kucing) {
						Kucing kucing = (Kucing) hewan2;
						System.out.println("Jenis kucing adalah : " + kucing.getJenisKucing());
						System.out.println("Habitatnya di : " + kucing.getHabitat());
						System.out.println("Jumlah kakinya adalah :" + kucing.getJumlahkaki());
						System.out.println("Jumlah mata adalah : " + kucing.getJumlahmata());
						System.out.println("====================================================\n");
					} else if (hewan2 instanceof Ikan) {
						Ikan ikan = (Ikan) hewan2;
						System.out.println("Jenis Ikan adalah : " + ikan.getJenisIKan());
						System.out.println("Habitatnya di : " + ikan.getHabitat());
						System.out.println("Jumlah kakinya adalah :" + ikan.getJumlahkaki());
						System.out.println("Jumlah mata adalah : " + ikan.getJumlahmata());
						System.out.println("====================================================\n");
					} else {
						Burung burung = (Burung) hewan2;
						System.out.println("Jenis burung adalah : " + burung.getJenisburung());
						System.out.println("Habitatnya di : " + burung.getHabitat());
						System.out.println("Jumlah kakinya adalah :" + burung.getJumlahkaki());
						System.out.println("Jumlah mata adalah : " + burung.getJumlahmata());
						System.out.println("====================================================\n");
					}
				}
				sc.nextLine();
				break;
			}
		} while (choose != 5);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zoo();
	}

}
