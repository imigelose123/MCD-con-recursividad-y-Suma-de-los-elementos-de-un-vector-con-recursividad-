public class Ejercicios {

    public static int factorial(int n) {
        int factorial;

        if (n == 1) {
            //caso base
            factorial = n;
        } else {
            factorial = n * factorial(n - 1);
        }

        return factorial;
    }

    //maximo comun divisor (mcd) , algoritmo de Euclides
    public static int mcd(int a, int b) {
        int mcd;

        if (a == b) {
            //caso base
            mcd = b;
        } else {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            mcd = mcd(a, b);
        }
        return mcd;
    }
    //suma de los elementos de un vector
    //vector  = {2,4,6}
    //suma = 2+{4,6}
    //suma = 4+{6}
    //suma = 6
    public static int sumaVector(int[] vector, int indice){
        int suma;

        if (indice == vector.length - 1) {
            //caso base
            suma = vector[indice];
        }else {
            suma = vector[indice] + sumaVector(vector,indice +1);
        }
        return suma;
    }
}