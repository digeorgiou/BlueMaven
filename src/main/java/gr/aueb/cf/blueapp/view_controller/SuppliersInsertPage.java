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

public class SuppliersInsertPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSupplierId;
	private JTextField textFieldSupplierName;
	private JTextField textFieldSupplierPhoneNumber;
	private JTextField textFieldSupplierAddress;
	private JTextField textFieldVAT;
	private JTextField textFieldDOY;


	public SuppliersInsertPage() {
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
		lblLogo.setIcon(new ImageIcon(SuppliersInsertPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblSupplierInsert = new JLabel("ΕΙΣΑΓΩΓΗ ΠΡΟΜΗΘΕΥΤΗ");
		lblSupplierInsert.setForeground(Color.WHITE);
		lblSupplierInsert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSupplierInsert.setBounds(519, 25, 217, 31);
		header.add(lblSupplierInsert);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblSupplierId = new JLabel("Κωδικός");
		lblSupplierId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSupplierId.setBounds(195, 137, 63, 34);
		contentPane.add(lblSupplierId);
		
		textFieldSupplierId = new JTextField();
		textFieldSupplierId.setColumns(10);
		textFieldSupplierId.setBounds(299, 130, 247, 53);
		contentPane.add(textFieldSupplierId);
		
		JLabel lblSupplierName = new JLabel("Όνομα");
		lblSupplierName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSupplierName.setBounds(205, 221, 53, 34);
		contentPane.add(lblSupplierName);
		
		textFieldSupplierName = new JTextField();
		textFieldSupplierName.setColumns(10);
		textFieldSupplierName.setBounds(299, 214, 247, 53);
		contentPane.add(textFieldSupplierName);
		
		JLabel lblSupplierPhoneNumber = new JLabel("Τηλέφωνο");
		lblSupplierPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSupplierPhoneNumber.setBounds(180, 310, 78, 34);
		contentPane.add(lblSupplierPhoneNumber);
		
		textFieldSupplierPhoneNumber = new JTextField();
		textFieldSupplierPhoneNumber.setColumns(10);
		textFieldSupplierPhoneNumber.setBounds(299, 303, 247, 53);
		contentPane.add(textFieldSupplierPhoneNumber);
		
		JLabel lblSupplierAddress = new JLabel("Διεύθυνση");
		lblSupplierAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSupplierAddress.setBounds(631, 307, 77, 34);
		contentPane.add(lblSupplierAddress);
		
		textFieldSupplierAddress = new JTextField();
		textFieldSupplierAddress.setColumns(10);
		textFieldSupplierAddress.setBounds(765, 303, 247, 53);
		contentPane.add(textFieldSupplierAddress);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersInsertPage().setVisible(false);
				Main.getSuppliersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 501, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 501, 262, 82);
		contentPane.add(btnSave);
		
		JLabel lblVAT = new JLabel("ΑΦΜ");
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVAT.setBounds(669, 137, 39, 34);
		contentPane.add(lblVAT);
		
		textFieldVAT = new JTextField();
		textFieldVAT.setColumns(10);
		textFieldVAT.setBounds(765, 131, 247, 53);
		contentPane.add(textFieldVAT);
		
		JLabel lblDOY = new JLabel("ΔΟΥ");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(673, 228, 35, 34);
		contentPane.add(lblDOY);
		
		textFieldDOY = new JTextField();
		textFieldDOY.setColumns(10);
		textFieldDOY.setBounds(765, 214, 247, 53);
		contentPane.add(textFieldDOY);
	}

}
