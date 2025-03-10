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

public class PurchaseMaterialsStatsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldDateFrom;
	private JTextField textFieldDateTo;


	public PurchaseMaterialsStatsPage() {
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
		lblLogo.setIcon(new ImageIcon(PurchaseMaterialsStatsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblPurchaseStats = new JLabel("ΣΤΑΤΙΣΤΙΚΑ ΑΓΟΡΩΝ ΠΡΩΤΗΣ ΥΛΗΣ");
		lblPurchaseStats.setForeground(Color.WHITE);
		lblPurchaseStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPurchaseStats.setBounds(475, 19, 305, 44);
		header.add(lblPurchaseStats);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchaseMaterialsStatsPage().setVisible(false);
				Main.getPurchasesMaterialsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(40, 489, 194, 96);
		contentPane.add(btnReturn);
		
		JLabel lblMaterialPurchases = new JLabel("ΑΓΟΡΕΣ ΠΡΩΤΗΣ ΥΛΗΣ");
		lblMaterialPurchases.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMaterialPurchases.setBounds(449, 105, 297, 43);
		contentPane.add(lblMaterialPurchases);
		
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
		
		JScrollPane scrollPaneMaterialPurchases = new JScrollPane(table);
		scrollPaneMaterialPurchases.setBounds(282, 159, 668, 462);
		contentPane.add(scrollPaneMaterialPurchases);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(997, 161, 100, 20);
		contentPane.add(lblDateFrom);
		
		textFieldDateFrom = new JTextField();
		textFieldDateFrom.setColumns(10);
		textFieldDateFrom.setBounds(997, 189, 198, 37);
		contentPane.add(textFieldDateFrom);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(997, 257, 100, 20);
		contentPane.add(lblDateTo);
		
		textFieldDateTo = new JTextField();
		textFieldDateTo.setColumns(10);
		textFieldDateTo.setBounds(997, 291, 198, 37);
		contentPane.add(textFieldDateTo);
		
		JButton btnShowPurchases = new JButton("Προβολή");
		btnShowPurchases.setForeground(Color.WHITE);
		btnShowPurchases.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowPurchases.setBackground(new Color(0, 128, 0));
		btnShowPurchases.setBounds(997, 489, 194, 96);
		contentPane.add(btnShowPurchases);
		
		JButton btnDeletePurchase = new JButton("Διαγραφή Αγοράς");
		btnDeletePurchase.setForeground(Color.WHITE);
		btnDeletePurchase.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeletePurchase.setBackground(new Color(182, 7, 64));
		btnDeletePurchase.setBounds(40, 182, 194, 96);
		contentPane.add(btnDeletePurchase);
	}
}
