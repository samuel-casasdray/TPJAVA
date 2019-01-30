
public class ex10 {
	public static void main(String[] arg) {
		int[] Tab = new int[10];
		for(int i = 0; i<10; i++) {
			Tab[i] = Ut.saisirEntier();
		}
		boolean b = true;
		for(int i = 1; i<10; i++) {
			if(Tab[i-1] > Tab[i]) { b = false; }
		}
		Ut.afficher("Croissant ? " + b);
	}
}
