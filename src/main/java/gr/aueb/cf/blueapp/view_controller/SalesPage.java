package gr.aueb.cf.blueapp.view_controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import gr.aueb.cf.blueapp.model.Customer;
import gr.aueb.cf.blueapp.Main;

import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable tableSearch;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldProductSearch;
	private JTextField textFieldQuantity;
	private JComboBox<Customer> customerComboBox;
	private List<Customer> customers = new ArrayList<>();

	
	public SalesPage() {
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowActivated(WindowEvent e) {
//				customers = fetchCustomersFromDatabase();
//				customers.forEach(customer -> customerComboBox.addItem(customer));
//				customerComboBox.setSelectedIndex(0);
//			}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Προϊόν","Τιμή" 
			}
		));
		table.setBounds(57, 192, 635, 285);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneShoppingCart = new JScrollPane(table);
		scrollPaneShoppingCart.setBounds(226, 394, 634, 182);
		contentPane.add(scrollPaneShoppingCart);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(SalesPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblSale = new JLabel("ΠΩΛΗΣΗ");
		lblSale.setForeground(Color.WHITE);
		lblSale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSale.setBounds(586, 19, 84, 44);
		header.add(lblSale);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 645, 1232, 99);
		contentPane.add(footer);
		
		JButton btnSaleButton = new JButton("Καταχώρηση Πώλησης");
		btnSaleButton.setBackground(new Color(0, 128, 0));
		btnSaleButton.setForeground(new Color(255, 255, 255));
		btnSaleButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaleButton.setBounds(923, 487, 274, 89);
		contentPane.add(btnSaleButton);
		
		JButton btnRestoreButton = new JButton("Επαναφορά");
		btnRestoreButton.setForeground(Color.WHITE);
		btnRestoreButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRestoreButton.setBackground(new Color(255, 128, 0));
		btnRestoreButton.setBounds(923, 387, 274, 89);
		contentPane.add(btnRestoreButton);
		
		JButton btnReturnButton = new JButton("Επιστροφή");
		btnReturnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSalesPage().setVisible(false);
				Main.getLandingPage().setVisible(true);			
				}
		});
		btnReturnButton.setForeground(Color.WHITE);
		btnReturnButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton.setBackground(new Color(32, 45, 64));
		btnReturnButton.setBounds(15, 486, 179, 89);
		contentPane.add(btnReturnButton);
		
		customerComboBox = new JComboBox<>();
		customerComboBox.setBounds(923, 131, 274, 37);
		contentPane.add(customerComboBox);
		
		JLabel lblCustomer = new JLabel("ΠΕΛΑΤΗΣ");
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomer.setBounds(1026, 93, 88, 27);
		contentPane.add(lblCustomer);
		
		JComboBox comboBoxPaymentMethod = new JComboBox();
		comboBoxPaymentMethod.setBounds(10, 172, 188, 37);
		contentPane.add(comboBoxPaymentMethod);
		
		JLabel lblPaymentMethod = new JLabel("ΤΡΟΠΟΣ ΠΛΗΡΩΜΗΣ");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPaymentMethod.setBounds(23, 138, 164, 27);
		contentPane.add(lblPaymentMethod);
		
		JLabel lblProduct = new JLabel("Προϊόν");
		lblProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduct.setBounds(226, 111, 67, 37);
		contentPane.add(lblProduct);
		
		textFieldProductSearch = new JTextField();
		textFieldProductSearch.setBounds(306, 105, 313, 45);
		contentPane.add(textFieldProductSearch);
		textFieldProductSearch.setColumns(10);
		
		JButton btnSearchProduct = new JButton("Αναζήτηση");
		btnSearchProduct.setForeground(new Color(255, 255, 255));
		btnSearchProduct.setBackground(new Color(32, 54, 64));
		btnSearchProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearchProduct.setBounds(643, 111, 217, 37);
		contentPane.add(btnSearchProduct);
		
		JButton btnAddProductToCart = new JButton("Προσθήκη στο καλάθι");
		btnAddProductToCart.setForeground(Color.WHITE);
		btnAddProductToCart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddProductToCart.setBackground(new Color(32, 54, 64));
		btnAddProductToCart.setBounds(923, 239, 274, 79);
		contentPane.add(btnAddProductToCart);
		
		JLabel lblCart = new JLabel("Καλάθι");
		lblCart.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCart.setBounds(469, 346, 80, 37);
		contentPane.add(lblCart);
		
		tableSearch = new JTable();
		
		tableSearch.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Προϊόν","Τιμή" 
			}
		));
		tableSearch.setBounds(57, 192, 635, 169);
		model = (DefaultTableModel) tableSearch.getModel();
		
		
		JScrollPane scrollPaneProductSearch = new JScrollPane(tableSearch);
		scrollPaneProductSearch.setBounds(226, 166, 635, 169);
		contentPane.add(scrollPaneProductSearch);
		
		JLabel lblQuantity = new JLabel("Ποσότητα");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantity.setBounds(923, 191, 93, 37);
		contentPane.add(lblQuantity);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setColumns(10);
		textFieldQuantity.setBounds(1043, 191, 152, 37);
		contentPane.add(textFieldQuantity);
	}
	
//	private List<Customer> fetchCustomersFromDatabase() {
//		String sql = "SELECT * FROM customers order by lastname asc";
//		List<Customer> customers = new ArrayList();
//
//		Connection connection = LandingPage.getConnection();
//
//		try(PreparedStatement ps = connection.prepareStatement(sql)) {
//			ResultSet rs = ps.executeQuery();
//
//			while(rs.next()) {
//				int id = rs.getInt("id");
//				String firstname = rs.getString("firstname");
//				String lastname = rs.getString("lastname");
//				String phoneNumber = rs.getString("phone_number");
//				String VAT = rs.getString("vat");
//				String DOY = rs.getString("doy");
//				String address = rs.getString("address");
//				String email = rs.getString("email");
//
//				Customer customer = new Customer(id,firstname,lastname,phoneNumber,address,email, DOY, VAT);
//				customers.add(customer);
//			}
//		}catch (SQLException e) {
//			JOptionPane.showMessageDialog(null, "Select Customers Error", "Error", JOptionPane.ERROR_MESSAGE);
//		}
//		return customers;
//	}
}
