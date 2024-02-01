public class Futbolista {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Futbolista{" + getClass() +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
                '}';
    }
}
