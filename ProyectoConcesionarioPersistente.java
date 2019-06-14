/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcesionariopersistente;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProyectoConcesionarioPersistente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=EntradaSalida.pedirOpcion();
        
        while (opcion!=3)
        {
            switch(opcion)
            {
            case 1:
                //1-Pedir datos coche
                Coche c=EntradaSalida.pedirDatosCoche();
                boolean grabacion_correcta=AccesoFichero.grabarCoche(c);
                //2-Grabar coche en fichero
                System.out.println("Se grabó bien: "+grabacion_correcta);
                break;
            case 2:
                //Listar
                ArrayList<Coche> lista_coches=AccesoFichero.obtenerCoches();
                EntradaSalida.mostrarCoches(lista_coches);
                break;
            
            }
            opcion=EntradaSalida.pedirOpcion();
        }
        
    }
    
}
