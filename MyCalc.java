package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MyCalc extends JFrame {
	
    private String exp = "";
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc frame = new MyCalc();
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
	public MyCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("about");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAboutDiglog().setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setText("0");
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Status");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 10, 5));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "7";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "8";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "9";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "/";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("x");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "*";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "4";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "5";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "6";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "+";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "-";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "1";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("2");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "2";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("3");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "3";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("C");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = "";
				textField.setText("0");
			}
		});
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String postfix = Infix2Postfix.convert(exp);
				double value = Calc.eval(postfix);
				textField.setText(String.valueOf(value));
			}
		});
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "0";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_15);
		
		JButton button = new JButton("(");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + "(";
				textField.setText(exp);
			}
		});
		panel_2.add(button);
		
		JButton btnNewButton_16 = new JButton(")");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exp = exp + ")";
				textField.setText(exp);
			}
		});
		panel_2.add(btnNewButton_16);

	}

	public JTextField getTextField() {
		return textField;
	}
	public AboutDialog getAboutDialog() {
		return aboutDialog;
	}
}
