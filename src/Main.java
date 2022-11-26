public class Main {
    public static void main(String[] args) {
        int result1 = sumaFuncionPura(1,2);
        int result2 = sumaFuncionPura(1, 2);
        System.out.println(result1 + " " + result2);
    }
    //funcion pura

    /**
     * UNA FUNCION PURA RETURN:
     * SIEMPRE LA MISMA SALIDA
     * UNA FUNCION PURA QUE INVOCA A OTRA FUNCION QUE NO ES PURA, ENTONCES YA NO ES PURA
     * SI MODIFICÓ UNA VARIABLE GLOBAL DENTRO DE UNA FUNCION PURA, ENTONCES YA NO ES PURA LA FCION
     * LA FUNCION DEBE DEVOLVER EL VALOR ACORDE A LOS PARAMETROS DE ENTRADA
     */
    public static int suma(int a, int b){

        return a + b + multiplicate(a, b);  //ya no es una f pura porque modifica la salida.
    }
    public static int sumaFuncionPura(int a, int b){
        return a + b;
    }
    public static int multiplicate(int a, int b){ // sí es una funcion pura, porque no modifica el valor de salida
        return a * b;
    }

    /*public static String devuelve(String cadena){
        return cadena.startsWith("a"); //deuvelve una
    }*/

}
