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

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PurchasesStatsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldDateFrom;
	private JTextField textFieldDateTo;

	
	public PurchasesStatsPage() {
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
		lblLogo.setIcon(new ImageIcon(PurchasesStatsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblPurchaseStats = new JLabel("ΙΣΤΟΡΙΚΟ ΑΓΟΡΩΝ");
		lblPurchaseStats.setForeground(Color.WHITE);
		lblPurchaseStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPurchaseStats.setBounds(547, 19, 162, 44);
		header.add(lblPurchaseStats);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblPurchases = new JLabel("ΑΓΟΡΕΣ");
		lblPurchases.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPurchases.setBounds(549, 93, 109, 51);
		contentPane.add(lblPurchases);
		
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
		
		JScrollPane scrollPanePurchases = new JScrollPane(table);
		scrollPanePurchases.setBounds(281, 148, 668, 462);
		contentPane.add(scrollPanePurchases);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesStatsPage().setVisible(false);
				Main.getPurchasesPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(39, 478, 194, 96);
		contentPane.add(btnReturn);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(996, 147, 100, 20);
		contentPane.add(lblDateFrom);
		
		textFieldDateFrom = new JTextField();
		textFieldDateFrom.setColumns(10);
		textFieldDateFrom.setBounds(996, 178, 198, 37);
		contentPane.add(textFieldDateFrom);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(996, 249, 100, 20);
		contentPane.add(lblDateTo);
		
		textFieldDateTo = new JTextField();
		textFieldDateTo.setColumns(10);
		textFieldDateTo.setBounds(996, 280, 198, 37);
		contentPane.add(textFieldDateTo);
		
		JButton btnSearchSales = new JButton("Αναζήτηση");
		btnSearchSales.setForeground(Color.WHITE);
		btnSearchSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSearchSales.setBackground(new Color(0, 128, 0));
		btnSearchSales.setBounds(996, 403, 194, 96);
		contentPane.add(btnSearchSales);
		
		JButton btnDeletePurchase = new JButton("Διαγραφή Αγοράς");
		btnDeletePurchase.setForeground(Color.WHITE);
		btnDeletePurchase.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeletePurchase.setBackground(new Color(182, 7, 64));
		btnDeletePurchase.setBounds(34, 178, 194, 96);
		contentPane.add(btnDeletePurchase);
	}

}
