import org.w3c.dom.ls.LSOutput;

public class Main{

    public static void main(String[] args) {
        Employee vito = new Employee("Vito", 123);
        Administrator luca = new Administrator("Luca", 101, "Business");
        Doctor micheal = new Doctor("Micheal", 234, "Heart");
        Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
        Nurse sonyy = new Nurse("Sonny", 789, 6);
        Receptionist tom = new Receptionist("Tom",707,"Talking", true);
        Janitor ant = new Janitor("Ant", 633,"Maintenence", false);


        System.out.println(vito);
        System.out.println(micheal);
        System.out.println(vincent);
        System.out.println(sonyy);
        System.out.println(luca);
        System.out.println(tom);
        System.out.println(ant);
        System.out.println();
        System.out.println();
        vito.work();
        micheal.diagnose();
        vincent.operate();
        sonyy.assist();
        luca.administrate();
        tom.answer();
        ant.sweep();

    }



}