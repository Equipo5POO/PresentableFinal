package Views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Vadmin extends JFrame {
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField Jtxtcodigolib;
	private JTextField JtxtLIBRO;
	private JTextField Jtxtautor;
	private JTextField Jtxtcantidad;
	private JTextField Jtxtestante;
	private JTextField Jtxttomo;
	private JTable tabla_1;
	private JButton btnImprimir;
	private JTextField Jtxtfechaprestamo;
	
	public Vadmin() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel.setBounds(-10, -32,1370, 710);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(27, 130, 450, 418);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("CODIGO DE LIBRO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 26, 165, 21);
		panel_2.add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("TITULO");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitulo.setBounds(24, 58, 113, 21);
		panel_2.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("AUTOR");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAutor.setBounds(24, 90, 113, 21);
		panel_2.add(lblAutor);
		
		JLabel lblGenero = new JLabel("GENERO");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGenero.setBounds(24, 122, 113, 21);
		panel_2.add(lblGenero);
		
		JLabel lblEstante = new JLabel("ESTANTE");
		lblEstante.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstante.setBounds(24, 154, 113, 21);
		panel_2.add(lblEstante);
		
		JLabel lblTomo = new JLabel("TOMO");
		lblTomo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTomo.setBounds(24, 217, 113, 21);
		panel_2.add(lblTomo);
		
		JLabel lblEstadoDelLibro = new JLabel("ESTADO DEL LIBRO");
		lblEstadoDelLibro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstadoDelLibro.setBounds(24, 249, 165, 21);
		panel_2.add(lblEstadoDelLibro);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidad.setBounds(24, 281, 113, 21);
		panel_2.add(lblCantidad);
		
		Jtxtcodigolib = new JTextField();
		Jtxtcodigolib.setFont(new Font("Tahoma", Font.BOLD, 15));
		Jtxtcodigolib.setBounds(199, 30, 226, 20);
		panel_2.add(Jtxtcodigolib);
		Jtxtcodigolib.setColumns(10);
		
		JtxtLIBRO = new JTextField();
		JtxtLIBRO.setFont(new Font("Tahoma", Font.BOLD, 15));
		JtxtLIBRO.setColumns(10);
		JtxtLIBRO.setBounds(199, 62, 226, 20);
		panel_2.add(JtxtLIBRO);
		
		Jtxtautor = new JTextField();
		Jtxtautor.setFont(new Font("Tahoma", Font.BOLD, 15));
		Jtxtautor.setColumns(10);
		Jtxtautor.setBounds(199, 94, 226, 20);
		panel_2.add(Jtxtautor);
		
		JLabel lblOtros = new JLabel("OTROS");
		lblOtros.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOtros.setBounds(24, 318, 113, 21);
		panel_2.add(lblOtros);
		
		Jtxtcantidad = new JTextField();
		Jtxtcantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		Jtxtcantidad.setColumns(10);
		Jtxtcantidad.setBounds(199, 284, 67, 20);
		panel_2.add(Jtxtcantidad);
		
		Jtxtestante = new JTextField();
		Jtxtestante.setFont(new Font("Tahoma", Font.BOLD, 15));
		Jtxtestante.setColumns(10);
		Jtxtestante.setBounds(199, 155, 226, 20);
		panel_2.add(Jtxtestante);
		
		Jtxttomo = new JTextField();
		Jtxttomo.setFont(new Font("Tahoma", Font.BOLD, 15));
		Jtxttomo.setColumns(10);
		Jtxttomo.setBounds(199, 217, 226, 20);
		panel_2.add(Jtxttomo);
		
		JComboBox cmbbxEstadodelibro = new JComboBox();
		cmbbxEstadodelibro.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbbxEstadodelibro.setModel(new DefaultComboBoxModel(new String[] {"", "EN BUEN ESTADO", "DA\u00D1ADO"}));
		cmbbxEstadodelibro.setBounds(199, 253, 226, 20);
		panel_2.add(cmbbxEstadodelibro);
		
		JComboBox cbxgenero = new JComboBox();
		cbxgenero.setFont(new Font("Tahoma", Font.BOLD, 15));
		cbxgenero.setModel(new DefaultComboBoxModel(new String[] {"", "MATEM\u00C1TICAS", "F\u00CDSICA", "QU\u00CDMICA"}));
		cbxgenero.setBounds(199, 125, 226, 20);
		panel_2.add(cbxgenero);
		
		JComboBox cmbbxOtros = new JComboBox();
		cmbbxOtros.setModel(new DefaultComboBoxModel(new String[] {"", "nada", "talvez"}));
		cmbbxOtros.setFont(new Font("Tahoma", Font.BOLD, 15));
		cmbbxOtros.setBounds(199, 322, 226, 20);
		panel_2.add(cmbbxOtros);
		
		Jtxtfechaprestamo = new JTextField();
		Jtxtfechaprestamo.setBounds(209, 186, 86, 20);
		panel_2.add(Jtxtfechaprestamo);
		Jtxtfechaprestamo.setColumns(10);
		
		JLabel lblFechaDePrstamo = new JLabel("FECHA DE PR\u00C9STAMO");
		lblFechaDePrstamo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFechaDePrstamo.setBounds(24, 186, 165, 21);
		panel_2.add(lblFechaDePrstamo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(27, 571, 1307, 105);
		panel.add(panel_3);
		
		
		JButton btnNewButton = new JButton("AGREGAR");//ESTE BOTON NO ME HACE CASO CSM
		btnNewButton.setIcon(new ImageIcon(Vadmin.class.getResource("/inocos/add-file.png")));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model= (DefaultTableModel) tabla_1.getModel();
				model.addRow(new Object[]{
						
						Jtxtcodigolib.getText(),
						JtxtLIBRO.getText(),
						Jtxtautor.getText(),
						Jtxtcantidad.getText(),
						Jtxtfechaprestamo.getText(),
						Jtxttomo.getText(),
						Jtxtestante.getText(),
						cmbbxEstadodelibro.getSelectedItem(),
						cbxgenero.getSelectedItem(),
						cmbbxOtros.getSelectedItem(),
						});
				
				if(tabla_1.getSelectedRow()==0){
					if(tabla_1.getRowCount()==1){
						JOptionPane.showMessageDialog(null, "guardado confirmado","sistema de bibliotecas",
								JOptionPane.OK_OPTION);
					}	
				}
				JtxtLIBRO.setText("");
				Jtxtautor.setText("");
				Jtxtcantidad.setText("");
				Jtxtfechaprestamo.setText("");
				Jtxttomo.setText("");
				Jtxtestante.setText("");
				cmbbxEstadodelibro.setSelectedItem("");
				cbxgenero.setSelectedItem("");
				cmbbxOtros.setSelectedItem("");
				
				
			};	
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(73, 25, 195, 43);
		panel_3.add(btnNewButton);
		
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setIcon(new ImageIcon(Vadmin.class.getResource("/inocos/recycling-bin.png")));
		btnEliminar.addActionListener(new ActionListener() {
		
		
			
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model= (DefaultTableModel) tabla_1.getModel();
				if(tabla_1.getSelectedRow()==-1){
					if(tabla_1.getSelectedRowCount()==0){
						JOptionPane.showMessageDialog(null, "No se elimino","SISTEMA DE BIBLIOTECAS", JOptionPane.OK_OPTION);
					}else{

						JOptionPane.showMessageDialog(null, "Seleccione la columnar a eliminar", "SISTEMA DE BIBLIOTECAS", JOptionPane.OK_OPTION);
					}
					}else{
						model.removeRow(tabla_1.getSelectedRow());
					}

				}
				
			});
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEliminar.setBounds(890, 25, 180, 43);
		panel_3.add(btnEliminar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setIcon(new ImageIcon(Vadmin.class.getResource("/inocos/box-get-out.png")));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame= new JFrame();
				//PARA CONFIRMAR SI QUIERE SALIR
				if(JOptionPane.showConfirmDialog(frame, "Confirma si quiere salir", "si quieres salir dice caumza",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(DISPOSE_ON_CLOSE);
				}
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalir.setBounds(1117, 25, 157, 43);
		panel_3.add(btnSalir);
		
		btnImprimir = new JButton("GESTIONAR BIBLIOTECARIOS");
		btnImprimir.setIcon(new ImageIcon(Vadmin.class.getResource("/inocos/add-contact.png")));
		btnImprimir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				JFAgregarBibliotecarios jfga = new JFAgregarBibliotecarios();
				jfga.setVisible(true);
				jfga.setLocationRelativeTo(null);
				
				//ESTO ES PARA IMPRIMIR, PERO NO ME SALE PTMR
				/*try
				{
					tabla.print();
				}
				catch(java.awt.print.PrinterException e){
					System.err.format("NO PRINTER FOUND", e.getMessage());
				}*/
				
			}
		});
		
		btnImprimir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnImprimir.setBounds(469, 25, 359, 43);
		panel_3.add(btnImprimir);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(new Color(0, 139, 139));
		panel_4.setBounds(487, 130, 847, 418);
		panel.add(panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 827, 396);
		panel_4.add(scrollPane);
		
		tabla_1 = new JTable();
		tabla_1.setEnabled(false);
		tabla_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"TITULO", "AUTOR", "GENERO", "ESTANTE", "FECHA DE PEDIDO", "TOMO", "ESTADO DEL LIBRO", "CANTIDAD DISPONIBLE", "OTROS"
			}
		));
		tabla_1.setColumnSelectionAllowed(true);
		scrollPane.setViewportView(tabla_1);
		
		JLabel label = new JLabel("SISTEMA DE BIBLIOTECA");
		label.setFont(new Font("Times New Roman", Font.BOLD, 50));
		label.setBounds(101, 24, 913, 74);
		panel.add(label);
		
	}
	protected JButton getBtnImprimir() {
		return btnImprimir;
	}
	
}
