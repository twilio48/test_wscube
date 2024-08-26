package interview;

public interface Servlet {
    static  public void init(){
        System.out.println("servlet is initializing");
    }

    void service();

    default public void destroy(){
        System.out.println("Servlet is destroying");
    }
}
