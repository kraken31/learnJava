package learnJava;


public class AnimalFamilier {
	int �ge;
	float poids;
	float taille;
	String couleur;
	
	public void dormir() {
		System.out.println("Bonne nuit, � demain");
	}
	
	public void manger() {
		System.out.println(
				"J'ai si faim&#8230; Donne-moi un biscuit !");
	}
	
	public String dire(String unMot) {
	    String r�ponseAnimal = "OK !! OK !! " + unMot;
	    return r�ponseAnimal; 
	}
}
