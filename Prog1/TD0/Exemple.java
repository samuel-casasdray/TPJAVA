public class Exemple {
	// Action: demande à l’utilisateur de saisir deux entiers et affiche leur somme
	public static void main(String[] args) {
		int x, y, somme;
		Ut.afficher("Entrer un premier entier : ");
		x = Ut.saisirEntier();
		Ut.afficher("Entrer un deuxième entier : ");
		y = Ut.saisirEntier();
		somme = x + y;
		Ut.afficher("La somme est " + somme + "\n");
		Ut.afficher("Merci de votre attention ! \n");
	}
}
