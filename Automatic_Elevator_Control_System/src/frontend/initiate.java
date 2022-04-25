
package frontend;

import java.awt.Color;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import classes.controller;
import classes.direction;
import classes.door;
import classes.emergencycall;
import classes.report_generate;
import classes.user_input;

public class initiate extends javax.swing.JFrame {

	controller elevator = new controller();
	ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

	/**
	 * Creates new form Initiate
	 */
	public initiate() {
		initComponents();
		inputPersons.setVisible(false);
		executor.scheduleAtFixedRate(ElevatorUpdated, 0, 500, TimeUnit.MILLISECONDS);
		setVisible(true);
		setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

		inputPersons.setBounds(800, 300, 557, 330);
		validateEmId.setVisible(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		inputPersons = new javax.swing.JDialog();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		exitingInput = new javax.swing.JComboBox<>();
		done = new javax.swing.JButton();
		enteringInput = new javax.swing.JComboBox<>();
		enterEmId = new javax.swing.JDialog();
		jPanel4 = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		emIdInput = new javax.swing.JTextField();
		validateEmId = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		peopleLabel = new javax.swing.JLabel();
		floorLabel = new javax.swing.JLabel();
		weightLabel = new javax.swing.JLabel();
		doorLabel = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		people = new javax.swing.JTextField();
		weight = new javax.swing.JTextField();
		doorStatus = new javax.swing.JTextField();
		floor = new javax.swing.JTextField();
		entering = new javax.swing.JLabel();
		overload = new javax.swing.JLabel();
		exiting = new javax.swing.JLabel();
		moving = new javax.swing.JLabel();
		generate = new javax.swing.JButton();
		elevatorDown = new javax.swing.JLabel();
		elevatorUp = new javax.swing.JLabel();
		powerCut = new javax.swing.JToggleButton();
		generateEmergency = new javax.swing.JButton();
		Emergency = new javax.swing.JLabel();

		inputPersons.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		inputPersons.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				inputPersonsWindowClosed(evt);
			}
		});

		jPanel3.setBackground(new java.awt.Color(45, 64, 89));

		jLabel3.setBackground(new java.awt.Color(238, 238, 238));
		jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(238, 238, 238));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("Enter Persons Entering / Leaving");

		jLabel5.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(235, 235, 234));
		jLabel5.setText("Entering ");

		jLabel6.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(238, 238, 238));
		jLabel6.setText("Exiting");

		exitingInput.setBackground(new java.awt.Color(238, 238, 238));
		exitingInput.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		exitingInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
		exitingInput.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				exitingInputFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				exitingInputFocusLost(evt);
			}
		});

		done.setBackground(new java.awt.Color(45, 64, 89));
		done.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		done.setForeground(new java.awt.Color(238, 238, 238));
		done.setText("Done");
		done.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				doneActionPerformed(evt);
			}
		});

		enteringInput.setBackground(new java.awt.Color(238, 238, 238));
		enteringInput.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		enteringInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
		enteringInput.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				enteringInputFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				enteringInputFocusLost(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(50, 50, 50).addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(212, 212, 212).addComponent(exitingInput, 0, 159, Short.MAX_VALUE))
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(212, 212, 212)
								.addComponent(enteringInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGap(36, 36, 36))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(done,
								javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(232, 232, 232)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(21, 21, 21)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(enteringInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(27, 27, 27)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(exitingInput,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
						.addComponent(done).addGap(28, 28, 28)));

		javax.swing.GroupLayout inputPersonsLayout = new javax.swing.GroupLayout(inputPersons.getContentPane());
		inputPersons.getContentPane().setLayout(inputPersonsLayout);
		inputPersonsLayout.setHorizontalGroup(inputPersonsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 557, Short.MAX_VALUE)
				.addGroup(inputPersonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(inputPersonsLayout.createSequentialGroup()
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));
		inputPersonsLayout.setVerticalGroup(inputPersonsLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 301, Short.MAX_VALUE)
				.addGroup(inputPersonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(inputPersonsLayout.createSequentialGroup()
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))));

		jPanel4.setBackground(new java.awt.Color(45, 64, 89));

		jLabel7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(238, 238, 238));
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Validate Emergency, Enter your ID:");

		validateEmId.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
		validateEmId.setForeground(new java.awt.Color(238, 238, 238));
		validateEmId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		validateEmId.setText("Not Valid !");

		jButton1.setBackground(new java.awt.Color(238, 238, 238));
		jButton1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
		jButton1.setText("OK");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(validateEmId, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel4Layout.createSequentialGroup().addGap(0, 91, Short.MAX_VALUE)
										.addComponent(emIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(93, 93, 93))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(158, 158, 158)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(jLabel7)
						.addGap(30, 30, 30)
						.addComponent(emIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37).addComponent(validateEmId)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
						.addComponent(jButton1).addGap(27, 27, 27)));

		javax.swing.GroupLayout enterEmIdLayout = new javax.swing.GroupLayout(enterEmId.getContentPane());
		enterEmId.getContentPane().setLayout(enterEmIdLayout);
		enterEmIdLayout.setHorizontalGroup(
				enterEmIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel4,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		enterEmIdLayout.setVerticalGroup(
				enterEmIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel4,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(694, 704));
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				try {
					formWindowClosed(evt);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jPanel1.setBackground(new java.awt.Color(240, 123, 63));

		jPanel2.setBackground(new java.awt.Color(45, 64, 89));
		jPanel2.setForeground(new java.awt.Color(238, 238, 238));
		jPanel2.setPreferredSize(new java.awt.Dimension(536, 194));

		jLabel1.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(238, 238, 238));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Initiated");

		jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(238, 238, 238));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("The Automatic Elevator has been initiated");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(27, 27, 27)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addGap(43, 43, 43)));

		peopleLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		peopleLabel.setText("Number of Persons");

		floorLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		floorLabel.setText("Floor Number");

		weightLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		weightLabel.setText("Weight");

		doorLabel.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		doorLabel.setText("Door Status");

		jLabel4.setBackground(new java.awt.Color(234, 84, 85));
		jLabel4.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText(" Overall Status ");
		jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		people.setEditable(false);
		people.setBackground(new java.awt.Color(247, 251, 252));
		people.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		people.setText("0");

		weight.setEditable(false);
		weight.setBackground(new java.awt.Color(247, 251, 252));
		weight.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		weight.setText("0");

		doorStatus.setEditable(false);
		doorStatus.setBackground(new java.awt.Color(247, 251, 252));
		doorStatus.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		doorStatus.setText("Closed");

		floor.setEditable(false);
		floor.setBackground(new java.awt.Color(247, 251, 252));
		floor.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		floor.setText("0");

		entering.setBackground(new java.awt.Color(184, 222, 111));
		entering.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		entering.setForeground(new java.awt.Color(255, 248, 205));
		entering.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		entering.setText("People Entering");
		entering.setEnabled(false);

		overload.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
		overload.setForeground(new java.awt.Color(255, 255, 0));
		overload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		overload.setText("Overload");
		overload.setEnabled(false);

		exiting.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		exiting.setForeground(new java.awt.Color(255, 248, 205));
		exiting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		exiting.setText("People Exiting");
		exiting.setEnabled(false);

		moving.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
		moving.setForeground(new java.awt.Color(255, 248, 205));
		moving.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		moving.setText("Lift Moving");
		moving.setEnabled(false);

		generate.setBackground(new java.awt.Color(45, 64, 89));
		generate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		generate.setForeground(new java.awt.Color(238, 238, 238));
		generate.setText("Generate Floor Request");
		generate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generateActionPerformed(evt);
			}
		});

		elevatorDown.setEnabled(false);

		elevatorUp.setForeground(new java.awt.Color(248, 248, 248));
		elevatorUp.setEnabled(false);

		powerCut.setBackground(new java.awt.Color(102, 255, 0));
		powerCut.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		powerCut.setForeground(new java.awt.Color(0, 0, 153));
		powerCut.setText("Power Cut");
		powerCut.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				powerCutActionPerformed(evt);
			}
		});

		generateEmergency.setBackground(new java.awt.Color(45, 64, 89));
		generateEmergency.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
		generateEmergency.setForeground(new java.awt.Color(238, 238, 238));
		generateEmergency.setText("Emergency Floor Request");
		generateEmergency.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generateEmergencyActionPerformed(evt);
			}
		});

		Emergency.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
		Emergency.setForeground(new java.awt.Color(255, 255, 0));
		Emergency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		Emergency.setText("Emergency");
		Emergency.setEnabled(false);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addGap(288, 288, 288)
								.addComponent(exiting, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(287, 287, 287))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(250, 250, 250)
						.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
						.addGap(254, 254, 254))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(41, 41, 41).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(weightLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(121, 121, 121))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(entering, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(120, 120, 120))
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(27, 27, 27)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(generateEmergency, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(peopleLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(69, 69, 69)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(weight, javax.swing.GroupLayout.DEFAULT_SIZE, 104,
														Short.MAX_VALUE)
												.addComponent(people)).addGap(31, 31, 31)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(doorLabel,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGap(18, 18, 18))
														.addComponent(floorLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(20, 20, 20)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(floor,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 60,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(jPanel1Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(elevatorUp,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				31,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(elevatorDown,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				31,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addComponent(doorStatus,
																javax.swing.GroupLayout.PREFERRED_SIZE, 94,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(274, 274, 274)
												.addComponent(moving, javax.swing.GroupLayout.DEFAULT_SIZE, 156,
														Short.MAX_VALUE)))
										.addGap(31, 31, 31))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup().addComponent(powerCut).addGap(128, 128,
												128))))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(146, 146, 146)
						.addComponent(overload, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(114, 114, 114)
						.addComponent(Emergency, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(34, 34, 34)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(peopleLabel)
														.addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE,
																31, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(doorLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(
																doorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(weightLabel)
																.addComponent(weight,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 31,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(elevatorUp)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(elevatorDown)))
												.addGap(65, 65, 65))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(53, 53, 53)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(floorLabel).addComponent(floor,
																javax.swing.GroupLayout.PREFERRED_SIZE, 31,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(66, 66, 66)))
								.addComponent(jLabel4).addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(entering).addComponent(exiting).addComponent(moving))
												.addGap(18, 18, 18)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(overload).addComponent(Emergency))
												.addGap(18, 18, 18).addComponent(generate).addGap(18, 18, 18)
												.addComponent(generateEmergency).addGap(29, 29, 29))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createSequentialGroup().addComponent(powerCut).addGap(64, 64, 64)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jPanel1,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void doneActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		setData();
		inputPersons.dispose();
		if (!overloaded) {
			updatePeople = true;
			elevator.incoming(false);
		}
	}

	private void inputPersonsWindowClosed(java.awt.event.WindowEvent evt) {
		// TODO add your handling code here:
		if (!overloaded) {
			elevator.incoming(false);
		}
		updatePeople = true;
	}

	private void enteringInputFocusGained(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
		entering.setEnabled(true);
	}

	private void enteringInputFocusLost(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
		entering.setEnabled(false);
	}

	private void exitingInputFocusGained(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
		exiting.setEnabled(true);
	}

	private void exitingInputFocusLost(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
		exiting.setEnabled(false);
	}

	private void formWindowClosed(java.awt.event.WindowEvent evt) throws Throwable {
		// TODO add your handling code here:
		elevator.finalize();
		inputPersons.dispose();
	}

	private void generateActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		elevator.get_newfloor();
	}

	private void powerCutActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (powerCut.isSelected()) {
			generate.setEnabled(false);
			powerCut.setBackground(Color.RED);
			generateEmergency.setEnabled(false);
			elevator.cut_emergency();
			elevator.incoming(true);
			elevatorUp.setEnabled(false);
			elevatorDown.setEnabled(false);

//			log log1 = new log();

			emergencycall email = new emergencycall();
			email.run();
		} else {
			elevator.incoming(false);
			powerCut.setBackground(new Color(102, 255, 0));
			generate.setEnabled(true);
			generateEmergency.setEnabled(true);

			log log2 = new log();
		}

	}

	private void generateEmergencyActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		enterEmId.setVisible(true);
		enterEmId.setBounds(800, 300, 391, 261);
		emIdInput.setText("");
//        if(validEmId)
//        {
//            elevator.getNewEmergencyFloor();
//        }
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String id = emIdInput.getText();
		validEmId = false;
		List<String> ids = elevator.get_sos();
		for (int i = 0; i < ids.size(); i++) {
			if (id.compareTo(ids.get(i)) == 0) {
				validEmId = true;
				break;
			}
		}
		if (validEmId) {
			validateEmId.setVisible(false);
			elevator.get_sos_floor();
			emIdInput.setText("");
			enterEmId.dispose();
		} else {
			validateEmId.setVisible(true);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(initiate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new initiate().setVisible(true);
			}
		});
	}

	public void setData() {
		maxWeight = elevator.get_weight();

		DecimalFormat df = new DecimalFormat("#.##");
		String e1 = (String) enteringInput.getSelectedItem();
		int ent = Integer.parseInt(e1);
		String e2 = (String) exitingInput.getSelectedItem();
		int ext = Integer.parseInt(e2);
		user_input newPassengers = new user_input(ent, ext, elevator.need_help(), elevator.get_floor_count());

		Set<Integer> floors = newPassengers.floor_list();
		List<Double> weights = newPassengers.weight_list();
		floors.forEach(fl -> {
			elevator.add_dest(fl);
		});

		Double totalWeight = 0.0;
		for (int i = 0; i < weights.size(); i++) {
			totalWeight += weights.get(i);
		}

		totalWeight = Double.parseDouble(df.format(totalWeight));

		elevator.weight_input(totalWeight);

		elevator.person_count_check(ent, ext);

		if (totalWeight > maxWeight) {
			overload.setEnabled(true);
			overloaded = true;
		} else {
			overload.setEnabled(false);
			overloaded = false;
		}
		report_generate log = new report_generate(elevator.current_floor(), ent, ext, totalWeight, elevator.need_help(),
				false);
	}

	public void setValuesComboBox() {
		enteringInput.removeAllItems();
		exitingInput.removeAllItems();
		int entppl = controller.get_person() - elevator.person_count();
		int extppl = elevator.person_count();
		for (int i = 0; i <= entppl; i++) {
			enteringInput.addItem(String.valueOf(i));
		}
		for (int i = 0; i <= extppl; i++) {
			exitingInput.addItem(String.valueOf(i));
		}
	}

	Runnable ElevatorUpdated = new Runnable() {
		@Override
		public void run() {
			// Receiving Values from elevator object
			int elPeople = elevator.person_count();
			Double elWeight = elevator.get_weight();
			door elDoor = elevator.door_check();
			String currentFloor = String.valueOf(elevator.current_floor());
			direction dr = elevator.get_Direction();
			boolean changing = elevator.get_coming();

			// Set the values in GUI
			people.setText(String.valueOf(elPeople));
			weight.setText(String.valueOf(elWeight));
			doorStatus.setText(String.valueOf(elDoor));
			floor.setText(currentFloor);
			if (elevator.sos == true) {
				Emergency.setEnabled(true);
			} else if (elevator.sos == false) {
				Emergency.setEnabled(false);
			}
			if (dr == direction.UP) {
				elevatorUp.setEnabled(true);
				elevatorDown.setEnabled(false);
				moving.setEnabled(true);
			} else if (dr == direction.DOWN) {
				elevatorUp.setEnabled(false);
				elevatorDown.setEnabled(true);
				moving.setEnabled(true);
			} else {
				elevatorUp.setEnabled(false);
				elevatorDown.setEnabled(false);
				moving.setEnabled(false);
			}
			if (changing) {
				moving.setEnabled(false);
				doorStatus.setText("Open");
			} else {
				doorStatus.setText("Closed");
			}

			if (changing & !powerCut.isSelected()) {
				inputPersons.setVisible(true);
//                 if(elevator.getupDestinationSize()==0 && elevator.getdownDestinationSize()==0)
//                     elevator.emergency=false;
				if (updatePeople) {
					setValuesComboBox();
					updatePeople = false;
				}
			}
			if (overloaded) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	};

	boolean updatePeople = true;
	boolean overloaded = false;
	Double maxWeight;

	boolean validEmId = false;
	// Variables declaration - do not modify
	private javax.swing.JLabel Emergency;
	private javax.swing.JButton done;
	private javax.swing.JLabel doorLabel;
	private javax.swing.JTextField doorStatus;
	private javax.swing.JLabel elevatorDown;
	private javax.swing.JLabel elevatorUp;
	private javax.swing.JTextField emIdInput;
	private javax.swing.JDialog enterEmId;
	private javax.swing.JLabel entering;
	private javax.swing.JComboBox<String> enteringInput;
	private javax.swing.JLabel exiting;
	private javax.swing.JComboBox<String> exitingInput;
	private javax.swing.JTextField floor;
	private javax.swing.JLabel floorLabel;
	private javax.swing.JButton generate;
	private javax.swing.JButton generateEmergency;
	private javax.swing.JDialog inputPersons;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JLabel moving;
	private javax.swing.JLabel overload;
	private javax.swing.JTextField people;
	private javax.swing.JLabel peopleLabel;
	private javax.swing.JToggleButton powerCut;
	private javax.swing.JLabel validateEmId;
	private javax.swing.JTextField weight;
	private javax.swing.JLabel weightLabel;
	// End of variables declaration
}
