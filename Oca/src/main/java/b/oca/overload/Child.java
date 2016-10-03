package b.oca.overload;

import java.util.ArrayList;
import java.util.IllegalFormatException;

/**
 * Created by Bálint on 2016. 10. 03..
 */
public class Child extends Super {

    // valid override
    @Override
    void test(){
        System.out.println("childtest");
    }

    //cant do that, super.test() does not throw an exception
    //void test() throws Exception{}

    // nok, can not restrict visibility
    //private void test(){}

    //test is already defined here, otherwise would be ok as broadens visibility
    //protected void test(){}

    //only private is nok here
    // @Override is optional
    protected void test(String s){
        System.out.println("child " + s);
    }

    // nok, test(String s) already defined
    //public String test(String s){}

    // incompatable reurn type
    //    public Iterable returnList(){
    //        return null;
    //    }

    // compatible return type > ok
    public ArrayList returnList(){
        return null;
    }
    // restricted access > nok
    //ArrayList returnList(){
    //        return null;
    //    }

    // Overridden method does not throw java.lang.Exception
//    public void testWithException() throws Exception{
//
//    }

    // IllegalFormatException is compatile with IllegalArgumentException > ok
    public void testWithException() throws IllegalFormatException{

    }

    // private method that overloads > ok
    private void testWithException(int i) throws IllegalFormatException{}



}
