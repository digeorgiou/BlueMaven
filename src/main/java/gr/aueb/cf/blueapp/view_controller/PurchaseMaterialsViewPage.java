package gr.aueb.cf.blueapp.view_controller;

import gr.aueb.cf.blueapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PurchaseMaterialsViewPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public PurchaseMaterialsViewPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1246, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaterialId = new JLabel("Κωδικός");
		lblMaterialId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialId.setBounds(212, 145, 65, 34);
		contentPane.add(lblMaterialId);
		
		JLabel lblMaterialName = new JLabel("Όνομα");
		lblMaterialName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialName.setBounds(212, 228, 65, 34);
		contentPane.add(lblMaterialName);
		
		JLabel lblMaterialPrice = new JLabel("Τιμή (ανα τμχ)");
		lblMaterialPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialPrice.setBounds(685, 145, 112, 34);
		contentPane.add(lblMaterialPrice);
		
		JLabel lblMaterialStock = new JLabel("Απόθεμα");
		lblMaterialStock.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMaterialStock.setBounds(726, 228, 71, 34);
		contentPane.add(lblMaterialStock);
		
		JButton btnReturn = new JButton("Επιστροφή");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getPurchaseMaterialsViewPage().setVisible(false);
				Main.getPurchasesMaterialsPage().setVisible(true);
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReturn.setBackground(new Color(32, 45, 64));
		btnReturn.setBounds(473, 468, 262, 82);
		contentPane.add(btnReturn);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(32, 45, 64));
		header.setBounds(0, 0, 1256, 82);
		contentPane.add(header);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(PurchaseMaterialsViewPage.class.getResource("/images/bluelogo-small.png")));
		lblLogo.setBounds(0, 0, 99, 82);
		header.add(lblLogo);
		
		JLabel lblViewMaterial = new JLabel("ΠΡΟΒΟΛΗ ΣΤΟΙΧΕΙΩΝ ΠΡΩΤΗΣ ΥΛΗΣ");
		lblViewMaterial.setForeground(Color.WHITE);
		lblViewMaterial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblViewMaterial.setBounds(471, 25, 313, 31);
		header.add(lblViewMaterial);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBackground(new Color(32, 45, 64));
		footer.setBounds(0, 632, 1232, 99);
		contentPane.add(footer);
		
		JLabel lblSpecificMaterialId = new JLabel("Κωδικός");
		lblSpecificMaterialId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificMaterialId.setBounds(386, 150, 181, 28);
		contentPane.add(lblSpecificMaterialId);
		
		JLabel lblSpecificMaterialName = new JLabel("Όνομα");
		lblSpecificMaterialName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificMaterialName.setBounds(386, 234, 181, 28);
		contentPane.add(lblSpecificMaterialName);
		
		JLabel lblSpecificMaterialPrice = new JLabel("Τιμή");
		lblSpecificMaterialPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificMaterialPrice.setBounds(908, 148, 181, 28);
		contentPane.add(lblSpecificMaterialPrice);
		
		JLabel lblSpecificMaterialStock = new JLabel("Απόθεμα");
		lblSpecificMaterialStock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSpecificMaterialStock.setBounds(908, 233, 181, 28);
		contentPane.add(lblSpecificMaterialStock);
	}

}
