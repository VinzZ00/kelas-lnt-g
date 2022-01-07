package pert6;

public abstract class BangunRuang {

	private String namaBangunRuang;

	public BangunRuang(String namaBangunRuang) {
		super();
		this.namaBangunRuang = namaBangunRuang;
	}

	public String getNamaBangunRuang() {
		return namaBangunRuang;
	}

	public void setNamaBangunRuang(String namaBangunRuang) {
		this.namaBangunRuang = namaBangunRuang;
	}
	
	public abstract int keliling();
	public int luas() {
		int a = 0;
		
		System.out.println("Ini luas");
		
		return a ;
	};
	
}
