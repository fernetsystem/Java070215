import java.io.*;
import java.util.*;
public class LeerFile {
public static void main(String[] args){
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	try{
		archivo= new File("F:\\BDD_LOG\\log.txt");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		String linea;
		linea = br.readLine();
		String param[];
		String otra;
		String cadena1=null,cadena2="";
		int ind;
/*		otra=linea.toUpperCase();
		param = otra.split(";");
		cadena1= param[4]+" into "+param[6]+" values( "+ param[5]+",";
		System.out.println(cadena1);
		linea = br.readLine();
	*/	while(linea!=null){
		otra=linea.toUpperCase();
		param = otra.split(";");
		cadena1= param[4]+" into "+param[6]+" values( "+ param[5]+",";
		//System.out.print(cadena1);
		linea = br.readLine();
			ind=1;
			while(ind <=5){
			otra=linea.toUpperCase();
			param = otra.split(";");
				cadena2 = cadena2 +"'"+param[5]+"',";
				ind++;
				linea = br.readLine();
				if(ind==6) {
					cadena1 = cadena1+cadena2;
					cadena1 = cadena1.substring(0,cadena1.length()-1);
					cadena1 = cadena1+ ");";
					System.out.println(cadena1);
					cadena2="";
				}
			}	
			/*cadena1 = cadena1+cadena2;
			cadena1 = cadena1.substring(0,cadena1.length()-1);
			cadena1 = cadena1+ ");";
			*///A qui va el código para insertar
		}
					//System.out.print(cadena2);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
	}
}    
}