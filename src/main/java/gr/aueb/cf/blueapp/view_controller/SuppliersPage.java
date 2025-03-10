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
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuppliersPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldSearchProvider;

	
	public SuppliersPage() {
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
		lblLogo.setIcon(new ImageIcon(SuppliersPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblProviders = new JLabel("ΠΡΟΜΗΘΕΥΤΕΣ");
		lblProviders.setForeground(Color.WHITE);
		lblProviders.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProviders.setBounds(562, 25, 131, 31);
		header.add(lblProviders);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(21, 484, 213, 96);
		contentPane.add(btnReturn);
		
		JButton btnAddProvider = new JButton("Προσθήκη Προμηθευτη");
		btnAddProvider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersPage().setVisible(false);
				Main.getSuppliersInsertPage().setVisible(true);
			}
		});
		btnAddProvider.setForeground(Color.WHITE);
		btnAddProvider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddProvider.setBackground(new Color(0, 128, 0));
		btnAddProvider.setBounds(21, 344, 213, 96);
		contentPane.add(btnAddProvider);
		
		textFieldSearchProvider = new JTextField();
		textFieldSearchProvider.setColumns(10);
		textFieldSearchProvider.setBounds(249, 111, 375, 51);
		contentPane.add(textFieldSearchProvider);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Προμηθευτής", "ΑΦΜ", "ΔΟΥ", "Τηλέφωνο", "Διεύθυνση"
			}
		));
		table.setBounds(57, 192, 668, 462);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneProviders = new JScrollPane(table);
		scrollPaneProviders.setBounds(249, 189, 659, 420);
		contentPane.add(scrollPaneProviders);
		
		JButton btnProviderSearch = new JButton("Αναζήτηση");
		btnProviderSearch.setForeground(Color.WHITE);
		btnProviderSearch.setBackground(new Color(32, 45, 64));
		btnProviderSearch.setBounds(657, 112, 251, 49);
		contentPane.add(btnProviderSearch);
		
		JButton btnShowProviderHistory = new JButton("Προβολή Ιστορικού");
		btnShowProviderHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersPage().setVisible(false);
				Main.getSuppliersStatsPage().setVisible(true);
			}
		});
		btnShowProviderHistory.setForeground(Color.WHITE);
		btnShowProviderHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProviderHistory.setBackground(new Color(32, 45, 64));
		btnShowProviderHistory.setBounds(942, 189, 260, 105);
		contentPane.add(btnShowProviderHistory);
		
		JButton btnUpdateProvider = new JButton("Επεξεργασία Προμηθευτή");
		btnUpdateProvider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersPage().setVisible(false);
				Main.getSuppliersUpdatePage().setVisible(true);
			}
		});
		btnUpdateProvider.setForeground(Color.WHITE);
		btnUpdateProvider.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateProvider.setBackground(new Color(32, 45, 64));
		btnUpdateProvider.setBounds(942, 343, 260, 105);
		contentPane.add(btnUpdateProvider);
		
		JButton btnShowProviderInfo = new JButton("Προβολή Στοιχείων");
		btnShowProviderInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getSuppliersPage().setVisible(false);
				Main.getSuppliersViewPage().setVisible(true);
			}
		});
		btnShowProviderInfo.setForeground(Color.WHITE);
		btnShowProviderInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowProviderInfo.setBackground(new Color(32, 45, 64));
		btnShowProviderInfo.setBounds(942, 504, 260, 105);
		contentPane.add(btnShowProviderInfo);
		
		JButton btnDeleteProvider = new JButton("Διαγραφή Προμηθευτή");
		btnDeleteProvider.setForeground(Color.WHITE);
		btnDeleteProvider.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteProvider.setBackground(new Color(182, 7, 64));
		btnDeleteProvider.setBounds(21, 198, 213, 96);
		contentPane.add(btnDeleteProvider);
	}

}
