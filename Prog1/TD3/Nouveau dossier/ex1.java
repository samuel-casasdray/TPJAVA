
public class ex1 {
	public static void main(String[] args) {
		TraiteTabInt();
	}

	public static void TraiteTabInt() {
		int tab[] = new int[20];
		for(int i=0; i<tab.length; i++) {
			tab[i] = i+1;//Ut.saisirEntier();
			if(i%2==1) tab[i]+=1;
		}
		for(int i=0; i<tab.length; i++)
			Ut.afficher(tab[i] + " | ");
		Ut.afficher("\n" + somme(tab) + "\n");
		Ut.afficher(moyenne(tab) + "\n");
	}

	public static int somme(int[] tab) {
		int som=0;
		for(int i=0; i<tab.length; i++)
			som+=tab[i];
		return som;
	}

	public static float moyenne(int[] tab) {
		float moy = 1;
		for(int i=0; i<tab.length; i++)
			moy*=tab[i];
		return (moy/(tab.length));
	}
}
