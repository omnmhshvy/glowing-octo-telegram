package FunctionalInterface;
import java.util.stream.IntStream;

public class Declarative{
   public static void main(String [] args){
      System.out.println(IntStream.rangeClosed(0,100).sum());
        Runnable one = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside Runnable");
            }
        };

        Thread foo = new Thread(one);
        foo.start();

        Runnable two = () -> {
            System.out.println("Inside lambda");
        };

        foo = new Thread(two);
        foo.start();

        new Thread(() -> System.out.println("ThreadLambda")).start();
   }
}