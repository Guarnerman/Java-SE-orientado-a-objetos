import javax.print.Doc;

import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Chente", "Oculista");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        /*Patient patient = new Patient("Pelé", "futbol@gol.com");
        Patient patient2 = new Patient( "Ulises", "gs@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient2.getName());

        patient2.setName("Yeye");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/


    }
}
