import java.io.*;
import javax.swing.*;
public class LeerGrabar {
	File f;
	File archivo = null;
	FileReader fr = null;
	FileWriter w = null;
	BufferedWriter bw = null;
	BufferedReader br = null;
	PrintWriter wr;
	String datos,pedir,linea;
	int cont = 1;
    public static void main(String[] args) {
        
        try{
        	archivo = new File("log.java");
        	f = new File("copia_log.txt");
        	fr = new FileReader(archivo);
        	br = new BufferedReader(fr);
        	w = new FileWriter(f);
        	bw = new BufferedWriter(w);
        	wr = new PrintWriter(bw);
        	linea =  br.readLine();
        	while(linea!=null){
        		wr.append(linea);
        		wr.println("");
        		linea = br.readLine();
        		cont++;
        	}
        }catch(Exception e){e.printStackTrace();}
        finally{
        	try{wr.close();	bw.close();
        	}catch(IOException e){//Pendiente        	}
        }
        
    }
}
}
