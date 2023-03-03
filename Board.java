import java.util.ArrayList;
import java.util.Random;

public class Board extends Case {
    private ArrayList<Case> Cases;

    public Board(ArrayList<Case> cases){
        this.Cases=cases;
    }

    public ArrayList<Case> GetCases(){
        return this.Cases;
    }

    public void SetCase(ArrayList<Case> c){
        this.Cases=c;
    }

    public Case GetCaseAt(int x,int y){
        int pos=4*x+y;
        return this.Cases.get(pos);
    }

    public void SetCaseAt(int x,int y, Case c){
        int pos=4*x+y;
        this.Cases.set(pos, c);
    }

    public void AddCase(Case c){
        this.Cases.add(c);
    }

    public boolean Win(){
        for (Case c : this.GetCases()){
            if (c.GetValue()==2048){
                return true;
            }
        }
        return false;
    }

    // public void MoveRight(){
    //     for (int i=0; i<this.GetCases().size();i++){
    //         if (this.GetCases().get(i).GetX()*4+this.GetCases().get(i).GetY()!=3||this.GetCases().get(i).GetX()*4+this.GetCases().get(i).GetY()!=7||this.GetCases().get(i).GetX()*4+this.GetCases().get(i).GetY()!=11||this.GetCases().get(i).GetX()*4+this.GetCases().get(i).GetY()!=15){

    //         }
    //     }
    // }

    public void Spawn(){
        ArrayList<Integer> v= new ArrayList<Integer>();
        v.add(2);
        v.add(4);
        Random r = new Random();
        int val=r.nextInt(1 - 0 + 1) + 0;
        int pos=r.nextInt(15 - 0 + 1) +0;
        int x= pos/4;
        int y = pos-x;
        Case c= new Case(x, y, v.get(val));
        this.SetCaseAt(x, y, c);
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