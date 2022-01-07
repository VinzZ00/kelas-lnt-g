package pert5;

public class Ikan extends Hewan implements berenang{
	
	private String jenisIkan;

	public String getJenisIKan() {
		return jenisIkan;
	}

	public void setJenisIKan(String jenisIKan) {
		this.jenisIkan = jenisIKan;
	}

	public Ikan(int jumlahkaki, int jumlahmata, String habitat, String jenisIkan) {
		super(jumlahkaki, jumlahmata, habitat);
		this.jenisIkan = jenisIkan;
	}

	@Override
	public void swimmingsounds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suara() {
		// TODO Auto-generated method stub
		
	}

}
