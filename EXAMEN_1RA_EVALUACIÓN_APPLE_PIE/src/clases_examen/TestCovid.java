
package clases_examen;


public class TestCovid {
    
        public int edad;
        public boolean enfermedad;
        public double peso;
        public double estatura;

        public TestCovid() {
            edad = 0;
            enfermedad = false;
            peso = 0;
            estatura = 0;
        }

        public void setEdad(int valor) {
            edad = valor;
        }

        public void setEnfermedad(boolean opcion) {
            enfermedad = opcion;
        }

        public void setPeso(double valor) {
            peso = valor;
        }

        public void setEstatura(double valor) {
            estatura = valor;
        }

        public int getEdad() {
            return edad;
        }

        public boolean getEnfermedad() {
            return enfermedad;
        }

        public double getPeso() {
            return peso;
        }

        public double getEstatura() {
            return estatura;
        }

        public void calcularPersonaRiesgo() {
            calcularIMC cimc = new calcularIMC();
            double imc = cimc.getOperacionImc();
            //System.out.println(imc);
            //System.out.println(peso);
            //System.out.println(estatura);
            if (edad >= 65 || enfermedad == true || imc > 30) {
                System.out.println("PERSONA DE RIESGO");
            } else {
                System.out.println("PERSONA SIN RIESGO");
            }
        }

    }

    class calcularIMC {

        TestCovid tc1 = new TestCovid();
        double imc;
        private double operacionIMC() {
            return imc = tc1.peso / (tc1.estatura * tc1.estatura);
        }
        public double getOperacionImc(){
            return imc;
        }
    }

