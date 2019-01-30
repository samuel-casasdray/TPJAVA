
public class ex2 {
	public static void main(String[] arg) {
	    int n,h,m,s;
	    n = Ut.saisirEntier();
	    s = n % 60;
	    h = n / 3600;
	    m = (n % 3600) / 60;
	    Ut.afficher(n+"s = "+h+":"+m+":"+s);
	}
}
