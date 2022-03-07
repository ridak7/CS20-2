import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PrimeNum {

	private JFrame frame;
	private JTextField inpT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNum window = new PrimeNum();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeNum() {
		initialize();
	}

	
	
	
	
	public static boolean isPrime( int x)
	{
		int divisor = 1;
		
		do
		{
			divisor = divisor  + 1;

		}while(( x % divisor) != 0);

		if(divisor == x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 499, 304);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		inpT = new JTextField();
		inpT.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		inpT.setBounds(237, 14, 143, 39);
		panel.add(inpT);
		inpT.setColumns(10);
		
		JLabel dis = new JLabel("is Prime:");
		dis.setHorizontalAlignment(SwingConstants.CENTER);
		dis.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		dis.setBounds(61, 175, 376, 54);
		panel.add(dis);
		
		JLabel lblNewLabel = new JLabel("Enter a Number");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(100, 23, 135, 14);
		panel.add(lblNewLabel);
		
		
		
		
		
		
		
		JButton subm = new JButton("Submit");
		subm.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		subm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int userNum = Integer.parseInt(inpT.getText());
				
				
				
				dis.setText(Boolean.toString(isPrime(userNum)));
			}
		});
		subm.setBounds(178, 81, 143, 39);
		panel.add(subm);
		

		
		
	}
}
