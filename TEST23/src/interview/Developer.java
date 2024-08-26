package interview;

public interface Developer {

    default void init(){
        System.out.println("THIS IS DEFAULT METHOD FOR ALL DEVELOPER");
    }
    void develop();
}
