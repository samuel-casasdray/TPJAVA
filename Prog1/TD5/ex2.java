public class ex2 {
	public static void main(String[] arg) {
		int a = Ut.saisirEntier();
		int b = Ut.saisirEntier();
		int c = Ut.saisirEntier();
		Ut.afficherSL(PlusGrandDesDeux(a,b));
		Ut.afficherSL(PlusGrandDesTrois(a,b,c));
		Ut.afficherSL(EntierDuMilieu(a,b,c));
	}
	public static int PlusGrandDesDeux(int a, int b) {
		if (a>=b) return a;
		return b;
	}
	public static int PlusGrandDesTrois(int a, int b, int c) {
		int m=a;
		if(m<b) m=b;
		if(m<c) m=c;
		return m;
	}
	public static int EntierDuMilieu(int a, int b, int c) {
		int m = PlusGrandDesTrois(a,b,c);
		int n = 0;
		if(n<a && a!=m) n=a;
		if(n<b && b!=m) n=b;
		if(n<c && c!=m) n=c;
		return n;
	}
}