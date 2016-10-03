package b.oca.arrays;

/**
 * Created by Bálint on 2016. 10. 02..
 */
public class ArrayTypes {
    String[] x;
    int [] a [] = {{1,2},{1}};
    Object c = new long[4];

    //ok
    Object[] d = x;
    // nok! Incompatible types!!!
    //Integer[] i = x;

    public static void main(String[] args){

    }
}
