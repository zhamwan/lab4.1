import src.*;

public class Main{
    public static void main(String[] args) {
        Newspaper news = new Newspaper("утро");
        news.release(" about cosmonauts");
        news.release(" about giant seeds");
        news.release(" about weightlessness, which the police could not cope with.");
        LoonHuman burzh = new LoonHuman(" Scooperfield ", 15);
        Factory factory = new Factory(burzh);
        LoonHuman work = new LoonHuman(" workers ", 15);
        if (work.getage()<1){
        try{
            throw new NegativeAgeException();}
        catch (NegativeAgeException e){
            System.out.println(e.getMessage());
            }}
        factory.revolution(work);
        LoonHuman pis = new LoonHuman(" Piskarek ", 15);
        pis.action(ActionType.learned, "out about it");
        EarthHuman ponch = new EarthHuman(" Ponchik ", 15);
        LoonHuman lesh = new LoonHuman(" Leshik ", 15);
        LoonHuman som = new LoonHuman(" Somik ", 15);
        LoonHuman syd = new LoonHuman(" Sydachok ", 15);
        ponch.speak(" about everything");
        pis.speak(" about everything");
        Money money = new Money(" money", 0);
        Food food = new Food(" food");
        Bag bag = new Bag(" bag", false);
        money.collect(lesh, 15);
        bag.fool(food);
        City city = new City(" Phantomas ", " Loon ");
        Train train = new Train(" train ", city);
        pis.buyTicket(train);
        LoonHuman five = new LoonHuman(" all five ", 75);
        five.action(ActionType.went, " train station");
        ponch.action(ActionType.saying_goodbye, " all five");
        Train.Railway_carriage rail = train.new Railway_carriage("Railway_carriage", 0);
        ponch.action(ActionType.sat_down, rail.getnamerailway());
        LoonHuman short1 = new LoonHuman(" Shorty ", 75);
        rail.full(short1);
        rail.full(short1);
        rail.full(short1);
        rail.full(short1);
        rail.full(pis);
    }
}