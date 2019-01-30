
public class fibo {
	public static void main(String[] args) {
		mainmenu();
	}

	public static void mainmenu() {
		int a=0;
		while(1>a || a>4) {
			Ut.afficher("Entrer un entier entre 1 et 4 : ");
			a = Ut.saisirEntier();
		}
		if (a==1) question1();
		else if (a==2) question2();
		else if (a==3) question3();
	}

	public static double absolu(double a) {
		if(a < 0) return -a;
		else return a;
	}

	public static void question1() {
		int Max=-1;
		while(Max < 0) {
			Ut.afficher("Entrer un entier superieur a 1 : ");
			Max = Ut.saisirEntier();
		}
		if(Max==0) mainmenu();
		else { affiche1(Max); }
	}

	public static void affiche1(int Max) {
		int Ua=1, Ub=1, Un, Iv = -1, Iw = -1;
		double Vn, P, Va, Wn, Or;
		Or = (1+Math.sqrt(5))/2;
		Ut.afficher((double)Math.pow( 10, -15 ));
		Un = Ua + Ub;
		Vn = (double)Un / (double)Ua;
		P = Vn * Vn - Vn - 1;
		Va = Vn;
		Ub = Ua;
		Ua = Un;
		Ut.afficher("i : " + 2 + ", Un : " + Un + ", Vn : " + Vn + ", P(Vn) : " + P + "\n");
		for(int i=3; i<=Max; i++) {
			Un = Ua + Ub;
			Vn = (double)Un / (double)Ua;
			P = Vn * Vn - Vn - 1;
			Wn = (Vn + Va) / 2;
			Va = Vn;
			Ub = Ua;
			Ua = Un;
			Ut.afficher("i : " + i + ", Un : " + Un + ", Vn : " + Vn + ", P(Vn) : " + P + ", Wn : " + Wn + "\n");
			if (Vn==Or && Iv==-1) Iv = i;
			if (Wn==Or && Iw==-1) Iw = i;
		}
		Ut.afficher("Iteration Vn : " + Iv + ", et Wn : " + Iw + "\n");
		question1();		
	}

	public static void question2() {
		double Ep=-1;
		while(Ep < 0) {
			Ut.afficher("Entrer un reel superieur a 0 : ");
			Ep = Ut.saisirReel();
		}
		if(Ep==0) mainmenu();
		else { affiche2(Ep); }
	}

	public static void affiche2(double Ep) {
		int Ua=1, Ub=1, Un, i=3;
		double Vn, P, Va, Wn;
		Un = Ua + Ub;
		Vn = (double)Un / (double)Ua;
		P = Vn * Vn - Vn - 1;
		Va = Vn;
		Ub = Ua;
		Ua = Un;
		Ut.afficher("i : " + i + ", Un : " + Un + ", Vn : " + Vn + ", P(Vn) : " + P + "\n");
		while(Ep < absolu(P)) {
			i++;
			Un = Ua + Ub;
			Vn = (double)Un / (double)Ua;
			P = Vn * Vn - Vn - 1;
			Wn = (Vn + Va) / 2;
			Va = Vn;
			Ub = Ua;
			Ua = Un;
			Ut.afficher("i : " + i + ", Un : " + Un + ", Vn : " + Vn + ", P(Vn) : " + P + ", Wn : " + Wn + "\n");
		}
		question2();
	}

	public static void question3() {
		double Ep=-1;
		while(Ep < 0) {
			Ut.afficher("Entrer un reel superieur a 0 : ");
			Ep = Ut.saisirReel();
		}
		if(Ep==0) mainmenu();
		else { affiche3(Ep); }
	}

	public static void affiche3(double Ep) {
		int Ua=1, Ub=1, Un, i=2;
		double Vn=9999, P=0, Or, Va, Wn;
		Or = (1+Math.sqrt(5))/2;
		Ut.afficher("Or : " + Or + "\n");
		i++;
		Un = Ua + Ub;
		Vn = (double)Un / (double)Ua;
		P = Vn * Vn - Vn - 1;
		Va = Vn;
		Ub = Ua;
		Ua = Un;
		Ut.afficher("i : " + i + ", Un : " + Un + ", Vn : " + Vn + ", P(Vn) : " + P + "\n");
		while(Ep < absolu(Vn-Or)) {
			i++;
			Un = Ua + Ub;
			Vn = (double)Un / (double)Ua;
			P = Vn * Vn - Vn - 1;
			Wn = (Vn + Va) / 2;
			Va = Vn;
			Ub = Ua;
			Ua = Un;
			Ut.afficher("i : " + i + ", Un : " + Un + ", Vn : " + Vn + ", P(Vn) : " + P + ", Wn : " + Wn + "\n");
		}
		question3();
	}
}
