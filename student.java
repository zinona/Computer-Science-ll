public class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private Name name;
    public Student (Name NNAME, Address home,
                    Address school)
    {
        name =NNAME;
        homeAddress = home;
        schoolAddress = school;
    }
    public String toString()
    {
        String result;
        result = name.firstName + " " +name.lastName+ "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;
        return result;
    }
}