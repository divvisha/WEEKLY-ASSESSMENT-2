public class Job
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.Name="Vishal";
        e1.age=25;
        e1.ph=54587;
        e1.Address="92, TH road, Chennai";
        e1.salary=60000;

        Manager e2=new Manager();
        e2.Name="Divya";
        e2.age=26;
        e2.ph=80424;
        e2.Address="58, Kaladipet, Chennai";
        e2.salary=75000;

        System.out.println("Name : "+e1.Name);
        System.out.println("Age : "+e1.age);
        System.out.println("Phone Number : "+e1.ph);
        System.out.println("Address : "+e1.Address);
        e1.printSalary(e1.salary);
        System.out.println("\n");
        System.out.println("Name : "+e2.Name);
        System.out.println("Age : "+e2.age);
        System.out.println("Phone Number : "+e2.ph);
        System.out.println("Address : "+e2.Address);
        e2.printSalary(e2.salary);
    }
}