package src;

public class NameLengthExeption extends Exception {
    String name;
    public NameLengthExeption(){
    }
    public NameLengthExeption(String msg, String name){
        super (msg);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getMessage(){
        return "error";
    }
}