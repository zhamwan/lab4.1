package src;

public class Money{
    private String name;
    private int number;
    public Money(String name, int number){
        this.name = name;
        this.number = number;
    }
    public String getname(){
        return name;
    }
    public int getnumber(){
        return number;
    }
    public void collect(LoonHuman loonHuman, int number1){
        number = number + number1;
        System.out.println(loonHuman.getname() + "collect " + number );
    }
}