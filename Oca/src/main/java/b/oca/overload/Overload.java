package b.oca.overload;

/**
 * Created by Bálint on 2016. 10. 01..
 */
public class Overload {

    public static void main(String... args){
        System.out.println("main");
    }

    //adding an exception throw does not overload > compile error as already defined
    //this would also execute
    public static void main(String... args) throws Throwable{
        System.out.println("main");
    }
}
