package Notes.polymorphism.Overriding.Abstraction;

public class employedetails extends companydetails {

    public static void main(String[] args) {
        employedetails emp = new employedetails();
        String name=emp.compname();
        long id=emp.id();

        System.out.println("The empoloye belongs to the " +name+" Company");
        System.out.println("The Company  id is : "+id);
    }
    
}
