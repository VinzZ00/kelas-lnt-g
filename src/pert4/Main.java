package pert4;

import pert4accmod.Hewan;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Anjing kiko = new Anjing(1, 3, 4, 1, "Rumah");
		
		System.out.println("Ekor anjing ini ada " + kiko.ekor);
		System.out.println("Kepala anjing ini ada " + kiko.head);
		System.out.println("kaki Anjing ini ada " + kiko.feet);
		System.out.println("Mulut anjing ini ada " + kiko.getmouthanjing());
		System.out.println("Habitatnya adalah " + kiko.getHabitat());
		
		System.out.println("\n====================================================\n");
		
		kiko.ekor = 9;
		kiko.head = 1;
		kiko.setmouthanjing(3);
		kiko.setHabitat("Rumah saya");
		
		System.out.println("Ekor anjing ini ada " + kiko.ekor);
		System.out.println("Kepala anjing ini ada " + kiko.head);
		System.out.println("kaki Anjing ini ada " + kiko.feet);
		System.out.println("Mulut anjing ini ada " + kiko.getmouthanjing());
		System.out.println("Habitatnya adalah " + kiko.getHabitat());
		
		
		Anjing Kyuubi = kiko;
		
		System.out.println("\n\nEkor anjing ini ada " + Kyuubi.ekor);
		System.out.println("Kepala anjing ini ada " + Kyuubi.head);
		System.out.println("kaki Anjing ini ada " + Kyuubi.feet);
		System.out.println("Mulut anjing ini ada " + Kyuubi.getmouthanjing());
		System.out.println("Habitatnya adalah " + Kyuubi.getHabitat());
		
		System.out.println("\n=============================================\n");
		Kyuubi.head = 3;
		
		System.out.println("Ekor anjing ini ada " + Kyuubi.ekor);
		System.out.println("Kepala anjing ini ada " + Kyuubi.head);
		System.out.println("kaki Anjing ini ada " + Kyuubi.feet);
		System.out.println("Mulut anjing ini ada " + Kyuubi.getmouthanjing());
		System.out.println("Habitatnya adalah " + Kyuubi.getHabitat());
		
		Hewan kucing = new Hewan();
		kucing.berkembangbiak();
		System.out.println(kucing.getHabitat2());
//		System.out.println(kucing.habitat2);
//		System.out.println(kucing.getSpecies());
		
		Kyuubi.species();
		Kyuubi.habitat2();
//		System.out.println(kucing.species);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
