package pert4;

import pert4accmod.Hewan;

public class Anjing extends Hewan{
	
	public int ekor;
	public int head;
	public int feet;
	
	private int mouth;
	private String Habitat;
	
	//
	//manual ketik constructor
	public Anjing(int ekor, int head, int feet, int mouth, String habitat) {
		super();
		this.ekor = ekor;
		this.head = head;
		this.feet = feet;
		this.mouth = mouth;
		this.Habitat = habitat;
	}
	
	//shortcut alt + shift + s + o generate constructor 
	
//	public Anjing(Double ekor, int head, int feet, int mouth, String habitat) {
//		super();
//		this.ekor = Integer.valueOf(String.valueOf(ekor));
//		this.head = head;
//		this.feet = feet;
//		this.mouth = mouth;
//		Habitat = habitat;
//		System.out.println("Anjing ini telah di buat");
//	}
	
	public int getmouthanjing() {
		return this.mouth;
	}
	
	public void setmouthanjing(int mouth) {
		this.mouth = mouth;
	}
	
	//shortcut construct setter getter alt + shift + s + r
	
	public String getHabitat() {
		return Habitat;
	}

	public void setHabitat(String habitat) {
		Habitat = habitat;
	}
	
	public Anjing() {
	}	// TODO Auto-generated constructor stub

	

	public void suara() {
		// TODO Auto-generated method stub
		System.out.println("Whoof - Whoof");
	}
	
	// ketik nama method + ctrl space
	
	public void jalan() {
		// TODO Auto-generated method stub
		System.out.println("Udh capek gaa bisa jalan lagi wkwk");
	}
	
	public void species() {
		System.out.println(this.species);
	}
	
	public void habitat2() {
		System.out.println(this.getHabitat2());
	}

}
