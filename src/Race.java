import java.util.Random;
public class Race {
    private Random random = new Random();
    private Rabbit rabbit = new Rabbit("Bugs Bunny");
    private Turtle turtle = new Turtle("Squirtle");
    public void raceStart(){
        while (rabbit.getRaceLocation() < 100 && turtle.getRaceLocation() < 100){
            rabbit.run(random.nextInt(6)+1);
            turtle.run(random.nextInt(6)+1);
        }
        if (rabbit.getRaceLocation()>=100 && turtle.getRaceLocation() >=100)
            System.out.println("Berabere!");
        else if (rabbit.getRaceLocation()>=100)
            System.out.println(rabbit.name + " kazandi!");
        else
            System.out.println(turtle.name + " kazandi!");
    }
}
