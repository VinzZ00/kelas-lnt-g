package pert6;

public class persegi <X,Y> extends BangunRuang {
	
	private int panjang;
	private int lebar;
	
//	public persegi(int panjang, int lebar) {
//		
//		// TODO Auto-generated constructor stub
//		this.panjang = panjang;
//		this.lebar = lebar;
//	}
//	
//	public persegi(float panjang, float lebar) {
//		// TODO Auto-generated constructor stub
//		this.panjang = (int) panjang;
//		this.lebar = (int) lebar;
//	}
	
	public persegi(X panjang1, Y lebar1, String bangunRuang)  throws Exception {
		super(bangunRuang);
		if (panjang1.getClass().toString().contains("String") || lebar1.getClass().toString().contains("String")) {
			Exception errorParsing = new Exception();
			throw errorParsing;
		} if (panjang1.getClass().toString().contains("Integer") || lebar1.getClass().toString().contains("Integer")) {
			this.panjang = (int) panjang1;
			this.lebar = (int) lebar1;
		} else {
			this.panjang = Math.round((float)panjang1);
			this.lebar = Math.round((float)lebar1);
		}
	}

	@Override
	public int keliling() {
		// TODO Auto-generated method stub
		int keliling = 2 * (panjang + lebar);
		return keliling;
	}
	
	@Override
	public int luas() {
		// TODO Auto-generated method stub
		int luas = panjang * lebar;
		return luas;
	}

	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	
	
	

}
