package Views;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controllers.Seguridad;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Vlogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelinicisecion;
	public static JTextField txtUser;
	public static JPasswordField txtPwd;
	Vadmin ventanabiblio= new Vadmin();
	
	private static Scanner sc;
	private static int intentos;
	private static String user,pwd;
	private JButton btnSalir;

	
	public Vlogin() {
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vlogin.class.getResource("/inocos/open-book (2).png")));
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 333, 348);
		panelinicisecion = new JPanel();
		panelinicisecion.setBackground(new Color(0, 139, 139));
		panelinicisecion.setForeground(Color.BLACK);
		panelinicisecion.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelinicisecion);
		panelinicisecion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIAR SESION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(53, 11, 199, 34);
		panelinicisecion.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(28, 84, 73, 14);
		panelinicisecion.add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(131, 83, 176, 20);
		panelinicisecion.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContrasea.setBounds(28, 135, 101, 14);
		panelinicisecion.add(lblContrasea);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(131, 133, 176, 20);
		panelinicisecion.add(txtPwd);
		
		
		
		JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.setIcon(new ImageIcon(Vlogin.class.getResource("/inocos/login.png")));
		btnNewButton.addActionListener(new ActionListener() {
			
		   public void actionPerformed(ActionEvent arg0) {
				
				int nLineas=0;
				int i=0;
				String [] usuarios = null;
				String linea;
				
				try {
					sc = new Scanner(new File("usuarios.txt"));
					File f = new File("usuarios.txt");
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					
					while((linea=br.readLine())!=null){
						nLineas++;	
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				usuarios = new String [nLineas];//Tamaño del array
				
				while (sc.hasNextLine()){

					usuarios[i++] = sc.nextLine();//Alamacenando cada linea en una posicion del array
					
				}
				
				intentos++;
				user = txtUser.getText();
				pwd=txtPwd.getText();
				
				Seguridad segu = new Seguridad();
				segu.validarUsuario(usuarios, user, pwd, intentos);
				txtUser.setText("");
				txtPwd.setText("");
				
			}
		});
		btnNewButton.setBounds(20, 204, 121, 52);
		panelinicisecion.add(btnNewButton);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setIcon(new ImageIcon(Vlogin.class.getResource("/inocos/log-out-button (1).png")));
		btnSalir.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		
		});
		btnSalir.setBounds(161, 204, 116, 52);
		panelinicisecion.add(btnSalir);
	}

}
