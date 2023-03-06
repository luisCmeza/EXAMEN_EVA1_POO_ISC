
package clases_examen;


public class FIBONACCI {

    int a1;
    int a2;
    int n;

    public FIBONACCI() {
        a1 = 1;
        a2 = 1;
        n = 6;
    }

    public FIBONACCI(int v1, int v2, int p1) {
        a1 = v1;
        a2 = v2;
        n = p1;
    }

    public void setA1(int valor) {
        a1 = valor;
    }

    public void setA2(int valor) {
        a2 = valor;
    }

    public void setN(int valor) {
        n = valor;
    }

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }

    public int getN() {
        return n;
    }

    public void calcularFibonacci() {
        for (int i = 1; i <= n; i++) {
            a2 = a1 + a2;
            if (i == n) {
                System.out.print(a1 + " ");
            } else if (i < n) {
                System.out.print(a1 + " - ");
            }
            a1 = a2 - a1;

        }
    }

}
