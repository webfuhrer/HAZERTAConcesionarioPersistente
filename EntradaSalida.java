/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcesionariopersistente;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {

    static int pedirOpcion() {
         Scanner sc=new Scanner(System.in);
    String[] opciones={"1-Crear coche", "2-Listar coches", 
   "3-Salir"};
    for (String opcion: opciones)
        {
            System.out.println(opcion);
        }
    int opcion=sc.nextInt();
    return opcion;
        
        
    }

    static Coche pedirDatosCoche() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la marca");
        String marca=sc.nextLine();
        System.out.println("Introduzca el modelo");
        String modelo=sc.nextLine();
        System.out.println("Introduzca potencia");
        int potencia=sc.nextInt();
        Coche c=new Coche(marca, modelo, potencia);
        return c;
    }
    
}
