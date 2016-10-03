package b.oca.primitives;

/**
 * Created by Bálint on 2016. 10. 02..
 */
public class Parrotlet extends Parrot {
    void chirp(long loud){
        System.out.println("chirp ");
    }

    public static void main(String[] args){
        Parrotlet bokeh = new Parrotlet();
        bokeh.chirp(420);
        // if no L > Integer number too large
//        bokeh.chirp(123_456_789_012);

    }

}

class Parrot{
    void chirp(int loud){
        System.out.println("CHIRP ");
    }
}
