

public class Arme {

	private int degat, proba, numid;
	private String nom;

	public Arme(int a, int b, int c, String d) {
		this.numid = a;
		this.degat = b;
		this.proba = c;
		this.nom = d;
	}

	public int Getdeg() {
		return this.degat;
	}

	public int Getpro() {
		return this.proba;
	}

	public String Getnom() {
		return this.nom;
	}

}



