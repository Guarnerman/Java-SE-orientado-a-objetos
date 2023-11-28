public class Patient {

    static int id = 0;
    private String name;
    private String email;
    private String addres;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(){
            System.out.println("Construyendo el objeto Paciente No. " + id);
        }

    public Patient (String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return this.height + " m.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 10){
            System.out.println("El número telefónico debe ser válido");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }
}
