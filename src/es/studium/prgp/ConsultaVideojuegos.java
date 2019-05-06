package es.studium.prgp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;

public class ConsultaVideojuegos extends Frame implements WindowListener, ActionListener{

	private static final long serialVersionUID = 1L;

	Panel panel = new Panel();
	
	ArrayList<String> listaVideojuegosTitulo = new ArrayList<>();
	ArrayList<String> listaVideojuegosBusqueda = new ArrayList<>();
	String nombreTabla="videojuegos";
	
	public ConsultaVideojuegos() {
		setSize(600,250);
		setTitle("Consulta Videojuegos");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		listaVideojuegosTitulo.add("IdVideojuego");
		listaVideojuegosBusqueda.add("idVideojuego");
		listaVideojuegosTitulo.add("Nombre");
		listaVideojuegosBusqueda.add("nombeVideojuego");
		listaVideojuegosTitulo.add("Genero");
		listaVideojuegosBusqueda.add("generoVideojuego");
		listaVideojuegosTitulo.add("Plataforma");
		listaVideojuegosBusqueda.add("plataformaVideojuego");
		//TablaConsulta clientes 
		TablaConsulta videojuegos=new TablaConsulta();
		add(panel);
		panel.setLayout(new GridLayout(1,1));
		JScrollPane tablaResultante=new JScrollPane(videojuegos.TablaConsulta(listaVideojuegosTitulo, listaVideojuegosBusqueda,nombreTabla));
		tablaResultante.setPreferredSize(new Dimension(550, 200));
		panel.add(tablaResultante);
		//panel.add(clientes);
		addWindowListener(this);	
		setVisible(true);
	}

	public static void main(String[] args) {
		new ConsultaVideojuegos();

	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosing(WindowEvent e) {
		if(isActive()) {
			setVisible(false);
		}
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
