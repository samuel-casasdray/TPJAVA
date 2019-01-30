 
import java.util.Random;
import java.util.Scanner;

public class Battleship {

	private int[][] Plateau;
	private int NbCoup, NbCoupMax, NbCoule;

	public Battleship() { }

	public void initPlateau() {
		Plateau = new int[10][10];
		NbCoup = 0;
		NbCoule = 0;
		for(int i=0; i<Plateau.length; i++) {
			for(int j=0; j<Plateau.length; j++) {
				Plateau[i][j]=0;
			}
		}
		for(int i=0; i<Plateau.length; i++) {
			int x = new Random().nextInt(Plateau.length);
			int y = new Random().nextInt(Plateau.length);
			if(Plateau[x][y] == 0) Plateau[x][y] = 1;
			else i--;
		}		
	}

	public void affichePlateau() {
		for(int i=0; i<this.Plateau.length; i++) {
			for(int j=0; j<this.Plateau.length; j++) {
				if(this.Plateau[i][j] > 9)
					System.out.print(this.Plateau[i][j]);
				else
					System.out.print("0");
				if(j<this.Plateau.length - 1)
					System.out.print("|");
			}
			if(i<this.Plateau.length - 1)
				System.out.print("\n-------------------\n");
		}
	}

	public void devoileCase(int i, int j) {
		if(this.Plateau[i][j] == 1)
			this.NbCoule++;
		this.NbCoup++;
		if(this.Plateau[i][j] < 2)
			this.Plateau[i][j]+=10;
		this.affichePlateau();
	}

	public void GameProgress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre de coup max : ");
		this.NbCoupMax = sc.nextInt();
		this.initPlateau();
		while(NbCoup < NbCoupMax && NbCoule != 10) {
			int a = 0, b = 0;
			System.out.println("Veuillez saisir les coordonnées a attaquer : ");
			while(!(0 < a && a < 11 && 0 < b && b < 11 )) {
				a = sc.nextInt();
				b = sc.nextInt();
			}
			devoileCase(a-1,b-1);
			System.out.println("\nIl vous reste " + (NbCoupMax - NbCoup) + " coups et vous avez touche " + NbCoule + " bateaux");
		}
		if(NbCoule == 10) 
			System.out.println("Vous avez gagne");
		else
			System.out.println("Vous avez perdu");
	}

}

