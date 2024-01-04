import java.time.LocalDate;

class Employee{
    private String name;
    private double Salary;
    private LocalDate hireDay;
    
    public Employee(String n, double s, int year, int month, int day){
        name=n;
        Salary=s;
        hireDay=LocalDate.of(year,month,day);
        
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return Salary;
    }
    public void raiseSalary(double perc){
        Salary=(1+perc/100)*Salary;
    }
    public String toString(){
        return "name=" + getName() + ",salary=" + getSalary() + ",hire day=" + hireDay();
    }
}
Employee john= new Employee("Smith John", 2534, 2001, 3, 26);