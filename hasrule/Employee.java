package hasrule;

public class Employee {

    int id;
    Name name;

    public Employee(int id,Name name)
    {
        this.id=id;
        this.name=name;
    }

    public void display()
    {

        System.out.println("id:"+id+"\nfirstname:"+name.firstname+"  \nmiddle name:"+name.middlename+"  \nlastname:"+name.lastname);
    }

    public static void main(String[] args) {

        Name name=new Name("Ashok","yogi","nath");
        Employee employee=new Employee(1,name);
        employee.display();
    }
}
