public class Rabbit extends Animal implements Running {
    public Rabbit(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void run() {
        System.out.println(getName()+" running");
    }

    @Override
    public String toString() {
        return "Rabbit name: "+getName()+" age: "+getAge()+" weight: "+getWeight();
    }
}
