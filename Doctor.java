public class Doctor extends Person {
    private String specialization;
    private int experienceYears;

    public Doctor(String name, int age, String specialization, int experienceYears) {
        super(name, age);
        setSpecialization(specialization);
        setExperienceYears(experienceYears);
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.isEmpty()) {
            this.specialization = "General";
        } else {
            this.specialization = specialization;
        }
    }


    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) {
            this.experienceYears = 0;
        } else {
            this.experienceYears = experienceYears;
        }
    }

    public boolean isExperienced() {
        return experienceYears >= 5;
    }


    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Role: Doctor" +
                ", Specialization: " + specialization +
                ", Experience: " + experienceYears + " years";
    }
}




