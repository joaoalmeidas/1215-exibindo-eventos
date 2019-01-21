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
		eventos.setVisibleRowCount(5);
		
		
		add(new JScrollPane(eventos));
		
		add(eventos);
		
		
		
		addMouseListener(
				new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent arg0) {
						nomesEventos.addElement(getClass().getMethods());
						
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					
					
				}
		);
		
	}
	
}
