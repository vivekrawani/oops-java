package templates;

class Act implements Comparable<Act>{
    int x; int y;
    Act(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return (this.x + " : " + this.y);
    }
    @Override
    public int compareTo(Act a){
        int t = this.x - a.x;
        return t;
    }
    
}

