
public class ex9 {
	public static void main(String[] arg) {
		int[] Tab = new int[10];
		for(int i = 0; i<10; i++) {
			Tab[i] = Ut.saisirEntier();
		}
		int a = Ut.saisirEntier();
		boolean b = false;
		for(int i = 0; i<10; i++) {
			if(Tab[i] == a) { b = true; }
		}
		Ut.afficher("Present ? " + b);
	}
}
