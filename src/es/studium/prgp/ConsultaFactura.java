package es.studium.prgp;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class ConsultaFactura extends Frame implements WindowListener, ActionListener{
private static final long serialVersionUID = 1L;	
	
	Panel panel = new Panel();
	
	ArrayList<String> listaFacturasTitulo = new ArrayList<>();
	ArrayList<String> listaFacturasBusqueda = new ArrayList<>();
	String nombreTabla="facturas";
	
	public ConsultaFactura() {
		setSize(450,350);
		setTitle("Consulta Facturas");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		listaFacturasTitulo.add("IdFactura");
		listaFacturasBusqueda.add("idFactura");
		listaFacturasTitulo.add("Fecha de Compra");
		listaFacturasBusqueda.add("fechaCompra");
		listaFacturasTitulo.add("IdClienteFK2");
		listaFacturasBusqueda.add("idClienteFK2");
		//TablaConsulta clientes 
		TablaConsulta facturas=new TablaConsulta();
		add(panel);
		panel.setLayout(new GridLayout(1,1));
		panel.add(facturas.TablaConsulta(listaFacturasTitulo, listaFacturasBusqueda,nombreTabla));
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