public class Main {
    public static void main(String[] args) {
        Programmer pro = new Programmer("Kuma","Java dev","Peak");
        System.out.println(pro);
        pro.coding();
        pro.eat();
        pro.learn();
        pro.walk();
        Dancer dan = new Dancer("Bubusara","ballroom","Opera");
        System.out.println(dan);
        dan.dancing();
        dan.eat();
        dan.learn();
        dan.walk();
        Singer sing = new Singer("Chester", "vocalist","Linkin park");
        System.out.println(sing);
        sing.sing();
        sing.playGitar();
        sing.learn();
        sing.walk();
        sing.eat();
    }
}