package Calculator;

import java.util.Scanner;



public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola, esta calculadora te ayudará a resolver ejercicios básicos");
        System.out.println("Indica el primer numero");
        double numeroUno = teclado.nextInt();
        System.out.println("Indica el segundo numero");
        double numeroDos = teclado.nextInt();

        System.out.println("El primer numero es: " + numeroUno +" y " + "El segundo numero es: " + numeroDos);

        System.out.println("si ambos numeros se suman el resultado es " + (numeroUno + numeroDos));
        System.out.println("si ambos numeros se resta el resultado es " + (numeroUno - numeroDos));
        System.out.println("si ambos se multiplican el resultado es " + (numeroUno * numeroDos));
        System.out.println("si ambos numeros se dividen el resultado es " + (numeroUno / numeroDos));
        System.out.println("La resta de la division del primer numero y segundo numero es " + (numeroUno % numeroDos));









    }
}
