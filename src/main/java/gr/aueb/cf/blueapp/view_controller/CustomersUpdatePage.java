package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomersUpdatePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldFirstname;
	private JTextField textLastname;
	private JTextField textFieldPhoneNumber;
	private JTextField textAddress;
	private JTextField textFieldVat;
	private JTextField textFieldDOY;

	
	public CustomersUpdatePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		Color grayColor = new Color(220, 220, 220);
		Color blackColor = new Color(0, 0, 0);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CustomersUpdatePage.class.getResource("/images/bluelogo-small.png")));
		lblNewLabel.setBounds(0, 0, 101, 82);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ΕΠΕΞΕΡΓΑΣΙΑ ΣΤΟΙΧΕΙΩΝ ΠΕΛΑΤΗ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(481, 25, 293, 31);
		header.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldFirstname = new JTextField();
		textFieldFirstname.setColumns(10);
		textFieldFirstname.setBounds(307, 137, 247, 53);
		contentPane.add(textFieldFirstname);
		
		textLastname = new JTextField();
		textLastname.setColumns(10);
		textLastname.setBounds(307, 221, 247, 53);
		contentPane.add(textLastname);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(307, 310, 247, 53);
		contentPane.add(textFieldPhoneNumber);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(307, 395, 247, 53);
		contentPane.add(textAddress);
		
		textFieldVat = new JTextField();
		textFieldVat.setColumns(10);
		textFieldVat.setBounds(760, 221, 207, 53);
		textFieldVat.setEnabled(false);
		contentPane.add(textFieldVat);
		
		textFieldDOY = new JTextField();
		textFieldDOY.setColumns(10);
		textFieldDOY.setBounds(760, 310, 207, 53);
		textFieldDOY.setEnabled(false);
		contentPane.add(textFieldDOY);
		
		JLabel lblFirstname = new JLabel("Όνομα");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstname.setBounds(199, 144, 83, 34);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Επώνυμο");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastname.setBounds(199, 228, 83, 34);
		contentPane.add(lblLastname);
		
		JLabel lblPhoneNumber = new JLabel("Τηλέφωνο");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(199, 317, 83, 34);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Διεύθυνση");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(199, 402, 83, 34);
		contentPane.add(lblAddress);
		
		JLabel lblVat = new JLabel("ΑΦΜ");
		lblVat.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVat.setBounds(667, 228, 83, 34);
		lblVat.setForeground(grayColor);
		contentPane.add(lblVat);
		
		JLabel lblDOY = new JLabel("ΔΟΥ");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(667, 317, 83, 34);
		lblDOY.setForeground(grayColor);
		contentPane.add(lblDOY);
		
		JCheckBox chckbxWholeSaleCustomer = new JCheckBox("Πελάτης Χονδρικής");
		chckbxWholeSaleCustomer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					textFieldVat.setEnabled(true);
					textFieldDOY.setEnabled(true);
					lblVat.setForeground(blackColor);
					lblDOY.setForeground(blackColor);
					
				} else {
					textFieldVat.setEnabled(false);
					textFieldDOY.setEnabled(false);
					lblVat.setForeground(grayColor);
					lblDOY.setForeground(grayColor);
				}
			}
		});
		chckbxWholeSaleCustomer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxWholeSaleCustomer.setBounds(763, 150, 220, 23);
		contentPane.add(chckbxWholeSaleCustomer);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersUpdatePage().setVisible(false);
				Main.getCustomersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 508, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSaveCustomer = new JButton("Αποθήκευση");
		btnSaveCustomer.setForeground(Color.WHITE);
		btnSaveCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaveCustomer.setBackground(new Color(0, 128, 64));
		btnSaveCustomer.setBounds(734, 508, 262, 82);
		contentPane.add(btnSaveCustomer);
	}
}
