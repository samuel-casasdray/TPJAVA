public class D {

	private int jour;
	private int mois;
	private int annee;
	private static final String[] moisLettres = {" janvier "," fevrier "," mars "," avril "," mai "," juin "," juillet "," aout "," septembre "," octobre "," novembre "," decembre "};

	public D(int j, int m, int a) {
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}

	public D(D d) {
		this.jour = d.jour;
		this.mois = d.mois;
		this.annee = d.annee;
	}

	public void afficherDb() {
		 System.out.println(this.jour + this.moisLettres[this.mois - 1] + this.annee);
		 System.out.println (this.jour +"/"+ this.mois  +"/" + this.annee);
	}

	private boolean anneeEstBissectile() {
		if((this.annee%4==0 && this.annee%100!=0) || (this.annee%400==0))
			return true;
		else 
			return false;
	}

	public D lendemain() {
		D d = new D(this);
		d.jour += 1;
		int a = 28;
		if(this.anneeEstBissectile()) a++;
		if((d.mois == 2 && d.jour > a) || ((d.mois == 4 || d.mois == 6 || d.mois == 9 || d.mois == 11) && d.jour > 30) || d.jour > 31) {
			d.mois+=1;
			d.jour=1;
		}
		if(d.mois>12) {
			d.mois=1;
			d.annee+=1;
		}
		return d;
	}

	public boolean egal(D d){
		if ( this.jour == d.jour && this.mois == d.mois && this.annee == d.annee)
			return true;
		return false;
		
	}

	public boolean apres(D d){
		if (this.annee > d.annee || this.mois>d.mois || this.jour>d.jour )
			return true;
		return false;
	}

	public boolean avant(D d){
		if (this.annee < d.annee || this.mois<d.mois || this.jour<d.jour )
			return true;
		return false;
	}
	public int ecart(D d){
		int i=0;
		D d2 = new D(this);
		while(d.avant(d2)) {
			d = d.lendemain();
			i++;
		}
		while(d.apres(d2)) {
			d2.lendemain();
			i++;
		}
		return i;
	}
}
