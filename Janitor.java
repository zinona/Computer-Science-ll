public class Janitor extends Administrator{
    protected boolean plus;

    public boolean isPlus() {
        return plus;
    }

    public void setPlus(boolean plus) {
        this.plus = plus;
    }

    public Janitor(String eName, int eNumber, String dept, boolean sw){
        super(eName, eNumber, dept);
        plus = sw;
    }

    public String toString() {
        return name + " has " + number + " hospital numbers and janitor in "+ department+".";
    }
    public void sweep(){
        if( plus == true){
            System.out.println("Cleaned the floor");
        }
        else
            System.out.println(" Not cleaned.");


    }
}
