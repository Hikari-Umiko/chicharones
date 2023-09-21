package chicharronera;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class chicharrones {

	private JFrame frmLaChicharronera;
	private JTextField txtA;
	private JTextField txtC;
	private JTextField txtB;
	private JButton btnCalcular;
	private JButton btnBorrar;
	private JLabel lblSol1;
	private JLabel lblSol2;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chicharrones window = new chicharrones();
					window.frmLaChicharronera.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chicharrones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaChicharronera = new JFrame();
		frmLaChicharronera.setTitle("La chicharronera");
		frmLaChicharronera.setBounds(100, 100, 611, 388);
		frmLaChicharronera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaChicharronera.getContentPane().setLayout(null);
		
		lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblA.setBounds(35, 26, 24, 25);
		frmLaChicharronera.getContentPane().add(lblA);
		
		lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblB.setBounds(35, 62, 24, 25);
		frmLaChicharronera.getContentPane().add(lblB);
		
		lblC = new JLabel("C");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblC.setBounds(35, 98, 24, 25);
		frmLaChicharronera.getContentPane().add(lblC);
		
		txtA = new JTextField();
		txtA.setBounds(66, 30, 86, 20);
		frmLaChicharronera.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(66, 66, 86, 20);
		frmLaChicharronera.getContentPane().add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(66, 102, 86, 20);
		frmLaChicharronera.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		JLabel lblimagen = new JLabel("");
		lblimagen.setIcon(new ImageIcon("C:\\Users\\Alumno\\Pictures\\gormula xd.jpg"));
		lblimagen.setBounds(226, 62, 322, 193);
		frmLaChicharronera.getContentPane().add(lblimagen);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Double.parseDouble(txtA.getText());
				double b =Double.parseDouble(txtB.getText());
				double c =Double.parseDouble(txtC.getText());
				double factor=(b*b)-(4*a*c);
				
				if(factor==0) {
					double Sol1;
				Sol1=((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
					lblSol1.setText(" "+Sol1);
				}else if(factor>0){
					double Sol1,Sol2;
					Sol1=((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
					Sol2=((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
						lblSol1.setText(" "+Sol1);
						lblSol2.setText(" "+Sol2);
				}else if(factor<0) {
					lblSol1.setText("No hay solucion uwu ");
				}
			}
		});
		btnCalcular.setBounds(10, 151, 89, 23);
		frmLaChicharronera.getContentPane().add(btnCalcular);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				lblSol1.setText("");
				lblSol2.setText("");
				lblSol2.setBackground(null);
				lblSol1.setBackground(null);
			}
		});
		btnBorrar.setBounds(113, 151, 89, 23);
		frmLaChicharronera.getContentPane().add(btnBorrar);
		
		lblSol1 = new JLabel("Sol1");
		lblSol1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblSol1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSol1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSol1.setBounds(26, 225, 176, 30);
		frmLaChicharronera.getContentPane().add(lblSol1);
		
		lblSol2 = new JLabel("Sol2");
		lblSol2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblSol2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSol2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSol2.setBounds(26, 269, 176, 30);
		frmLaChicharronera.getContentPane().add(lblSol2);
	}
	
		}

