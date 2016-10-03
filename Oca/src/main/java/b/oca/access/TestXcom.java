package b.oca.access;

import b.oca.access.xcom.B;

/**
 * Created by Bálint on 2016. 10. 02..
 */
public class TestXcom {
    public static void main(String[] args){
        B b = new B(); b.doB();
        // go is only visible if public in A
        b.go();
    }
}
