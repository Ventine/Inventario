/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * 
 * @author Camaras
 */


import java.io.FileNotFoundException;
//import vista.Inicio;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class validarInicio {
    
    
    public boolean validarIni (String us, String pas) throws FileNotFoundException, IOException, ParseException{
        boolean resp = false;
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Camaras\\Documents\\NetBeansProjects\\Inventario\\src\\main\\java\\Data\\datos.txt");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray array = (JSONArray)pJsonObj.get("Usuario");
        
        for(int i = 0; i < array.size(); i++){
            JSONObject userpass = (JSONObject)array.get(i);
            
            String user = (String) userpass.get("user");
            String pass = (String) userpass.get("pass");
            
            if(user.equals(us) && pass.equals(pas)){
            System.out.println( "\n Inicio de sesion correcto: ");
            System.out.println( "User: " + user);
            System.out.println( "Pass: " + pass);
            resp= true;
            }else{
            System.out.println( "\n Inicio de sesion incorrecto: ");  
            resp = false;
            }

        }  
        return resp;
    }
    
}
