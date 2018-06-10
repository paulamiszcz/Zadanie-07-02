public class Teacher extends Person{

    private double salary;

    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" zarobki: " + getSalary());
    }
}
