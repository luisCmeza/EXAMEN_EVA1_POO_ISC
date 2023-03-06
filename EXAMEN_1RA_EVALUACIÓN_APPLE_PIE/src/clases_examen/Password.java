
package clases_examen;


public class Password {
    String usuario, contra;
    
    public Password(){
        usuario = "----";
        contra = "----";         
    }
    public Password(String usuario1, String contra1){
        usuario = usuario1;
        contra = contra1;
    }
    
    //------------------------------------------------
    public void setUsuaro(String valor){
        usuario = valor;
    }
    public void setContra(String valor){
        contra = valor;
    }
    
    //------------------------------------------------
    public boolean verificarAcceso(String usuario2, String contra2){
        boolean acceso= true;
        
        if ((usuario2 == usuario) && (contra2 == contra)){
            acceso = true;
        }else
            acceso = false;
            System.out.println(acceso);
        return acceso;
        
    }
}
