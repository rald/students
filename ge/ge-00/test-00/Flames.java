import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;



public class Flames {

	static JFrame mf = new JFrame("FLAMES");
	static JTextField n1 = new JTextField("Boy");
	static JTextField n2 = new JTextField("Girl");
	static JButton b1 = new JButton("compute");
	static JTextField r1 = new JTextField("Result 1");
	static JTextField r2 = new JTextField("Result 2");
	static JTextField r3 = new JTextField("Final Result");

	static String flames(int cnt) {
		if(cnt==0) return "think of";
		switch((cnt-1)%6) {
			case 0: return "friend";
			case 1: return "love";
			case 2: return "admire";
			case 3: return "marry";
			case 4: return "elope"; 
			case 5: return "sweetheart";
			default: break;
		}
		return "unknown";
	}

	static int pos(StringBuffer s1,Character c1) {
		if(!Character.isLetter(c1) || !Character.isLowerCase(c1)) return -1;
		return s1.indexOf(Character.toString(c1));
	}

	static StringBuffer sar(StringBuffer s1,Character c1) {
		StringBuffer s2=new StringBuffer("");
		for(int i=0;i<s1.length();i++) {
			Character c2=s1.charAt(i);
			if(Character.isLetter(c2) && Character.isLowerCase(c2)) {
				if(c2.equals(c1)) {
					s2.append(Character.toString(c2).toUpperCase());
				} else {
					s2.append(Character.toString(c2));
				}
			} else {
				s2.append(Character.toString(c2));
			}
		}
		return s2;
	}

	static int count(StringBuffer s) {
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			if(Character.isLetter(c) && Character.isUpperCase(c)) cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {

		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);

		n1.setBounds(5, 5,300,30);
		n2.setBounds(5,40,300,30);
		b1.setBounds(5,75,300,30);
		r1.setBounds(5,110,300,30);
		r2.setBounds(5,145,300,30);
		r3.setBounds(5,180,300,30);

		r1.setEnabled(true);
		r2.setEnabled(true);
		r3.setEnabled(true);

		mf.add(n1);
		mf.add(n2);
		mf.add(b1);
		mf.add(r1);
		mf.add(r2);
		mf.add(r3);

		b1.addActionListener(new ActionListener() { 
		  public void actionPerformed(ActionEvent e) {

				StringBuffer n3=new StringBuffer(n1.getText().toLowerCase());
				StringBuffer n4=new StringBuffer(n2.getText().toLowerCase());
				StringBuffer n5=new StringBuffer(n1.getText());
				StringBuffer n6=new StringBuffer(n2.getText());

				int i=0;
				int j=0;

				while(i<n3.length()) {
					Character c1=n3.charAt(i);
					j=pos(n4,c1);
					if(j!=-1) {
						n3=sar(n3,c1);
						n4=sar(n4,c1);
					}
					i++;
				}

				n1.setText(n3.toString());
				n2.setText(n4.toString());

				int ct1=count(new StringBuffer(n1.getText()));
				int ct2=count(new StringBuffer(n2.getText()));

				r1.setText(n5+" "+flames(ct1)+" "+n6);
				r2.setText(n6+" "+flames(ct2)+" "+n5);
				r3.setText("both "+flames(ct1+ct2)+" each other");

		  } 
		});

		mf.setPreferredSize(new Dimension(320, 245));
    mf.pack();
    mf.setLocationRelativeTo(null);
    mf.setVisible(true);
	
	}

}
