import java.util.ArrayList;

// import java.util.ArrayList;

// import javax.swing.border.Border;

// public class Test {
//     public static void main(String[] args) {
//         Case c1= new Case(0, 0, 2);
//         Case c2= new Case(0, 3, 2);
//         Case c3= new Case(2, 0, 2);
//         Case c4= new Case();



//         ArrayList<Case> l= new ArrayList<Case>();

//         // l.add(c3);
//         // l.add(c2);
//         // l.add(c1);

//         for(int i=0;i<16;i++){
//             l.add(c4);
//         }

//         Board b= new Board(l);

//         b.SetCaseAt(c1.GetX(),c1.GetY(), c1);
//         b.SetCaseAt(c2.GetX(),c2.GetY(), c2);
//         b.SetCaseAt(c3.GetX(),c3.GetY(), c3);

//         System.out.println(b.toString());

//         b.Spawn();

//         System.out.println(b.toString());
//     }
// }

public class Test{
    public static void main(String[] args){
        Case c1= new Case(0, 0, 2);
        Case c2= new Case(0, 3, 2);
        Case c3= new Case(2, 0, 2);
        Case c4= new Case();

        ArrayList<ArrayList<Case>> ct= new ArrayList<ArrayList<Case>>();

        for (int i=0;i<4;i++){
            ArrayList<Case> c= new ArrayList<Case>();
            for (int j=0;j<4;j++){
                c.add(c4);
            }
            ct.add(c);
        }

        Board b= new Board(ct);

        b.SetCaseAt(c1.GetX(),c1.GetY(), c1);
        b.SetCaseAt(c2.GetX(),c2.GetY(), c2);
        b.SetCaseAt(c3.GetX(),c3.GetY(), c3);

        b.Spawn();
        System.out.println(b.toString());
    }
}