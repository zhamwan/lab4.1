package src;

public class EarthHuman extends Human implements Speak{
    private String name;
    private int age;
    public EarthHuman(String name, int age){
        super(name, age);
        this.name = name;
        this.age = age;
    }
    public void speak(String string){
        System.out.println(name + " speak " + string);
    }
}