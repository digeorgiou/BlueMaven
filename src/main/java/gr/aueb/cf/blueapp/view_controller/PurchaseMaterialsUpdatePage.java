package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PurchaseMaterialsUpdatePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMaterialId;
	private JTextField textFieldMaterialName;
	private JTextField textFieldPrice;
	private JTextField textFieldStock;


	public PurchaseMaterialsUpdatePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaterialId = new JLabel("Κωδικός");
		lblMaterialId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialId.setBounds(164, 181, 65, 34);
		contentPane.add(lblMaterialId);
		
		JLabel lblMaterialName = new JLabel("Όνομα");
		lblMaterialName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialName.setBounds(174, 264, 55, 34);
		contentPane.add(lblMaterialName);
		
		textFieldMaterialId = new JTextField();
		textFieldMaterialId.setColumns(10);
		textFieldMaterialId.setBounds(314, 179, 220, 42);
		contentPane.add(textFieldMaterialId);
		
		textFieldMaterialName = new JTextField();
		textFieldMaterialName.setColumns(10);
		textFieldMaterialName.setBounds(314, 262, 220, 42);
		contentPane.add(textFieldMaterialName);
		
		JLabel lblPrice = new JLabel("Τιμή (ανα τμχ)");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(648, 181, 102, 34);
		contentPane.add(lblPrice);
		
		JLabel lblStock = new JLabel("Απόθεμα");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStock.setBounds(685, 264, 65, 34);
		contentPane.add(lblStock);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(824, 182, 238, 37);
		contentPane.add(textFieldPrice);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(824, 265, 238, 37);
		contentPane.add(textFieldStock);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchaseMaterialsUpdatePage().setVisible(false);
				Main.getPurchasesMaterialsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(236, 485, 262, 82);
		contentPane.add(btnReturn);
		
		JButton btnSave = new JButton("Αποθήκευση");
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBackground(new Color(0, 128, 64));
		btnSave.setBounds(734, 485, 262, 82);
		contentPane.add(btnSave);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(PurchaseMaterialsUpdatePage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblUpdateMaterial = new JLabel("ΕΠΕΞΕΡΓΑΣΙΑ ΣΤΟΙΧΕΙΩΝ ΠΡΩΤΗΣ ΥΛΗΣ");
		lblUpdateMaterial.setForeground(Color.WHITE);
		lblUpdateMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpdateMaterial.setBounds(457, 25, 341, 31);
		header.add(lblUpdateMaterial);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
	}

}
