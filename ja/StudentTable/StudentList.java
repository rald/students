import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;


class Student {
	String studentNumber="0000",studentName="noname";
	Student(String newName,String newStudentNumber) {
		studentNumber=newStudentNumber;
		studentName=newName;
	}
}

public class StudentList {

	public static void main(String args[]) {

		Object[][] student = {
			{"0000","gc"},
			{"0001","al"},
			{"0002","ja"},
			{"0003","js"},
		};

		String[] column = {
			"Student Number","Student Name"
		};

		JFrame frame = new JFrame("Student List");

		frame.setLayout(new BorderLayout());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTable table = new JTable(new DefaultTableModel(student,column));

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFillsViewportHeight(true);

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		JPanel panel = new JPanel();

		JButton button1=new JButton("ADD");
		JButton button2=new JButton("REMOVE");

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String snum=JOptionPane.showInputDialog("Student number?");
				String snam=JOptionPane.showInputDialog("Student name?");
				model.addRow(new Object[]{snum,snam});
			}
		});

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				model.removeRow(table.getSelectedRow());
			}
		});

		panel.add(button1);
		panel.add(button2);

		JScrollPane scrollPane1 = new JScrollPane(table);

		frame.add(scrollPane1,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.SOUTH);

		frame.setSize(new Dimension(320,240));
		frame.setVisible(true);
	}
}

