public class Lion extends Animal implements Hunt{
    private  Wolf wolf;
    private Rabbit rabbit;
    public Lion(String name, int age, double weight,Wolf wolf,Rabbit rabbit) {
        super(name, age, weight);
        this.wolf=wolf;
        this.rabbit=rabbit;
    }
    @Override
    public void hunt(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if(animals[i].getClass().getName().equals("Wolf")){
                System.out.println(getName()+" hunting "+wolf);
            }else if(animals[i].getClass().getName().equals("Rabbit")){
                System.out.println(getName()+" hunting "+rabbit);
            }else {
                System.out.println(getName()+" hunting "+wolf+" "+rabbit);
                i++;
            }
        }

    }

    public Wolf getWolf() {
        return wolf;
    }

    public void setWolf(Wolf wolf) {
        this.wolf = wolf;
    }

    public Rabbit getRabbit() {
        return rabbit;
    }

    public void setRabbit(Rabbit rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return "Lion name: "+ getName()+" age "+getAge()+" weight"+getWeight();
    }
}
