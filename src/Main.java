public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("tom");
        Cat cat2 = new Cat("tama");
        Cat cat3 = new Cat("mike");

        Dog dog1 = new Dog("pochi");
        Dog dog2 = new Dog("taro");
        Dog dog3 = new Dog("hachi");


        System.out.println("Hello!" + cat1.getName() + "!");
        System.out.println("Hello!" + cat2.getName() + "!");
        System.out.println("Hello!" + cat3.getName() + "!");

        System.out.println("Hello!" + dog1.getName() + "!");
        System.out.println("Hello!" + dog2.getName() + "!");
        System.out.println("Hello!" + dog3.getName() + "!");

    }
}
