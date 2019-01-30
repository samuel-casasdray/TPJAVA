public class ex4 {
	public static void main(String[] args) {
		Ut.afficher("Entrez Mot : ");
		String mot = (Ut.saisirString()).toUpperCase();
		int l = (mot.split("")).length;
		Ut.afficherSL(vof(mot , l));
	}

	public static boolean vof(String mot, int l) {
		for(int i=0; i<(l)/2; i++) {
			if((char)mot.charAt(i)!=(char)mot.charAt(l-i-1)) {
				return false;
			}
		}
		return true;
	}
}