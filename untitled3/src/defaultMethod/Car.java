package defaultMethod;

public interface Car {
    void color();


    static int speed(int wheel, int capacity){
        return (wheel*capacity)/5;
    }
    default void selfdriving(){
        System.out.println("this is default method in  car interface");
    }
}
