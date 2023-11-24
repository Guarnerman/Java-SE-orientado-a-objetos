public class Doctor {
    //Atributos
    static int id = 0; //Autoincremento
    String name;
    String specialty;

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
}
