
public class ex4 {
	public static void main(String[] arg) {
	    int a;
	    int f = 1;
	    a = Ut.saisirEntier();
	    for(int i = 1; i<=a; i++) {
	    	f=f*i;
	    }
	    Ut.afficher("Facto :" + f);
	}
}
