package src;

public class Food{
    private String name;
    public Food(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
   public void eating(LoonHuman loonHuman){
       System.out.println(loonHuman.getname() + "eating" + name );
   }
}