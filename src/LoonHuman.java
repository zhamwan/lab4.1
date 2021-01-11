package src;

public class LoonHuman extends Human implements Speak, Ticket {
    private String name;
    private int age;
    public LoonHuman(String name, int age){
        super(name, age);
        this.name = name;
        this.age = age;
    }
    public void speak(String string){
        System.out.println(name + " speal " + string);
    }
    public void buyTicket( Train train){
        System.out.println(name + " buy ticket on " + train.getnametrain()+ " " + train.getcity().getNameCity() );
    }
}