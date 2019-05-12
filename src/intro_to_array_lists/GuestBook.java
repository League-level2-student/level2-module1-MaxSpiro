package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton addguest;
	JButton viewnames;
	ArrayList<String> guests = new ArrayList<String>();
	public void run() {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		addguest = new JButton();
		addguest.setText("Add Guest");
		addguest.addActionListener(this);

		viewnames = new JButton();
		viewnames.setText("View Names");
		viewnames.addActionListener(this);

		
		panel.add(addguest);
		frame.pack();
		panel.add(viewnames);
		frame.pack();
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a
		// message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Benders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Glanders
		// Guest #4: Downy Downers
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == addguest) {
			String g = JOptionPane.showInputDialog("Enter a name");
			guests.add(g);
		}
		if(buttonClicked == viewnames) {
			for(int i=0; i<guests.size();i++) {
				JOptionPane.showMessageDialog(null, "Guest #"+(i+1)+": "+guests.get(i));
			}
		}
	}
}