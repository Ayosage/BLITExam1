import java.sql.SQLOutput;
import java.util.Scanner;

public class Counter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        Counter counter = new Counter();


        Runnable evenRun = () -> {
                while(counter.c < number){
                    System.out.println(Thread.currentThread().getName() + " " + counter.value());
                    counter.increment();
                    counter.increment();
                }



        };
        Runnable oddRun = () -> {
            counter.c = 0;
            counter.increment();
            while(counter.c < number){
                System.out.println(Thread.currentThread().getName() + " " + counter.value());
                counter.increment();
                counter.increment();
            }



        };
        Thread even = new Thread(evenRun, "Even");
        Thread odd = new Thread(oddRun, "Odd");

        even.start();
        try{
            even.join();
        }catch (Exception err){
            System.out.println(err);
        }
        odd.start();




    }

}
