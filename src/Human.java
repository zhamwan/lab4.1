package src;
import java.util.Objects;

public abstract class Human{
    private String name;
    private int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getage(){
        return age;
    }
    public String  getname(){
        return name;
    }
    public void action(ActionType action, String str){
        System.out.println( name + action  +"  "+ str);
    }
    public String tostring(){
        return "Human.java{" + " name: " + name + ", age: " + age  +" }";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name );
    }
    public int hashCode() {
        return Objects.hash(name);
    }
}