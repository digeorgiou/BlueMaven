package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldSearchProducts;

	public ProductsPage() {
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
		lblLogo.setIcon(new ImageIcon(ProductsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblProducts = new JLabel("ΠΡΟΙΟΝΤΑ");
		lblProducts.setForeground(Color.WHITE);
		lblProducts.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProducts.setBounds(577, 25, 101, 31);
		header.add(lblProducts);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Όνομα", "Κατηγορία", "Απόθεμα", "Τιμή" 
			}
		));
		table.setBounds(57, 192, 659, 420);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneProducts = new JScrollPane(table);
		scrollPaneProducts.setBounds(251, 190, 659, 420);
		contentPane.add(scrollPaneProducts);
		
		textFieldSearchProducts = new JTextField();
		textFieldSearchProducts.setColumns(10);
		textFieldSearchProducts.setBounds(251, 112, 335, 51);
		contentPane.add(textFieldSearchProducts);
		
		JButton btnProductSearch = new JButton("Αναζήτηση Προϊόντος");
		btnProductSearch.setForeground(Color.WHITE);
		btnProductSearch.setBackground(new Color(32, 45, 64));
		btnProductSearch.setBounds(621, 113, 289, 49);
		contentPane.add(btnProductSearch);
		
		JButton btnAddProduct = new JButton("Προσθήκη Προϊόντος");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductsPage().setVisible(false);
				Main.getProductInsertPage().setVisible(true);
			}
		});
		btnAddProduct.setForeground(Color.WHITE);
		btnAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddProduct.setBackground(new Color(0, 128, 0));
		btnAddProduct.setBounds(23, 319, 205, 96);
		contentPane.add(btnAddProduct);
		
		JButton btnUpdateProduct = new JButton("Επεξεργασία Προϊόντος");
		btnUpdateProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductsPage().setVisible(false);
				Main.getProductUpdatePage().setVisible(true);
			}
		});
		btnUpdateProduct.setForeground(Color.WHITE);
		btnUpdateProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateProduct.setBackground(new Color(32, 45, 64));
		btnUpdateProduct.setBounds(944, 319, 260, 105);
		contentPane.add(btnUpdateProduct);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getProductsPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(23, 469, 205, 96);
		contentPane.add(btnReturn);
		
		JButton btnShowProductInfo = new JButton("Προβολή Στοιχείων");
		btnShowProductInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductsPage().setVisible(false);
				Main.getProductViewPage().setVisible(true);
			}
		});
		btnShowProductInfo.setForeground(Color.WHITE);
		btnShowProductInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProductInfo.setBackground(new Color(32, 45, 64));
		btnShowProductInfo.setBounds(944, 469, 260, 105);
		contentPane.add(btnShowProductInfo);
		
		JButton btnShowProductHistory = new JButton("Προβολή Ιστορικού");
		btnShowProductHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductsPage().setVisible(false);
				Main.getProductStatsPage().setVisible(true);	
				}
		});
		btnShowProductHistory.setForeground(Color.WHITE);
		btnShowProductHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProductHistory.setBackground(new Color(32, 45, 64));
		btnShowProductHistory.setBounds(944, 178, 260, 105);
		contentPane.add(btnShowProductHistory);
		
		JButton btnDeleteProduct = new JButton("Διαγραφή Προϊόντος");
		btnDeleteProduct.setForeground(Color.WHITE);
		btnDeleteProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteProduct.setBackground(new Color(182, 7, 64));
		btnDeleteProduct.setBounds(23, 178, 205, 96);
		contentPane.add(btnDeleteProduct);
	}
}
