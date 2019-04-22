package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Manuel
 */
public class Metodos {
    /* Con el siguiente método efectuamos todas las operaciones de sumar. Lo realizamos creando una variable resultado que inicialmente es 0 
     * en la cual se guarda el resultado de la operación, que mas tarde el mñetodo nos lo devolverá.
     */
    public double suma(int n1, int n2){
        int resultado = 0;
        resultado = n1 + n2;
        return resultado;
    }
    /* Tal como hemos explicado en el comentario anterior para el metodo de la suma en este se realiza el mismo procedimiento pero 
     * para operaciones relacionadas con restas de numeros.
     */
    public double resta(int n1, int n2){
        int resultado = 0;
        resultado = n1 - n2;
        return resultado;
    }
    public double multiplicacion(int n1, int n2){
        int resultado = 0;
        resultado = n1 * n2;
        return resultado;
    }
    /* En el caso de la division el unico cambio que tenemos respecto a los demás métodos es que el resultado que nos va a devolver 
     * va a ser de tipo entero.
     */
    public double division(int n1, int n2){
        int resultado = 0;
        resultado = (int) (n1*1.0/n2);
        return resultado;
    }
}
