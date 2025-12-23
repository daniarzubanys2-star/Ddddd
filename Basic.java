import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);


        hospital.addDoctor(new Doctor("Erkassiet", "Dentistry", "Child", "Male", 6));
        hospital.addDoctor(new Doctor("Nurbolsyn", "Dentistry", "Adult", "Male", 4));
        hospital.addDoctor(new Doctor("Magzhan", "Dentistry", "Senior", "Male", 8));
        hospital.addDoctor(new Doctor("Nurai", "Dentistry", "Child", "Female", 5));
        hospital.addDoctor(new Doctor("Ademi", "Dentistry", "Adult", "Female", 3));

        boolean running = true;

        while (running) {

            System.out.println("\n=== " + hospital.getHospitalName() + " ===");
            System.out.println("1. Show doctors");
            System.out.println("2. Add patient");
            System.out.println("3. Book appointment");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Doctors ---");
                    for (Doctor d : hospital.getDoctors()) {
                        System.out.println(d);
                    }
                    break;

                case 2:
                    System.out.print("Patient name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Problem: ");
                    String problem = scanner.nextLine();

                    System.out.print("Phone number: ");
                    String phone = scanner.nextLine();

                    Patient patient = new Patient(name, age, problem, phone);
                    hospital.addPatient(patient);

                    System.out.println("Patient added successfully!");
                    break;

                case 3:
                    if (hospital.getTotalPatients() == 0) {
                        System.out.println("No patients yet. Add patient first.");
                        break;
                    }

                    Patient lastPatient = hospital.getLastPatient();
                    String category = lastPatient.getAgeCategory();

                    System.out.println("\nAvailable doctors for " + category + ":");
                    hospital.showDoctorsForAgeGroup(category);

                    System.out.println("Appointment booked successfully!");
                    break;

                case 0:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}



