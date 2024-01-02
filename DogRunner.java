public class DogRunner {
    public static void main(String[] args) {
    Dog d1 = new Dog("Sparky", 4);
    Dog d2 = new Dog("Toby", 7);
    Dog d3 = new Dog("Fiona", 12);

    Dog[] dogs = {d1,d2,d3};

    System.out.println(dogs[0].getName());
    System.out.println(dogs[1].getName());
    System.out.println(dogs[2].getName());
}
}
