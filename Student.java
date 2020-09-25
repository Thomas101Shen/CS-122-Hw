
public class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private UniversityID uId;
    private Telephone pNum;

    public Student(String first, String last, UniversityID uId, Telephone pNum, Address home,
            Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.uId = uId;
        this.pNum = pNum;
        
    }

    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;
        result += "Uni Id: \n" + uId + "\n";
        result += "Telephone: \n" + pNum;

        return result;
    }
}
