package dia6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

public class MiPrimeraVentana extends JFrame  {
	
	//Definir los controles que va a tener mi ventana
	JButton boton1,boton2,botonNum2,botonNum3,botonBorrar;
	JTextField texto1;
	
	//Constructor para inicializar la ventana
	
	public MiPrimeraVentana() {
		
		//Establecer un título
		this.setTitle("Mi primera Ventana");
		//Establecer el tamaño
		this.setSize(500,350);
		
		//Cerrar la aplicación al pulsar en cerrar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		inicialiacionControles();
		
		//Añadir los controles al panel de contenidos de mi JFrame
		
		//Establecer el layout a flowlayout
		//this.setLayout(new FlowLayout());
		//Quitar todo tipo de Layout
		this.setLayout(null);
		boton1.setBounds(10,10,90,50);
		texto1.setBounds(10,70,120,25);
		boton2.setBounds(10,110,60,60);
		botonNum2.setBounds(75,110,60,60);
		botonNum3.setBounds(140,110,60,60);
		botonBorrar.setBounds(10,205,100,50);
		add(boton1);
		getContentPane().add(texto1);
		getContentPane().add(boton2);
		getContentPane().add(botonNum2);
		getContentPane().add(botonNum3);
		getContentPane().add(botonBorrar);
		
		//Gestionar eventos
		boton1.addActionListener(new EscuchaBtnSaludar());
		boton2.addActionListener(new EscuchaBtnNumerico());
		botonNum2.addActionListener(new EscuchaBtnNumerico());
		botonNum3.addActionListener(new EscuchaBtnNumerico());
		texto1.addMouseListener(new EscuchaMouse());
		
		botonBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto1.setText("");
			}
			
		}
		);
		
		
		texto1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				texto1.setBackground(Color.BLUE);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		//Hacerla visible
		this.setVisible(true);
		
	}

	private void inicialiacionControles() {
		// TODO Auto-generated method stub
		boton1 = new JButton("Saludar");
		boton2 = new JButton("1");
		botonNum2 = new JButton("2");
		botonNum3 = new JButton("3");
		botonBorrar = new JButton("Clean");
		texto1 = new JTextField(15);
	}

		
	
	
	//Los Listener suelen programarse en clases Internas
	
	class EscuchaBtnSaludar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto1.setText("I Love Java");
		}		
	}
	
	class EscuchaBtnNumerico implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Obtener que botón fue pulsado
			
			JButton btnPulsado = (JButton)e.getSource();		
			
			texto1.setText(texto1.getText()+btnPulsado.getText());
		}
		
	}
	
	
	class EscuchaVentana extends WindowAdapter{
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	class EscuchaMouse extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			texto1.setBackground(Color.RED);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			texto1.setBackground(Color.WHITE);
		}
		
	}
			
}
