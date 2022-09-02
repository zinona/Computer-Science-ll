public class Surgeon extends Doctor{
    protected boolean operating;

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public Surgeon(String eName, int eNumber, String special, boolean isOper) {
        super(eName, eNumber, special);
        operating =isOper;
    }

    public String toString() {
        return name + " has " + number + " hospital number and surgeon in this hospital";
    }
    public void operate(){
        if( operating == true){
            System.out.println("Operating today!");
        }
        else
            System.out.println("Not operating today!");
    }
}
