/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrabalhoPoo
{
    public static void main(String[] args)
    {
        Gson gson = new Gson();
        String fileContent = null;
        try {
            fileContent = new String(Files.readAllBytes(Paths.get("datafile.json")));
        } catch (IOException ex) {
            Logger.getLogger(TrabalhoPoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        JData dataCollection = gson.fromJson(fileContent, JData.class);
        
        dataCollection.getData().stream().forEach((record) -> {
            if(record.getValue() != 0)
            {
                System.out.println(record.getCountry() + ": " + record.getYear() + " -> " + record.getValue());
            }
        });
    }
}
