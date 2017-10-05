package pistol;

public class Pistol {
	private Magazin m1;
	private String namaPistol;
	private int kategoriPistol;
	private int jumlahPeluru;
	private boolean peluru=true;
	
	protected Pistol(String namaPistol,int kategoriPistol) {
		this.namaPistol=namaPistol;
		this.kategoriPistol=kategoriPistol;
	}
	
	protected void isiMagazin(int isiMagazin,int kategoriMagazin) {
		m1 = new Magazin(isiMagazin,kategoriMagazin-1);
	}
	
	protected void isiPeluru(int jumlahPeluru, int kategoriPeluru) {
		if(m1.getIsiMagazin()>jumlahPeluru) {
		if(kategoriPeluru==m1.getKategoriMagazin()) {
		this.jumlahPeluru += jumlahPeluru;
		} else if(kategoriPeluru!=m1.getKategoriMagazin()){
			System.out.println("Masukkan kategori peluru yang benar");
		} else if (jumlahPeluru==m1.getIsiMagazin()) {
			System.out.println("Masukkan jumlah peluru sesuai dengan isi Magazin");
		}
		}
		else {
			System.out.println("Jumlah isi magazine full");
		}
	}
	
	protected void tembak() {
		if(this.jumlahPeluru>0) {
		System.out.println("Door");
		jumlahPeluru--;
		peluru = true;
		} else {
			System.out.println("Masukkan peluru");
			peluru = false;
		}
	}
	
	protected void statusPistol() {
		if(this.peluru==false) {
			System.out.println("Tolong Masukkan Peluru");
		} else {
			System.out.println("Nama Pistol"+this.namaPistol+"\nTipe Pistol"+this.kategoriPistol+
					"\nJumlah Peluru"+this.jumlahPeluru);
		}
	
	}
}
