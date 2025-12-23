public class Doctor {


    private String name;
    private String specialization;
    private String ageGroup;
    private String gender;
    private int experienceYears;


    public Doctor() {
    }


    public Doctor(String name, String specialization, String ageGroup, String gender, int experienceYears) {
        this.name = name;
        this.specialization = specialization;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.experienceYears = experienceYears;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }


    public boolean worksWithAgeGroup(String group) {
        return ageGroup.equals(group);
    }


    public boolean isExperienced() {
        return experienceYears >= 5;
    }


    @Override
    public String toString() {
        return "Doctor{name='" + name + "', gender='" + gender +
                "', specialization='" + specialization +
                "', ageGroup='" + ageGroup +
                "', experienceYears=" + experienceYears + "}";
    }
}


