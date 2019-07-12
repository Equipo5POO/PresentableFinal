package Controllers;

import javax.swing.JOptionPane;

import Views.Vadmin;
import Views.Vbibliotecario;


public class Seguridad {//esta clase es exclusiva para comprobar y comparar el texto ingresado con la contaraseña real
	Vbibliotecario ventanabibliotecario= new Vbibliotecario();
	Vadmin ventanaadmin= new Vadmin();
	String res;
	public void validarUsuario(String usuarios[], String user, String pwd, int intentos){
		
		boolean encontrado = false;
		
		for ( int i=0; i<usuarios.length; i++){ 
	
			/*douglas ctm, aquí podemos poner uno para redirigirlo a administradores y otro a bibliotecarios
			 * lacuestion es que en eel primer if recorra solo a administradores o a bibliotecarios y si se da , que redirija a cada ventana suya*/
			
			if((usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equals(pwd))){
				
				
				//ESTE IF ES PARA REDIRIGIR, SI ES EL ADMINISTRADOR O EL BIBLIOTECARIO
				if((usuarios[0].equalsIgnoreCase(user)&&usuarios[1].equals(pwd))){
					ventanaadmin.setVisible(true);//SI LA CONDICION ES CIERTA ABRE LA VENTANA DEL ADMIN
				}
				else{
					ventanabibliotecario.setVisible(true);//SI LA CONDICION NO ES CIERTA ABRE LA VENTANA DEL BIBLIOTECARIO
				}
				
				encontrado = true;
				res = "Bienvenido " + user;//para mostrar una ventana de bienvenida
				JOptionPane.showMessageDialog(null, res, "Inicio de sesion",JOptionPane.INFORMATION_MESSAGE);
				intentos=0;
				break;
				
				
			}//FIN DEL IF
			
		}//FIN DEL FOR 
		
	
		if (encontrado==false){
		
		res="Clave y/o contraseña errónea";
		JOptionPane.showMessageDialog(null, res,"Inicio de sesion",JOptionPane.ERROR_MESSAGE);
		
	}//FIN DEL IF
	
	if(intentos>2){
		JOptionPane.showMessageDialog(null, "3 intentos fallidos, esto se cerrará","Inicio de Sesión",JOptionPane.ERROR_MESSAGE);
        System.exit(0); 
		
	}//FIN DEL IF
	
	}
}
