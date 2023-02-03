public class Wolf extends Animal implements Eat{
   private Rabbit rabbit ;
    public Wolf(String name, int age, double weight,Rabbit rabbit) {
        super(name, age, weight);
        this.rabbit=rabbit;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eating "+rabbit);
    }

    @Override
    public String toString() {
        return "Wolf name:" +getName()+" age "+getAge()+" weight: "+getWeight()+
                '}';
    }
}
