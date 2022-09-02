public class Nurse extends Employee{
    protected int numPatients;

    public int getNumPatients() {
        return numPatients;
    }

    public void setNumPatients(int numPatients) {
        this.numPatients = numPatients;
    }

    public Nurse(String eName, int eNumber, int numPat) {
        super(eName, eNumber);
        numPatients =numPat;
    }
    public String toString() {
        return name + " has " + number + " hospital number and responsible for "+ numPatients+" patients.";
    }
    public void assist(){
        System.out.println(name + " has been assisting doctors since 2002");
    }



}
