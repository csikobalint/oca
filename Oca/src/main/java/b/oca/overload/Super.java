package b.oca.overload;

import java.rmi.server.ExportException;
import java.util.List;

/**
 * Created by Bálint on 2016. 10. 03..
 */
public class Super {

    void test(){
        System.out.println("test");
    }

    //valid overload, there is a change in the parameter list
    void test(String s){
        System.out.println(s);
    }

    void testWithException() throws IllegalArgumentException{

    }

    protected List returnList(){
        return null;
    }

// test() already defined
//    void test() throws ExportException{
//
//    }

// test() is already defined
//    String test(){
//        return "S";
//    }


}
