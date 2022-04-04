public interface Animal {
    String getName();
    String getType();
    String makeSound();
}

public class Macan implements Animal
{
    private String sound;
    public Macan(String sound){
        this.sound = sound;
    }
    
   public String getName(){
       return "m1";
   }
   public String getType()
   {
      return "macan";
   }
   
    
}

public class Kambing implements Animal
{
    private String sound;
    public Kambing(String sound){
        this.sound = sound;
    }
    
   public String getName(){
       return "k";
   }
   public String getType()
   {
      return "kambing";
   }
   
   
}

public class Ayam implements Animal
{
    private String sound;
    public Ayam(String sound){
        this.sound = sound;
    }
    
   public String getName(){
       return "a";
   }
   public String getType()
   {
      return "ayam";
   }
   
}
