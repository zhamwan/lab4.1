package src;

public class NegativeAgeException extends Exception {
    private int age;
    public NegativeAgeException (){
    }
    public int GetAge() {
        return age;
    }
    public String getMessage(){
        return "error";
    }
}
