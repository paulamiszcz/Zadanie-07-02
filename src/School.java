public class School {
    public static void main(String[] args) {

        Person[] people = new Person[2];
        people[0] = new Student("Anna", "Tomaszewska",15,2);
        people[1] = new Teacher("Tomek", "Zych",40,5000 );

        people[0].showInfo();
        people[1].showInfo();

        }
    }

