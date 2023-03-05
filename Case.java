public class Case {
    private int x;
    private int y;
    private int value;
    private boolean set;

    public Case(){
        this.x=0;
        this.y=0;
        this.value=0;
    }

    public Case(int x, int y, int value){
        this.value=value;
        this.x=x;
        this.y=y;
    }

    public Case(int x, int y, int value, boolean set){
        this.value=value;
        this.x=x;
        this.y=y;
    }

    public int GetX(){
        return this.x;
    }

    public int GetY(){
        return this.y;
    }

    public int GetValue(){
        return this.value;
    }

    public void SetX(int x){
        this.x=x;
    }

    public void SetY(int y){
        this.y=y;
    }

    public void SetValue(int value){
        this.value=value;
    }

    public void Setset(boolean s){
        this.set=s;
    }

    public boolean Getset(){
        return this.set;
    }

    @Override
    public String toString(){
        if (this.GetValue()==0){
            return " ";
        }else{
            return ""+this.GetValue()+"";
        }
    }
}
