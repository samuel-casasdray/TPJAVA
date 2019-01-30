
import java.util.Random;

public class Orque {

	private int num, poids, pdv, agg;
	private Arene arene;
	private Arme arme;
	private double taille;
	private int posx, posy, dimFen;
	private Point perso;

	public Orque(int n, Arme a, Arene b, int dim) {
		this.num = n;
		this.arene = b;
		this.arme = a;
		this.taille = 1.8;
		this.pdv = 100;
		this.agg = 3;
		this.posx = new Random().nextInt(dim-10);
		this.posy = new Random().nextInt(dim-10);
		this.dimFen = dim;
		this.perso = new Point(this.posx, this.posy, new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
	}

	public int CombatGagnant(Orque b) {
		int x = new Random().nextInt(100) % 2;
		while(this.pdv >= 0 && b.pdv >= 0) {
			if(x == 1)
				if(new Random().nextInt(100) <= this.arme.Getpro())
					this.pdv -= this.arme.Getdeg();
			else
				if(new Random().nextInt(100) <= b.GetArme().Getpro())
					b.pdv -= b.GetArme().Getdeg();
			x = (x + 1) % 2;
		}
		if(this.pdv <= 0) {
			Point.removeInstance(this.perso);
			return b.num;
		}
		else {
			Point.removeInstance(b.perso);
			return this.num;
		}
	}

	public void SetCar(String what, double num) {
		if(num > 0) {
			if(what == "pdv")
				this.pdv = (int)num;
			else if (what == "taille")
				this.taille = num;
			else if (what == "agg")
				this.agg = (int)num;
		}
	}

	public int Getpdv() {
		return this.pdv;
	}

	public void Setpdv(int a) {
		this.pdv = a;
	}

	public Arme GetArme() {
		return this.arme;
	}

	public int Getnum() {
		return this.num;
	}

	public int getPosx() {
		return posx;
    }
	
    public int getPosy() {
		return posy;
    }

	public void move() {
		int a = new Random().nextInt(10);
		if(new Random().nextBoolean()) {
			if(new Random().nextBoolean()) {
				if(this.posx+a < this.dimFen - 20)
					this.posx+=a;
			}
			else if(this.posx-a > 0)
				this.posx-=a;
		}
		else {
			if(new Random().nextBoolean()) {
				if(this.posy+a < this.dimFen - 20)
					this.posy+=a;
			}
			else if(this.posy-a > 0)
				this.posy-=a;
		}
		this.perso.MovePos(this.posx, this.posy);
	}

}


