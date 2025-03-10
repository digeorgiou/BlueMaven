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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuppliersStatsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldDateFrom;
	private JTextField textFieldDateTo;


	public SuppliersStatsPage() {
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
		lblLogo.setIcon(new ImageIcon(SuppliersStatsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblProviderStats = new JLabel("ΣΤΑΤΙΣΤΙΚΑ ΠΡΟΜΗΘΕΥΤΗ");
		lblProviderStats.setForeground(Color.WHITE);
		lblProviderStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProviderStats.setBounds(510, 25, 235, 31);
		header.add(lblProviderStats);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersStatsPage().setVisible(false);
				Main.getSuppliersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(37, 489, 194, 96);
		contentPane.add(btnReturn);
		
		JLabel lblProviderPurchases = new JLabel("ΑΓΟΡΕΣ ΑΠΟ ΠΡΟΜΗΘΕΥΤΗ");
		lblProviderPurchases.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblProviderPurchases.setBounds(446, 105, 339, 43);
		contentPane.add(lblProviderPurchases);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Προϊόν", "Προμηθευτής", "Ημερομηνία", "Ποσό" 
			}
		));
		table.setBounds(57, 192, 668, 462);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneProviderPurchases = new JScrollPane(table);
		scrollPaneProviderPurchases.setBounds(279, 159, 668, 462);
		contentPane.add(scrollPaneProviderPurchases);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(1010, 159, 100, 20);
		contentPane.add(lblDateFrom);
		
		textFieldDateFrom = new JTextField();
		textFieldDateFrom.setColumns(10);
		textFieldDateFrom.setBounds(1010, 189, 182, 37);
		contentPane.add(textFieldDateFrom);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(1010, 258, 100, 20);
		contentPane.add(lblDateTo);
		
		textFieldDateTo = new JTextField();
		textFieldDateTo.setColumns(10);
		textFieldDateTo.setBounds(1010, 291, 182, 37);
		contentPane.add(textFieldDateTo);
		
		JButton btnShowSales = new JButton("Προβολή");
		btnShowSales.setForeground(Color.WHITE);
		btnShowSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowSales.setBackground(new Color(0, 128, 0));
		btnShowSales.setBounds(1017, 489, 194, 96);
		contentPane.add(btnShowSales);
		
		JButton btnDeleteSale = new JButton("Διαγραφή Αγοράς");
		btnDeleteSale.setForeground(Color.WHITE);
		btnDeleteSale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteSale.setBackground(new Color(182, 7, 64));
		btnDeleteSale.setBounds(37, 171, 194, 96);
		contentPane.add(btnDeleteSale);
	}

}
