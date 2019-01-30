
public class ex6 {
	public static void main(String[] arg) {
	    int a,b,c;
	    a = Ut.saisirEntier();
	    b = Ut.saisirEntier();
	    c = Ut.saisirEntier();
	    if(LPGDD(LPGDD(a,b),c) != LPGDD(a,b)) {
	    	c=LPGDD(a,b);
	    }
	    else if(LPGDD(LPGDD(a,b),c)==a) {
	    	c=LPGDD(b,c);
	    }
	    Ut.afficher("Mediane : " + c);
	}

	public static int LPGDD(int a, int b) {
	    if(b>a) {
	    	a=b;
	    }
	    return a;
	}
}
