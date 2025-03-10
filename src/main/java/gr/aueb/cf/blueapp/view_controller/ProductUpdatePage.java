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

public class ProductUpdatePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldProductId;
	private JTextField textFieldProductName;
	private JTextField textFieldWeight;
	private JTextField textFieldPrice;
	private JTextField textFieldTimeToMake;
	private JTextField textFieldCost;
	private JTextField textFieldStock;
	private JTextField textFieldMaterial;
	private JTextField textFieldCategory;


	public ProductUpdatePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1232, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ProductUpdatePage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblUpdateProduct = new JLabel("ΕΠΕΞΕΡΓΑΣΙΑ ΠΡΟΙΟΝΤΟΣ");
		lblUpdateProduct.setForeground(Color.WHITE);
		lblUpdateProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpdateProduct.setBounds(499, 25, 258, 31);
		header.add(lblUpdateProduct);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldProductId = new JTextField();
		textFieldProductId.setColumns(10);
		textFieldProductId.setBounds(350, 130, 220, 42);
		contentPane.add(textFieldProductId);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setColumns(10);
		textFieldProductName.setBounds(350, 214, 220, 42);
		contentPane.add(textFieldProductName);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setColumns(10);
		textFieldWeight.setBounds(350, 388, 220, 42);
		contentPane.add(textFieldWeight);
		
		JLabel lblProductId = new JLabel("Κωδικός Προϊόντος");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductId.setBounds(151, 132, 140, 34);
		contentPane.add(lblProductId);
		
		JLabel lblProductName = new JLabel("Όνομα");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductName.setBounds(234, 212, 57, 34);
		contentPane.add(lblProductName);
		
		JLabel lblMaterial = new JLabel("Υλικό");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterial.setBounds(245, 301, 46, 34);
		contentPane.add(lblMaterial);
		
		JLabel lblWeight = new JLabel("Βάρος (γρ.)");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight.setBounds(202, 386, 89, 34);
		contentPane.add(lblWeight);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductUpdatePage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 492, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 492, 262, 82);
		contentPane.add(btnSave);
		
		JLabel lblCategory = new JLabel("Κατηγορία");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(711, 127, 80, 34);
		contentPane.add(lblCategory);
		
		JLabel lblPrice = new JLabel("Τιμή");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(752, 193, 39, 34);
		contentPane.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(845, 194, 238, 37);
		contentPane.add(textFieldPrice);
		
		JLabel lblCost = new JLabel("Κόστος");
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCost.setBounds(734, 331, 57, 34);
		contentPane.add(lblCost);
		
		textFieldTimeToMake = new JTextField();
		textFieldTimeToMake.setColumns(10);
		textFieldTimeToMake.setBounds(845, 257, 238, 37);
		contentPane.add(textFieldTimeToMake);
		
		JLabel lblTimeToMake = new JLabel("Χρόνος (λεπτά)");
		lblTimeToMake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimeToMake.setBounds(676, 256, 115, 34);
		contentPane.add(lblTimeToMake);
		
		textFieldCost = new JTextField();
		textFieldCost.setColumns(10);
		textFieldCost.setBounds(845, 332, 238, 37);
		contentPane.add(textFieldCost);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(845, 395, 238, 37);
		contentPane.add(textFieldStock);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(722, 398, 69, 34);
		contentPane.add(lblStock);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setColumns(10);
		textFieldMaterial.setBounds(350, 301, 220, 42);
		contentPane.add(textFieldMaterial);
		
		textFieldCategory = new JTextField();
		textFieldCategory.setColumns(10);
		textFieldCategory.setBounds(845, 127, 238, 42);
		contentPane.add(textFieldCategory);
	}
}
