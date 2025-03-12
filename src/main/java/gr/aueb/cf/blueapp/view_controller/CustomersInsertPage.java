package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;
import gr.aueb.cf.blueapp.dao.CustomerDAOImpl;
import gr.aueb.cf.blueapp.dao.ICustomerDAO;
import gr.aueb.cf.blueapp.dao.exceptions.CustomerDAOException;
import gr.aueb.cf.blueapp.dto.customer.CustomerInsertDTO;
import gr.aueb.cf.blueapp.dto.customer.CustomerReadOnlyDTO;
import gr.aueb.cf.blueapp.exceptions.CustomerAlreadyExistsException;
import gr.aueb.cf.blueapp.service.CustomerServiceImpl;
import gr.aueb.cf.blueapp.service.ICustomerService;
import gr.aueb.cf.blueapp.validator.CustomerValidator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;

public class CustomersInsertPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldFirstname;
	private JTextField textFieldLastname;
	private JTextField textFieldPhoneNumber;
	private JTextField textFieldAddress;
	private JTextField textFieldVAT;
	private JTextField textFieldDOY;
	private JTextField textFieldEmail;

	//injecting dao in service and service in controller
	private final ICustomerDAO customerDAO = new CustomerDAOImpl();
	private final ICustomerService customerService =
			new CustomerServiceImpl(customerDAO);

	public CustomersInsertPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		Color grayColor = new Color(220, 220, 220);
		Color blackColor = new Color(0, 0, 0);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CustomersInsertPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblAddNewCustomer = new JLabel("ΠΡΟΣΘΗΚΗ ΝΕΟΥ ΠΕΛΑΤΗ");
		lblAddNewCustomer.setForeground(Color.WHITE);
		lblAddNewCustomer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddNewCustomer.setBounds(514, 25, 227, 31);
		header.add(lblAddNewCustomer);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		textFieldFirstname = new JTextField();
		textFieldFirstname.setBounds(314, 130, 247, 53);
		contentPane.add(textFieldFirstname);
		textFieldFirstname.setColumns(10);
		
		textFieldLastname = new JTextField();
		textFieldLastname.setColumns(10);
		textFieldLastname.setBounds(314, 214, 247, 53);
		contentPane.add(textFieldLastname);
		
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setColumns(10);
		textFieldPhoneNumber.setBounds(314, 303, 247, 53);
		contentPane.add(textFieldPhoneNumber);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(314, 388, 247, 53);
		contentPane.add(textFieldAddress);
		
		textFieldVAT = new JTextField();
		textFieldVAT.setColumns(10);
		textFieldVAT.setBounds(767, 214, 247, 53);
		textFieldVAT.setEnabled(false);
		contentPane.add(textFieldVAT);
		
		textFieldDOY = new JTextField();
		textFieldDOY.setColumns(10);
		textFieldDOY.setBounds(767, 303, 247, 53);
		textFieldDOY.setEnabled(false);
		contentPane.add(textFieldDOY);
		
		JLabel lblFirstname = new JLabel("Όνομα");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstname.setBounds(206, 137, 83, 34);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Επώνυμο");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastname.setBounds(206, 221, 83, 34);
		contentPane.add(lblLastname);
		
		JLabel lblPhoneNumber = new JLabel("Τηλέφωνο");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNumber.setBounds(206, 310, 83, 34);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Διεύθυνση");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(206, 395, 83, 34);
		contentPane.add(lblAddress);
		
		JLabel lblVat = new JLabel("ΑΦΜ");
		lblVat.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVat.setBounds(674, 221, 83, 34);
		lblVat.setForeground(grayColor);
		contentPane.add(lblVat);
		
		JLabel lblDOY = new JLabel("ΔΟΥ");
		lblDOY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDOY.setBounds(674, 310, 83, 34);
		lblDOY.setForeground(grayColor);
		contentPane.add(lblDOY);
		
		JCheckBox chckbxCustomerWholeSale = new JCheckBox("Πελάτης Χονδρικής");
		chckbxCustomerWholeSale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					textFieldVAT.setEnabled(true);
					textFieldDOY.setEnabled(true);
					lblVat.setForeground(blackColor);
					lblDOY.setForeground(blackColor);
					
				} else {
					textFieldVAT.setEnabled(false);
					textFieldDOY.setEnabled(false);
					lblVat.setForeground(grayColor);
					lblDOY.setForeground(grayColor);
				}
			}
		});
		chckbxCustomerWholeSale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxCustomerWholeSale.setBounds(770, 143, 220, 23);
		contentPane.add(chckbxCustomerWholeSale);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.getCustomersInsertPage().setVisible(false);
				Main.getCustomersPage().setVisible(true);
			}
		});
		btnReturn.setForeground(new Color(255, 255, 255));
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 501, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CustomerReadOnlyDTO customerReadOnlyDTO;

				//Data Binding
				CustomerInsertDTO insertDTO = doDataBinding();

				//Validation
				Map<String, String> errors =
						CustomerValidator.validate(insertDTO);
				if(!errors.isEmpty()){
					//...
				}

				try {
					customerReadOnlyDTO =
							customerService.insertCustomer(insertDTO);
					JOptionPane.showMessageDialog(null, "Επιτυχής προσθήκη " +
							"πελάτη με κωδικό " + customerReadOnlyDTO.getCustomerId(),
							"Εισαγωγή", JOptionPane.INFORMATION_MESSAGE);
					//todo form instead of message dialog
				} catch (CustomerDAOException | CustomerAlreadyExistsException ex){
					JOptionPane.showMessageDialog(null,
							"Error" + ex.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
				}


			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 501, 262, 82);
		contentPane.add(btnSave);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(767, 388, 247, 53);
		contentPane.add(textFieldEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(674, 395, 83, 34);
		contentPane.add(lblEmail);
	}

	private CustomerInsertDTO doDataBinding() {
		String firstname = textFieldFirstname.getText().trim();
		String lastname = textFieldLastname.getText().trim();
		String phoneNumber = textFieldPhoneNumber.getText();
		String address = textFieldAddress.getText();
		String vat = textFieldVAT.getText().trim();
		String doy = textFieldDOY.getText().trim();
		String email = textFieldEmail.getText().trim();

		return new CustomerInsertDTO(firstname, lastname,phoneNumber,address,
				email,doy,vat);
	}
}
