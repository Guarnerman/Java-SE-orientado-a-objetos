import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincremento
    private String name;
    private String email;
    private String specialty;

    //Available appointment

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String specialty){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.specialty = specialty;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
