package Views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;


import javax.swing.JTextArea;

import Controllers.Seguridad;
import Controllers.SIBprincipal;

import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;;



public class InicioSIB extends JFrame {

	public static JTextField jtxtbuscadorlector;
	public static JPanel contentPane;

	Vlogin ventanapass= new Vlogin();
	Vadmin ventanabiblio= new Vadmin();
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSIB frame = new InicioSIB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 
	public InicioSIB() {
		
		setBackground(Color.BLACK);
		setFont(new Font("Tahoma", Font.BOLD, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSIB.class.getResource("/inocos/open-book (2).png")));
		setType(Type.POPUP);
		setTitle("SISTEMA DE BIBLIOTECAS ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 495);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jtxtbuscadorlector = new JTextField();
		jtxtbuscadorlector.setBounds(231, 108, 263, 31);
		contentPane.add(jtxtbuscadorlector);
		jtxtbuscadorlector.setColumns(10);
		
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setIcon(new ImageIcon(InicioSIB.class.getResource("/inocos/search.png")));
		btnNewButton.addActionListener(new ActionListener() {
			
			//ESTO ES PARA BUSCAR  EL ARCHIVO
			
			JFileChooser seleccionado = new JFileChooser();
			File archivo;
			byte [] bytesImg;
			AgregarBibliotecarios gestion = new AgregarBibliotecarios();
			private JPanel contentPane;
			
			JTextArea JTxtareabuscador = new JTextArea();
			public void actionPerformed(ActionEvent e) {
				
				if(seleccionado.showDialog(null,"ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
					archivo = seleccionado.getSelectedFile();
					if(archivo.canRead()){
						if(archivo.getName().endsWith("txt")){
							
							String contenido = gestion.AbrirATexto(archivo);
							JTxtareabuscador.setText(contenido+"|");
							
						}else{
							JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o imagen.");
						}
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setToolTipText("Presione aqu\u00ED para buscar el texto deseado.");
		btnNewButton.setBounds(88, 103, 133, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("INICIAR SESION");
		btnNewButton_1.setIcon(new ImageIcon(InicioSIB.class.getResource("/inocos/arrow-to-the-right-inside-a-circle.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanapass.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(440, 28, 171, 41);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addComponentListener(new ComponentAdapter() {
		});
		
		scrollPane.setBounds(110, 165, 364, 269);
		contentPane.add(scrollPane);
		
		JTextArea JTxtareabuscador = new JTextArea();
		scrollPane.setViewportView(JTxtareabuscador);
		
		
		
		
	}
}
