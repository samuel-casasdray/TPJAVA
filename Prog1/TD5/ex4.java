public class ex4 {
	public static void main(String[] arg) {
		int N = Ut.saisirEntier();
		Ut.afficherSL(AnneeBissextile(N));
	}
	public static boolean AnneeBissextile(int A) {
		if ((A%4==0 && A%100!=0) || A%400==0) return true;
		return false;
	}
}