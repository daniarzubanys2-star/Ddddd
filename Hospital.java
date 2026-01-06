import java.util.ArrayList;

public class Hospital {
    private String name;
    private ArrayList<Person> people;

    public Hospital(String name) {
        this.name = name;
        people = new ArrayList<>();
    }


    public void addPerson(Person person) {
        people.add(person);
    }

    public void showAllPeople() {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    public void showOnlyDoctors() {
        for (Person p : people) {
            if (p instanceof Doctor) {
                Doctor d = (Doctor) p;
                System.out.println(d);
            }
        }
    }
}


