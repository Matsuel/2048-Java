import java.util.ArrayList;
import java.util.Random;

public class Board extends Case {
    private ArrayList<ArrayList<Case>> Cases;
    private final int row=4;
    private final int col=4;

    public Board(){
        this.Cases= new ArrayList<ArrayList<Case>>();
    }

    public Board(ArrayList<ArrayList<Case>> list){
        this.Cases=list;
    }

    public ArrayList<ArrayList<Case>> GetCases(){
        return this.Cases;
    }

    public void SetCases(ArrayList<ArrayList<Case>> C){
        this.Cases=C;
    }

    public Case GetCaseAt(int row, int col){
        return this.Cases.get(row).get(col);
    }

    public void SetCaseAt(int row, int col, Case c){
        this.Cases.get(row).set(col, c);
    }

    public boolean Win(){
        for (ArrayList<Case> col: this.GetCases()){
            for (Case c:col){
                if (c.GetValue()==2048){
                    return true;
                }
            }
        }
        return false;
    }

    public void Spawn(){
        ArrayList<Integer> v= new ArrayList<Integer>();
        v.add(2);
        v.add(4);
        Random va= new Random();
        int val=va.nextInt(1 - 0 + 1) + 0;
        Random r = new Random();
        int row=r.nextInt(3 - 0 + 1) + 0;
        Random c = new Random();
        int col=c.nextInt(3 - 0 + 1) + 0;
        Case ca= new Case(row, col, v.get(val));
        this.SetCaseAt(row, col, ca);
    }

    @Override 
    public String toString(){
        String str="+---+---+---+---+\n";
        for (ArrayList<Case> col: this.GetCases()){
            str+="|";
            for (Case c:col){
                str+=" "+c.toString()+" |";
            }
            str+="\n"+"+---+---+---+---+\n";
        }
        return str;
    }
}