import java.util.ArrayList;

import javax.swing.border.Border;

public class Test {
    public static void main(String[] args) {
        Case c1= new Case(0, 0, 2);
        Case c2= new Case(0, 3, 2);
        Case c3= new Case(2, 0, 2);
        Case c4= new Case();



        ArrayList<Case> l= new ArrayList<Case>();

        l.add(c3);
        l.add(c2);
        l.add(c1);

        for(int i=0;i<13;i++){
            l.add(c4);
        }

        Board b= new Board(l);

        System.out.println(b.toString());
    }
}
