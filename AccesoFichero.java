/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcesionariopersistente;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class AccesoFichero {
static String ruta_fichero="D:\\coches.csv";
    static boolean grabarCoche(Coche c)  {
    try {
        FileWriter escritor=new FileWriter(ruta_fichero, true);
        String aux=c.getMarca()+","+c.getModelo()+","+c.getPotencia()+"\n";
        escritor.write(aux);
        escritor.close();
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
     return true;
    }
    
}
