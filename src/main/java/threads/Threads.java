package threads;

import java.util.ArrayList;
import java.util.List;

public class Threads {
    static List<String> myList = new ArrayList<>();

    public static void main(String[] args) {
        List<String> filler = new ArrayList<>();

        for (int i = 2; i < 50; i++) {
            myList.add(i + " gogosi");
        }
        Thread first = new Thread(() -> {
            for (int i = 0; i < myList.size(); i = i + 2) {
                myList.set(i, myList.get(i) + " cu ciocolata!");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Ciocolate");
        Thread second = new Thread(() -> {
            for (int i = 1; i < myList.size(); i = i + 2) {
                myList.set(i, myList.get(i) + " cu zmeura!");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Zmeura");
        Thread third = new Thread(() -> {
            for (int i = 0; i < myList.size(); i++) {
                myList.set(i, myList.get(i) + " cu detoate!");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        /*
         * Run just those two to see the speed
         **/
        // first.start();
        // second.start();

        /*
         * Run this alone to see the diference
         **/
        third.start();

        /*
         * Fill the complexity of the run to take more time
         **/
        for (int i = 0; i < 1000000; i++) {
            filler.add(i + "h");
        }

        for (String string : myList) {
            System.out.println(string);
        }

    }

}
