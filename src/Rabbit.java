public class Rabbit extends Animal{
    public Rabbit(String name) {
        super(name);
    }
    @Override
    public void run(int dice) {
        if(dice>=1 && dice <=3){
            this.raceLocation+=2;
            System.out.println(name + " kostu!");
        }
        else if (dice==4 || dice==5){
            this.raceLocation-=1;
            System.out.println(name + " uyuyakaldi!");
        }
        else{
            System.out.println(name + " yemek yiyor!");
        }
        System.out.println(name + ":" + getRaceLocation());
    }
}
