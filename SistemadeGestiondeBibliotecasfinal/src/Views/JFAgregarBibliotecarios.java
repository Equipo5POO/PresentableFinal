package Views;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class JFAgregarBibliotecarios extends JFrame {

	JFileChooser seleccionado = new JFileChooser();
	File archivo;
	byte [] bytesImg;
	AgregarBibliotecarios gestion = new AgregarBibliotecarios();
	private JPanel contentPane;
	
	public JFAgregarBibliotecarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFAgregarBibliotecarios.class.getResource("/inocos/open-book (2).png")));
		setFont(new Font("Sitka Banner", Font.BOLD, 14));
		setTitle("GESTION DE BIBLIOTECARIOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 409, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setForeground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirArchivo = new JButton("BUSCAR ARCHIVO");
		btnAbrirArchivo.setIcon(new ImageIcon(JFAgregarBibliotecarios.class.getResource("/inocos/search (2).png")));
		btnAbrirArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(seleccionado.showDialog(null,"ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
					archivo = seleccionado.getSelectedFile();
					if(archivo.canRead()){
						if(archivo.getName().endsWith("txt")){
							String contenido = gestion.AbrirATexto(archivo);
							txtAreaTexto.setText(contenido+"\n");
						}else{
							JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de texto o imagen.");
						}
					}
				}	
			}
		});
		btnAbrirArchivo.setBounds(21, 376, 157, 39);
		contentPane.add(btnAbrirArchivo);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(61, 79, 252, 286);
		contentPane.add(scrollPane_1);
		
		txtAreaTexto = new JTextArea();
		scrollPane_1.setRowHeaderView(txtAreaTexto);
		
		JButton btnNewButton_1 = new JButton("GUARDAR CAMBIOS");
		btnNewButton_1.setIcon(new ImageIcon(JFAgregarBibliotecarios.class.getResource("/inocos/diskette.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(seleccionado.showDialog(null,"GUARDAR TEXTO") == JFileChooser.APPROVE_OPTION){
					archivo = seleccionado.getSelectedFile();
					if(archivo.getName().endsWith("txt")){
						String contenido = txtAreaTexto.getText();
						String respuesta = gestion.GuardaATexto(archivo, contenido);
						if(respuesta != null){
							JOptionPane.showMessageDialog(null, respuesta);
						}else{
							JOptionPane.showMessageDialog(null, "Error al guardar texto");
						}
					}else{
						JOptionPane.showMessageDialog(null, "El texto se debe guardar en formato de texto");
					}
				}
			}
		});
		btnNewButton_1.setBounds(188, 376, 179, 39);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("AGREGUE BIBLIOTECARIOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(84, 11, 209, 57);
		contentPane.add(lblNewLabel);
	}
	
	public JTextArea txtAreaTexto;
}
