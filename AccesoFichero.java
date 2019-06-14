/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcesionariopersistente;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class AccesoFichero {
static String ruta_fichero="D:\\coches.csv";
static String separador=",";
    static boolean grabarCoche(Coche c)  {
    try {
        FileWriter escritor=new FileWriter(ruta_fichero, true);
        String aux=c.getMarca()+separador+c.getModelo()+separador+c.getPotencia()+"\n";
        escritor.write(aux);
        escritor.close();
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
     return true;
    }

    static ArrayList<Coche> obtenerCoches()  {
       ArrayList<Coche> lista_coches=new ArrayList<>(); 
    try {
        
        FileReader lector=new FileReader(ruta_fichero);
        BufferedReader br=new BufferedReader(lector);
        String linea=br.readLine();
        while(linea!=null)
        {
           String[] datos= linea.split(separador);
           String marca=datos[0];
           String modelo=datos[1];
           String potencia=datos[2];
           int potencia_numerica=Integer.parseInt(potencia);
           Coche c=new Coche(marca, modelo, potencia_numerica);
           lista_coches.add(c);
           linea=br.readLine();
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
    return lista_coches;
    
    }
    
}
