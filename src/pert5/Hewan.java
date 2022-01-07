package pert5;

public abstract class Hewan {

	private int jumlahkaki;
	private int jumlahmata;
	private String habitat;
	
	
	public int getJumlahmata() {
		return jumlahmata;
	}

	public Hewan(int jumlahkaki, int jumlahmata, String habitat) {
		this.jumlahkaki = jumlahkaki;
		this.jumlahmata = jumlahmata;
		this.habitat = habitat;
	}

	public int getJumlahkaki() {
		return jumlahkaki;
	}

	public void setJumlahkaki(int jumlahkaki) {
		this.jumlahkaki = jumlahkaki;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setJumlahmata(int jumlahmata) {
		this.jumlahmata = jumlahmata;
	}
	
	public abstract void suara();

	

}
