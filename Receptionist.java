public class Receptionist extends Administrator{
    protected boolean answering;

    public boolean isAnswering() {
        return answering;
    }

    public void setAnswering(boolean answering) {
        this.answering = answering;
    }

    public Receptionist(String eName, int eNumber, String dept, boolean ans){
        super(eName, eNumber, dept);
         answering= ans;
    }

    public String toString() {
        return name + " has a " + number + " hospital number and receptionist in "+ department+".";
    }
    public void answer(){
        if( answering == true){
            System.out.println("Never leaved the duty place!");
        }
        else
            System.out.println("Not attended so far!");
    }

}
