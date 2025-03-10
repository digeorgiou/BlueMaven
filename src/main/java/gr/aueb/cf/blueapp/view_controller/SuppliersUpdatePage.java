package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuppliersUpdatePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldProviderId;
	private JTextField textFieldProviderName;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldAddress;
	private JTextField textFieldDOY;
	private JTextField textFieldVAT;

	public SuppliersUpdatePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(SuppliersUpdatePage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblProviderUpdate = new JLabel("ΕΠΕΞΕΡΓΑΣΙΑ ΠΡΟΜΗΘΕΥΤΗ");
		lblProviderUpdate.setForeground(Color.WHITE);
		lblProviderUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProviderUpdate.setBounds(506, 25, 244, 31);
		header.add(lblProviderUpdate);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblProviderId = new JLabel("Κωδικός");
		lblProviderId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProviderId.setBounds(204, 136, 59, 34);
		contentPane.add(lblProviderId);
		
		textFieldProviderId = new JTextField();
		textFieldProviderId.setColumns(10);
		textFieldProviderId.setBounds(319, 129, 247, 53);
		contentPane.add(textFieldProviderId);
		
		JLabel lblProviderName = new JLabel("Όνομα");
		lblProviderName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProviderName.setBounds(211, 220, 52, 34);
		contentPane.add(lblProviderName);
		
		textFieldProviderName = new JTextField();
		textFieldProviderName.setColumns(10);
		textFieldProviderName.setBounds(319, 213, 247, 53);
		contentPane.add(textFieldProviderName);
		
		JLabel lblPhoneNumber = new JLabel("Τηλέφωνο");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(186, 309, 77, 34);
		contentPane.add(lblPhoneNumber);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(319, 302, 247, 53);
		contentPane.add(textFieldPhoneNumber);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersUpdatePage().setVisible(false);
				Main.getSuppliersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 500, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 500, 262, 82);
		contentPane.add(btnSave);
		
		JLabel lblAddress = new JLabel("Διεύθυνση");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(646, 309, 77, 34);
		contentPane.add(lblAddress);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(767, 302, 247, 53);
		contentPane.add(textFieldAddress);
		
		JLabel lblDOY = new JLabel("ΔΟΥ");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(689, 227, 34, 34);
		contentPane.add(lblDOY);
		
		textFieldDOY = new JTextField();
		textFieldDOY.setColumns(10);
		textFieldDOY.setBounds(767, 213, 247, 53);
		contentPane.add(textFieldDOY);
		
		JLabel lblVAT = new JLabel("ΑΦΜ");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVAT.setBounds(689, 136, 34, 34);
		contentPane.add(lblVAT);
		
		textFieldVAT = new JTextField();
		textFieldVAT.setColumns(10);
		textFieldVAT.setBounds(767, 129, 247, 53);
		contentPane.add(textFieldVAT);
	}

}
