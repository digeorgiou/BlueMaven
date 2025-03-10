package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomersPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	private JTextField textFieldCustomerSearch;
	private int selectedId;

	
	public CustomersPage() {
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowActivated(WindowEvent e) {
//				buildTable();
//			}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
//		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				//check if the selection is still adjusting
//				if(!e.getValueIsAdjusting()) {
//					//Get the selected row index
//					int selectedRow = table.getSelectedRow();
//
//					//check if a row is selected
//					if (selectedRow != -1) {
//						//Get data from the selected row
////						String selectedStr = (String) model.getValueAt(selectedRow, 0);
//						selectedId = (int) model.getValueAt(selectedRow, 0);
//					}
//				}
//			}
//		});
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Κωδικός", "Επώνυμο", "Όνομα", "Τηλέφωνο" 
			}
		));
		table.setBounds(57, 192, 659, 420);
		model = (DefaultTableModel) table.getModel();
		
		JScrollPane scrollPaneCustomers = new JScrollPane(table);
		scrollPaneCustomers.setBounds(255, 201, 659, 420);
		contentPane.add(scrollPaneCustomers);
		
		textFieldCustomerSearch = new JTextField();
		textFieldCustomerSearch.setBounds(255, 123, 335, 51);
		contentPane.add(textFieldCustomerSearch);
		textFieldCustomerSearch.setColumns(10);
		
		JButton btnCustomerSearch = new JButton("Αναζήτηση");
//		btnCustomerSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				buildTable();
//			}
//		});
		btnCustomerSearch.setBackground(new Color(32, 45, 64));
		btnCustomerSearch.setForeground(new Color(255, 255, 255));
		btnCustomerSearch.setBounds(625, 124, 243, 49);
		contentPane.add(btnCustomerSearch);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CustomersPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 103, 82);
		header.add(lblLogo);
		
		JLabel lblCustomers = new JLabel("ΠΕΛΑΤΕΣ");
		lblCustomers.setForeground(Color.WHITE);
		lblCustomers.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomers.setBounds(583, 25, 90, 31);
		header.add(lblCustomers);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JButton btnAddCustomer = new JButton("Προσθήκη Πελάτη");
		btnAddCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getCustomersInsertPage().setVisible(true);
			}
		});
		btnAddCustomer.setForeground(Color.WHITE);
		btnAddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddCustomer.setBackground(new Color(0, 128, 0));
		btnAddCustomer.setBounds(27, 330, 198, 105);
		contentPane.add(btnAddCustomer);
		
		JButton btnUpdateCustomer = new JButton("Επεξεργασία Πελάτη");
		btnUpdateCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getCustomersUpdatePage().setVisible(true);
			}
		});
		btnUpdateCustomer.setForeground(Color.WHITE);
		btnUpdateCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUpdateCustomer.setBackground(new Color(32, 45, 64));
		btnUpdateCustomer.setBounds(948, 330, 260, 105);
		contentPane.add(btnUpdateCustomer);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getLandingPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(27, 480, 198, 94);
		contentPane.add(btnReturn);
		
		JButton btnShowCustomerInfo = new JButton("Προβολή Στοιχείων");
		btnShowCustomerInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				Main.getCustomersPage().setVisible(false);
				Main.getCustomerViewPage().setVisible(true);
			}
		});
		btnShowCustomerInfo.setForeground(Color.WHITE);
		btnShowCustomerInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowCustomerInfo.setBackground(new Color(32, 45, 64));
		btnShowCustomerInfo.setBounds(948, 480, 260, 105);
		contentPane.add(btnShowCustomerInfo);
		
		JButton btnShowCustomerHistory = new JButton("Προβολή Ιστορικού");
		btnShowCustomerHistory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersPage().setVisible(false);
				Main.getCustomerStatsPage().setVisible(true);
			}
		});
		btnShowCustomerHistory.setForeground(Color.WHITE);
		btnShowCustomerHistory.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnShowCustomerHistory.setBackground(new Color(32, 45, 64));
		btnShowCustomerHistory.setBounds(948, 189, 260, 105);
		contentPane.add(btnShowCustomerHistory);
		
		JButton btnDeleteCustomer = new JButton("Διαγραφή Πελάτη");
//		btnDeleteCustomer.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				doDelete(getSelectedId());
//			}
//		});
		btnDeleteCustomer.setForeground(Color.WHITE);
		btnDeleteCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDeleteCustomer.setBackground(new Color(182, 7, 64));
		btnDeleteCustomer.setBounds(27, 189, 198, 96);
		contentPane.add(btnDeleteCustomer);
	}
	
	public int getSelectedId() {
		return selectedId;
	}
	
//	private void buildTable() {
//		String sql = "SELECT id, lastname, firstname, phone_number FROM customers WHERE lastname LIKE ?";
//		Connection conn = LandingPage.getConnection();
//
//		try(PreparedStatement ps = conn.prepareStatement(sql)) {
//			ps.setString(1, textFieldCustomerSearch.getText().trim() + "%");
//			ResultSet rs = ps.executeQuery();
//
//			model.setRowCount(0); // Clear Table
//
//			while(rs.next()) {
//				Object[] row = {
//						rs.getInt("id"),
//						rs.getString("lastname"),
//						rs.getString("firstname"),
//						rs.getString("phone_number")
//				};
//				model.addRow(row);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//			JOptionPane.showMessageDialog(null,"Select Error", "Error", JOptionPane.ERROR_MESSAGE);
//		}
//	}
	
//	private void doDelete(int id) {
//		String sql = "DELETE FROM customers WHERE id = ?";
//		Connection conn = LandingPage.getConnection();
//
//
//		try(PreparedStatement ps = conn.prepareStatement(sql)) {
//			ps.setInt(1, id);
//
//			int answer = JOptionPane.showConfirmDialog(null, "Είστε σίγουρος", "Διαγραφή", JOptionPane.YES_NO_OPTION);
//			if(answer == JOptionPane.YES_OPTION) {
//				int rowsAffected = ps.executeUpdate();
//				JOptionPane.showMessageDialog(null, rowsAffected + "πελάτης διαγράφηκε", "Διαγραφή", JOptionPane.INFORMATION_MESSAGE );
//			} else {
//				return;
//			}
//
//		}catch(SQLException e) {
//			e.printStackTrace();
//			JOptionPane.showMessageDialog(null,"Delete Error", "Error", JOptionPane.ERROR_MESSAGE);
//		}
//	}
}
