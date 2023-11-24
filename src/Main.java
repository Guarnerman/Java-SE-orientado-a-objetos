import javax.print.Doc;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Chente", "Oculista");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialty);

        Patient patient = new Patient("Pelé", "futbol@gol.com");
    }
}
