package Personnage;

public class Personnage{
// Le constructeur
public Personnage(String name, int life, int power){
	this.nom = name;
	this.vie = life;
	this.force = power;
}
//Accesseur du nom de Personnage
public String LeNom(){
	return this.nom;
}
public int LaVie(){
	return this.vie;
}
public int LaForce(){
	return this.force;
}

public void attaque(Personnage perso){
perso.vie() = perso.vie() - this.force();
this.vie() = this.vie() - perso.force();
}

//Les attributs
private String nom;
private int vie;
private int force;
}
