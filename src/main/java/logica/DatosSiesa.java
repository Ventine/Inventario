/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.FileNotFoundException;
//import vista.Inicio;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Camaras
 */
public class DatosSiesa { 
    public String descVal (Long us) throws FileNotFoundException, IOException, ParseException {
        String ver = "";
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Camaras\\Documents\\NetBeansProjects\\Inventario\\src\\main\\java\\Data\\datosInv.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray array = (JSONArray)pJsonObj.get("REF");
        
        for(int i = 0; i < array.size(); i++){
        JSONObject userpass = (JSONObject)array.get(i);
            
        String descripcion_item = (String) userpass.get("descripcion_item");
            
        String cod_barra = (String) userpass.get("cod_barra");
        long codi = Long.parseLong(cod_barra);
            
          if(us == codi){
             ver =descripcion_item;   
            }
        }  
        return ver;
    }
    
        public String colorVal (Long us) throws FileNotFoundException, IOException, ParseException {
        String ver = "";
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Camaras\\Documents\\NetBeansProjects\\Inventario\\src\\main\\java\\Data\\datosInv.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray array = (JSONArray)pJsonObj.get("REF");
        
        for(int i = 0; i < array.size(); i++){
        JSONObject userpass = (JSONObject)array.get(i);
            
        String Color = (String) userpass.get("Color");
            
        String cod_barra = (String) userpass.get("cod_barra");
        long codi = Long.parseLong(cod_barra);
            
          if(us == codi){
             ver =Color;   
            }
        }  
        return ver;
    }

        public String refVal (Long us) throws FileNotFoundException, IOException, ParseException {
        String ver = "";
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Camaras\\Documents\\NetBeansProjects\\Inventario\\src\\main\\java\\Data\\datosInv.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray array = (JSONArray)pJsonObj.get("REF");
        
        for(int i = 0; i < array.size(); i++){
        JSONObject userpass = (JSONObject)array.get(i);
            
        String ID_REFER_ITEM = (String) userpass.get("ID_REFER_ITEM");
            
        String cod_barra = (String) userpass.get("cod_barra");
        long codi = Long.parseLong(cod_barra);
            
          if(us == codi){
             ver =ID_REFER_ITEM;   
            }
        }  
        return ver;
    }
        
        public String talVal (Long us) throws FileNotFoundException, IOException, ParseException {
        String ver = "";
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Camaras\\Documents\\NetBeansProjects\\Inventario\\src\\main\\java\\Data\\datosInv.json");
        Object obj = parser.parse(reader);
        JSONObject pJsonObj = (JSONObject)obj;
        JSONArray array = (JSONArray)pJsonObj.get("REF");
        
        for(int i = 0; i < array.size(); i++){
        JSONObject userpass = (JSONObject)array.get(i);
            
        String TALLA_01 = (String) userpass.get("TALLA_01");
            
        String cod_barra = (String) userpass.get("cod_barra");
        long codi = Long.parseLong(cod_barra);
            
          if(us == codi){
             ver =TALLA_01;   
            }
        }  
        return ver;
    }
}
