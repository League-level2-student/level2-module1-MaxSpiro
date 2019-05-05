package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public void run() {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton addbutton = new JButton();
		addbutton.setText("Add Button");
		addbutton.addActionListener(this);

		JButton viewnames = new JButton();
		viewnames.setText("View Names");
		viewnames.addActionListener(this);

		panel.add(addbutton);
		frame.pack();
		panel.add(viewnames);
		frame.pack();
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a
		// message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == addbutton) {

		}
	}
}