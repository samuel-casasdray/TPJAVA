class MD {
	public static void main(String args[]){
	 	D d1, d2, d3;

	 	d1 = new D(8,7,2000);
	 	d2 = new D(11,10,2008);
	 	d3 = new D(d1);

	 	d1.afficherDb();
	 	d2.afficherDb();
	 	d3.afficherDb();

	 	System.out.println(d1.ecart(d2));
	}
}