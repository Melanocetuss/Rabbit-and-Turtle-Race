public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }
    @Override
    public void run(int dice) {
        if(dice>=1 && dice<=4){
            this.raceLocation+=1;
            System.out.println(name + " yurudu!");
        }
        else{
            System.out.println(name + " yemek yiyiyor!");
        }
        System.out.println(name + " : " + getRaceLocation());
    }
}
