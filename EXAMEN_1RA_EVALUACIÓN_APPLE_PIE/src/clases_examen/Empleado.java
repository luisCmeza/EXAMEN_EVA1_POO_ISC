package clases_examen;

public class Empleado {

    String nombre, apellido, direccion;

    int año;
    double salario;

    public void setNombre(String valor) {
        nombre = valor;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public void setDireccion(String valor) {
        direccion = valor;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public void setSalario(double valor) {
        salario = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAño() {
        return año;
    }

    public double getSalario() {
        return salario;
    }

    //-----------------------------------------------
    public Empleado() {
        nombre = "";
        apellido = "";
        direccion = "";
        año = 0000;
        salario = 0.00;
    }

    public Empleado(String nombre1, String apellido1, String direccion1, int año1, double salario1) {
        nombre = nombre1;
        apellido = apellido1;
        direccion = direccion1;
        año = año1;
        salario = salario1;
    }

    //-------------------------------------------------------
    public int calcularVacaciones() {
        int vacas = 0;
        int antig = 2023 - año;
        int sal = 0;
        if (antig == 1) {
            vacas = 6;
        } else if (antig > 1) {
            sal = (antig / 5);
            antig--;
            vacas = 6 + (antig * 2) + (sal * 2);
        } else if (antig < 1) {
            System.out.println("trabajele más");
        }
        return vacas;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Direccion: " + direccion);
        System.out.println("Año de Ingreso: " + año);
        System.out.println("Salario: $" + salario);
        System.out.println("Vacaciones " + calcularVacaciones());
        System.out.println("");
    }
}
