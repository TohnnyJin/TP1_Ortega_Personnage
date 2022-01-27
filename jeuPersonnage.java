import Personnage.*;
public class jeuPersonnage{
public static void main (String args[]){
Personnage UnSorcier = new Personnage ("Harry Potter", 100, 15);
System.out.println("Votre personnage est : "+ UnSorcier.LeNom() );
System.out.println("Il possède : "+ UnSorcier.LaVie() +" points de vie.");
System.out.println("Il possède aussi : "+ UnSorcier.LaForce() +" points d'attaque.");

Personnage victime = new Personnage ("jacques", 80, 1);
    UnSorcier.attaque(victime);

    }   
}
