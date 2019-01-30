import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class EE
{
  private int cardinal;
  private int[] ensTab;
  
  public EE(int paramInt)
  {
    ensTab = new int[paramInt];
    cardinal = 0;
  }
  
  public EE(int[] paramArrayOfInt, int paramInt) {
    this(paramInt);
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      ajoutElt(paramArrayOfInt[i]);
    }
  }
  
  public EE(EE paramEE) {
    /*this(paramEE.length);
    for (int i = 0; i < cardinal; i++) {
      ajoutElt(paramEE[i]);
    }*/
  }
  
  public EE(String paramString, int paramInt) {
    this(paramInt);
    Scanner localScanner = new Scanner(paramString);
    while (localScanner.hasNext()) {
      ajoutElt(localScanner.nextInt());
    }
  }
  
  public EE(File paramFile, int paramInt) {
    this(paramInt);
    try
    {
      Scanner localScanner = new Scanner(paramFile);
      while (localScanner.hasNext()) {
        ajoutElt(localScanner.nextInt());
      }
    }
    catch (FileNotFoundException localFileNotFoundException) {
      System.out.println(localFileNotFoundException);
      System.exit(0);
    }
  }
  
  public String toString() {
    String str = "{";
    for (int i = 0; i < cardinal - 1; i++) {
      str = str + ensTab[i] + ",";
    }
    if (cardinal > 0) {
      str = str + ensTab[(cardinal - 1)];
    }
    str = str + "}";
    return str;
  }
  

  public int getCardinal()
  {
    return cardinal;
  }
  


  private int contientPratique(int paramInt)
  {
    int i = 0;
    while ((i < cardinal) && (ensTab[i] != paramInt)) {
      i++;
    }
    if (i == cardinal) {
      return -1;
    }
    return i;
  }
  
  public boolean contient(int paramInt) {
    return contientPratique(paramInt) >= 0;
  }
  



  private void ajoutPratique(int paramInt)
  {
    ensTab[cardinal] = paramInt;
    cardinal += 1;
  }
  



  private int retraitPratique(int paramInt)
  {
    int i = ensTab[paramInt];
    ensTab[paramInt] = ensTab[(cardinal - 1)];
    cardinal -= 1;
    return i;
  }
  


  public boolean estVide()
  {
    return cardinal == 0;
  }
  


  public boolean deborde()
  {
    return cardinal == ensTab.length;
  }
  





  public boolean retraitElt(int paramInt)
  {
    int i = contientPratique(paramInt);
    if (i == -1) {
      return false;
    }
    retraitPratique(i);
    return true;
  }
  




  public int ajoutElt(int paramInt)
  {
    if (deborde())
      return -1;
    if (contient(paramInt)) {
      return 0;
    }
    ajoutPratique(paramInt);
    return 1;
  }
  



  public int selectElt()
  {
    cardinal -= 1;
    return ensTab[cardinal];
  }
  


  public int selectEltAleatoirement()
  {
    int i = Ut.randomMinMax(0, cardinal - 1);
    int j = retraitPratique(i);
    return j;
  }
  




  public boolean estInclus(EE paramEE)
  {
    int i = 0;
    while ((i < cardinal) && (paramEE.contient(ensTab[i]))) {
      i++;
    }
    return i == cardinal;
  }
  




  public boolean estEgal(EE paramEE)
  {
    return (cardinal == cardinal) && (estInclus(paramEE));
  }
  








  public boolean estDisjoint(EE paramEE)
  {
    int i = 0;
    while ((i < cardinal) && (!paramEE.contient(ensTab[i]))) {
      i++;
    }
    return i == cardinal;
  }
  








  public EE intersection(EE paramEE)
  {
    EE localEE = new EE(ensTab.length);
    for (int i = 0; i < cardinal; i++) {
      if (paramEE.contient(ensTab[i])) {
        localEE.ajoutPratique(ensTab[i]);
      }
    }
    return localEE;
  }
  







  public EE reunion(EE paramEE)
  {
    EE localEE = new EE(this);
    
    for (int i = 0; i < cardinal; i++) {
      localEE.ajoutElt(ensTab[i]);
    }
    return localEE;
  }
  







  public EE difference(EE paramEE)
  {
    EE localEE = new EE(ensTab.length);
    for (int i = 0; i < cardinal; i++) {
      if (!paramEE.contient(ensTab[i])) {
        localEE.ajoutPratique(ensTab[i]);
      }
    }
    return localEE;
  }
  







  public EE differenceBis(EE paramEE)
  {
    EE localEE = new EE(this);
    for (int i = 0; i < cardinal; i++) {
      if (contient(ensTab[i])) {
        localEE.retraitElt(ensTab[i]);
      }
    }
    return localEE;
  }
}
