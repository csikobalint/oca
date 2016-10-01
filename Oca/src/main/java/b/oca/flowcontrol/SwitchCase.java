package b.oca.flowcontrol;

/**
 * Created by Bálint on 2016. 10. 01..
 */
public class SwitchCase {
    public static void main(String... args){
        float d = (float) 343.43d;
        // switch only byte, short, int, long, enum or String
        //case - only compile time constant

        final int y = 0;
        final int x = 3;
        switch ((short) d){
            case 2:
                System.out.println(2);
                //x can be used here only because x is final
                // all case values must be of type short
            case (short) (x + 2 + y):
                System.out.println(x+2);
            case 1:
                System.out.println(1);
                // only short allowed
            case (short) 678434:
                System.out.println(678434);
                //duplicate label > compile error
//            case 1:
//                System.out.println(x+2);

            case (short) 3:{
                System.out.println("a");
                System.out.println("b");
                System.out.println("c");
            }
            // empty commands
            case 4:
            case 6:
            case 7: {}
            default:
                System.out.println("def");
                // no break needed here
        }

    }
}
