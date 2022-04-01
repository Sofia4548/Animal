public class Main {

    public static void main(String[] args) {
	Animal m = new Mammals();
    m.sleep();
    m.eat();
        ((Mammals) m).run();
    BlueJay b = new BlueJay();
    b.sleep();
    b.eat();
    b.fly();
    b.sing();
    }
}
