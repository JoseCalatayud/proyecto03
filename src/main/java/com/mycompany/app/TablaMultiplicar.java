package com.mycompany.app;

public class TablaMultiplicar {

    public int[] tablaNumero(int numero) {
        // inicializamos el array de longitud 10 con los valores iniciales a 0
        // un array es un objeto. Si no se inicializa y no apunta a nada es "null"
        int[] tabla = new int[10];
        // Bucle for que va calculando los valores de la tabla de multiplicar
        for (int i = 0; i < tabla.length; i++) {
            // insertamos el valor en el array en orden de posicion 0 a 9
            tabla[i] = (i + 1) * numero;
        }
        // retornamos el array con los valores obtenidos
        return tabla;
    }

    public int menu(int numero) {
        int selector = numero;
        switch (selector) {
            case 4:
                System.out.println("es un 4");
                return selector;

            default:
                System.out.println("no es un 4");
                return selector;
        }
    }

}
