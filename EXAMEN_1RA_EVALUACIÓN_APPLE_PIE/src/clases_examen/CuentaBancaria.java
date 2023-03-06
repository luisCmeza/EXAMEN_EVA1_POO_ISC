
package clases_examen;


public class CuentaBancaria {
    int cuenta;
    double saldo;
    String cliente;
    
    public void setCuenta(int valor){
        cuenta = valor;
    }
    public void setCliente(String valor){
        cliente = valor;
    }
    public int getCuenta(){
        return cuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getCliente(){
        return cliente;
    }
    
    //---------------------------------------------
    public CuentaBancaria(){
        cuenta = 0;
        saldo = 0.00;
        cliente = "";
    }
    public CuentaBancaria(String cliente1, int cuenta1, double saldo1){
        cliente = cliente1;
        cuenta = cuenta1;
        saldo = saldo1;
    }
    
    //-----------------------------------------------------
    public double depositarEnCuenta(double monto){
        saldo = saldo + monto;
        return  saldo;
    }
    public double retirarDeCuenta(double monto){
        if(monto > saldo){
            System.out.println("Insuficiente saldo");
        }else
        saldo = saldo - monto;
            return saldo;
    }
    public void imprimirDatos(){
        System.out.println("DATOS DE CUENTA:");
        System.out.println("Número de Cuenta: " + cuenta);
        System.out.println("Nombre del Cliente: " + cliente);
        System.out.println("Saldo: $" + saldo);
        System.out.println("");
    }
}
