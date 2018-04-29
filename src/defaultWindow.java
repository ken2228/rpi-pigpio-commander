import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class defaultWindow {

	private JFrame frame;
	private JTextField textLogin;
	private JTextField textPass;
	private JTextField textAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					defaultWindow window = new defaultWindow();
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
	public defaultWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 240);
		frame.getContentPane().add(tabbedPane);
		
		JPanel connectTab = new JPanel();
		tabbedPane.addTab("Connection", null, connectTab, null);
		connectTab.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 22, 66, 14);
		connectTab.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 47, 66, 14);
		connectTab.add(lblPassword);
		
		JLabel lblRpiaddress = new JLabel("RPI-address:");
		lblRpiaddress.setBounds(10, 72, 66, 14);
		connectTab.add(lblRpiaddress);
		
		textLogin = new JTextField();
		textLogin.setBounds(101, 19, 86, 20);
		connectTab.add(textLogin);
		textLogin.setColumns(10);
		
		textPass = new JTextField();
		textPass.setBounds(101, 44, 86, 20);
		connectTab.add(textPass);
		textPass.setColumns(10);
		
		textAddress = new JTextField();
		textAddress.setBounds(101, 69, 86, 20);
		connectTab.add(textAddress);
		textAddress.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}
}
