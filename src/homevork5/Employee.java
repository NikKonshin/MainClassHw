package homevork5;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }




    public void info(){
        System.out.print("Full Name: " + fullName + ". Position: "
                + position + ". e-mail: " + eMail + ". Phone: " + phone + ". Salary: " + salary
        + ". Age: " + age + ".");


    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        if(age < 40){
            System.out.println();
            return;
        }
        this.age=age;
    }
}
