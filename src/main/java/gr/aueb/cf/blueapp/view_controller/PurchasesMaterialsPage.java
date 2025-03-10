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

public class PurchasesMaterialsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldSearchMaterials;


	public PurchasesMaterialsPage() {
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
		lblLogo.setIcon(new ImageIcon(PurchasesMaterialsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblMaterials = new JLabel("ΠΡΩΤΕΣ ΥΛΕΣ");
		lblMaterials.setForeground(Color.WHITE);
		lblMaterials.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMaterials.setBounds(566, 19, 123, 44);
		header.add(lblMaterials);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnAddMaterial = new JButton("Προσθήκη Πρώτης Ύλης");
		btnAddMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesMaterialsPage().setVisible(false);
				Main.getPurchaseMaterialsInsertPage().setVisible(true);
			}
		});
		btnAddMaterial.setForeground(Color.WHITE);
		btnAddMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddMaterial.setBackground(new Color(0, 128, 0));
		btnAddMaterial.setBounds(10, 318, 225, 105);
		contentPane.add(btnAddMaterial);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesMaterialsPage().setVisible(false);
				Main.getPurchasesPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(10, 468, 225, 94);
		contentPane.add(btnReturn);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Υλικό", "Τιμή(τμχ)", "Απόθεμα"
			}
		));
		table.setBounds(57, 192, 659, 420);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneMaterials = new JScrollPane(table);
		scrollPaneMaterials.setBounds(254, 189, 659, 420);
		contentPane.add(scrollPaneMaterials);
		
		textFieldSearchMaterials = new JTextField();
		textFieldSearchMaterials.setColumns(10);
		textFieldSearchMaterials.setBounds(254, 111, 335, 51);
		contentPane.add(textFieldSearchMaterials);
		
		JButton btnMaterialSearch = new JButton("Αναζήτηση Προϊόντος");
		btnMaterialSearch.setForeground(Color.WHITE);
		btnMaterialSearch.setBackground(new Color(32, 45, 64));
		btnMaterialSearch.setBounds(624, 112, 289, 49);
		contentPane.add(btnMaterialSearch);
		
		JButton btnShowMaterialHistory = new JButton("Προβολή Ιστορικού");
		btnShowMaterialHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesMaterialsPage().setVisible(false);
				Main.getPurchaseMaterialsStatsPage().setVisible(true);
			}
		});
		btnShowMaterialHistory.setForeground(Color.WHITE);
		btnShowMaterialHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowMaterialHistory.setBackground(new Color(32, 45, 64));
		btnShowMaterialHistory.setBounds(947, 177, 260, 105);
		contentPane.add(btnShowMaterialHistory);
		
		JButton btnUpdateMaterial = new JButton("Επεξεργασία Προϊόντος");
		btnUpdateMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesMaterialsPage().setVisible(false);
				Main.getPurchaseMaterialsUpdatePage().setVisible(true);
			}
		});
		btnUpdateMaterial.setForeground(Color.WHITE);
		btnUpdateMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateMaterial.setBackground(new Color(32, 45, 64));
		btnUpdateMaterial.setBounds(947, 318, 260, 105);
		contentPane.add(btnUpdateMaterial);
		
		JButton btnShowMaterialInfo = new JButton("Προβολή Στοιχείων");
		btnShowMaterialInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchasesMaterialsPage().setVisible(false);
				Main.getPurchaseMaterialsViewPage().setVisible(true);
			}
		});
		btnShowMaterialInfo.setForeground(Color.WHITE);
		btnShowMaterialInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowMaterialInfo.setBackground(new Color(32, 45, 64));
		btnShowMaterialInfo.setBounds(947, 468, 260, 105);
		contentPane.add(btnShowMaterialInfo);
		
		JButton btnDeleteMaterial = new JButton("Διαγραφή Πρώτης Ύλης");
		btnDeleteMaterial.setForeground(Color.WHITE);
		btnDeleteMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteMaterial.setBackground(new Color(182, 7, 64));
		btnDeleteMaterial.setBounds(10, 181, 225, 96);
		contentPane.add(btnDeleteMaterial);
	}

}
