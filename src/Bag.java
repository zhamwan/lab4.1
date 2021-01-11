package src;

public class Bag{
    private String name;
    private Food food;
    private boolean check;
    public Bag(String name, boolean check){
        this.name = name;
        this.check = check;
    }
    public String getname(){
        return name;
    }
    public void fool(Food food1){
        if (!check){
            food = food1;
            check = true;
            System.out.println(" in" + name + " food" );
        }else{
            System.out.println("zanyto");
        }
    }
}