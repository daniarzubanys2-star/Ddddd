public class Patient extends Person {
    private String problem;
    private String phone;

    public Patient(String name, int age, String problem, String phone) {
        super(name, age);
        setProblem(problem);
        setPhone(phone);
    }

    public void setProblem(String problem) {
        if (problem == null || problem.isEmpty()) {
            this.problem = "Not specified";
        } else {
            this.problem = problem;
        }
    }


    public void setPhone(String phone) {
        if (phone == null || phone.length() < 5) {
            this.phone = "Unknown";
        } else {
            this.phone = phone;
        }
    }

    public String getAgeCategory() {
        if (age < 18) return "Child";
        if (age <= 60) return "Adult";
        return "Senior";
    }


    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Role: Patient" +
                ", Problem: " + problem +
                ", Category: " + getAgeCategory();
    }
}




