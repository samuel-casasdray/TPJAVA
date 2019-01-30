public class EE {

	private int[] ensTab;
	private int cardinal;

	public EE(int max) {
		this.cardinal = 0;
		this.ensTab = new int[max];
	}

	public EE(int max, int[] Tab) {
		this(max);
		if(Tab.length < max)
			max = Tab.length;
		for(int i=0; i<max; i++)
			this.ajoutElt(Tab[i]);
	}

	public EE(EE ens) {
		this(ens.cardinal, ens.ensTab);
	}

	public EE(int max, String liste) {
		this(max);
		for(int i=0; i<max; i++)
			this.ajoutElt(Integer.parseInt(liste.split(" ")[i]));
	}

	public String toString() {
		String a = "{";
		for(int i = 0; i<this.cardinal; i++) {
			a = a + ensTab[i];
			if (i < this.cardinal - 1)
				a = a + ", ";
		}
		return (a + "}");
	}

	public int getCardinal() { return this.cardinal; }

	private int contientPratique(int nb) {
		int a = -1;
		for(int i = 0; i<this.cardinal; i++) {
			if(ensTab[i] == nb) {
				a = i;
				break;
			}
		}
		return a;
	}

	public boolean contient(int nb) {
		if(contientPratique(nb) == -1)
			return false;
		return true;
	}

	private void ajoutPratique(int e) {
		this.ensTab[this.cardinal] = e;
		this.cardinal++;
	}

	private int retraitPratique(int i) {
		if(0 <= i && i< this.cardinal) {
			int a = this.ensTab[i];
			this.ensTab[i] = this.ensTab[(cardinal -1)];
			this.cardinal--;
			return a;
		}
		return -1;
	}

	public boolean estVide() {
		return this.cardinal == 0;
	}

	public boolean deborde() {
		return this.cardinal == this.ensTab.length;
	}

	public boolean retraitElt(int i) {
		if(this.contient(i)) {
			this.retraitPratique(this.contientPratique(i));
			return true;
		}
		return false;
	}

	public int ajoutElt(int i) {
		if(this.deborde())
			return -1;
		else if(this.contient(i))
			return 0;
		else {
			this.ajoutPratique(i);
			return 1;
		}
	}

	public boolean estInclus(EE ens) {
		boolean b = true;
		for (int i=0; i<this.cardinal; i++) {
			if(!ens.contient(this.ensTab[i]))
				b=false;
		}
		return b;
	}

	public boolean estEgal(EE ens) {
		if(ens.cardinal == this.cardinal && this.estInclus(ens))
			return true;
		return false;
	}

	public boolean estDisjoint(EE ens) {
		boolean b = true;
		for (int i=0; i<this.cardinal; i++) {
			if(ens.contient(this.ensTab[i]))
				b=false;
		}
		return b;
	}

	public EE intersection(EE ens) {
		EE ensbis = new EE(this.cardinal);
		for (int i=0; i<ens.cardinal; i++) {
			if(this.contient(ens.ensTab[i]))
				ensbis.ajoutElt(ens.ensTab[i]);
		}
		return ensbis;
	}

	public EE reunion(EE ens) {
		EE ensbis = new EE(ens.cardinal + this.cardinal, ens.ensTab);
		for(int i=0; i<this.cardinal; i++)
			ensbis.ajoutElt(this.ensTab[i]);
		return ensbis;
	}

	public EE difference(EE ens) {
		EE ensbis = new EE(ens.cardinal + this.cardinal, this.ensTab);
		for(int i=0; i<ens.cardinal; i++)
			ensbis.retraitElt(ens.ensTab[i]);
		return ensbis;
	}

}