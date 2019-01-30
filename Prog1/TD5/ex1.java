public class ex1 {
	public static void main(String[] arg) {
		int a = Ut.saisirEntier();
		int b = Ut.saisirEntier();
		Ut.afficherSL(PlusGrand(a,b));
	}
	public static boolean PlusGrand(int a, int b) {
		if (a>=b) return true;
		return false;
	}
}