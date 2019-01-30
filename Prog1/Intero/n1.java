
public class n1 {
	public static void main(String[] args) {
		Ut.afficher("Entrez N : ");
		int N = Ut.saisirEntier();
		int[] Tab =new int[N];
		for(int i=0; i<N; i++) {
			Ut.afficher("Afficher le nombre n°"+(i+1)+" de Tab : ");
			Tab[i] = Ut.saisirEntier();
		}
		Ut.afficher("Tab = {"+Tab[0]);
		for(int i=0; i<N-1; i++) 
			Ut.afficher(", "+Tab[i+1]);
		Ut.afficherSL("}");
		Ut.afficherSL(vof(Tab));
	}

	public static boolean vof(int[] Tab) {
		for(int i=0; i<(Tab.length)/2; i++) {
			if(Tab[i]+Tab[(Tab.length)-i-1] != 10) {
				return false;
			}
		}
		if((float)Tab.length/2 != Tab.length/2)
			if(Tab[Tab.length/2]!=10)
				return false;
		return true;

	}
}