/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adrian
 */
public class filesCreator {
    public filesCreator(String str_ruta,String datos) throws IOException{
        String ruta = str_ruta;
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo,true));
            bw.write(datos);
            bw.newLine();
        } else {
            bw = new BufferedWriter(new FileWriter(archivo,true));
            bw.write(datos);
            bw.newLine();
        }
        bw.close();
        
        
    }
}
