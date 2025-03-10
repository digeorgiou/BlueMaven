package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PurchaseMaterialsInsertPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMaterialName;
	private JTextField textFieldMaterialPrice;
	private JTextField textFieldStock;


	public PurchaseMaterialsInsertPage() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				textFieldMaterialName.setText("");
				textFieldStock.setText("");
				textFieldMaterialPrice.setText("");
			}
		});
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
		lblLogo.setIcon(new ImageIcon(PurchaseMaterialsInsertPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblAddNewMaterial = new JLabel("ΠΡΟΣΘΗΚΗ ΝΕΑΣ ΠΡΩΤΗΣ ΥΛΗΣ");
		lblAddNewMaterial.setForeground(Color.WHITE);
		lblAddNewMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddNewMaterial.setBounds(490, 25, 276, 31);
		header.add(lblAddNewMaterial);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblMaterialName = new JLabel("Όνομα");
		lblMaterialName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialName.setBounds(208, 296, 68, 34);
		contentPane.add(lblMaterialName);
		
		textFieldMaterialName = new JTextField();
		textFieldMaterialName.setColumns(10);
		textFieldMaterialName.setBounds(341, 294, 220, 42);
		contentPane.add(textFieldMaterialName);
		
		JLabel lblMaterialPrice = new JLabel("Τιμή (ανα τμχ)");
		lblMaterialPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialPrice.setBounds(666, 201, 119, 34);
		contentPane.add(lblMaterialPrice);
		
		textFieldMaterialPrice = new JTextField();
		textFieldMaterialPrice.setColumns(10);
		textFieldMaterialPrice.setBounds(836, 202, 238, 37);
		contentPane.add(textFieldMaterialPrice);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(702, 296, 89, 34);
		contentPane.add(lblStock);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(836, 297, 238, 37);
		contentPane.add(textFieldStock);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchaseMaterialsInsertPage().setVisible(false);
				Main.getPurchasesMaterialsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 498, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
//		btnSave.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				//Data Binding (Παίρνω τα data απο την φορμα και τα βαζω σε δικες μου μεταβλητες)
//
//
//				String name = textFieldMaterialName.getText().trim();
//				String quantityInStockString = textFieldStock.getText().trim();
//				int quantityInStock = Integer.valueOf(quantityInStockString);
//				String priceString = textFieldMaterialPrice.getText().trim();
//				double price = Double.valueOf(priceString);
//
//
//				//Validate (Έλεγχος )
//
//				//Insert
//
//				String sql = "INSERT INTO materials (name, quantity_in_stock, unit_price) VALUES (? , ?, ?)";
//				Connection conn = LandingPage.getConnection();
//
//				try (PreparedStatement ps = conn.prepareStatement(sql)){
//
//
//					ps.setString(1, name);
//					ps.setInt(2, quantityInStock);
//					ps.setDouble(3, price);
//
//					int n = ps.executeUpdate();
//
//					JOptionPane.showMessageDialog(null, n + "record inserted", "INSERT", JOptionPane.PLAIN_MESSAGE);
//				}catch(SQLException e1) {
//					e1.printStackTrace();
//					JOptionPane.showMessageDialog(null, "Insertion Error", "Error", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 498, 262, 82);
		contentPane.add(btnSave);
	}

}
