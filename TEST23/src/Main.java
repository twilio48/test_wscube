import java.util.*;

public abstract class Main {

    abstract void start();

 static    class car extends  Main{
        void start(){
            System.out.println("car");
        }
    }

   static class scooter extends Main{
        void start(){
            System.out.println("scooter");
        }
    }
    public  static void main(String[] args) {
       car c =new car();
       c.start();
       scooter s = new scooter();
       s.start();

    }
}