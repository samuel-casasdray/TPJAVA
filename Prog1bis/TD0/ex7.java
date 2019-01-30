
public class ex7 {
	public static void main(String[] arg) {
	    int m = 0;
	    int[] Tab = new int[10];
	    for(int i = 0; i<10; i++) {
	    	Tab[i] = Ut.saisirEntier();
	    }
	    for(int i = 0; i<2; i++) {
	    	for(int j=0; j<10; j++) {
	    		Ut.afficher(Tab[j] + "|");
	    	}
	    	Tab = Inverse(Tab);
	    }
	    Ut.afficher(Somme(Tab));
	}

	public static int[] Inverse(int[] Tab) {
		int[] Tabb = new int[10];
		for(int i = 0; i<10; i++) {
			Tabb[9-i] = Tab[i];
		}
		return Tabb;
	}

	public static int Somme(int[] Tab) {
		int m = 0;
		for(int i = 0; i<10; i++) {
			m += Tab[i];
		}
		return m;
	}
}
