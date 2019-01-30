
public class ex12 {
	public static void main(String[] arg) {
		int[][] Tab = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				Tab[i][j] = Ut.saisirEntier();
			}
		}
		for (int k=0; k<2; k++) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if (k==0) {
						Ut.afficher(Tab[i][j]);
					}
					else {
						Ut.afficher(Tab[j][i]);
					}
					if(j!=2) {
						Ut.afficher("|");
					}
				}
				if(i!=2) {
					Ut.afficher("\n-----\n");
				}
			}
			if(k==0) {
				Ut.afficher("\n#####\n");
			}
		}
	}
}
