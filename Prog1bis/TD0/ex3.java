
public class ex3 {
	public static void main(String[] arg) {
	    int a,b;
	    a = Ut.saisirEntier();
	    b = Ut.saisirEntier();
	    if(b>a) {
	    	a=b;
	    }
	    Ut.afficher("Plus Grand : " + a);
	}
}
