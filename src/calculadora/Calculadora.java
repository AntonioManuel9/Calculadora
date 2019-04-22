/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javafx.application.Application;
import javafx.stage.Stage;
// Utilizamos el siguiente import para realizar la tarea de introducir un numero por consola.
import java.util.Scanner;

/**
 *
 * @author Antonio Manuel
 */
public class Calculadora extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Metodos operaciones = new Metodos();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, resultado, opcion;
        boolean op= true;
        /* El siguiente bucle while lo que hace es repetir constantemente lo que le estamos indicando y parará una vez que entre en el if que sería una vez 
         * que le indicamos la opción 5 que es la de salir y por lo tanto la aplicación se cerrará y el bucle while terminará.
         */
        while(op){
            System.out.println("*************************");
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Seleccione opción: ");
            opcion = entrada.nextInt();
            
            if(opcion == 5){
                System.out.println("La aplicación se cerró");
                break;
            } else {
                /* Con el siguiente switch haremos las correspondientes operaciones llamando a la clase metodos en la que se encuentran los diferentes metodos para 
                 * realizar tanto las operaciones de suma, resta, multiplicacion y division.
                 */
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el primer valor. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo valor. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = (int) operaciones.suma(n1, n2);
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer valor. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo valor. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = (int) operaciones.resta(n1, n2);
                        System.out.println("La resta es: " + resultado);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer valor. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo valor. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = (int) operaciones.multiplicacion(n1, n2);
                        System.out.println("La multiplicación es: " + resultado);
                        break;
                    case 4: 
                        System.out.println("Ingrese el primer valor. Valor: ");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo valor. Valor: ");
                        n2 = entrada.nextInt();
                        resultado = (int) operaciones.division(n1, n2);
                        System.out.println("La división es: " + resultado);
                        break;
                    // En caso que introduzcamos un valor que no aparezca en el menú entrará en por defecto o default y nos mostrará el mensaje "Opción no valida"
                    default:
                        System.out.print("Opción no Valida......");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
