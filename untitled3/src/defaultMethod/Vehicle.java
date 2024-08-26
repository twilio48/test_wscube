package defaultMethod;

public interface Vehicle {
    default void selfdriving(){
        System.out.println("this is default method in vehicle interface ");
    }
}
