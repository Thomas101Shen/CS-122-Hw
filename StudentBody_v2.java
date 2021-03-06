public class StudentBody_v2 
{
    public static void main(String[] args)
    {
        Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
        
        Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
        
        Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
        
        UniversityID jUID = new UniversityID(11223344);
        
        UniversityID mUID = new UniversityID(55667788);
        
        Telephone jPhone = new Telephone("212-333-3333");
        
        Telephone mPhone = new Telephone("212-555-5555");
        
        Student john = new Student("John", "Smith", jUID, jPhone, jHome, school);
        
        Student marsha = new Student("Marsha", "Jones", mUID, mPhone, mHome, school);

        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
    }
}