public class ex1 {
	public static void main(String[] arg) {
		int a = Ut.saisirEntier();
		MULTIPLICATION(a);
	}
	public static void MULTIPLICATION(int N) {
		for(int i=1; i<11; i++)
			Ut.afficherSL(i+" * "+N+" = "+N*i);
	}
}