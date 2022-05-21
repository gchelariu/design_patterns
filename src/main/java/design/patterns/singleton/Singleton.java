package design.patterns.singleton;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Singleton {
    private String parametre;
    private static final Singleton instance = new Singleton();

    static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
        parametre = "This instance is created when class is loaded in memory";
        System.out.println(parametre);
    }
}

class Lazy {
    @Getter
    private static Lazy lazyInstance = null;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (lazyInstance == null) {
            System.out.println("Lazy instance created.");
            lazyInstance = new Lazy();
        } else {
            System.out.println("Lazy instance is already created.");
        }
        return lazyInstance;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());

        //instance is null
        System.out.println(Lazy.getInstance() + " lazy instance");
        //instanciate
        Lazy.getInstance();
        //check instance
        Lazy.getInstance();



    }
}
