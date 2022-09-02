public class StudentBody
{
    public static void main (String[] args)
    {
        Address school = new Address ("800 Lancaster Ave.", "Villanova",
                "PA", 19085);
        Name jName = new Name("John","Smith" );
        Address jHome = new Address ("21 Jump Street", "Lynchburg",
                "VA", 24551);
        Student john = new Student (jName, jHome, school);
        Name mName = new Name("Marsha","Jones" );
        Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                44132);
        Student marsha = new Student (mName , mHome, school);
        System.out.println (john);
        System.out.println ();
        System.out.println (marsha);
    }
}