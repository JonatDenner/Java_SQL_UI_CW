package databaseCoursework;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class GUI extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setResizable(false);
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
	private GUI() {
		setTitle("Volunteer Registry");
		final CardLayout cl = new CardLayout();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(cl);
		
		JPanel main = new JPanel();
		contentPane.add(main, "main");
		SpringLayout sl_main = new SpringLayout();
		main.setLayout(sl_main);
		
		JLabel lblMain = new JLabel("v. 1.0");
		sl_main.putConstraint(SpringLayout.WEST, lblMain, 10, SpringLayout.WEST, main);
		sl_main.putConstraint(SpringLayout.SOUTH, lblMain, -10, SpringLayout.SOUTH, main);
		main.add(lblMain);
		
		JLabel lblNewLabel = new JLabel("COS5020-B Database Systems Coursework 2");
		sl_main.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, lblMain);
		sl_main.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, main);
		main.add(lblNewLabel);
		
		JLabel lblUniversityOfBradford = new JLabel("University of Bradford Coronavirus Volunteers Registry");
		lblUniversityOfBradford.setHorizontalAlignment(SwingConstants.CENTER);
		sl_main.putConstraint(SpringLayout.NORTH, lblUniversityOfBradford, 87, SpringLayout.NORTH, main);
		sl_main.putConstraint(SpringLayout.WEST, lblUniversityOfBradford, 20, SpringLayout.WEST, main);
		main.add(lblUniversityOfBradford);
		
		/*
		 * Client insert panel
		 */
		final JPanel iClient = new JPanel();
		contentPane.add(iClient, "iClient");
		SpringLayout sl_iClient = new SpringLayout();
		iClient.setLayout(sl_iClient);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Medicine Delivery");
		sl_iClient.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 0, SpringLayout.WEST, iClient);
		iClient.add(chckbxNewCheckBox);
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Grocery Delivery");
		sl_iClient.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox, -6, SpringLayout.NORTH, chckbxNewCheckBox_1);
		sl_iClient.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_1, 0, SpringLayout.WEST, chckbxNewCheckBox);
		iClient.add(chckbxNewCheckBox_1);
		
		final JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Dog Walking");
		sl_iClient.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox_1, -6, SpringLayout.NORTH, chckbxNewCheckBox_2);
		sl_iClient.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_2, 0, SpringLayout.WEST, iClient);
		sl_iClient.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox_2, -22, SpringLayout.SOUTH, iClient);
		iClient.add(chckbxNewCheckBox_2);
		
		final JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Social Check-Up");
		sl_iClient.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_3, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		iClient.add(chckbxNewCheckBox_3);
		
		final JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Social Call");
		sl_iClient.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_4, 6, SpringLayout.SOUTH, chckbxNewCheckBox_3);
		sl_iClient.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_3, 0, SpringLayout.WEST, chckbxNewCheckBox_4);
		sl_iClient.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_4, 24, SpringLayout.EAST, chckbxNewCheckBox_1);
		iClient.add(chckbxNewCheckBox_4);
		
		JLabel lblHelpNeeded = new JLabel("Help Needed:");
		sl_iClient.putConstraint(SpringLayout.WEST, lblHelpNeeded, 5, SpringLayout.WEST, iClient);
		sl_iClient.putConstraint(SpringLayout.SOUTH, lblHelpNeeded, -14, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_iClient.putConstraint(SpringLayout.EAST, lblHelpNeeded, -329, SpringLayout.EAST, iClient);
		iClient.add(lblHelpNeeded);
		
		final JFormattedTextField txtHouseNumber = new JFormattedTextField();
		sl_iClient.putConstraint(SpringLayout.NORTH, txtHouseNumber, 35, SpringLayout.NORTH, iClient);
		sl_iClient.putConstraint(SpringLayout.WEST, txtHouseNumber, 188, SpringLayout.WEST, iClient);
		sl_iClient.putConstraint(SpringLayout.EAST, txtHouseNumber, -87, SpringLayout.EAST, iClient);
		txtHouseNumber.setText("House Number");
		iClient.add(txtHouseNumber);
		
		final JFormattedTextField txtName = new JFormattedTextField();
		sl_iClient.putConstraint(SpringLayout.NORTH, txtName, 10, SpringLayout.NORTH, iClient);
		sl_iClient.putConstraint(SpringLayout.WEST, txtName, 5, SpringLayout.WEST, iClient);
		sl_iClient.putConstraint(SpringLayout.EAST, txtName, -270, SpringLayout.EAST, iClient);
		txtName.setText("Name");
		iClient.add(txtName);
		
		final JFormattedTextField txtSurname = new JFormattedTextField();
		sl_iClient.putConstraint(SpringLayout.WEST, txtSurname, 28, SpringLayout.EAST, txtName);
		sl_iClient.putConstraint(SpringLayout.SOUTH, txtSurname, -6, SpringLayout.NORTH, txtHouseNumber);
		sl_iClient.putConstraint(SpringLayout.EAST, txtSurname, -87, SpringLayout.EAST, iClient);
		txtSurname.setText("Surname");
		iClient.add(txtSurname);
		
		final JFormattedTextField txtPhoneNumber = new JFormattedTextField();
		sl_iClient.putConstraint(SpringLayout.NORTH, txtPhoneNumber, 6, SpringLayout.SOUTH, txtName);
		sl_iClient.putConstraint(SpringLayout.WEST, txtPhoneNumber, 5, SpringLayout.WEST, iClient);
		sl_iClient.putConstraint(SpringLayout.EAST, txtPhoneNumber, -28, SpringLayout.WEST, txtHouseNumber);
		txtPhoneNumber.setText("Phone Number");
		iClient.add(txtPhoneNumber);
		
		final JFormattedTextField txtStreet = new JFormattedTextField();
		sl_iClient.putConstraint(SpringLayout.NORTH, txtStreet, 6, SpringLayout.SOUTH, txtPhoneNumber);
		sl_iClient.putConstraint(SpringLayout.WEST, txtStreet, 5, SpringLayout.WEST, iClient);
		sl_iClient.putConstraint(SpringLayout.EAST, txtStreet, 0, SpringLayout.EAST, txtName);
		txtStreet.setText("Street");
		iClient.add(txtStreet);
		
		final JFormattedTextField txtPostcode = new JFormattedTextField();
		sl_iClient.putConstraint(SpringLayout.NORTH, txtPostcode, 6, SpringLayout.SOUTH, txtHouseNumber);
		sl_iClient.putConstraint(SpringLayout.WEST, txtPostcode, 0, SpringLayout.WEST, txtHouseNumber);
		sl_iClient.putConstraint(SpringLayout.EAST, txtPostcode, 0, SpringLayout.EAST, txtHouseNumber);
		txtPostcode.setText("Postcode");
		iClient.add(txtPostcode);
		
		JButton btnEnterData = new JButton("Enter Data");
		sl_iClient.putConstraint(SpringLayout.NORTH, btnEnterData, -1, SpringLayout.NORTH, chckbxNewCheckBox_2);
		sl_iClient.putConstraint(SpringLayout.WEST, btnEnterData, 5, SpringLayout.WEST, chckbxNewCheckBox_3);
		btnEnterData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQL.iClient(txtName.getText(), txtSurname.getText(), txtPhoneNumber.getText(), txtHouseNumber.getText(),
						txtStreet.getText(), txtPostcode.getText(), chckbxNewCheckBox.isSelected(), chckbxNewCheckBox_1.isSelected(), 
						chckbxNewCheckBox_2.isSelected(),chckbxNewCheckBox_3.isSelected(), chckbxNewCheckBox_4.isSelected());
			}
		});
		iClient.add(btnEnterData);
		
		/*
		 * Volunteer insert panel
		 */
		JPanel iVolunteer = new JPanel();
		contentPane.add(iVolunteer, "iVolunteer");
		SpringLayout sl_iVolunteer = new SpringLayout();
		iVolunteer.setLayout(sl_iVolunteer);
		
		JLabel lblNewLabel_1 = new JLabel("Availability:");
		iVolunteer.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Activities:");
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 31, SpringLayout.SOUTH, lblNewLabel_1);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, lblNewLabel_2, 5, SpringLayout.WEST, iVolunteer);
		iVolunteer.add(lblNewLabel_2);
		
		final JCheckBox iVolDog = new JCheckBox("Dog Walking");
		sl_iVolunteer.putConstraint(SpringLayout.WEST, iVolDog, 0, SpringLayout.WEST, iVolunteer);
		sl_iVolunteer.putConstraint(SpringLayout.SOUTH, iVolDog, -22, SpringLayout.SOUTH, iVolunteer);
		iVolunteer.add(iVolDog);
		
		final JCheckBox iVolGro = new JCheckBox("Grocery Delivery");
		sl_iVolunteer.putConstraint(SpringLayout.SOUTH, iVolGro, -6, SpringLayout.NORTH, iVolDog);
		iVolunteer.add(iVolGro);
		
		final JCheckBox iVolMed = new JCheckBox("Medicine Delivery");
		sl_iVolunteer.putConstraint(SpringLayout.SOUTH, iVolMed, -6, SpringLayout.NORTH, iVolGro);
		iVolunteer.add(iVolMed);
		
		final JCheckBox iVolCall = new JCheckBox("Social Call");
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, iVolCall, 0, SpringLayout.NORTH, iVolGro);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, iVolCall, 24, SpringLayout.EAST, iVolGro);
		iVolunteer.add(iVolCall);
		
		final JCheckBox iVolVis = new JCheckBox("Social Check-Up");
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, iVolVis, 0, SpringLayout.NORTH, iVolMed);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, iVolVis, 0, SpringLayout.WEST, iVolCall);
		iVolunteer.add(iVolVis);
		
		final JFormattedTextField txtiVolName = new JFormattedTextField();
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, txtiVolName, 10, SpringLayout.NORTH, iVolunteer);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, txtiVolName, 5, SpringLayout.WEST, iVolunteer);
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 31, SpringLayout.SOUTH, txtiVolName);
		txtiVolName.setText("Name");
		iVolunteer.add(txtiVolName);
		
		final JFormattedTextField txtiVolSurname = new JFormattedTextField();
		sl_iVolunteer.putConstraint(SpringLayout.WEST, txtiVolSurname, 188, SpringLayout.WEST, iVolunteer);
		sl_iVolunteer.putConstraint(SpringLayout.EAST, txtiVolSurname, -87, SpringLayout.EAST, iVolunteer);
		sl_iVolunteer.putConstraint(SpringLayout.EAST, txtiVolName, -28, SpringLayout.WEST, txtiVolSurname);
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, txtiVolSurname, 10, SpringLayout.NORTH, iVolunteer);
		txtiVolSurname.setText("Surname");
		iVolunteer.add(txtiVolSurname);
		
		final JFormattedTextField txtiVolPhoneNumber = new JFormattedTextField();
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, txtiVolPhoneNumber, 6, SpringLayout.SOUTH, txtiVolName);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, txtiVolPhoneNumber, 5, SpringLayout.WEST, iVolunteer);
		sl_iVolunteer.putConstraint(SpringLayout.EAST, txtiVolPhoneNumber, -270, SpringLayout.EAST, iVolunteer);
		txtiVolPhoneNumber.setText("Phone Number");
		iVolunteer.add(txtiVolPhoneNumber);
		
		final JFormattedTextField txtiVolAva = new JFormattedTextField();
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, txtiVolAva, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, txtiVolAva, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_iVolunteer.putConstraint(SpringLayout.EAST, txtiVolAva, 0, SpringLayout.EAST, txtiVolSurname);
		txtiVolAva.setText("DAY/hhmm-hhmm; DAY/hhmm-hhmm; etc...");
		iVolunteer.add(txtiVolAva);
		
		JButton iVolButton = new JButton("Enter Data");
		sl_iVolunteer.putConstraint(SpringLayout.NORTH, iVolButton, -1, SpringLayout.NORTH, iVolDog);
		sl_iVolunteer.putConstraint(SpringLayout.WEST, iVolButton, 5, SpringLayout.WEST, iVolCall);
		iVolButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQL.iVol(txtiVolName.getText(), txtiVolSurname.getText(), txtiVolPhoneNumber.getText(), txtiVolAva.getText(),
						iVolGro.isSelected(), iVolMed.isSelected(), iVolDog.isSelected(),iVolVis.isSelected(), iVolCall.isSelected());
			}
		});
		iVolunteer.add(iVolButton);
		
		/*
		 * Log insert panel
		 */
		JPanel iLog = new JPanel();
		contentPane.add(iLog, "Log");
		SpringLayout sl_iLog = new SpringLayout();
		iLog.setLayout(sl_iLog);
		
		final Choice iLogAct = new Choice();
		sl_iLog.putConstraint(SpringLayout.NORTH, iLogAct, 33, SpringLayout.NORTH, iLog);
		iLogAct.add("Medicine Delivery");
		iLogAct.add("Grocery Delivery");
		iLogAct.add("Dog Walking");
		iLogAct.add("Social Check-Up");
		iLogAct.add("Social Call");
		iLog.add(iLogAct);
		
		JButton btnEnterData_2 = new JButton("Enter Data");
		sl_iLog.putConstraint(SpringLayout.WEST, btnEnterData_2, 5, SpringLayout.WEST, iLog);
		
		JLabel lblNewLabel_4 = new JLabel("Activity");
		sl_iLog.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 35, SpringLayout.NORTH, iLog);
		sl_iLog.putConstraint(SpringLayout.WEST, lblNewLabel_4, 188, SpringLayout.WEST, iLog);
		sl_iLog.putConstraint(SpringLayout.WEST, iLogAct, 6, SpringLayout.EAST, lblNewLabel_4);
		iLog.add(lblNewLabel_4);
		
		final JFormattedTextField txtiClID = new JFormattedTextField();
		sl_iLog.putConstraint(SpringLayout.NORTH, txtiClID, 10, SpringLayout.NORTH, iLog);
		sl_iLog.putConstraint(SpringLayout.WEST, txtiClID, 5, SpringLayout.WEST, iLog);
		sl_iLog.putConstraint(SpringLayout.EAST, txtiClID, -270, SpringLayout.EAST, iLog);
		txtiClID.setText("Client ID");
		iLog.add(txtiClID);
		
		final JFormattedTextField txtiV2ID = new JFormattedTextField();
		sl_iLog.putConstraint(SpringLayout.WEST, txtiV2ID, 5, SpringLayout.WEST, iLog);
		sl_iLog.putConstraint(SpringLayout.EAST, txtiV2ID, -28, SpringLayout.WEST, lblNewLabel_4);
		sl_iLog.putConstraint(SpringLayout.NORTH, btnEnterData_2, 31, SpringLayout.SOUTH, txtiV2ID);
		sl_iLog.putConstraint(SpringLayout.NORTH, txtiV2ID, 6, SpringLayout.SOUTH, txtiClID);
		txtiV2ID.setText("Volunteer 2 ID");
		iLog.add(txtiV2ID);
		
		final JFormattedTextField txtiDate = new JFormattedTextField();
		sl_iLog.putConstraint(SpringLayout.NORTH, txtiDate, 6, SpringLayout.SOUTH, txtiV2ID);
		sl_iLog.putConstraint(SpringLayout.WEST, txtiDate, 0, SpringLayout.WEST, btnEnterData_2);
		sl_iLog.putConstraint(SpringLayout.EAST, txtiDate, 0, SpringLayout.EAST, txtiClID);
		txtiDate.setText("Date YYYY-MM-DD");
		iLog.add(txtiDate);
		
		final JFormattedTextField txtiV1ID = new JFormattedTextField();
		sl_iLog.putConstraint(SpringLayout.WEST, txtiV1ID, 28, SpringLayout.EAST, txtiClID);
		sl_iLog.putConstraint(SpringLayout.SOUTH, txtiV1ID, -4, SpringLayout.NORTH, iLogAct);
		sl_iLog.putConstraint(SpringLayout.EAST, txtiV1ID, 183, SpringLayout.EAST, txtiClID);
		txtiV1ID.setText("Volunteer 1 ID");
		iLog.add(txtiV1ID);
		
		btnEnterData_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQL.iLog(Integer.parseInt(txtiClID.getText()), Integer.parseInt(txtiV1ID.getText()), txtiV2ID.getText(),
						iLogAct.getSelectedItem(), txtiDate.getText());
			}
		});
		iLog.add(btnEnterData_2);
		
		/*
		 * Client search panel
		 */
		final JPanel sClient = new JPanel();
		contentPane.add(sClient, "sClient");
		SpringLayout sl_sClient = new SpringLayout();
		sClient.setLayout(sl_sClient);
		
		final Choice choice = new Choice();
		choice.add("Name");
		choice.add("Surname");
		choice.add("Street");
		choice.add("Postcode");
		sClient.add(choice);
		
		JLabel lblNewLabel_3 = new JLabel("Search By");
		sl_sClient.putConstraint(SpringLayout.NORTH, choice, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_sClient.putConstraint(SpringLayout.WEST, choice, 0, SpringLayout.WEST, lblNewLabel_3);
		sl_sClient.putConstraint(SpringLayout.WEST, lblNewLabel_3, 5, SpringLayout.WEST, sClient);
		sl_sClient.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 10, SpringLayout.NORTH, sClient);
		sClient.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Search");
		sl_sClient.putConstraint(SpringLayout.WEST, btnNewButton, 5, SpringLayout.WEST, sClient);
		sl_sClient.putConstraint(SpringLayout.SOUTH, btnNewButton, -35, SpringLayout.SOUTH, sClient);
		
		final JFormattedTextField txtsCli = new JFormattedTextField("enter search terms");
		sl_sClient.putConstraint(SpringLayout.WEST, txtsCli, 5, SpringLayout.WEST, sClient);
		sl_sClient.putConstraint(SpringLayout.SOUTH, txtsCli, -6, SpringLayout.NORTH, btnNewButton);
		sl_sClient.putConstraint(SpringLayout.EAST, txtsCli, 210, SpringLayout.WEST, sClient);
		sClient.add(txtsCli);
		
		final JTextArea txtSCliRes = new JTextArea();
		txtSCliRes.setEditable(false);
		sl_sClient.putConstraint(SpringLayout.NORTH, txtSCliRes, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_sClient.putConstraint(SpringLayout.WEST, txtSCliRes, 6, SpringLayout.EAST, txtsCli);
		sl_sClient.putConstraint(SpringLayout.SOUTH, txtSCliRes, 226, SpringLayout.NORTH, sClient);
		sl_sClient.putConstraint(SpringLayout.EAST, txtSCliRes, -10, SpringLayout.EAST, sClient);
		sClient.add(txtSCliRes);
		
		final JScrollPane scrollCli = new JScrollPane (txtSCliRes, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sl_sClient.putConstraint(SpringLayout.NORTH, scrollCli, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_sClient.putConstraint(SpringLayout.WEST, scrollCli, 6, SpringLayout.EAST, txtsCli);
		sl_sClient.putConstraint(SpringLayout.SOUTH, scrollCli, 216, SpringLayout.NORTH, lblNewLabel_3);
		sl_sClient.putConstraint(SpringLayout.EAST, scrollCli, -10, SpringLayout.EAST, sClient);
		sClient.add(scrollCli);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = SQL.sClient(txtsCli.getText(), choice.getSelectedItem());
				txtSCliRes.setText(a);
				SwingUtilities.updateComponentTreeUI(sClient);
				SwingUtilities.updateComponentTreeUI(scrollCli);
				SwingUtilities.updateComponentTreeUI(txtSCliRes);
			}
		});
		sClient.add(btnNewButton);
		
		/*
		 * Volunteer search panel
		 */
		final JPanel sVolunteer = new JPanel();
		contentPane.add(sVolunteer, "sVolunteer");
		SpringLayout sl_sVolunteer = new SpringLayout();
		sVolunteer.setLayout(sl_sVolunteer);
		
		JLabel lblSortBy = new JLabel("Search By");
		sl_sVolunteer.putConstraint(SpringLayout.NORTH, lblSortBy, 10, SpringLayout.NORTH, sVolunteer);
		sl_sVolunteer.putConstraint(SpringLayout.WEST, lblSortBy, 5, SpringLayout.WEST, sVolunteer);
		sVolunteer.add(lblSortBy);
		
		final Choice choice_1 = new Choice();
		sl_sVolunteer.putConstraint(SpringLayout.NORTH, choice_1, 6, SpringLayout.SOUTH, lblSortBy);
		sl_sVolunteer.putConstraint(SpringLayout.WEST, choice_1, 0, SpringLayout.WEST, lblSortBy);
		choice_1.add("Name");
		choice_1.add("Surname");
		choice_1.add("Activity");
		sVolunteer.add(choice_1);

		JButton btnSearch = new JButton("Search");
		sl_sVolunteer.putConstraint(SpringLayout.SOUTH, btnSearch, -35, SpringLayout.SOUTH, sVolunteer);
		sl_sVolunteer.putConstraint(SpringLayout.WEST, btnSearch, 5, SpringLayout.WEST, sVolunteer);
		
		
		final JFormattedTextField txtsVol = new JFormattedTextField();
		sl_sVolunteer.putConstraint(SpringLayout.WEST, txtsVol, 5, SpringLayout.WEST, sVolunteer);
		sl_sVolunteer.putConstraint(SpringLayout.SOUTH, txtsVol, -6, SpringLayout.NORTH, btnSearch);
		sl_sVolunteer.putConstraint(SpringLayout.EAST, txtsVol, -220, SpringLayout.EAST, sVolunteer);
		txtsVol.setText("enter search terms");
		sVolunteer.add(txtsVol);
		
		final JTextArea txtResSVol = new JTextArea();
		sl_sVolunteer.putConstraint(SpringLayout.NORTH, txtResSVol, 10, SpringLayout.NORTH, sVolunteer);
		sl_sVolunteer.putConstraint(SpringLayout.WEST, txtResSVol, 0, SpringLayout.WEST, sVolunteer);
		sl_sVolunteer.putConstraint(SpringLayout.SOUTH, txtResSVol, -10, SpringLayout.SOUTH, sVolunteer);
		txtResSVol.setEditable(false);
		sVolunteer.add(txtResSVol);
		
		final JScrollPane scroll = new JScrollPane (txtResSVol, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sl_sVolunteer.putConstraint(SpringLayout.WEST, scroll, 6, SpringLayout.EAST, txtsVol);
		sl_sVolunteer.putConstraint(SpringLayout.NORTH, scroll, -1, SpringLayout.NORTH, lblSortBy);
		sl_sVolunteer.putConstraint(SpringLayout.SOUTH, scroll, 216, SpringLayout.NORTH, lblSortBy);
		sl_sVolunteer.putConstraint(SpringLayout.EAST, scroll, -10, SpringLayout.EAST, sVolunteer);
		sVolunteer.add(scroll);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = SQL.sVolunteer(txtsVol.getText(), choice_1.getSelectedItem());
				txtResSVol.setText(a);
				SwingUtilities.updateComponentTreeUI(sVolunteer);
				SwingUtilities.updateComponentTreeUI(scroll);
				SwingUtilities.updateComponentTreeUI(txtResSVol);
			}
		});
		sVolunteer.add(btnSearch);
		
		/*
		 * Activity display panel
		 */
		JPanel sActivity = new JPanel();
		contentPane.add(sActivity, "sActivity");
		SpringLayout sl_sActivity = new SpringLayout();
		sActivity.setLayout(sl_sActivity);
		
		JLabel lblActivities = new JLabel("Activities");
		sl_sActivity.putConstraint(SpringLayout.NORTH, lblActivities, 10, SpringLayout.NORTH, sActivity);
		sl_sActivity.putConstraint(SpringLayout.WEST, lblActivities, 5, SpringLayout.WEST, sActivity);
		sActivity.add(lblActivities);
		
		JTextArea txtrIdName = new JTextArea();
		txtrIdName.setText("ID: 1   Name: Medicine Delivery \nID: 2   Name: Grocery Delivery \nID: 3   Name: Dog Walking "
				+ "\nID: 4   Name: Social Check-Up \nID: 5   Name: Social Call");
		txtrIdName.setEditable(false);
		sl_sActivity.putConstraint(SpringLayout.NORTH, txtrIdName, 5, SpringLayout.SOUTH, lblActivities);
		sl_sActivity.putConstraint(SpringLayout.WEST, txtrIdName, 5, SpringLayout.WEST, sActivity);
		sl_sActivity.putConstraint(SpringLayout.SOUTH, txtrIdName, 201, SpringLayout.SOUTH, lblActivities);
		sl_sActivity.putConstraint(SpringLayout.EAST, txtrIdName, 420, SpringLayout.WEST, sActivity);
		sActivity.add(txtrIdName);
		
		/*
		 * Log entry search panel
		 */
		final JPanel sLog = new JPanel();
		contentPane.add(sLog, "sLog");
		SpringLayout sl_sLog = new SpringLayout();
		sLog.setLayout(sl_sLog);
		
		JLabel lblSearchBy = new JLabel("Search By");
		sl_sLog.putConstraint(SpringLayout.NORTH, lblSearchBy, 10, SpringLayout.NORTH, sLog);
		sl_sLog.putConstraint(SpringLayout.WEST, lblSearchBy, 5, SpringLayout.WEST, sLog);
		sLog.add(lblSearchBy);
		
		final Choice choice_2 = new Choice();
		sl_sLog.putConstraint(SpringLayout.NORTH, choice_2, 6, SpringLayout.SOUTH, lblSearchBy);
		sl_sLog.putConstraint(SpringLayout.WEST, choice_2, 0, SpringLayout.WEST, lblSearchBy);
		choice_2.add("Client ID");
		choice_2.add("Volunteer ID");
		choice_2.add("Activity");
		choice_2.add("Date (YYYY-MM-DD)");
		sLog.add(choice_2);
		
		JButton btnSearch_1 = new JButton("Search");
		sl_sLog.putConstraint(SpringLayout.WEST, btnSearch_1, 0, SpringLayout.WEST, lblSearchBy);
		sl_sLog.putConstraint(SpringLayout.SOUTH, btnSearch_1, -35, SpringLayout.SOUTH, sLog);
		
		final JFormattedTextField txtSLog = new JFormattedTextField();
		sl_sLog.putConstraint(SpringLayout.WEST, txtSLog, 5, SpringLayout.WEST, sLog);
		sl_sLog.putConstraint(SpringLayout.SOUTH, txtSLog, -6, SpringLayout.NORTH, btnSearch_1);
		sl_sLog.putConstraint(SpringLayout.EAST, txtSLog, 210, SpringLayout.WEST, sLog);
		txtSLog.setText("enter search terms");
		sLog.add(txtSLog);
		
		final JTextArea txtSLogRes = new JTextArea();
		txtSLogRes.setEditable(false);
		sl_sLog.putConstraint(SpringLayout.NORTH, txtSLogRes, 10, SpringLayout.NORTH, sLog);
		sl_sLog.putConstraint(SpringLayout.WEST, txtSLogRes, 6, SpringLayout.EAST, txtSLog);
		sl_sLog.putConstraint(SpringLayout.SOUTH, txtSLogRes, 226, SpringLayout.NORTH, sLog);
		sl_sLog.putConstraint(SpringLayout.EAST, txtSLogRes, -10, SpringLayout.EAST, sLog);
		sLog.add(txtSLogRes);
		
		final JScrollPane logScroll = new JScrollPane (txtSLogRes, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sl_sLog.putConstraint(SpringLayout.NORTH, logScroll, -1, SpringLayout.NORTH, lblSearchBy);
		sl_sLog.putConstraint(SpringLayout.WEST, logScroll, 6, SpringLayout.EAST, txtSLog);
		sl_sLog.putConstraint(SpringLayout.SOUTH, logScroll, 66, SpringLayout.SOUTH, txtSLog);
		sl_sLog.putConstraint(SpringLayout.EAST, logScroll, -10, SpringLayout.EAST, sLog);
		sLog.add(logScroll);
		
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = SQL.sLog(txtSLog.getText(), choice_2.getSelectedItem());
				txtSLogRes.setText(a);
				SwingUtilities.updateComponentTreeUI(sLog);
				SwingUtilities.updateComponentTreeUI(logScroll);
				SwingUtilities.updateComponentTreeUI(txtSLogRes);
			}
		});
		sLog.add(btnSearch_1);
		
		/*
		 * Update client panel
		 */
		JPanel uClient = new JPanel();
		contentPane.add(uClient, "uClient");
		SpringLayout sl_uClient = new SpringLayout();
		uClient.setLayout(sl_uClient);
		
		JLabel lblChange = new JLabel("Change");
		sl_uClient.putConstraint(SpringLayout.NORTH, lblChange, 38, SpringLayout.NORTH, uClient);
		sl_uClient.putConstraint(SpringLayout.WEST, lblChange, 5, SpringLayout.WEST, uClient);
		uClient.add(lblChange);
		
		final Choice choice_4 = new Choice();
		sl_uClient.putConstraint(SpringLayout.NORTH, choice_4, 35, SpringLayout.NORTH, uClient);
		sl_uClient.putConstraint(SpringLayout.WEST, choice_4, 6, SpringLayout.EAST, lblChange);
		choice_4.add("Name");
		choice_4.add("Surname");
		choice_4.add("Phone Number");
		choice_4.add("House Number");
		choice_4.add("Street");
		choice_4.add("Postcode");
		uClient.add(choice_4);
		
		final JFormattedTextField uClInfo = new JFormattedTextField();
		sl_uClient.putConstraint(SpringLayout.NORTH, uClInfo, 3, SpringLayout.SOUTH, choice_4);
		sl_uClient.putConstraint(SpringLayout.WEST, uClInfo, 5, SpringLayout.WEST, uClient);
		sl_uClient.putConstraint(SpringLayout.EAST, uClInfo, 185, SpringLayout.WEST, uClient);
		uClInfo.setText("enter new information here");
		uClient.add(uClInfo);
		
		final JFormattedTextField uClID = new JFormattedTextField();
		sl_uClient.putConstraint(SpringLayout.WEST, uClID, 5, SpringLayout.WEST, uClient);
		sl_uClient.putConstraint(SpringLayout.SOUTH, uClID, -6, SpringLayout.NORTH, choice_4);
		sl_uClient.putConstraint(SpringLayout.EAST, uClID, 0, SpringLayout.EAST, uClInfo);
		uClID.setText("Enter Client ID");
		uClient.add(uClID);
		
		
		final JCheckBox chckbxMedicineDelivery_1 = new JCheckBox("Medicine Delivery");
		sl_uClient.putConstraint(SpringLayout.NORTH, chckbxMedicineDelivery_1, 31, SpringLayout.SOUTH, choice_4);
		sl_uClient.putConstraint(SpringLayout.WEST, chckbxMedicineDelivery_1, 5, SpringLayout.WEST, uClient);
		uClient.add(chckbxMedicineDelivery_1);
		
		final JCheckBox chckbxGroceryDelivery_1 = new JCheckBox("Grocery Delivery");
		sl_uClient.putConstraint(SpringLayout.NORTH, chckbxGroceryDelivery_1, 6, SpringLayout.SOUTH, chckbxMedicineDelivery_1);
		sl_uClient.putConstraint(SpringLayout.WEST, chckbxGroceryDelivery_1, 5, SpringLayout.WEST, uClient);
		uClient.add(chckbxGroceryDelivery_1);
		
		final JCheckBox chckbxDogWalking_1 = new JCheckBox("Dog Walking");
		sl_uClient.putConstraint(SpringLayout.NORTH, chckbxDogWalking_1, 5, SpringLayout.SOUTH, chckbxGroceryDelivery_1);
		sl_uClient.putConstraint(SpringLayout.WEST, chckbxDogWalking_1, 5, SpringLayout.WEST, uClient);
		uClient.add(chckbxDogWalking_1);
		
		final JCheckBox chckbxSocialCheckup_1 = new JCheckBox("Social Check-Up");
		sl_uClient.putConstraint(SpringLayout.NORTH, chckbxSocialCheckup_1, 6, SpringLayout.SOUTH, chckbxDogWalking_1);
		sl_uClient.putConstraint(SpringLayout.WEST, chckbxSocialCheckup_1, 5, SpringLayout.WEST, uClient);
		uClient.add(chckbxSocialCheckup_1);
		
		final JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Social Call");
		sl_uClient.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_5, 6, SpringLayout.SOUTH, chckbxSocialCheckup_1);
		sl_uClient.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_5, 5, SpringLayout.WEST, uClient);
		uClient.add(chckbxNewCheckBox_5);
		
		JButton btnNewButton_1 = new JButton("Update");
		sl_uClient.putConstraint(SpringLayout.NORTH, btnNewButton_1, -5, SpringLayout.NORTH, lblChange);
		sl_uClient.putConstraint(SpringLayout.EAST, btnNewButton_1, -74, SpringLayout.EAST, uClient);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQL.uClient(Integer.parseInt(uClID.getText()), uClInfo.getText(), choice_4.getSelectedItem(),
						chckbxMedicineDelivery_1.isSelected(),chckbxGroceryDelivery_1.isSelected(),
						chckbxDogWalking_1.isSelected(), chckbxSocialCheckup_1.isSelected(),chckbxNewCheckBox_5.isSelected());
			}
		});
		uClient.add(btnNewButton_1);
		
		/*
		 * Update volunteer panel
		 */
		JPanel uVolunteer = new JPanel();
		contentPane.add(uVolunteer, "uVolunteer");
		SpringLayout sl_uVolunteer = new SpringLayout();
		uVolunteer.setLayout(sl_uVolunteer);
		
		JLabel lblChange_1 = new JLabel("Change");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, lblChange_1, 38, SpringLayout.NORTH, uVolunteer);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, lblChange_1, 5, SpringLayout.WEST, uVolunteer);
		uVolunteer.add(lblChange_1);
		
		final Choice choice_5 = new Choice();
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, choice_5, 35, SpringLayout.NORTH, uVolunteer);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, choice_5, 6, SpringLayout.EAST, lblChange_1);
		choice_5.add("Name");
		choice_5.add("Surname");
		choice_5.add("Phone Number");
		choice_5.add("Availability");
		uVolunteer.add(choice_5);
		
		final JCheckBox medBox = new JCheckBox("Medicine Delivery");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, medBox, 31, SpringLayout.SOUTH, choice_5);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, medBox, 5, SpringLayout.WEST, uVolunteer);
		uVolunteer.add(medBox);
		
		final JCheckBox groBox = new JCheckBox("Grocery Delivery");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, groBox, 6, SpringLayout.SOUTH, medBox);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, groBox, 5, SpringLayout.WEST, uVolunteer);
		uVolunteer.add(groBox);
		
		final JCheckBox dogBox = new JCheckBox("Dog Walking");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, dogBox, 5, SpringLayout.SOUTH, groBox);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, dogBox, 5, SpringLayout.WEST, uVolunteer);
		uVolunteer.add(dogBox);
		
		final JCheckBox visBox = new JCheckBox("Social Check-Up");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, visBox, 6, SpringLayout.SOUTH, dogBox);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, visBox, 5, SpringLayout.WEST, uVolunteer);
		uVolunteer.add(visBox);
		
		final JCheckBox callBox = new JCheckBox("Social Call");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, callBox, 6, SpringLayout.SOUTH, visBox);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, callBox, 5, SpringLayout.WEST, uVolunteer);
		uVolunteer.add(callBox);

		final JFormattedTextField uVolID = new JFormattedTextField();
		sl_uVolunteer.putConstraint(SpringLayout.WEST, uVolID, 5, SpringLayout.WEST, uVolunteer);
		sl_uVolunteer.putConstraint(SpringLayout.SOUTH, uVolID, -6, SpringLayout.NORTH, choice_5);
		sl_uVolunteer.putConstraint(SpringLayout.EAST, uVolID, -245, SpringLayout.EAST, uVolunteer);
		uVolID.setText("Enter Volunteer ID");
		uVolunteer.add(uVolID);
		
		final JFormattedTextField uVolInfo = new JFormattedTextField();
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, uVolInfo, 3, SpringLayout.SOUTH, choice_5);
		sl_uVolunteer.putConstraint(SpringLayout.WEST, uVolInfo, 5, SpringLayout.WEST, uVolunteer);
		sl_uVolunteer.putConstraint(SpringLayout.EAST, uVolInfo, 185, SpringLayout.WEST, uVolunteer);
		uVolInfo.setText("enter new information here");
		uVolunteer.add(uVolInfo);
		
		JButton btnUpdate = new JButton("Update");
		sl_uVolunteer.putConstraint(SpringLayout.NORTH, btnUpdate, -5, SpringLayout.NORTH, lblChange_1);
		sl_uVolunteer.putConstraint(SpringLayout.EAST, btnUpdate, -74, SpringLayout.EAST, uVolunteer);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQL.uVolunteer(Integer.parseInt(uVolID.getText()), uVolInfo.getText(), choice_5.getSelectedItem(),
						medBox.isSelected(), groBox.isSelected(), dogBox.isSelected(), visBox.isSelected(), callBox.isSelected());
			}
		});
		uVolunteer.add(btnUpdate);
		
		/*
		 * Panel for deleting entries
		 */
		JPanel delete = new JPanel();
		contentPane.add(delete, "panelDelete");
		SpringLayout sl_delete = new SpringLayout();
		delete.setLayout(sl_delete);
		
		final JFormattedTextField delInfo = new JFormattedTextField();
		sl_delete.putConstraint(SpringLayout.NORTH, delInfo, 31, SpringLayout.NORTH, delete);
		sl_delete.putConstraint(SpringLayout.WEST, delInfo, 5, SpringLayout.WEST, delete);
		sl_delete.putConstraint(SpringLayout.EAST, delInfo, -303, SpringLayout.EAST, delete);
		delInfo.setText("enter id");
		delete.add(delInfo);
		
		final Choice choice_3 = new Choice();
		sl_delete.putConstraint(SpringLayout.NORTH, choice_3, 5, SpringLayout.NORTH, delete);
		sl_delete.putConstraint(SpringLayout.WEST, choice_3, -1, SpringLayout.WEST, delInfo);
		sl_delete.putConstraint(SpringLayout.SOUTH, choice_3, -6, SpringLayout.NORTH, delInfo);
		choice_3.add("Delete Client");
		choice_3.add("Delete Volunteer");
		choice_3.add("Delete Log Entry");
		delete.add(choice_3);
		
		JButton btnDeleteEntry = new JButton("Delete Entry");
		sl_delete.putConstraint(SpringLayout.NORTH, btnDeleteEntry, 6, SpringLayout.SOUTH, delInfo);
		sl_delete.putConstraint(SpringLayout.WEST, btnDeleteEntry, 5, SpringLayout.WEST, delete);
		btnDeleteEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SQL.delete(delInfo.getText(), choice_3.getSelectedItem());
			}
		});
		delete.add(btnDeleteEntry);
		
		/*
		 * Menu bar items, needs to be at end to reference all panels
		 */
		JMenu insert = new JMenu("Insert Data");
		menuBar.add(insert);
		
		
		JMenuItem insertClient = new JMenuItem(new AbstractAction("Insert Client") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "iClient");
		    }
		});
		insert.add(insertClient);
		
		JMenuItem insertVolunteer = new JMenuItem(new AbstractAction("Insert Volunteer") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "iVolunteer");
		    }
		});
		insert.add(insertVolunteer);
		
		JMenuItem insertLog = new JMenuItem(new AbstractAction("Logbook Entry") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "Log");
		    }
		});
		insert.add(insertLog);
		
		JMenu select = new JMenu("Find Data");
		menuBar.add(select);
		
		JMenuItem selectClient = new JMenuItem(new AbstractAction("Find Client") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "sClient");
		    }
		});
		select.add(selectClient);
		
		JMenuItem selectVolunteer = new JMenuItem(new AbstractAction("Find Volunteer") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "sVolunteer");
		    }
		});
		select.add(selectVolunteer);
		
		JMenuItem selectActivity = new JMenuItem(new AbstractAction("Find Activity") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "sActivity");
		    }
		});
		selectActivity.setText("Show Activities");
		select.add(selectActivity);
		
		JMenuItem selectLog = new JMenuItem(new AbstractAction("Find Log Entry") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "sLog");
		    }
		});
		select.add(selectLog);
		
		JMenu update = new JMenu("Update Data");
		menuBar.add(update);
		
		JMenuItem updateClient = new JMenuItem(new AbstractAction("Update Client") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "uClient");
		    }
		});
		update.add(updateClient);
		
		JMenuItem updateVolunteer = new JMenuItem(new AbstractAction("Update Volunteer") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "uVolunteer");
		    }
		});
		update.add(updateVolunteer);
		
		JMenuItem deleteMenu = new JMenuItem(new AbstractAction("Delete Entry") {
			public void actionPerformed(ActionEvent e) {
				cl.show(contentPane, "panelDelete");
		    }
		});
		menuBar.add(deleteMenu);
	}
}
