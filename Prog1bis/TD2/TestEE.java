

public class TestEE {

	public static void main(String[] args) {
		EE ens1, ens2, ens3, ens4, ens5;

		ens1 = new EE(5, new int[]{6,9,4,7,3});
		ens2 = new EE(10, "9 4 7 5 6 3 11 55 36 96");
		ens3 = new EE(ens1);
		ens4 = new EE(6);
		ens5 = new EE(5, new int[]{97,64,36,55,8});

		System.out.println("ens1 :"+ens1+"\nens2 :"+ens2 +"\nens3 :"+ens3);
		System.out.println("Cardinale : "+ens1.getCardinal()+"|"+ens2.getCardinal());
		System.out.println("Contient : "+ens1.contient(9)+"|"+ens2.contient(2));
		System.out.println("estVide : "+ens1.estVide()+";"+ens1.deborde()+"|"+ens4.estVide()+";"+ens4.deborde());
		System.out.println("estInclus : "+ens1.estInclus(ens2)+"|"+ens2.estInclus(ens1));
		System.out.println("estEgal : "+ens1.estEgal(ens2)+"|"+ens1.estEgal(ens3));
		System.out.println("estDisjoint : "+ens1.estDisjoint(ens2)+"|"+ens1.estDisjoint(ens4));
		System.out.println("intersection : "+ens2.intersection(ens5));
		System.out.println("reunion : "+ens2.reunion(ens5));
		System.out.println("difference : "+ens2.difference(ens1));
	}
// estInclus ; estEgal ; estDisjoint ; intersection ; reunion ; difference
}
