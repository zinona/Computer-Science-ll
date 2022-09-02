public class Doctor extends Employee {
    protected String speciality;

    public Doctor(String eName, int eNumber, String special) {
        super(eName, eNumber);
        speciality = special;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String toString() {
        return name + " has " + number + " hospital number and this doctor is " + speciality;
    }
    public void diagnose() {
        System.out.println( name +  " diagnosed with two different types of cancer.");
    }


}