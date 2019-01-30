public class Date {

	private int years;
	private int mounth;
	private int days;
	private static final String[] moisLettres = {"janvier","fevrier","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","decembre"};

	private boolean anneeEstBissectile() {
		if((this.years%4==0 && this.years%100!=0) || (this.years%400==0))
			return true;
		else 
			return false;
	}

	public Date(int a, int b, int c) {
		this.years = a;
		this.mounth = b;
		this.days = c;
	}

	public Date(Date d) {
		this.years = d.years;
		this.mounth = d.mounth;
		this.days = d.days;
	}

	public Date lendemain() {
		Date d = new Date(this);
		d.days += 1;
		int a = 28;
		if(this.anneeEstBissectile()) a++;
		if((d.mounth == 2 && d.days > a) || ((d.mounth == 4 || d.mounth == 6 || d.mounth == 9 || d.mounth == 11) && d.days > 30) || d.days > 31) {
			d.mounth+=1;
			d.days=1;
		}
		if(d.mounth>12) {
			d.mounth=1;
			d.years+=1;
		}
		return d;
	}
	
	public void afficherDate() {
		Ut.afficher(this.days + " " + moisLettres[this.mounth-1] + " " + this.years+"\n");
		Ut.afficher(this.days + "/" + this.mounth + "/" + this.years+"\n");
	}

	public boolean egal(Date d){
		if ( this.days == d.days && this.mounth == d.mounth && this.years == d.years)
			return true;
		return false;
	}

	public boolean apres(Date d){
		if ((this.years > d.years)||(this.years == d.years && this.mounth>d.mounth)||(this.years == d.years && this.mounth == d.mounth && this.days>d.days))
			return true;
		return false;
	}

	public boolean avant(Date d){
		if (this.egal(d) || this.apres(d))
			return false;
		return true;
	}
	public int ecart(Date d){
		int i=0;
		Date d2 = new Date(this);
		while(d.avant(d2)) {
			d = d.lendemain();
			i++;
		}
		while(d.apres(d2)) {
			d2 = d2.lendemain();
			i++;
		}
		return i;
	}

}