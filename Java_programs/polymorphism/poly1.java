package Notes.polymorphism;

public class poly1 {

    private void clientdetails(int age)
    {

        System.out.println("the age of the Client is "+age);

    }


    private void clientdetails(String name)
    {

        System.out.println("the name of the Client is "+name);

    }

    private void clientdetails(int age,String name)
    {

        System.out.println("the age of the Client is "+age+" and the name is  :"+name);

    }

    private void clientdetails(int age,int salary)
    {

        System.out.println("the age of the Client is "+age+" and the Salary is  :"+salary);

    }

    


    public static void main(String[] args) {
        poly1 p = new poly1();
        
        p.clientdetails(21,70000);


    }
    
}
