package es.studium.prgp;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class ConsultaCliente extends Frame implements WindowListener, ActionListener{

	private static final long serialVersionUID = 1L;	
	
	Panel panel = new Panel();
	
	ArrayList<String> listaClientesTitulo = new ArrayList<>();
	ArrayList<String> listaClientesBusqueda = new ArrayList<>();
	String nombreTabla="clientes";
	
	public ConsultaCliente(String string) {
		setSize(450,350);
		setTitle("Consulta Cliente");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		listaClientesTitulo.add("IdCliente");
		listaClientesBusqueda.add("idCliente");
		listaClientesTitulo.add("Nombre");
		listaClientesBusqueda.add("nombreCliente");
		listaClientesTitulo.add("Fecha de Nacimiento");
		listaClientesBusqueda.add("fechaNacimientoCliente");
		listaClientesTitulo.add("Puntos");
		listaClientesBusqueda.add("puntosCliente");
		//TablaConsulta clientes 
		TablaConsulta clientes=new TablaConsulta();
		add(panel);
		panel.setLayout(new GridLayout(1,1));
		panel.add(clientes.TablaConsulta(listaClientesTitulo, listaClientesBusqueda,nombreTabla));
		//panel.add(clientes);
		addWindowListener(this);	
		setVisible(true);
	}

	public static void main(String[] args) {
		new ConsultaCliente("Consulta Clientes");

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