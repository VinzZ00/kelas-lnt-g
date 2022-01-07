package pert5;


public class Burung extends Hewan implements terbang { 
	
	private String jenisburung;
	
	public String getJenisburung() {
		return jenisburung;
	}


	public void setJenisburung(String jenisburung) {
		this.jenisburung = jenisburung;
	}


	public Burung(int jumlahkaki, int jumlahmata, String habitat, String jenisburung) {
		super(jumlahkaki, jumlahmata, habitat);
		this.jenisburung = jenisburung;
	}


	@Override
	public void suara() {
		// TODO Auto-generated method stub
		System.out.println("Chirp-chirp");
	}


	@Override
	public void flyingsounds() {
		// TODO Auto-generated method stub
		System.out.println("SWosshh...");
	}
	
	

}
