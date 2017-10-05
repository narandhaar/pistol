package pistol;

public class Main {
	public static void main(String[]args) {
		Pistol pistol = new Pistol("Tembak",1);
		pistol.isiMagazin(5,1);
		pistol.isiPeluru(3,1);
		pistol.statusPistol();
		pistol.tembak();
		pistol.statusPistol();
		pistol.tembak();
		pistol.statusPistol();
		pistol.tembak();
		pistol.statusPistol();
		pistol.tembak();
		pistol.statusPistol();
	}

}
