
package examen_1ra_evaluación_apple_pie;

import clases_examen.CuentaBancaria;
import clases_examen.DatosIntegrantes;
import clases_examen.Empleado;
import clases_examen.FIBONACCI;
import clases_examen.Password;
import clases_examen.TestCovid;

/*
 David, Iram, Angel, Luis
 */
public class EXAMEN_1RA_EVALUACIÓN_APPLE_PIE {

    public static void main(String[] args) {
      
        String datos="";
        System.out.println(DatosIntegrantes.imprimirDatosEquipo(datos));
        System.out.println("");
        System.out.println(DatosIntegrantes.imprimirProblemasResueltos(datos));

        
        //-----------------------------------------------------
        System.out.println("CLASE CONTRASEÑA:");
        Password pas = new Password();
        pas.setUsuaro("asi es");
        pas.setContra("apple pie");
        pas.verificarAcceso("asi es", "apple pie");

        Password pas2 = new Password("no es", "chees pie");
        pas2.verificarAcceso("no es", "chees pie");
        System.out.println("");
        
        
        
        //------------------------------------------------
        System.out.println("CLASE CUENTA BANCARIA:");
        CuentaBancaria cta = new CuentaBancaria();
        cta.setCuenta(22550287);
        cta.setCliente("David Martínez");
        cta.depositarEnCuenta(5000);
        cta.retirarDeCuenta(2500);
        cta.imprimirDatos();
        
        CuentaBancaria cta1 = new CuentaBancaria("Iram", 22550298, 0);
        cta1.depositarEnCuenta(2000);
        cta1.retirarDeCuenta(5000);
        cta1.imprimirDatos();
        
        CuentaBancaria cta2 = new CuentaBancaria("Carlos", 22550299, 100);
        
        cta2.depositarEnCuenta(200);
        cta2.retirarDeCuenta(27);
        
        String cliente = cta2.getCliente();
        int cuenta = cta2.getCuenta();
        double saldo = cta2.getSaldo();
               
        System.out.println("DATOS DE LA CUENTA");
        System.out.println("Numenro de cuenta: " +cuenta);
        System.out.println("Nombre del Cliente: " +cliente);
        System.out.println("Saldo: $" +saldo);
        //-------------------------------------------------
        System.out.println("");
        System.out.println("CLASE EMPLEADO:");
        Empleado e1 = new Empleado();
        e1.setNombre("Ange");
        e1.setApellido("Arizpe");
        e1.setDireccion("Tec2");
        e1.setAño(2017);
        e1.setSalario(5000);
        e1.calcularVacaciones();
        e1.imprimirDatos();
        
        Empleado e2 = new Empleado("Figonachi", "Phi", "Examen_POO", 2021, 20);
        e2.calcularVacaciones();
        e2.imprimirDatos();
        
         Empleado e3 = new Empleado("Luis_David", "Meza", "Tu casa", 2023, 6000);
         String nombre = e3.getNombre();
         String apellido = e3.getApellido();
         String direccion = e3.getDireccion();
         int año = e3.getAño();
         double salario = e3.getSalario();
         
         System.out.println("Nombre: " +nombre);
         System.out.println("Apellido: " +apellido);
         System.out.println("Direccion: " +direccion);
         System.out.println("Año de Ingreso: " +año);
         System.out.println("Salario: $" +salario);
         System.out.println("Vacaciones: " +e3.calcularVacaciones());
         //---------------------------------------------------------------
         System.out.println("");
         System.out.println("CLASE FIBONACCI:");
        FIBONACCI f1 = new FIBONACCI();
        f1.calcularFibonacci();
        System.out.println("");
        
        FIBONACCI f2 = new FIBONACCI();
        f2.setA1(2);
        f2.setA2(5);
        f2.setN(6);
        f2.calcularFibonacci();
        System.out.println("");
        
        FIBONACCI f3 = new FIBONACCI(1, 1, 6);
        int a1 = f3.getA1();
        int a2 = f3.getA2();
        int n= f3.getN();
        f3.calcularFibonacci();
        System.out.println("");
        //------------------------------------------
        System.out.println("");
        System.out.println("CLASE TEST COVID:");
        TestCovid tc1 = new TestCovid();
        tc1.setEdad(30);
        tc1.setEnfermedad(false);
        tc1.setPeso(60.0);
        tc1.setEstatura(1.70);
        tc1.calcularPersonaRiesgo();

    }
    
}
      