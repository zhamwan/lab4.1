package src;

public class Factory{
    private LoonHuman loonHuman;
    public Factory(LoonHuman loonHuman){
        this.loonHuman = loonHuman;
    }
    public LoonHuman gethuman(){
        return loonHuman;
    }
    public void revolution(LoonHuman loonHuman1){
        this.loonHuman = loonHuman1;
        System.out.println("there was a revolution now the plant belongs " + loonHuman.getname() );
    }
}