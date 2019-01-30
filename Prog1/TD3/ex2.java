
public class ex2 {
	public static void main(String[] args) {
		CalculeNbreChiffresb(Ut.saisirEntier());
	}

	public static void CalculeNbreChiffres(int N){
		int[] Tab = new int[10];
		String tp = Integer.toString(N);
		int[] tplist = new int[tp.length()];
		for (int i = 0; i < tp.length(); i++)
			Tab[tp.charAt(i) - '0']++;
		for (int i=0; i< Tab.length; i++)
			Ut.afficher(Tab[i]+"|");
		ChiffresDistincs(Tab);
	}

	public static void CalculeNbreChiffresb(int N){
		int[] Tab = new int[10];
		while(N>0) {
			Tab[N%10]++;
			N = N/10;
		}
		for(int i=0; i<Tab.length; i++)
			Ut.afficher(Tab[i]+"|");
		ChiffresDistincs(Tab);
	}

	public static void ChiffresDistincs(int[] Tab) {
		boolean val = true;
		for(int i=0; i<Tab.length; i++) {
			for(int j=0; j<Tab.length; j++)
				if(Tab[i]==Tab[j] && Tab[i]!=0 && i!=j) {
					val=false;
					break;
				}
			if(!val) break;
		}
		Ut.afficher("\n"+val+"\n");
	}
}
