package isp.lab3.exercise1;

public class Tree {
    private int heigh;

    public Tree(){
        this.heigh=15;
    }

    public Tree(int meters){
        if(meters>=1){
            this.heigh=1;
        }else{
            this.heigh=1;
        }
    }

    public void grow(int meters){
        if(meters>=1){
            this.heigh=this.heigh+meters;
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "heigh=" + heigh +
                '}';
    }

    public int getHeigh() {
        return heigh;
    }

}
