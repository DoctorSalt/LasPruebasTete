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

public class ConsultaTrabajadores extends Frame implements WindowListener, ActionListener{
	private static final long serialVersionUID = 1L;

	Panel panel = new Panel();
	
	ArrayList<String> listaTrabajadoresTitulo = new ArrayList<>();
	ArrayList<String> listaTrabajadoresBusqueda = new ArrayList<>();
	String nombreTabla="trabajadores";
	
	public ConsultaTrabajadores() {
		setSize(450,350);
		setTitle("Consulta Trabajadores");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		listaTrabajadoresTitulo.add("IdTrabajador");
		listaTrabajadoresBusqueda.add("idTrabajador");
		listaTrabajadoresTitulo.add("Nombre");
		listaTrabajadoresBusqueda.add("nombreTrabajador");
		listaTrabajadoresTitulo.add("Apellidos");
		listaTrabajadoresBusqueda.add("apellidosTrabajador");
		listaTrabajadoresTitulo.add("Nomina");
		listaTrabajadoresBusqueda.add("nominaTrabajador");
		listaTrabajadoresTitulo.add("Tipo de Contrato");
		listaTrabajadoresBusqueda.add("tipoContratoTrabajador");
		listaTrabajadoresTitulo.add("Horas Semanales");
		listaTrabajadoresBusqueda.add("horasTrabajador");
		listaTrabajadoresTitulo.add("IdTiendaFK1");
		listaTrabajadoresBusqueda.add("idTiendaFK1");
		listaTrabajadoresTitulo.add("JefeDeFK1");
		listaTrabajadoresBusqueda.add("jefeDeFK1");
		
		//TablaConsulta clientes 
		TablaConsulta trabajadores=new TablaConsulta();
		add(panel);
		panel.setLayout(new GridLayout(1,1));
		panel.add(trabajadores.TablaConsulta(listaTrabajadoresTitulo, listaTrabajadoresBusqueda,nombreTabla));
		//panel.add(clientes);
		addWindowListener(this);	
		setVisible(true);
	}

	public static void main(String[] args) {
		new ConsultaTrabajadores();

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
