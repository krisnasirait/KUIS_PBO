
import java.util.ArrayList;

public class main
{
    public static void main(String[] args)
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Macan("p"));
        animals.add(new Macan("pp"));
        animals.add(new Kambing("k"));
        animals.add(new Ayam("a"));
        
        
         for (Animal animal: animals) 
        {
            System.out.println(animal.getName()+ " adalah "  + animal.getName() +" dengan bunyi "+ animal.makeSound());
        }
    }
   
}



