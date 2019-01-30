
import java.util.Random;

public class Arene {

	private EE ensOrques, ensArmes;
	private static Orque[] tabOrques;
	public int nbOrques;
	private Fenetre fen = Fenetre.getInstance();
	private int TailleFen;

	public Arene(int nbo) {
		String[] Tab = {"hache", "epee", "dague", "lance", "fleau", "arc"};
		this.tabOrques = new Orque[nbo];
		this.ensOrques = new EE(nbo);
		this.ensArmes = new EE(nbo);
		this.TailleFen = 20 * nbo;
		fen.createFenetre(this.TailleFen, this.TailleFen, "Arene de combat d'orque");
		for(int i = 0; i<nbo; i++) {
			int a = 30 + new Random().nextInt(20);
			int b = 70 + new Random().nextInt(30);
			String c = Tab[new Random().nextInt(Tab.length)];
			this.ensArmes.ajoutElt(i+nbOrques);
			this.tabOrques[i] = new Orque(i+nbOrques, new Arme(i+nbOrques, a, b, c), this, this.TailleFen);
			this.ensOrques.ajoutElt(i+nbOrques);
		}
		nbOrques += nbo;
		this.move();
	}

	public void bataille() {
		for (int i=0; i<tabOrques.length; i++) {
			boolean verif = false;
			for (int j=0; j<tabOrques.length; j++) {
				for (int k=0; k<tabOrques.length; k++) {
					if((Maths.absolu(tabOrques[j].getPosx() - tabOrques[k].getPosx()) < 20 && Maths.absolu(tabOrques[j].getPosy() - tabOrques[k].getPosy()) < 20) && j!=k && this.ensOrques.contient(j) && this.ensOrques.contient(k)) {
						int a = j;
						int b = k;
						this.ensOrques.retraitElt(j);
						this.ensOrques.retraitElt(k);
						System.out.print("Combat entre orque "+a+" et "+b);
						a = this.tabOrques[a].CombatGagnant(this.tabOrques[b]);
						System.out.println(" : Victoire de "+a+" avec "+tabOrques[a].Getpdv()+" pdv");
						this.ensOrques.ajoutElt(a);
					}
					if(verif) break;
				}
				if(verif) break;
			}
		}
	}

	public void move() {
		while(this.ensOrques.getCardinal()!=1) {
			for(int i = 0; i<tabOrques.length; i++) {
				tabOrques[i].move();
			}
		    try {
				Thread.sleep(200);
		    } 
		    catch (InterruptedException e) {
				e.printStackTrace();
		    }
		    bataille();
		}
		for(int i = 0; i<tabOrques.length; i++) {
			tabOrques[i].move();
		}
		System.out.println("Le vainqueur est l'orque " + (this.ensOrques.toString()).replace("{", "").replace("}", ""));
	}

	public int GetSizeFen() {
		return this.TailleFen;
	}
}




