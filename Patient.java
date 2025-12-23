public class Patient {


    private String name;
    private int age;
    private String problem;
    private String phoneNumber;


    public Patient() {
    }


    public Patient(String name, int age, String problem, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.problem = problem;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAgeCategory() {
        if (age >= 3 && age < 18) return "Child";
        else if (age <= 60) return "Adult";
        else return "Senior";
    }


    public boolean isAdult() {
        return age >= 18;
    }


    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age +
                ", category='" + getAgeCategory() +
                "', problem='" + problem +
                "', phone='" + phoneNumber + "'}";
    }
}


