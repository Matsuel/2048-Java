import java.util.ArrayList;

public class Board extends Case {
    private ArrayList<Case> Cases;

    public Board(ArrayList<Case> cases){
        this.Cases=cases;
    }

    public ArrayList<Case> GetCases(){
        return this.Cases;
    }

    public Case GetCaseAt(int x,int y){
        int pos=4*x+y;
        return this.Cases.get(pos);
    }

    public void SetCaseAt(int x,int y, Case c){
        int pos=4*x+y;
        this.Cases.add(pos, c);
    }

    public void AddCase(Case c){
        this.Cases.add(c);
    }

    @Override
    public String toString(){
        String str="+---+---+---+---+\n";
        int pos=0;
        for (Case c: this.GetCases()){
            if (pos==0|| pos==4 || pos==8|| pos ==12){
                str+= "| "+c.toString()+" |";
            }else if (pos ==3 || pos==7 || pos ==11|| pos==15){
                str+=" "+c.toString()+" |\n"+"+---+---+---+---+\n";
            }else{
                str+=" "+c.toString()+" |";
            }
            pos++;
        }
        return str;
    }
}