package es.studium.prgp;

import java.awt.BorderLayout;
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

public class ConsultaFactura extends Frame implements WindowListener, ActionListener{
private static final long serialVersionUID = 1L;	
	
	Panel panel = new Panel();
	
	ArrayList<String> listaFacturasTitulo = new ArrayList<>();
	ArrayList<String> listaFacturasBusqueda = new ArrayList<>();
	String nombreTabla="facturas";
	
	public ConsultaFactura() {
		setSize(500,250);
		setTitle("Consulta Facturas");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		listaFacturasTitulo.add("IdFactura");
		listaFacturasBusqueda.add("idFactura");
		listaFacturasTitulo.add("Fecha de Compra");
		listaFacturasBusqueda.add("fechaCompra");
		listaFacturasTitulo.add("IdClienteFK2");
		listaFacturasBusqueda.add("idClienteFK2");
		//TablaConsulta clientes 
		TablaConsulta facturas=new TablaConsulta();
		JScrollPane tablaResultante=new JScrollPane(facturas.TablaConsulta(listaFacturasTitulo, listaFacturasBusqueda,nombreTabla));
		tablaResultante.setPreferredSize(new Dimension(450, 200));
		add(tablaResultante, BorderLayout.CENTER);
		//panel.add(clientes);
		addWindowListener(this);	
		setVisible(true);
	}

	public static void main(String[] args) {
		new ConsultaFactura();

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
