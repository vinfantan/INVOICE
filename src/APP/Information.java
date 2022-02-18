/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author VIVEK
 */
public class Information {
    public String getinfo(int index)
    {
      String info=""; int i=0;
         String data[]={"","","","","","",""};
         try {

            File f = new File("C:\\Users\\VIVEK\\Documents\\NetBeansProjects\\INVOICE\\src\\APP\\Vivek.txt");
       
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                     if(i<7)
                    data[i]=readLine; 
                     i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
      
      return data[index];
    }
}
