import javax.print.Doc;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Chente", "Oculista");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialty);

        Patient patient = new Patient("Pelé", "futbol@gol.com");
        patient.setWeight(78.5);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("557738822");
        System.out.println(patient.getPhoneNumber());
    }
}
