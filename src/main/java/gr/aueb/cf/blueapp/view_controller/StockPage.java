package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StockPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSearchStock;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldNewStock;


	public StockPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldSearchStock = new JTextField();
		textFieldSearchStock.setColumns(10);
		textFieldSearchStock.setBounds(263, 107, 335, 51);
		contentPane.add(textFieldSearchStock);
		
		JButton btnStockSearch = new JButton("Αναζήτηση Προϊόντος");
		btnStockSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnStockSearch.setForeground(Color.WHITE);
		btnStockSearch.setBackground(new Color(32, 45, 64));
		btnStockSearch.setBounds(633, 108, 289, 49);
		contentPane.add(btnStockSearch);
		
		table = new JTable();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Προϊόν", "Κατηγορία", "Υλικό", "Stock" 
			}
		));
		table.setBounds(57, 192, 659, 420);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneStock = new JScrollPane(table);
		scrollPaneStock.setBounds(263, 185, 659, 420);
		contentPane.add(scrollPaneStock);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(StockPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 100, 82);
		header.add(lblLogo);
		
		JLabel lblStock = new JLabel("ΑΠΟΘΗΚΗ");
		lblStock.setForeground(Color.WHITE);
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStock.setBounds(582, 25, 91, 31);
		header.add(lblStock);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnUpdateStock = new JButton("Ανανέωση Υπολοίπου");
		btnUpdateStock.setForeground(Color.WHITE);
		btnUpdateStock.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateStock.setBackground(new Color(32, 45, 64));
		btnUpdateStock.setBounds(957, 516, 254, 89);
		contentPane.add(btnUpdateStock);
		
		JButton btnReturnButton = new JButton("Επιστροφή");
		btnReturnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getStockPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturnButton.setForeground(Color.WHITE);
		btnReturnButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturnButton.setBackground(new Color(32, 45, 64));
		btnReturnButton.setBounds(40, 483, 158, 89);
		contentPane.add(btnReturnButton);
		
		textFieldNewStock = new JTextField();
		textFieldNewStock.setColumns(10);
		textFieldNewStock.setBounds(957, 454, 254, 51);
		contentPane.add(textFieldNewStock);
		
		JLabel lblNewStock = new JLabel("Νέο Υπόλοιπο");
		lblNewStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewStock.setBounds(957, 419, 254, 24);
		contentPane.add(lblNewStock);
	}
}
