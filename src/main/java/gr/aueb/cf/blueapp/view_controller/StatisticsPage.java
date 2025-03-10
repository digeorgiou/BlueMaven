package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatisticsPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldDateFrom;
	private JTextField textFieldDateTo;

	
	public StatisticsPage() {
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
		lblLogo.setIcon(new ImageIcon(StatisticsPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 101, 82);
		header.add(lblLogo);
		
		JLabel lblSalesStats = new JLabel("ΣΤΑΤΙΣΤΙΚΑ ΠΩΛΗΣΕΩΝ");
		lblSalesStats.setForeground(Color.WHITE);
		lblSalesStats.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalesStats.setBounds(520, 25, 215, 31);
		header.add(lblSalesStats);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldDateFrom = new JTextField();
		textFieldDateFrom.setBounds(1000, 178, 182, 37);
		contentPane.add(textFieldDateFrom);
		textFieldDateFrom.setColumns(10);
		
		textFieldDateTo = new JTextField();
		textFieldDateTo.setColumns(10);
		textFieldDateTo.setBounds(1000, 280, 182, 37);
		contentPane.add(textFieldDateTo);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getStatisticsPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(27, 478, 198, 96);
		contentPane.add(btnReturn);
		
		JLabel lblDateFrom = new JLabel("Από : ");
		lblDateFrom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateFrom.setBounds(1000, 148, 100, 20);
		contentPane.add(lblDateFrom);
		
		JLabel lblDateTo = new JLabel("Έως : ");
		lblDateTo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateTo.setBounds(1000, 247, 100, 20);
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
		
		
		JScrollPane scrollPaneSales = new JScrollPane(table);
		scrollPaneSales.setBounds(269, 148, 668, 462);
		contentPane.add(scrollPaneSales);
		
		JLabel lblSales = new JLabel("ΠΩΛΗΣΕΙΣ");
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSales.setBounds(537, 93, 158, 51);
		contentPane.add(lblSales);
		
		JButton btnDeleteSale = new JButton("Διαγραφή Πώλησης");
		btnDeleteSale.setForeground(new Color(255, 255, 255));
		btnDeleteSale.setBackground(new Color(182, 7, 64));
		btnDeleteSale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteSale.setBounds(27, 154, 198, 96);
		contentPane.add(btnDeleteSale);
		
		JButton btnShowSales = new JButton("Προβολή");
		btnShowSales.setForeground(Color.WHITE);
		btnShowSales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowSales.setBackground(new Color(0, 128, 0));
		btnShowSales.setBounds(993, 412, 198, 96);
		contentPane.add(btnShowSales);
	}
}
