
import java.util.Scanner; 
import java.lang.*;

class MainDate { // Classe de test de Fraction et contenant la fonction principale

    public static void main(String args[]){
	
	Date d1, d2, d3;

	d1 = new Date(2000,10,11);

	d2 = new Date(2000,10,6);

	d3 = new Date(2018,11,8);

	d1.afficherDate();
	System.out.println();
	d1.lendemain().afficherDate();
	System.out.println(d2.ecart(d3));


    }
}

