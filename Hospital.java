import java.util.ArrayList;

public class Hospital {


    private String hospitalName;
    private String type;
    private int roomCount;
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;


    public Hospital() {
        this.hospitalName = "DanIyar Zhubanysh Private Dental Clinic";
        this.type = "Private Dental Clinic";
        this.roomCount = 5;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }


    public Hospital(String hospitalName, String type, int roomCount) {
        this.hospitalName = hospitalName;
        this.type = type;
        this.roomCount = roomCount;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }


    public void showDoctorsForAgeGroup(String ageGroup) {
        for (Doctor d : doctors) {
            if (d.worksWithAgeGroup(ageGroup)) {
                System.out.println(d);
            }
        }
    }


    public int getTotalPatients() {
        return patients.size();
    }


    public java.util.ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public Patient getLastPatient() {
        return patients.get(patients.size() - 1);
    }


    @Override
    public String toString() {
        return "Hospital{name='" + hospitalName +
                "', type='" + type +
                "', rooms=" + roomCount +
                ", doctors=" + doctors.size() +
                ", patients=" + patients.size() + "}";
    }
}
