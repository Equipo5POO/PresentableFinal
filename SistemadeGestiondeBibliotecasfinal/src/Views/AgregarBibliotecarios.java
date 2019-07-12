package Views;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class AgregarBibliotecarios {
	
	//TRES VARIABLES :
	FileInputStream entrada; //FLUJO DE DE ENTRADA DE BYTES
	FileOutputStream salida; //FLUJO DE SALIDA DE BYTES
	File archivo; //FICHERO
	
	public AgregarBibliotecarios(){
		
	}
	
	//ABRIR UN ARCHIVO DE TEXTO
	
	public String AbrirATexto(File archivo){
		
		String contenido = "";
		
		try{
			entrada = new FileInputStream(archivo);
			int ascci;
			while((ascci = entrada.read())!=-1){	
				char carcater = (char)ascci;
				contenido += carcater;	
			}
			
		}catch(Exception e){
			
			JOptionPane.showMessageDialog(null, "No se econtró archivo");
			
		}
		
		return contenido;
	}
	
	//GUARDAR ARCHIVO DE TEXTO 
	
	public String GuardaATexto(File archivo, String contenido){
		
		String respuesta = null;
		
		try{
			salida = new FileOutputStream(archivo);
			byte [] bytesTxt = contenido.getBytes();
			salida.write(bytesTxt);
			respuesta = "Se guardó con éxito el archivo.";
		
		}catch(Exception e){
			System.out.println("no se ha guardado correctamente.");
		}
		
		return respuesta;
		
	}

}
