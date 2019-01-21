import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class EventoFrame extends JFrame{
	
	private final JList <String> eventos;
	private final DefaultListModel nomesEventos = new DefaultListModel();
	private final JLabel tituloEvento;
	private final JButton botao;

	public EventoFrame() {
		
		super("Eventos");
		setLayout(new FlowLayout());
		
		tituloEvento = new JLabel("Eventos");
		add(tituloEvento);
		
		botao = new JButton("ok");
		add(botao);
		
		eventos = new JList<String>(nomesEventos);
		add(eventos);
		eventos.setVisibleRowCount(30);
		eventos.setFixedCellWidth(1200);
		eventos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		add(new JScrollPane(eventos));
		
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
		
		botao.addActionListener(
				
					new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							nomesEventos.addElement(arg0.toString());
							
						}
						
						
						
					}
				
				);
		
	}
	
}
