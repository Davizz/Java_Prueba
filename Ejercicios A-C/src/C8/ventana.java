package C8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;

public class ventana extends JFrame {

	private JPanel contentPane;
	private JTextField ImpDe;
	private JTextField ImpA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		setTitle("Mi Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox ConversionDE = new JComboBox();
		ConversionDE.setModel(new DefaultComboBoxModel(new String[] {"euros", "dolares"}));
		ConversionDE.setToolTipText("");
		ConversionDE.setBounds(247, 69, 278, 27);
		contentPane.add(ConversionDE);
		
		JComboBox ConversionA = new JComboBox();
		ConversionA.setBounds(247, 108, 279, 27);
		contentPane.add(ConversionA);
		
		ImpDe = new JTextField();
		ImpDe.setBounds(22, 68, 213, 27);
		contentPane.add(ImpDe);
		ImpDe.setColumns(10);
		
		ImpA = new JTextField();
		ImpA.setBounds(22, 107, 213, 27);
		ImpA.setColumns(10);
		contentPane.add(ImpA);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR DE MONEDAS");
		lblNewLabel.setBounds(23, 20, 291, 37);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 45, 503, 12);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 147, 503, 12);
		contentPane.add(separator_1);
	}
}
