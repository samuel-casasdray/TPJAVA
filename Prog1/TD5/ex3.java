public class ex3 {
	public static void main(String[] arg) {
		int N = Ut.saisirEntier();
		Ut.afficherSL(NbChiffres(N));
		Ut.afficherSL(NbChiffresCarre(N));
	}
	public static int NbChiffres(int N) {
		int m=0;
		while(N>0) {
			m+=1;
			N=N/10;
		}
		return m;
	}
	public static int NbChiffresCarre(int N) {
		return NbChiffres(N*N);
	}
}