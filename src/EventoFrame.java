import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;

public class EventoFrame extends JFrame{
	
	private final JList <String> eventos;
	
	public EventoFrame() {
		
		super("Eventos");
		setLayout(new FlowLayout());
		
	}
	
}
