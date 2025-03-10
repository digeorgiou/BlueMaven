package gr.aueb.cf.blueapp.view_controller;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gr.aueb.cf.blueapp.model.Material;
import gr.aueb.cf.blueapp.model.Product;
import gr.aueb.cf.blueapp.model.ProductMaterial;
import gr.aueb.cf.blueapp.Main;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ProductInsertPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldProductId;
	private JTextField textFieldProductName;
	private JTextField textFieldWeight;
	private JTextField textFieldPrice;
	private JTextField textFieldTimeToMake;
	private JTextField textFieldStock;
	private JTextField textFieldCategory;
	private JTextArea textAreaDescription;
    private JList<String> materialList; // To display materials
    private DefaultListModel<String> materialListModel; // Model for the JList
    private List<Material> materials; // Temporary storage for materials from the database

	public ProductInsertPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		// Initialize the list of materials
//        materials = fetchMaterialsFromDatabase(); // Fetch materials from the database
//        materialListModel = new DefaultListModel<>();
//        for (Material material : materials) {
//            materialListModel.addElement(material.getName()); // Add material names to the list model
//        }
//        materialList = new JList<>(materialListModel);
//        materialList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Allow multiple selections
//		
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(ProductInsertPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblAddNewProduct = new JLabel("ΠΡΟΣΘΗΚΗ ΝΕΟΥ ΠΡΟΙΟΝΤΟΣ");
		lblAddNewProduct.setForeground(Color.WHITE);
		lblAddNewProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddNewProduct.setBounds(499, 25, 258, 31);
		header.add(lblAddNewProduct);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldProductId = new JTextField();
		textFieldProductId.setColumns(10);
		textFieldProductId.setBounds(368, 131, 238, 37);
		contentPane.add(textFieldProductId);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setColumns(10);
		textFieldProductName.setBounds(368, 199, 238, 37);
		contentPane.add(textFieldProductName);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setColumns(10);
		textFieldWeight.setBounds(368, 262, 238, 37);
		contentPane.add(textFieldWeight);
		
		JLabel lblProductId = new JLabel("Κωδικός Προϊόντος");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductId.setBounds(165, 133, 149, 34);
		contentPane.add(lblProductId);
		
		JLabel lblProductName = new JLabel("Όνομα");
		lblProductName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProductName.setBounds(236, 198, 56, 34);
		contentPane.add(lblProductName);
		
		JLabel lblMaterial = new JLabel("Υλικό");
		lblMaterial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterial.setBounds(268, 375, 46, 34);
		contentPane.add(lblMaterial);
		
		JLabel lblWeight = new JLabel("Βάρος (γρ.)");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight.setBounds(221, 261, 93, 34);
		contentPane.add(lblWeight);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductInsertPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 497, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 497, 262, 82);
		contentPane.add(btnSave);
		
		JLabel lblCategory = new JLabel("Κατηγορία");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCategory.setBounds(700, 132, 78, 34);
		contentPane.add(lblCategory);
		
		JLabel lblPrice = new JLabel("Τιμή");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(747, 198, 31, 34);
		contentPane.add(lblPrice);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(834, 199, 238, 37);
		contentPane.add(textFieldPrice);
		
		textFieldTimeToMake = new JTextField();
		textFieldTimeToMake.setColumns(10);
		textFieldTimeToMake.setBounds(834, 262, 238, 37);
		contentPane.add(textFieldTimeToMake);
		
		JLabel lblTimeToMake = new JLabel("Χρόνος (λεπτά)");
		lblTimeToMake.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTimeToMake.setBounds(669, 261, 109, 34);
		contentPane.add(lblTimeToMake);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(834, 356, 238, 37);
		contentPane.add(textFieldStock);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(712, 355, 66, 34);
		contentPane.add(lblStock);
		
		textFieldCategory = new JTextField();
		textFieldCategory.setColumns(10);
		textFieldCategory.setBounds(834, 125, 238, 37);
		contentPane.add(textFieldCategory);
		
		JList list = new JList();
		list.setBounds(151, 317, 1, 1);
		contentPane.add(list);
		
		JLabel lblDescription = new JLabel("Περιγραφή");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDescription.setBounds(69, 322, 96, 34);
		contentPane.add(lblDescription);
		
		JTextArea textAreaDescription = new JTextArea();
		textAreaDescription.setLineWrap(true);
		textAreaDescription.setBounds(27, 367, 171, 117);
		contentPane.add(textAreaDescription);
		
		JScrollPane materialScrollPane = new JScrollPane(materialList);
		materialScrollPane.setBounds(371, 353, 235, 82);
		contentPane.add(materialScrollPane);
	}
	
//		private List<Material> fetchMaterialsFromDatabase() {
//			List<Material> materials = new ArrayList<>();
//			String sql = "SELECT * FROM materials order by name asc";
//			Connection conn2 = LandingPage.getConnection();
//			
//			try(PreparedStatement ps = conn2.prepareStatement(sql)){
//				ResultSet rs = ps.executeQuery();
//				while (rs.next()) {
//					int id = rs.getInt("id");
//					String name = rs.getString("name");
//					int quantity = rs.getInt("quantity_in_stock");
//					double price = rs.getDouble("unit_price");
//					
//					Material material = new Material(id,name,quantity,price);
//					materials.add(material);
//				}
//				}catch(SQLException e) {
//					e.printStackTrace();
//					JOptionPane.showMessageDialog(this, "Error Fetching materials", "Error", JOptionPane.ERROR_MESSAGE);
//			}
//			return materials;
//			
//		}
//		
//		// Method to save the product
//	    private void saveProduct() {
//	        // Retrieve product details from the text fields
//	        int productId = Integer.parseInt(textFieldProductId.getText());
//	        String productName = textFieldProductName.getText();
//	        String description = textAreaDescription.getText();
//	        double weight = Double.parseDouble(textFieldWeight.getText());
//	        double price = Double.parseDouble(textFieldPrice.getText());
//	        double timeToMake = Double.parseDouble(textFieldTimeToMake.getText());
//	        int stock = Integer.parseInt(textFieldStock.getText());
//	        String category = textFieldCategory.getText();
//
//	        // Retrieve selected materials
//	        List<Material> selectedMaterials = new ArrayList<>();
//	        for (int index : materialList.getSelectedIndices()) {
//	            selectedMaterials.add(materials.get(index));
//	        }
//
//	        // Create the Product object
//	        Product product = new Product(productId, productName, weight, description, category, price, stock, timeToMake);
//	        
//	    
//	        // Add the selected materials to the product
//	        	        for (Material material : selectedMaterials) {
//	        	        	ProductMaterial pm = new ProductMaterial(product,1.0, material);
//	        	        	List<ProductMaterial> newList = product.getProductMaterials();
//	        	        	newList.add(pm);
//	        	        	product.setProductMaterials(newList);
//	        //	            product.addMaterial(new ProductMaterial(material.getId(), product.getId(), 1.0)); // Example: quantity = 1.0
//	        	        }
//
//	        // Save the product to the database (you need to implement this)
//	        // Database.saveProduct(product);
//
//	        JOptionPane.showMessageDialog(this, "Το προϊόν αποθηκεύτηκε με επιτυχία!", "Επιτυχία", JOptionPane.INFORMATION_MESSAGE);
//	    }
}
