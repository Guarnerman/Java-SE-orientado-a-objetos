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
            id++;
            this.name = name;
            this.email = email;
            this.weight = 78.5;
        }
}
