
import java.util.Random;

public class ex3 {
	public static void main(String[] args) {
		int[] Tab = new int[30];
		for(int i=0; i<Tab.length; i++) {
			Tab[i] = new Random().nextInt(200);
			Ut.afficher(Tab[i]+"|");
		}
		Ut.passerLigne();
		//Ut.afficher(Indice(Tab));
		Tri(Tab);
	}

	public static int Indice(int[] Tab) {
		int a = 0;
		for(int i=0; i<Tab.length; i++)
			if(Tab[i]>Tab[a]) 
				a=i;
		return a;
	}

	public static int IndicePlusGrandRelatif(int[] Tab, int a, int b) {
		int c = b;
		if(a>=0 && b <= 29) {
			for(int i = a; i<=b; i++)
				if(Tab[i]>Tab[c]) 
					c=i;
		}
		return c;
	}

	public static void Tri(int[] Tab) {
		int nb;
		for(int i = 0; i<Tab.length; i++) { //Ordre croissant
			nb = IndicePlusGrandRelatif(Tab, 0, Tab.length-2-i);
			if(nb>=0 && Tab[Tab.length-1-i]<=Tab[nb]) {
				Tab[Tab.length-1-i] = Tab[Tab.length-1-i] + Tab[nb];
				Tab[nb] = Tab[Tab.length-1-i] - Tab[nb];
				Tab[Tab.length-1-i] = Tab[Tab.length-1-i] - Tab[nb]; 
			}
		}
		/*for(int i = 0; i<Tab.length; i++) { // Ordre decroissant
			nb = IndicePlusGrandRelatif(Tab, i+1, Tab.length-1);
			if(nb<Tab.length) {
				Tab[i] = Tab[i] + Tab[nb];
				Tab[nb] = Tab[i] - Tab[nb];
				Tab[i] = Tab[i] - Tab[nb]; 
			}
		}*/
		for(int i=0; i<Tab.length; i++)
			Ut.afficher(Tab[i]+"|");
		Ut.passerLigne();
	}
}