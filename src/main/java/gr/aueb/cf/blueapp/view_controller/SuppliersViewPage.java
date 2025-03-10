package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuppliersViewPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public SuppliersViewPage() {
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
		lblLogo.setIcon(new ImageIcon(SuppliersViewPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblViewProvider = new JLabel("ΠΡΟΒΟΛΗ ΣΤΟΙΧΕΙΩΝ ΠΡΟΜΗΘΕΥΤΗ");
		lblViewProvider.setForeground(Color.WHITE);
		lblViewProvider.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblViewProvider.setBounds(470, 19, 315, 44);
		header.add(lblViewProvider);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblProviderId = new JLabel("Κωδικός");
		lblProviderId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProviderId.setBounds(221, 133, 69, 34);
		contentPane.add(lblProviderId);
		
		JLabel lblProviderName = new JLabel("Όνομα");
		lblProviderName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProviderName.setBounds(231, 224, 59, 34);
		contentPane.add(lblProviderName);
		
		JLabel lblPhoneNumber = new JLabel("Τηλέφωνο");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(207, 312, 83, 34);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Διεύθυνση");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(676, 312, 83, 34);
		contentPane.add(lblAddress);
		
		JLabel lblDOY = new JLabel("ΔΟΥ");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(719, 230, 40, 34);
		contentPane.add(lblDOY);
		
		JLabel lblVAT = new JLabel("ΑΦΜ");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVAT.setBounds(719, 139, 40, 34);
		contentPane.add(lblVAT);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersViewPage().setVisible(false);
				Main.getSuppliersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(485, 497, 262, 82);
		contentPane.add(btnReturn);
		
		JLabel lblSpecificProviderId = new JLabel("Κωδικός");
		lblSpecificProviderId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificProviderId.setBounds(377, 139, 166, 22);
		contentPane.add(lblSpecificProviderId);
		
		JLabel lblSpecificProviderName = new JLabel("Όνομα");
		lblSpecificProviderName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificProviderName.setBounds(377, 229, 166, 22);
		contentPane.add(lblSpecificProviderName);
		
		JLabel lblSpecificPhoneNumber = new JLabel("Τηλέφωνο");
		lblSpecificPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificPhoneNumber.setBounds(377, 318, 166, 22);
		contentPane.add(lblSpecificPhoneNumber);
		
		JLabel lblSpecificVAT = new JLabel("ΑΦΜ");
		lblSpecificVAT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificVAT.setBounds(860, 145, 166, 22);
		contentPane.add(lblSpecificVAT);
		
		JLabel lblSpecificDOY = new JLabel("ΔΟΥ");
		lblSpecificDOY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificDOY.setBounds(860, 236, 166, 22);
		contentPane.add(lblSpecificDOY);
		
		JLabel lblSpecificAddress = new JLabel("Διεύθυνση");
		lblSpecificAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificAddress.setBounds(860, 318, 166, 22);
		contentPane.add(lblSpecificAddress);
	}

}
