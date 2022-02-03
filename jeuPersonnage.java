import Personnage.*;
public class jeuPersonnage{
public static void main (String args[]){
Personnage UnSorcier = new Personnage ("Harry Potter", 100, 25);
Personnage victime = new Personnage ("jacques", 1, 1);
Personnage Roi = new Personnage ("Hagrid", 10000, 10000);
System.out.println();
System.out.println("Il était une fois, "+UnSorcier.LeNom()+" le sorcier veut voler la couronne du roi.");
System.out.println("Mais "+victime.LeNom()+", le meilleur garde de Chine l'empêche !");
System.out.println("Ils s'affrontent dans un combat à mort.");
System.out.println();
    UnSorcier.attaque(victime);
    System.out.println(victime.LeNom()+" est mort dans un combat honorable.");
    System.out.println();
    System.out.println(UnSorcier.LeNom()+" se trouve devant "+Roi.LeNom()+" le roi.");
    System.out.println(Roi.LeNom()+ ": Harry, tu es un criminel, pas un sorcier !");
    System.out.println(Roi.LeNom()+": Pour tous les péchés que tu as commis, je vais te faire apprendre les maths !");
    System.out.println();
    System.out.println("Le roi se concentre et cria:");
    System.out.println(Roi.LeNom()+": b²-4ac !");
    System.out.println();
    System.out.println("Cette formule de maths très complexe infligera "+Roi.LaForce()+" points de dégats à "+UnSorcier.LeNom());
    System.out.println(UnSorcier.LeNom()+" a été par le roi et sa formule de maths.");
    System.out.println();
    System.out.println("Fin de l'histoire");

    }   
}
