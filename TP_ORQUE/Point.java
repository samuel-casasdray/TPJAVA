
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/* Auteur principal : Loic Wisniewski ; date de creation : decembre 2014 ; mise a jour : 1 decembre 2014  */

public class Point {

    private Color c;
    private int x;
    private int y;
    private static List<Point> InstanceList = new ArrayList<Point>(); // liste des instances de la classe, pour les afficher simplement.
	
    public Point(int posx, int posy){ // constructeur minimal
	this.x = posx;
	this.y = posy;
	this.c = new Color(0,0,0);
	InstanceList.add(this);
	draw();
    }
	
    public Point(int posx, int posy, int R, int G, int B){ // constructeur avec couleur
	this(posx, posy);
	setColor(R,G,B);
	draw();
    }
	
    public Point(Point p){ // constructeur par recopie
	this.x = p.x;
	this.y = p.y;
	this.c = new Color(p.getColor().getRed(), p.getColor().getGreen(), p.getColor().getBlue());
	draw();
    }
	
    public void setColor(int R, int G, int B){ // pour changer la couleur d'un point
	this.c = new Color(R,G,B);
	draw();
    }
	
    public Color getColor(){ // recupere la couleur (pratique pour l'affichage)
	return c;
    }
	
    public int getPosx(){ // obtention de la position pour l'affichage
	return x;
    }
	
    public int getPosy(){
	return y;
    }

    public void MovePos(int a, int b) {
    	this.x = a;
    	this.y = b;
    	draw();
    }

    public static void removeInstance(Point point) {
    	InstanceList.remove(point);
    }
	
    public static Point getInstance(int id){ // methode de classe permettant de recuperer l'instance numero 'id' (sans modifier la liste)
	return InstanceList.get(id);
    }
	
    public static int numberInstances(){ // utile pour afficher tous les points crees : boucle de id=0 a id=Point.numerInstances
	return InstanceList.size();
    }
	
    private void draw(){ // permet d'actualiser l'affichage lors d'un changement de couleur
	Fenetre.getInstance().actualiserAffichage();
    }
}
