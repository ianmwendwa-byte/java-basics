class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class pig extends Animal{
    public void animalSound(){
        System.out.println("The pigs says:wee wee");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says:bow wow");
    }
}
public class JavaPolymophism {
    public static void main(String[] args) {
       Animal myAnimal =new Animal();
       Animal myPig = new pig();
       Animal myDog = new dog(); 
       myAnimal.animalSound();
       myPig.animalSound();
       myDog.animalSound();
    }
    
}
