public class Employee {

    protected String name;
    protected String number;

    public Employee(String eName, int eNumber){
        name = eName;
        number = eName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString(){
        return name + " has  " + number + " hospital number.";
    }
    public void work(){
        System.out.println(name +" is currently working");
    }
}
