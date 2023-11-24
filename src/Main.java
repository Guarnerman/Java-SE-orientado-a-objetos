import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Vicente Fernandez";
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();;

        showMenu();
    }
}
