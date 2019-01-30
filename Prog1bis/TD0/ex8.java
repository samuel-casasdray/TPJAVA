
public class ex8 {
	public static void main(String[] arg) {
		for(int i = 0; i<arg.length; i++) {
			char[] Tab = arg[i].toCharArray();
			for(int j = 0; j<Tab.length; j++) {
				if((int)Tab[j] > 96 && (int)Tab[j] < 123)
					Tab[j] = (char)(((int)Tab[j])-32);
				Ut.afficher(Tab[j]);
			}
			Ut.afficher(" ");
		}
	}
}
