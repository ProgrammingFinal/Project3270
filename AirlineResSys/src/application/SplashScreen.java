package application;

	import java.awt.*;
	import javax.swing.*;
	// welcome screen 
	public class SplashScreen implements Runnable {
		JFrame frame;
		JLabel label1, label2, label3;
		Thread thread;
		LogIn loggedIn;
		ImageIcon splash;
		SplashScreen() {
			
			thread = new Thread(this);
			frame = new JFrame("Welcome Screen");
			frame.getContentPane().setLayout(null);
			frame.getContentPane().setBackground(Color.BLACK);
			label1 = new JLabel("Shuguang Hong Airline Reservation System");
			label1.setBounds(200, 300, 900, 50);
			label1.setFont(new Font("Courier new", Font.BOLD,36));
			label1.setForeground(Color.BLUE);
			label2 = new JLabel("By Ashley McGinn, Ben Brasch, and Koi Riley");
			label2.setFont(new Font("Courier new", Font.BOLD,28));
			label2.setBounds(260, 380, 800, 40);
			label2.setForeground(Color.BLUE);
			label3 = new JLabel(splash);
			label3.setBounds(0, 0, 1300, 1000);
			frame.getContentPane().add(label1);
			frame.getContentPane().add(label2);
			frame.getContentPane().add(label3);
			frame.setSize(1300, 1000);
			frame.setVisible(true);
			thread.start();
		}
		public void run(){
			int x = 1;
			while(x <= 5) {
				try {
					Thread.sleep(1000);
					
				} catch(Exception e){}
				x++;
			}
			frame.setVisible(false);
			loggedIn = new LogIn();
		}
	}

