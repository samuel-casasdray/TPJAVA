
public class ex11 {
	public static void main(String[] arg) {
		int[][] Tab = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				Tab[i][j] = Ut.saisirEntier();
			}
		}
		boolean b = true;
		if(Tab[0][1] != Tab[1][0] || Tab[0][1] != Tab[1][0] || Tab[0][1] != Tab[1][0]) {
			b = false;
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				Ut.afficher(Tab[i][j]);
				if(j!=2) {Ut.afficher("|");}
			}
			if(i!=2) {Ut.afficher("\n-----\n");}
		}
		Ut.afficher("\nSymetrique ?"+b+"\n");
	}
}
