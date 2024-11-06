package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        TablaMultiplicar tm = new TablaMultiplicar();
        int numero = 9;
        int[]tabla = tm.tablaNumero(numero);
        for (int i = 1; i <= tabla.length; i++) {
            if(i<=9){
                System.out.println(" "+i+" x "+numero+" = "+ tabla[i-1]);

            }else{
                System.out.println(i+" x "+numero+" = "+ tabla[i-1]);
            }
        }
        
    }
}
