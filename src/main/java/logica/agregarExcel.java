/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import Vista.Inicio;
import Vista.Vinventario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Camaras
 */
public class agregarExcel {
     int keys = 1;
        XSSFWorkbook workbook = new XSSFWorkbook();
  
        // spreadsheet object
        XSSFSheet spreadsheet
            = workbook.createSheet(" Inve ");
  
        // creating a row object
        XSSFRow row;
  
        // This data needs to be written (Object[])
        Map<String, Object[]> Inve
            = new TreeMap<String, Object[]>();
        
        public  void Excel(String id, String cod, String desc, String col, String ref ,String tal ,String cant, boolean grd ) throws FileNotFoundException, IOException{
        keys = keys+1;
        String Key = Integer.toString(keys);
        Inve.put(
            "1",
            new Object[] { "ID", "COD-BARRAS", "DESCRIPCION", "COLOR", "REFERENCIA", "TALLA", "CANTIDAD" });
  
        Inve.put(Key, new Object[] { id, cod, desc, col, ref, tal, cant  });
  
        Set<String> keyid = Inve.keySet();
  
        int rowid = 0;
  
        // writing the data into the sheets...
  
        for (String key : keyid) {
  
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = Inve.get(key);
            int cellid = 0;
  
            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }

        if(grd){
         // .xlsx is the format for Excel Sheets...
        // writing the workbook into the file...
             FileOutputStream out = new FileOutputStream(
           new File("C:\\Users\\Camaras\\Documents\\NetBeansProjects\\Inventario\\InventarioDatos.xlsx"));
  
        workbook.write(out);
        out.close();           
        }

        
    }
        
    public void eliminarRegistro(int id){
            int valor =  id + 1;
            String val = Integer.toString(valor);
            Inve.put(val, new Object[] { "Registro", "Eliminado", "Eliminado", "Eliminado", "Eliminado", "Eliminado", "Eliminado"  });
    
    }
}
