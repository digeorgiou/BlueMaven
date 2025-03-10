package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Connection connection;

	
	public LandingPage() {
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowOpened(WindowEvent e) {
//				String URL = "jdbc:postgresql://localhost:5432/BlueMargaritaDB";
//				String user = "user-7";
//				String password = "12345";
//
//				try {
//					//Class.forName("com.mysql.cj.jdbc.Driver"); θα χρειαζοταν αν δεν ειχαμε βαλει τον driver στο classpath
//					connection = DriverManager.getConnection(URL,user,password);
//					System.out.println("Connection Success");
//				}catch  (SQLException e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
		
		
		setTitle("Blue Margarita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		Color cyanColor = new Color(0, 255, 255);
		Color blueMarg = new Color(32,45,64);
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(LandingPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JPanel sidemenu = new JPanel();
		sidemenu.setBackground(new Color(32, 45, 64));
		sidemenu.setBounds(0, 79, 228, 553);
		contentPane.add(sidemenu);
		sidemenu.setLayout(null);
		
		JLabel lblSale = new JLabel("Πώληση");
		lblSale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getSalesPage().setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSale.setBackground(cyanColor);
				lblSale.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSale.setBackground(blueMarg);
				lblSale.setOpaque(false);
			}
		});
		lblSale.setForeground(new Color(255, 255, 255));
		lblSale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSale.setBounds(10, 25, 193, 58);
		sidemenu.add(lblSale);
		
		JLabel lblStats = new JLabel("Στατιστικά");
		lblStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblStats.setBackground(cyanColor);
				lblStats.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblStats.setBackground(blueMarg);
				lblStats.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getStatisticsPage().setVisible(true);
			}
		});
		lblStats.setForeground(Color.WHITE);
		lblStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStats.setBounds(10, 94, 193, 58);
		sidemenu.add(lblStats);
		
		JLabel lblPurchase = new JLabel("Αγορές");
		lblPurchase.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPurchase.setBackground(cyanColor);
				lblPurchase.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPurchase.setBackground(blueMarg);
				lblPurchase.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getPurchasesPage().setVisible(true);
			}
		});
		lblPurchase.setForeground(Color.WHITE);
		lblPurchase.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPurchase.setBounds(10, 370, 193, 58);
		sidemenu.add(lblPurchase);
		
		JLabel lblProduct = new JLabel("Προϊόντα");
		lblProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblProduct.setBackground(cyanColor);
				lblProduct.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblProduct.setBackground(blueMarg);
				lblProduct.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		lblProduct.setForeground(Color.WHITE);
		lblProduct.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProduct.setBounds(10, 301, 193, 58);
		sidemenu.add(lblProduct);
		
		JLabel lblProvider = new JLabel("Προμηθευτές");
		lblProvider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblProvider.setBackground(cyanColor);
				lblProvider.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblProvider.setBackground(blueMarg);
				lblProvider.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getSuppliersPage().setVisible(true);
			}
		});
		lblProvider.setForeground(Color.WHITE);
		lblProvider.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProvider.setBounds(10, 439, 193, 58);
		sidemenu.add(lblProvider);
		
		JLabel lblInventory = new JLabel("Αποθήκη");
		lblInventory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblInventory.setBackground(cyanColor);
				lblInventory.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInventory.setBackground(blueMarg);
				lblInventory.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getStockPage().setVisible(true);
			}
		});
		lblInventory.setForeground(Color.WHITE);
		lblInventory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInventory.setBounds(10, 232, 193, 58);
		sidemenu.add(lblInventory);
		
		JLabel lblCustomer = new JLabel("Πελάτες");
		lblCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCustomer.setBackground(cyanColor);
				lblCustomer.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCustomer.setBackground(blueMarg);
				lblCustomer.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getLandingPage().setVisible(false);
				Main.getCustomersPage().setVisible(true);
			}
		});
		lblCustomer.setForeground(Color.WHITE);
		lblCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomer.setBounds(10, 163, 193, 58);
		sidemenu.add(lblCustomer);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblPhotoSunset = new JLabel("");
		lblPhotoSunset.setIcon(new ImageIcon(LandingPage.class.getResource("/images/sunset1030.jpg")));
		lblPhotoSunset.setBounds(226, 81, 1030, 551);
		contentPane.add(lblPhotoSunset);
	}
	
//	public static Connection getConnection() {
//		return connection;
//	}
}
