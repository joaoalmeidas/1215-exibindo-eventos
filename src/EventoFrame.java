import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class EventoFrame extends JFrame{
	
	private final JList <String> eventos;
	private final DefaultListModel nomesEventos = new DefaultListModel();

	public EventoFrame() {
		
		super("Eventos");
		setLayout(new FlowLayout());
		
		eventos = new JList<String>(nomesEventos);
		
		
		
		add(new JScrollPane(eventos));
		eventos.setVisibleRowCount(5);
		add(eventos);
		
		
		
		addMouseListener(
				new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent arg0) {
						nomesEventos.addElement(arg0);
						
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
						nomesEventos.addElement(arg0);
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						nomesEventos.addElement(arg0);
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						nomesEventos.addElement(arg0);
						
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						nomesEventos.addElement(arg0);
						
					}
					
					
					
				}
		);
		
	}
	
}
