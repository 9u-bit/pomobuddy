package pomobuddy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Circular timer panel
        timerPanel = new TimerPanel();
        timerPanel.setBounds(120, 50, 200, 200);
        contentPane.add(timerPanel);
		
		JButton btnHourUp = new JButton("▲");
		btnHourUp.setBounds(71, 266, 51, 30);
		contentPane.add(btnHourUp);
		
		JButton btnHourDown = new JButton("▼");
		btnHourDown.setBounds(71, 298, 51, 30);
		contentPane.add(btnHourDown);
		
		JButton btnMinuteUp = new JButton("▲");
		btnMinuteUp.setBounds(321, 266, 51, 30);
		contentPane.add(btnMinuteUp);
		
		JButton btnMinuteDown = new JButton("▼");
		btnMinuteDown.setBounds(321, 298, 51, 30);
		contentPane.add(btnMinuteDown);
		
		textFieldHour = new JTextField("00");
		textFieldHour.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHour.setBounds(132, 266, 80, 62);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMinute = new JTextField("00");
		textFieldMinute.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMinute.setColumns(10);
		textFieldMinute.setBounds(229, 266, 80, 62);
		contentPane.add(textFieldMinute);
		
		JButton btnSetCount = new JButton("1x");
		btnSetCount.setBounds(71, 338, 51, 40);
		contentPane.add(btnSetCount);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(132, 338, 240, 40);
		contentPane.add(btnStart);
		btnStart.addActionListener(e -> startTimer());

	}
	
	private void startTimer() {
        
    }

}
