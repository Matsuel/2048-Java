import java.util.ArrayList;
import java.util.Random;

public class Board extends Case {
    private ArrayList<ArrayList<Case>> Cases;

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

    public void InitCases(){

        for (int i=0;i<4;i++){
            ArrayList<Case> c= new ArrayList<Case>();
            for (int j=0;j<4;j++){
                Case c1= new Case(i, j, 0);
                c.add(c1);
            }
            this.Cases.add(c);
        }
    }

    public ArrayList<ArrayList<Integer>> GetEmpty(){
        ArrayList<ArrayList<Integer>> empty= new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Case> col: this.GetCases()){
            for (Case c: col){
                if (c.GetValue()==0){
                    ArrayList<Integer> pos= new ArrayList<Integer>();
                    pos.add(c.GetX());
                    pos.add(c.GetY());
                    empty.add(pos);
                }
            }
        }
        return empty;
    }

    public void Spawn(){
        ArrayList<Integer> v= new ArrayList<Integer>();
        v.add(2);
        v.add(4);
        Random va= new Random();
        int val=va.nextInt(1 - 0 + 1) + 0;
        Random r= new Random();
        Integer pos= r.nextInt(this.GetEmpty().size()-0+1)+0;
        Case ca = new Case(this.GetEmpty().get(pos).get(0), this.GetEmpty().get(pos).get(1), v.get(val));
        this.SetCaseAt(this.GetEmpty().get(pos).get(0), this.GetEmpty().get(pos).get(1), ca);
    }

    public void MoveBottom(){

        for (int i=0; i<3;i++){
            for (int j=0; j<4;j++){
                Integer val = this.GetCaseAt(i, j).GetValue();
                Integer val1 = this.GetCaseAt(i+1, j).GetValue();

                if (val==val1){
                    Case c = new Case(i+1, j, val+val1);
                    this.SetCaseAt(i+1, j, c);
                    Case cnul = new Case(i, j, 0);
                    this.SetCaseAt(i, j, cnul);
                }else if (val1==0){
                    Case c = new Case(i+1, j, val);
                    this.SetCaseAt(i+1, j, c);
                    Case cnul = new Case(i, j, 0);
                    this.SetCaseAt(i, j, cnul);
                }

            }
        }

    }

    public void MoveTop(){
        
    }

    public void MoveLeft(){
        
    }

    public void MoveRight(){
        
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