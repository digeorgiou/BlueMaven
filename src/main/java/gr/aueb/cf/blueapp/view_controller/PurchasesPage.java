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
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PurchasesPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public PurchasesPage() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PurchasesPage.class.getResource("/images/bluelogo-small.png")));
		lblNewLabel.setBounds(0, 0, 101, 82);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ΑΓΟΡΑ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(586, 19, 84, 44);
		header.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblProvider = new JLabel("ΠΡΟΜΗΘΕΥΤΗΣ");
		lblProvider.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProvider.setBounds(943, 99, 250, 27);
		contentPane.add(lblProvider);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(938, 137, 255, 37);
		contentPane.add(comboBox);
		
		JButton btnRestoreButton = new JButton("Επαναφορά");
		btnRestoreButton.setForeground(Color.WHITE);
		btnRestoreButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRestoreButton.setBackground(new Color(255, 128, 0));
		btnRestoreButton.setBounds(932, 409, 274, 89);
		contentPane.add(btnRestoreButton);
		
		JButton btnSaleButton = new JButton("Καταχώρηση Αγοράς");
		btnSaleButton.setForeground(Color.WHITE);
		btnSaleButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton.setBackground(new Color(0, 128, 0));
		btnSaleButton.setBounds(932, 509, 274, 82);
		contentPane.add(btnSaleButton);
		
		JButton btnReturnButton = new JButton("Επιστροφή");
		btnReturnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturnButton.setForeground(Color.WHITE);
		btnReturnButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton.setBackground(new Color(32, 45, 64));
		btnReturnButton.setBounds(41, 483, 167, 104);
		contentPane.add(btnReturnButton);
		
		JButton btnReturnButton_2 = new JButton("Πρώτες Ύλες");
		btnReturnButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesPage().setVisible(false);
				Main.getPurchasesMaterialsPage().setVisible(true);
			}
		});
		btnReturnButton_2.setForeground(Color.WHITE);
		btnReturnButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton_2.setBackground(new Color(32, 45, 64));
		btnReturnButton_2.setBounds(41, 153, 167, 104);
		contentPane.add(btnReturnButton_2);
		
		JButton btnSaleButton_1 = new JButton("Ιστορικό Αγορών");
		btnSaleButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesPage().setVisible(false);
				Main.getPurchasesStatsPage().setVisible(true);
			}
		});
		btnSaleButton_1.setForeground(Color.WHITE);
		btnSaleButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton_1.setBackground(new Color(0, 128, 0));
		btnSaleButton_1.setBounds(41, 315, 167, 104);
		contentPane.add(btnSaleButton_1);
		
		JLabel lblproduct = new JLabel("Πρώτη Ύλη");
		lblproduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblproduct.setBounds(255, 120, 93, 37);
		contentPane.add(lblproduct);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(356, 120, 292, 45);
		contentPane.add(textField);
		
		JButton btnSearchProduct = new JButton("Αναζήτηση");
		btnSearchProduct.setForeground(Color.WHITE);
		btnSearchProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchProduct.setBackground(new Color(32, 54, 64));
		btnSearchProduct.setBounds(672, 120, 218, 43);
		contentPane.add(btnSearchProduct);
		
		JScrollPane scrollPaneProductSearch = new JScrollPane((Component) null);
		scrollPaneProductSearch.setBounds(255, 181, 635, 169);
		contentPane.add(scrollPaneProductSearch);
		
		JLabel lblCart = new JLabel("Καλάθι");
		lblCart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCart.setBounds(498, 361, 80, 37);
		contentPane.add(lblCart);
		
		JScrollPane scrollPaneShoppingCart = new JScrollPane((Component) null);
		scrollPaneShoppingCart.setBounds(255, 409, 634, 182);
		contentPane.add(scrollPaneShoppingCart);
		
		JButton btnSaleButton_2 = new JButton("Προσθήκη στο Καλάθι");
		btnSaleButton_2.setForeground(Color.WHITE);
		btnSaleButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton_2.setBackground(new Color(0, 128, 0));
		btnSaleButton_2.setBounds(932, 261, 274, 89);
		contentPane.add(btnSaleButton_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1052, 215, 152, 37);
		contentPane.add(textField_1);
		
		JLabel lblproduct_1 = new JLabel("Ποσότητα");
		lblproduct_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblproduct_1.setBounds(932, 215, 93, 37);
		contentPane.add(lblproduct_1);
	}
}
