package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        new Ejercicio_2().operaciones();

        System.out.println(Ejercicio_2_GitHub.sumar(5, 6));
    }

    public void operaciones() {

        int nro1, nro2, nro3, resultadoSuma, resultadoResta;

        System.out.println("Ingrese tres numeros para realizar operaciones");
        Scanner leer = new Scanner(System.in);
        nro1 = leer.nextInt();
        nro2 = leer.nextInt();
        nro3 = leer.nextInt();

        resultadoSuma = nro1 + nro2 + nro3;
        resultadoResta = nro3 - nro2 - nro3;

        System.out.println("El resultado de la suma es: " + resultadoSuma + " y el resultado de la resta es: " + resultadoResta);

    }

}
