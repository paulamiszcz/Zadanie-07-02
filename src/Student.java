public class Student extends Person {

    private int whichClass;

    public Student(String firstName, String lastName, int age, int whichClass) {
        super(firstName, lastName, age);
        this.whichClass = whichClass;
    }

    public int getWhichClass() {
        return whichClass;
    }

    public void setWhichClass(int whichClass) {
        this.whichClass = whichClass;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(", która klasa: " + getWhichClass());
    }
}
