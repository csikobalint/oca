package b.oca;

/**
 * Created by Bálint on 2016. 10. 03..
 */
public class StringTest {

    public static void main(String[] args){
        String a = "A";
        String r = whatHappens(a);
        System.out.println("a = " + a );
        System.out.println("r = " + r);
    }

    static String whatHappens(String s){
        s = s + "WTF";
        return s;

    }
}
