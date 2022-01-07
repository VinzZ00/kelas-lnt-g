package pert5;

public class Kucing extends Hewan{

	private String jenisKucing;

	public Kucing(String jenisKucing ,int jumlahkaki, int jumlahmata, String habitat) {
		super(jumlahkaki, jumlahmata, habitat);
		// TODO Auto-generated constructor stub
		this.jenisKucing = jenisKucing;
	}

	
	@Override
	public void suara() {
		// TODO Auto-generated method stub
		System.out.println("Miao-Miao");
	}


	public String getJenisKucing() {
		return jenisKucing;
	}


	public void setJenisKucing(String jenisKucing) {
		this.jenisKucing = jenisKucing;
	}



}
