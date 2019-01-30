
public class ex5 {
	public static void main(String[] arg) {
	    int a = 0,m = 0;
	    while(a >= 0) {
	    	m=m+a;
	    	a=Ut.saisirEntier();
	    }
	    Ut.afficher("Somme : " + m);
	}
}
