package defaultMethod;

public class Hyundai implements Car , Vehicle{

    @Override
    public void color() {
        System.out.println("this is color method in hyundai ");
    }

    @Override
    public void selfdriving() {
        Car.super.selfdriving();
    }


    void m1(){
        System.out.println("this is m1 method");
        System.out.println("this speed of hyundai is :" +Car.speed(4,100));
    }
}
