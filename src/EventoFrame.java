import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class EventoFrame extends JFrame{
	
	private final JList <String> eventos;
	
	public EventoFrame() {
		
		super("Eventos");
		setLayout(new FlowLayout());
		
		eventos = new JList<String>();
		eventos.setVisibleRowCount(5);
		
		add(new JScrollPane(eventos));
		
	}
	
}
