class MyClass{
    enum lamp {on, off, none};
    enum door {on, off, none};
    lamp current_lamp = lamp.off;
    door current_door;
}
public class Main {
    public static void main(String[] args) {
        MyClass one = new MyClass();
       // one.number = 7;
        if (one.current_lamp == MyClass.lamp.on)  System.out.println("Hello world! " + one.current_lamp);
        System.out.println("Nothing done.");
        System.out.println();

    }
}
