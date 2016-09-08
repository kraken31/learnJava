package learnJava;

public class MaitreAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String reactionAnimal;	

	    AnimalFamilier monAnimal = new AnimalFamilier();

	    monAnimal.manger();
	    reactionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(reactionAnimal);
	  
	    monAnimal.dormir();

	}

}
