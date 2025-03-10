package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductViewPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public ProductViewPage() {
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
		
		JLabel lblViewProduct = new JLabel("ΠΡΟΒΟΛΗ ΣΤΟΙΧΕΙΩΝ ΠΡΟΙΟΝΤΟΣ");
		lblViewProduct.setForeground(Color.WHITE);
		lblViewProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblViewProduct.setBounds(468, 25, 320, 31);
		header.add(lblViewProduct);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ProductViewPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblProductId = new JLabel("Κωδικός Προϊόντος");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductId.setBounds(150, 148, 138, 34);
		contentPane.add(lblProductId);
		
		JLabel lblProductName = new JLabel("Όνομα");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductName.setBounds(231, 226, 57, 34);
		contentPane.add(lblProductName);
		
		JLabel lblMaterial = new JLabel("Υλικό");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterial.setBounds(244, 298, 44, 34);
		contentPane.add(lblMaterial);
		
		JLabel lblWeight = new JLabel("Βάρος (γρ.)");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight.setBounds(205, 375, 83, 34);
		contentPane.add(lblWeight);
		
		JLabel lblCategory = new JLabel("Κατηγορία");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(650, 148, 83, 34);
		contentPane.add(lblCategory);
		
		JLabel lblPrice = new JLabel("Τιμή");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(696, 212, 37, 34);
		contentPane.add(lblPrice);
		
		JLabel lblSpecificProductId = new JLabel("Κωδικός Προϊόντος");
		lblSpecificProductId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificProductId.setBounds(373, 155, 194, 22);
		contentPane.add(lblSpecificProductId);
		
		JLabel lblSpecificProductName = new JLabel("Όνομα");
		lblSpecificProductName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificProductName.setBounds(373, 233, 194, 22);
		contentPane.add(lblSpecificProductName);
		
		JLabel lblSpecificMaterial = new JLabel("Υλικό");
		lblSpecificMaterial.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificMaterial.setBounds(373, 305, 83, 22);
		contentPane.add(lblSpecificMaterial);
		
		JLabel lblSpecificWeight = new JLabel("Βάρος (γρ.)");
		lblSpecificWeight.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificWeight.setBounds(373, 382, 194, 22);
		contentPane.add(lblSpecificWeight);
		
		JLabel lblSpecificCategory = new JLabel("Κατηγορία");
		lblSpecificCategory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificCategory.setBounds(808, 155, 194, 22);
		contentPane.add(lblSpecificCategory);
		
		JLabel lblSpecificPrice = new JLabel("Τιμή");
		lblSpecificPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificPrice.setBounds(808, 219, 194, 22);
		contentPane.add(lblSpecificPrice);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductViewPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(455, 493, 262, 82);
		contentPane.add(btnReturn);
		
		JLabel lblTimeToMake = new JLabel("Χρόνος (λεπτά)");
		lblTimeToMake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimeToMake.setBounds(624, 267, 109, 34);
		contentPane.add(lblTimeToMake);
		
		JLabel lblCost = new JLabel("Κόστος");
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCost.setBounds(676, 323, 57, 34);
		contentPane.add(lblCost);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(663, 375, 70, 34);
		contentPane.add(lblStock);
		
		JLabel lblSpecificTimeToMake = new JLabel("Χρόνος (λεπτά)");
		lblSpecificTimeToMake.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificTimeToMake.setBounds(808, 274, 194, 22);
		contentPane.add(lblSpecificTimeToMake);
		
		JLabel lblSpecificCost = new JLabel("Κόστος");
		lblSpecificCost.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificCost.setBounds(808, 330, 194, 22);
		contentPane.add(lblSpecificCost);
		
		JLabel lblSpecificStock = new JLabel("Απόθεμα");
		lblSpecificStock.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSpecificStock.setBounds(808, 382, 194, 22);
		contentPane.add(lblSpecificStock);
	}

}
