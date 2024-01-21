import javax.print.Doc;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Chente", "Oculista");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialty);

        Patient patient = new Patient("Pelé", "futbol@gol.com");
        Patient patient2 = new Patient( "Ulises", "gs@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient2.getName());

        patient2.setName("Yeye");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        /*patient.setWeight(78.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("557738822");
        System.out.println(patient.getPhoneNumber());*/
    }
}
