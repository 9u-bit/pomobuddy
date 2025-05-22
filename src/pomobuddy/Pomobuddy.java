package pomobuddy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Pomobuddy extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldHour;
	private JTextField textFieldMinute;
	private TimerPanel timerPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pomobuddy frame = new Pomobuddy();
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
	public Pomobuddy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 224, 254));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Circular timer panel
        timerPanel = new TimerPanel();
        timerPanel.setBackground(new Color(189, 224, 254));
        timerPanel.setBounds(120, 50, 200, 200);
        contentPane.add(timerPanel);
		
		JButton btnHourUp = new JButton("▲");
		btnHourUp.setForeground(new Color(255, 255, 255));
		btnHourUp.setBackground(new Color(162, 210, 255));
		btnHourUp.setBounds(71, 266, 51, 30);
		contentPane.add(btnHourUp);
		
		JButton btnHourDown = new JButton("▼");
		btnHourDown.setForeground(new Color(255, 255, 255));
		btnHourDown.setBackground(new Color(162, 210, 255));
		btnHourDown.setBounds(71, 298, 51, 30);
		contentPane.add(btnHourDown);
		
		JButton btnMinuteUp = new JButton("▲");
		btnMinuteUp.setForeground(new Color(255, 255, 255));
		btnMinuteUp.setBackground(new Color(162, 210, 255));
		btnMinuteUp.setBounds(321, 266, 51, 30);
		contentPane.add(btnMinuteUp);
		
		JButton btnMinuteDown = new JButton("▼");
		btnMinuteDown.setForeground(new Color(255, 255, 255));
		btnMinuteDown.setBackground(new Color(162, 210, 255));
		btnMinuteDown.setBounds(321, 298, 51, 30);
		contentPane.add(btnMinuteDown);
		
		textFieldHour = new JTextField("00");
		textFieldHour.setForeground(new Color(255, 255, 255));
		textFieldHour.setBackground(new Color(162, 210, 255));
		textFieldHour.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHour.setBounds(132, 266, 80, 62);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMinute = new JTextField("00");
		textFieldMinute.setForeground(new Color(255, 255, 255));
		textFieldMinute.setBackground(new Color(162, 210, 255));
		textFieldMinute.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMinute.setColumns(10);
		textFieldMinute.setBounds(229, 266, 80, 62);
		contentPane.add(textFieldMinute);
		
		JButton btnSetCount = new JButton("1x");
		btnSetCount.setForeground(new Color(255, 255, 255));
		btnSetCount.setBackground(new Color(162, 210, 255));
		btnSetCount.setBounds(71, 338, 51, 40);
		contentPane.add(btnSetCount);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBackground(new Color(255, 175, 204));
		btnStart.setBounds(132, 338, 240, 40);
		contentPane.add(btnStart);
		btnStart.addActionListener(e -> startTimer());

	}
	
	private void startTimer() {
        
    }

}
