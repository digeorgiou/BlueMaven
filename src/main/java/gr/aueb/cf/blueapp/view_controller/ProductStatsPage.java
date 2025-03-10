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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductStatsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldDateFrom;
	private JTextField textFieldDateTo;


	public ProductStatsPage() {
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
		lblLogo.setIcon(new ImageIcon(ProductStatsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblProductSalesStats = new JLabel("ΣΤΑΤΙΣΤΙΚΑ ΠΩΛΗΣΕΩΝ ΠΡΟΙΟΝΤΟΣ");
		lblProductSalesStats.setForeground(Color.WHITE);
		lblProductSalesStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProductSalesStats.setBounds(470, 25, 316, 31);
		header.add(lblProductSalesStats);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldDateFrom = new JTextField();
		textFieldDateFrom.setColumns(10);
		textFieldDateFrom.setBounds(1008, 174, 182, 37);
		contentPane.add(textFieldDateFrom);
		
		textFieldDateTo = new JTextField();
		textFieldDateTo.setColumns(10);
		textFieldDateTo.setBounds(1008, 276, 182, 37);
		contentPane.add(textFieldDateTo);
		
		JButton btnShowSales = new JButton("Προβολή");
		btnShowSales.setForeground(Color.WHITE);
		btnShowSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowSales.setBackground(new Color(0, 128, 0));
		btnShowSales.setBounds(1008, 426, 194, 96);
		contentPane.add(btnShowSales);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(1008, 144, 100, 20);
		contentPane.add(lblDateFrom);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(1008, 243, 100, 20);
		contentPane.add(lblDateTo);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Προϊόν", "Επώνυμο Πελάτη", "Όνομα Πελάτη", "Ημερομηνία", "Ποσό" 
			}
		));
		table.setBounds(57, 192, 668, 462);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneProductSales = new JScrollPane(table);
		scrollPaneProductSales.setBounds(282, 144, 668, 462);
		contentPane.add(scrollPaneProductSales);
		
		JLabel lblCustomerSales = new JLabel("ΠΩΛΗΣΕΙΣ ΠΡΟΙΟΝΤΟΣ");
		lblCustomerSales.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCustomerSales.setBounds(466, 90, 299, 43);
		contentPane.add(lblCustomerSales);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getProductStatsPage().setVisible(false);
				Main.getProductsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(49, 426, 194, 96);
		contentPane.add(btnReturn);
		
		JButton btnDeleteSale = new JButton("Διαγραφή Πώλησης");
		btnDeleteSale.setForeground(Color.WHITE);
		btnDeleteSale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteSale.setBackground(new Color(182, 7, 64));
		btnDeleteSale.setBounds(49, 191, 194, 96);
		contentPane.add(btnDeleteSale);
	}
}
