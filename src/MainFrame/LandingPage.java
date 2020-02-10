package MainFrame;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFormattedTextField;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.Label;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.TextField;
import java.awt.List;
import java.awt.TextArea;

public class LandingPage extends JFrame {

	String[] pompkeuze = { "Kies Pomp..", "Pomp een", "Pomp twee", "Pomp drie", "Pomp vier" };
	JComboBox POMP = new JComboBox(pompkeuze);
	String status1;
	String status2;
	String status3;
	String status4;
	String role;
	String[] OlieType = { "Kies OlieType", "Diesel", "Unleaded", "Super Unleaded" };
	final static String newline = "\n";
	private JPanel contentPane;
	private JTextField textFieldbedrag;
	private JTextField textFieldin;
	private JTextField textFieldkenteken;

	/**
	 * Launch the application.
	 */
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private JTextField textperlitter;
	private JTextField textstatuspomp;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage frame = new LandingPage();
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
	public LandingPage() {
		setTitle("Golden Station");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		MainFrame.SignIn Signedin = new MainFrame.SignIn();
		System.out.println(role);
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(394, 0, 395, 439);
		contentPane.add(panel);
		panel.setLayout(null);

		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(10, 236, 375, 34);
		panel.add(formattedTextField);

		JLabel lblStatusPomp = new JLabel("Status Pomp");
		lblStatusPomp.setForeground(Color.GREEN);
		lblStatusPomp.setBounds(170, 165, 73, 20);
		panel.add(lblStatusPomp);

		textstatuspomp = new JTextField();
		textstatuspomp.setBounds(159, 186, 98, 34);
		panel.add(textstatuspomp);
		textstatuspomp.setColumns(10);

		textstatuspomp.setEditable(false);
		Button UNBLOCK4 = new Button("UNBLOCK");
		UNBLOCK4.setBounds(109, 113, 194, 42);
		panel.add(UNBLOCK4);
		UNBLOCK4.setActionCommand("UNBLOCK4");
		UNBLOCK4.setForeground(Color.WHITE);
		UNBLOCK4.setFont(new Font("Dialog", Font.BOLD, 14));
		UNBLOCK4.setBackground(new Color(154, 205, 50));

		Button UNBLOCK = new Button("UNBLOCK");
		UNBLOCK.setBounds(109, 113, 194, 42);
		panel.add(UNBLOCK);

		UNBLOCK.setForeground(Color.WHITE);
		UNBLOCK.setFont(new Font("Dialog", Font.BOLD, 14));
		UNBLOCK.setBackground(new Color(154, 205, 50));

		Button UNBLOCK2 = new Button("UNBLOCK");
		UNBLOCK2.setBounds(109, 113, 194, 42);
		panel.add(UNBLOCK2);
		UNBLOCK2.setActionCommand("UNBLOCK2");
		UNBLOCK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		UNBLOCK2.setForeground(Color.WHITE);
		UNBLOCK2.setFont(new Font("Dialog", Font.BOLD, 14));
		UNBLOCK2.setBackground(new Color(154, 205, 50));

		Button UNBLOCK3 = new Button("UNBLOCK");
		UNBLOCK3.setBounds(109, 113, 194, 42);
		panel.add(UNBLOCK3);
		UNBLOCK3.setActionCommand("UNBLOCK3");
		UNBLOCK3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UNBLOCK3.setForeground(Color.WHITE);
		UNBLOCK3.setFont(new Font("Dialog", Font.BOLD, 14));
		UNBLOCK3.setBackground(new Color(154, 205, 50));

		Button BLOCK2 = new Button("BLOCK");
		BLOCK2.setBounds(109, 113, 194, 42);
		panel.add(BLOCK2);
		BLOCK2.setForeground(Color.WHITE);
		BLOCK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BLOCK2.setFont(new Font("Dialog", Font.BOLD, 14));
		BLOCK2.setBackground(Color.RED);

		Button BLOCK = new Button("BLOCK");
		BLOCK.setBounds(109, 113, 194, 42);
		panel.add(BLOCK);
		BLOCK.setForeground(Color.WHITE);
		BLOCK.setFont(new Font("Dialog", Font.BOLD, 14));
		BLOCK.setBackground(new Color(255, 0, 0));
		BLOCK.setActionCommand("SUMBIT");

		Button BLOCK4 = new Button("BLOCK");
		BLOCK4.setBounds(109, 113, 192, 42);
		panel.add(BLOCK4);
		BLOCK4.setForeground(Color.WHITE);
		BLOCK4.setFont(new Font("Dialog", Font.BOLD, 14));
		BLOCK4.setBackground(Color.RED);

		Button BLOCK3 = new Button("BLOCK");
		BLOCK3.setBounds(109, 113, 192, 42);
		panel.add(BLOCK3);
		BLOCK3.setFont(new Font("Dialog", Font.BOLD, 14));
		BLOCK3.setForeground(Color.WHITE);
		BLOCK3.setBackground(Color.RED);

		TextArea textArea = new TextArea();
		Font font = new Font("Courier", Font.BOLD, 40);
		textArea.setFont(font);
//textArea.setComponentOrientation(ComponentOrientation.);
		textArea.setBounds(10, 10, 375, 85);

		panel.add(textArea);

		TextArea textAreaOUTPUT = new TextArea();
		textAreaOUTPUT.setBounds(10, 279, 375, 160);
		panel.add(textAreaOUTPUT);
		BLOCK3.setVisible(false);
		BLOCK.setVisible(false);
		BLOCK2.setVisible(false);
		BLOCK4.setVisible(false);
		UNBLOCK3.setVisible(false);
		UNBLOCK2.setVisible(false);
		UNBLOCK.setVisible(false);
		UNBLOCK4.setVisible(false);

		Button buttonBET = new Button("SUBMIT");
		buttonBET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		buttonBET.setActionCommand("SUMBIT");

		buttonBET.setForeground(Color.WHITE);
		buttonBET.setFont(new Font("Dialog", Font.BOLD, 14));
		buttonBET.setBackground(new Color(0, 0, 255));
		buttonBET.setBounds(108, 254, 194, 42);
		contentPane.add(buttonBET);

		JLabel lblNewLabel = new JLabel("POMP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(10, 46, 126, 32);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("KENTEKEN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(10, 170, 89, 27);
		contentPane.add(lblNewLabel_1);

		JLabel lblOlieType = new JLabel("OLIE TYPE");
		lblOlieType.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOlieType.setBackground(Color.LIGHT_GRAY);
		lblOlieType.setBounds(10, 89, 126, 32);
		contentPane.add(lblOlieType);

		JLabel lblBedragSrd = new JLabel("BEDRAG SRD");
		lblBedragSrd.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBedragSrd.setBackground(Color.LIGHT_GRAY);
		lblBedragSrd.setBounds(10, 132, 89, 27);
		contentPane.add(lblBedragSrd);

		POMP.setBounds(108, 49, 105, 26);
		POMP.setSelectedIndex(0);
		POMP.addActionListener(POMP);
		contentPane.add(POMP);

		JComboBox comboBoxolietype = new JComboBox(OlieType);
		comboBoxolietype.setBounds(108, 95, 151, 26);
		comboBoxolietype.setSelectedIndex(0);
		comboBoxolietype.addActionListener(POMP);
		contentPane.add(comboBoxolietype);

		textFieldbedrag = new JTextField();
		textFieldbedrag.setBounds(109, 133, 150, 24);
		contentPane.add(textFieldbedrag);
		textFieldbedrag.setColumns(10);

		textFieldin = new JTextField();
		textFieldin.setColumns(10);
		textFieldin.setBounds(223, 50, 150, 24);
		contentPane.add(textFieldin);
		textFieldin.setVisible(false);

		textFieldkenteken = new JTextField();
		textFieldkenteken.setColumns(10);
		textFieldkenteken.setBounds(108, 171, 150, 24);
		contentPane.add(textFieldkenteken);

		JLabel lblNewLabel_2 = new JLabel("SRD P/L");
		lblNewLabel_2.setBounds(260, 94, 55, 23);
		contentPane.add(lblNewLabel_2);

		textperlitter = new JTextField();
		textperlitter.setBounds(318, 94, 55, 27);
		contentPane.add(textperlitter);
		textperlitter.setColumns(10);
		textperlitter.setEditable(false);

		Label labelrole = new Label("");
		labelrole.setAlignment(Label.CENTER);
		labelrole.setForeground(new Color(255, 255, 255));
		labelrole.setFont(new Font("Dialog", Font.BOLD, 14));
		labelrole.setBackground(new Color(0, 0, 0));
		labelrole.setBounds(159, 10, 126, 22);
		contentPane.add(labelrole);

		POMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == POMP) {
					MainFrame.Pomp mains = new MainFrame.Pomp();
					JComboBox cb = (JComboBox) e.getSource();
					String msg = (String) cb.getSelectedItem();
					switch (msg) {
					case "Pomp een":
						textArea.setText(null);
						textstatuspomp.setText(status1);
						UNBLOCK.setVisible(false);
						UNBLOCK2.setVisible(false);
						UNBLOCK3.setVisible(false);
						UNBLOCK4.setVisible(false);
						if (status1 == null || status1 == "Available") {
							BLOCK.setVisible(true);
							BLOCK2.setVisible(false);
							BLOCK3.setVisible(false);
							BLOCK4.setVisible(false);
						} else {
							BLOCK.setVisible(false);
							BLOCK2.setVisible(false);
							BLOCK3.setVisible(false);
							BLOCK4.setVisible(false);
							UNBLOCK.setVisible(true);
							UNBLOCK2.setVisible(false);
							UNBLOCK3.setVisible(false);
							UNBLOCK4.setVisible(false);
						}

						UNBLOCK.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status1 = "Available";
								if (status1 == "Available") {
									textstatuspomp.setText(status1);
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK.setVisible(true);
									UNBLOCK.setVisible(false);
								} else {
									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
								}
							}
						});
						BLOCK.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status1 = "Blocked";

								if (status1 == "Blocked") {

									textstatuspomp.setText(status1);

									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK.setVisible(false);
									UNBLOCK.setVisible(true);
									UNBLOCK2.setVisible(false);
									UNBLOCK3.setVisible(false);
									UNBLOCK4.setVisible(false);
								} else {
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
								}
							}
						});
						if (status1 == "Blocked") {

							textFieldbedrag.setEditable(false);
							textFieldkenteken.setEditable(false);
							buttonBET.setVisible(false);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						} else {
							textFieldbedrag.setEditable(true);
							textFieldkenteken.setEditable(true);
							buttonBET.setVisible(true);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);
						}
						mains.setKeuzepomp(msg);
						textFieldin.setText(msg);
						break;
					case "Pomp twee":
						textArea.setText(null);
						textstatuspomp.setText(status2);
						UNBLOCK.setVisible(false);
						UNBLOCK3.setVisible(false);
						UNBLOCK4.setVisible(false);

						if (status2 == null || status2 == "Available") {
							BLOCK2.setVisible(true);
							BLOCK.setVisible(false);
							BLOCK3.setVisible(false);
							BLOCK4.setVisible(false);
						} else {
							BLOCK.setVisible(false);
							BLOCK2.setVisible(false);
							BLOCK3.setVisible(false);
							BLOCK4.setVisible(false);
							UNBLOCK2.setVisible(true);
							UNBLOCK.setVisible(false);
							UNBLOCK3.setVisible(false);
							UNBLOCK4.setVisible(false);
						}

						UNBLOCK2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status2 = "Available";
								if (status2 == "Available") {
									textstatuspomp.setText(status2);
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK2.setVisible(true);
									UNBLOCK2.setVisible(false);
								} else {
									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
								}
							}
						});
						BLOCK2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status2 = "Blocked";
								if (status2 == "Blocked") {
									textstatuspomp.setText(status2);

									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK2.setVisible(false);
									UNBLOCK2.setVisible(true);
									UNBLOCK.setVisible(false);
									UNBLOCK3.setVisible(false);
									UNBLOCK4.setVisible(false);

								} else {
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);

								}
							}
						});
						if (status2 == "Blocked") {

							textFieldbedrag.setEditable(false);
							textFieldkenteken.setEditable(false);
							buttonBET.setVisible(false);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						} else {
							textFieldbedrag.setEditable(true);
							textFieldkenteken.setEditable(true);
							buttonBET.setVisible(true);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						}

						mains.setKeuzepomp(msg);
						textFieldin.setText(msg);
						;
						break;
					case "Pomp drie":
						textArea.setText(null);
						textstatuspomp.setText(status3);
						UNBLOCK.setVisible(false);
						UNBLOCK2.setVisible(false);
						UNBLOCK4.setVisible(false);

						if (status3 == null || status3 == "Available") {
							BLOCK3.setVisible(true);
							BLOCK.setVisible(false);
							BLOCK2.setVisible(false);
							BLOCK4.setVisible(false);

						} else {
							BLOCK.setVisible(false);
							BLOCK2.setVisible(false);
							BLOCK3.setVisible(false);
							BLOCK4.setVisible(false);
							UNBLOCK.setVisible(false);
							UNBLOCK2.setVisible(false);
							UNBLOCK3.setVisible(true);
							UNBLOCK4.setVisible(false);
						}

						UNBLOCK3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status3 = "Available";
								if (status3 == "Available") {
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK3.setVisible(true);
									BLOCK.setVisible(false);
									BLOCK4.setVisible(false);
									BLOCK2.setVisible(false);
									UNBLOCK4.setVisible(false);
									UNBLOCK3.setVisible(false);

								} else {
									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
								}
							}
						});
						BLOCK3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								status3 = "Blocked";

								if (status3 == "Blocked" && msg == "Pomp drie") {

									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK3.setVisible(false);
									UNBLOCK3.setVisible(true);
									UNBLOCK.setVisible(false);
									UNBLOCK2.setVisible(false);
									UNBLOCK4.setVisible(false);

								} else {
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
								}
							}
						});

						if (status3 == "Blocked") {

							textFieldbedrag.setEditable(false);
							textFieldkenteken.setEditable(false);
							buttonBET.setVisible(false);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						} else {
							textFieldbedrag.setEditable(true);
							textFieldkenteken.setEditable(true);
							buttonBET.setVisible(true);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						}
						mains.setKeuzepomp(msg);
						textFieldin.setText(msg);
						break;
					case "Pomp vier":
						textArea.setText(null);
						textstatuspomp.setText(status4);
						UNBLOCK.setVisible(false);
						UNBLOCK2.setVisible(false);
						UNBLOCK3.setVisible(false);
						UNBLOCK4.setVisible(false);

						if (status4 == null || status4 == "Available") {
							BLOCK4.setVisible(true);
							BLOCK.setVisible(false);
							BLOCK2.setVisible(false);
							BLOCK3.setVisible(false);
						} else {
							BLOCK.setVisible(false);
							BLOCK2.setVisible(false);
							BLOCK3.setVisible(false);
							BLOCK4.setVisible(false);
							UNBLOCK.setVisible(false);
							UNBLOCK2.setVisible(false);
							UNBLOCK3.setVisible(false);
							UNBLOCK4.setVisible(true);
						}

						UNBLOCK4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status4 = "Available";
								if (status4 == "Available") {
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK4.setVisible(true);
									BLOCK.setVisible(false);
									BLOCK3.setVisible(false);
									BLOCK2.setVisible(false);
									UNBLOCK4.setVisible(false);

								} else {
									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
								}
							}
						});
						BLOCK4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								status4 = "Blocked";

								if (status4 == "Blocked") {

									textFieldbedrag.setEditable(false);
									textFieldkenteken.setEditable(false);
									buttonBET.setVisible(false);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);
									BLOCK.setVisible(false);
									BLOCK2.setVisible(false);
									BLOCK3.setVisible(false);
									BLOCK4.setVisible(false);
									UNBLOCK3.setVisible(false);
									UNBLOCK.setVisible(false);
									UNBLOCK2.setVisible(false);
									UNBLOCK4.setVisible(true);

								} else {
									textFieldbedrag.setEditable(true);
									textFieldkenteken.setEditable(true);
									buttonBET.setVisible(true);
									formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: "
											+ status3 + " POMP4: " + status4);

								}
							}
						});
						if (status4 == "Blocked") {

							textFieldbedrag.setEditable(false);
							textFieldkenteken.setEditable(false);
							buttonBET.setVisible(false);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						} else {
							textFieldbedrag.setEditable(true);
							textFieldkenteken.setEditable(true);
							buttonBET.setVisible(true);
							formattedTextField.setText("POMP1: " + status1 + " POMP2: " + status2 + " POMP3: " + status3
									+ " POMP4: " + status4);

						}
						mains.setKeuzepomp(msg);
						textFieldin.setText(msg);
						break;
					}
				}
				comboBoxolietype.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (e.getSource() == comboBoxolietype) {
							MainFrame.PompEEN info = new MainFrame.PompEEN();
							JComboBox cb = (JComboBox) e.getSource();
							String msg = (String) cb.getSelectedItem();
							switch (msg) {
							case "Diesel":
								info.setTypeolievalue(5.88);
								textperlitter.setText(Double.toString(info.getTypeolievalue()));
								info.setTypeOlie(msg);
								break;
							case "Unleaded":
								info.setTypeolievalue(6.41);
								textperlitter.setText(Double.toString(info.getTypeolievalue()));
								info.setTypeOlie(msg);
								break;
							case "Super Unleaded":

								info.setTypeolievalue(6.66);
								textperlitter.setText(Double.toString(info.getTypeolievalue()));
								info.setTypeOlie(msg);
								break;
							}

							buttonBET.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
								
									String meh= null;
									if (textFieldbedrag.getText().equals("")) {
										JOptionPane.showMessageDialog(null, "Bedrag staat leeg, A.U.B invoeren ",
												"Invoer error", JOptionPane.ERROR_MESSAGE);

									} else {
										textArea.setText("Running");
										if(textArea.getText().equals("Running")) {											
											double bedragtest = Double.parseDouble(textFieldbedrag.getText());
											info.setAantalLiters(bedragtest / info.getTypeolievalue());
											int litter = (int) (info.getAantalLiters() * 100);

											try {

												for (int i = 0; i <= litter; i++) {
													Thread.sleep(120);
													textArea.setBackground(new Color(154,205,50) );
													textArea.setText(null);
													textArea.append(df2.format((double) i / 100) + " " + newline);
													System.out.println((double) i / 100);
													if (df2.format((double) i / 100)
															.equals(df2.format(info.getAantalLiters()))) {
														textstatuspomp.setText("Stopped");
														break;
													}
												}
											} catch (InterruptedException ex) {
												System.out.println(ex);
											}

											textAreaOUTPUT.append(
													textFieldin.getText() + " ran: " + df2.format(info.getAantalLiters())
															+ " Litter " + info.getTypeOlie() + " " + newline);
										}

								
									}
								}
							});
						}

					}
				});

			}
		});

	}
}
