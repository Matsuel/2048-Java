public class Test{
    public static void main(String[] args){
        Case c1= new Case(0, 0, 2);
        Case c2= new Case(0, 3, 2);
        Case c3= new Case(2, 0, 2);

        Board b= new Board();

        b.InitCases();

        b.SetCaseAt(c1.GetX(),c1.GetY(), c1);
        b.SetCaseAt(c2.GetX(),c2.GetY(), c2);
        b.SetCaseAt(c3.GetX(),c3.GetY(), c3);

        b.Spawn();
        b.Spawn();
        b.Spawn();
        System.out.println(b.toString());
        b.MoveBottom();
        System.out.println(b.toString());
        //System.out.println(b.GetEmpty());
    }
}