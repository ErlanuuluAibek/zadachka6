public class Main {
    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit("Krolik",3,3.4);
        Wolf wolf=new Wolf("volk",3,4.5,rabbit);
        Lion lion=new Lion("Simba",4,7.8,wolf,rabbit);
        lion.hunt(wolf,rabbit);
    }
}