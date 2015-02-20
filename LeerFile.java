import java.io.*;
import java.util.*;
public class LeerFile {
public static void main(String[] args){
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	try{
		archivo= new File("E:\\BDD_LOG\\log.txt");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		String linea;
		linea = br.readLine();
		String param[];
		String otra;
		String cadena1=null,cadena2="",cadenaFin="";;
		int ind;
		while(linea!=null){
		otra=linea.toUpperCase();
		param = otra.split(";");
			if(param[2].equals("900")){
				cadena1= param[4]+" into "+param[6]+" values( "+ param[5]+",";
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
			}
			if(param[2].equals("800")){
				cadena1= param[4]+" from "+param[6]+" where ";
				linea = br.readLine();
					ind=1;
					if(ind==1){
						cadena1=cadena1+param[3]+"="+param[5]+";";
					}
					while(ind <=5){
						//otra=linea.toUpperCase();
						//param = otra.split(";");
						//cadena2 = cadena2 +"'"+param[5]+"',";
						ind++;
						linea = br.readLine();
						if(ind==6) {
							//cadena1 = cadena1+cadena2;
							//cadena1 = cadena1.substring(0,cadena1.length()-1);
							//cadena1 = cadena1+ ");";
							System.out.println(cadena1);
							cadena1="";
						}
					} 
			}
			if(param[2].equals("700")){
				cadena1= param[4]+" "+param[6]+" set ";
				linea = br.readLine();
					ind=1;
					if(ind==1){
						cadenaFin = cadenaFin+" where "+param[3]+"="+param[5]+";";
					}
					while(ind <=5){
						otra=linea.toUpperCase();
						param = otra.split(";");
						cadena2 = cadena2 +param[3]+"='"+param[5]+"',";
						ind++;
						linea = br.readLine();
						if(ind==6) {
							cadena1 = cadena1+cadena2;
							cadena1 = cadena1.substring(0,cadena1.length()-1);
							cadena1 = cadena1+ cadenaFin;
							System.out.println(cadena1);
							cadena2=""; cadenaFin="";
						}
					}
			}
			
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
	}
}    
}