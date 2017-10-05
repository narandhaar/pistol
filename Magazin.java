package pistol;

public class Magazin {
	private int kategoriMagazin[]= {1,2,3};
	private int isiMagazin;
	private int nomor;
	
	protected Magazin(int isiMagazin,int kategoriMagazin) {
		this.isiMagazin = isiMagazin;
		this.nomor=kategoriMagazin;
	}
	
	protected int getKategoriMagazin() {
		return this.kategoriMagazin[this.nomor];
	}
	
	protected int getIsiMagazin() {
		return this.isiMagazin;
	}
}

