import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class LRC_Board {

	private JFrame frame;
	
	private JLabel showDiceRollLabel;
	private JLabel southPlayer;
	private JLabel westPlayer;
	private JLabel eastPlayer;
	private JLabel northPlayer;
	private JLabel centerPotPlayer;
	Font font = new Font("Courier", Font.BOLD, 15);

	private String diceString = "";
	private String diceStringNoTab = "";
	int turn = 0;

	Player[] players = new Player[4];
	//players[0] = new Player();
	Pot centerPot = new Pot(0);
	Game LRCgame = new Game();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LRC_Board window = new LRC_Board();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LRC_Board() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton rollDiceButton = new JButton("ROLL DICE");
		rollDiceButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		
		rollDiceButton.setForeground(Color.BLUE);
		rollDiceButton.setBounds(244, 345, 127, 27);
		frame.getContentPane().add(rollDiceButton);
		
		showDiceRollLabel = new JLabel("", SwingConstants.CENTER);
		showDiceRollLabel.setBounds(244, 304, 117, 27);
		frame.getContentPane().add(showDiceRollLabel);
		
		southPlayer = new JLabel("3", SwingConstants.LEFT);
		southPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		southPlayer.setBounds(305, 256, 66, 27);
		frame.getContentPane().add(southPlayer);
		
		centerPotPlayer = new JLabel("0", SwingConstants.LEFT);
		centerPotPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		centerPotPlayer.setBounds(293, 103, 66, 141);
		frame.getContentPane().add(centerPotPlayer);
		
		westPlayer = new JLabel("3", SwingConstants.LEFT);
		westPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		westPlayer.setBounds(176, 165, 56, 27);
		frame.getContentPane().add(westPlayer);
		
		eastPlayer = new JLabel("3", SwingConstants.LEFT);
		eastPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		eastPlayer.setBounds(444, 171, 66, 27);
		frame.getContentPane().add(eastPlayer);
		
		northPlayer = new JLabel("3", SwingConstants.LEFT);
		northPlayer.setForeground(Color.BLACK);
		northPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		northPlayer.setBounds(305, 64, 66, 27);
		frame.getContentPane().add(northPlayer);
		
		JLabel westDollarSign = new JLabel("$");
		westDollarSign.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		westDollarSign.setHorizontalAlignment(SwingConstants.RIGHT);
		westDollarSign.setBounds(113, 165, 56, 27);
		frame.getContentPane().add(westDollarSign);
		
		JLabel northDollarSign = new JLabel("$");
		northDollarSign.setHorizontalAlignment(SwingConstants.RIGHT);
		northDollarSign.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		northDollarSign.setBounds(244, 64, 56, 27);
		frame.getContentPane().add(northDollarSign);
		
		JLabel southDollarSign = new JLabel("$");
		southDollarSign.setForeground(Color.RED);
		southDollarSign.setHorizontalAlignment(SwingConstants.RIGHT);
		southDollarSign.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		southDollarSign.setBounds(244, 256, 56, 27);
		frame.getContentPane().add(southDollarSign);
		
		JLabel eastDollarSign = new JLabel("$");
		eastDollarSign.setHorizontalAlignment(SwingConstants.RIGHT);
		eastDollarSign.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		eastDollarSign.setBounds(383, 171, 56, 27);
		frame.getContentPane().add(eastDollarSign);
		
		JLabel potDollarSign = new JLabel("$", SwingConstants.RIGHT);
		potDollarSign.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		potDollarSign.setBounds(227, 103, 66, 141);
		frame.getContentPane().add(potDollarSign);
		
		for(int i = 0; i < 4; ++i)
			players[i] = new Player();
		
		rollDiceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do {
					diceString = Dice.roll(3);
					showDiceRollLabel.setFont(font);
					showDiceRollLabel.setText(diceString);
					
				//System.out.print("turn = " + turn);
					
					
					diceStringNoTab  = diceString.replaceAll("\\s+","");
					System.out.println(diceStringNoTab);
					
					//South(you) roll
					if( diceStringNoTab.charAt(0) == 'L' && turn == 0 ) {
						players[0].moneyLeft--;
						players[1].moneyLeft++;
						southPlayer.setText(players[0].toString());
						westPlayer.setText(players[1].toString());
						southDollarSign.setForeground(Color.BLACK);
					}
					else if( diceStringNoTab.charAt(0) == 'R' && turn == 0 ) {
						players[0].moneyLeft--;
						players[3].moneyLeft++;
						southPlayer.setText(players[0].toString());
						eastPlayer.setText(players[3].toString());
						southDollarSign.setForeground(Color.BLACK);
					} else if( diceStringNoTab.charAt(0) == 'C' && turn == 0 ) {
						players[0].moneyLeft--;
						centerPot.moneyInPot++;
						southPlayer.setText(players[0].toString());
						centerPotPlayer.setText(centerPot.toString());
						southDollarSign.setForeground(Color.BLACK);
					} else
						southDollarSign.setForeground(Color.BLACK);

					
					//West roll
					if( diceStringNoTab.charAt(0) == 'L' && turn == 1 ) {
						players[1].moneyLeft--;
						players[2].moneyLeft++;
						westPlayer.setText(players[1].toString());
						northPlayer.setText(players[2].toString());
						westDollarSign.setForeground(Color.BLACK);
					}
					else if( diceStringNoTab.charAt(0) == 'R' && turn == 1 ) {
						players[1].moneyLeft--;
						players[0].moneyLeft++;
						westPlayer.setText(players[1].toString());
						southPlayer.setText(players[0].toString());
						westDollarSign.setForeground(Color.BLACK);
					} else if( diceStringNoTab.charAt(0) == 'C' && turn == 1 ) {
						players[1].moneyLeft--;
						centerPot.moneyInPot++;
						westPlayer.setText(players[1].toString());
						centerPotPlayer.setText(centerPot.toString());
						westDollarSign.setForeground(Color.BLACK);
					} else
						westDollarSign.setForeground(Color.BLACK);

					
					//North roll
					if( diceStringNoTab.charAt(0) == 'L' && turn == 2 ) {
						players[2].moneyLeft--;
						players[3].moneyLeft++;
						northPlayer.setText(players[2].toString());
						eastPlayer.setText(players[3].toString());
						northDollarSign.setForeground(Color.BLACK);
					}
					else if( diceStringNoTab.charAt(0) == 'R' && turn == 2 ) {
						players[2].moneyLeft--;
						players[1].moneyLeft++;
						northPlayer.setText(players[2].toString());
						westPlayer.setText(players[1].toString());
						northDollarSign.setForeground(Color.BLACK);
					} else if( diceStringNoTab.charAt(0) == 'C' && turn == 2 ) {
						players[2].moneyLeft--;
						centerPot.moneyInPot++;
						northPlayer.setText(players[2].toString());
						centerPotPlayer.setText(centerPot.toString());
						northDollarSign.setForeground(Color.BLACK);
					} else
						northDollarSign.setForeground(Color.BLACK);
					
					//East turn
					if( diceStringNoTab.charAt(0) == 'L' && turn == 3 ) {
						players[3].moneyLeft--;
						players[0].moneyLeft++;
						eastPlayer.setText(players[3].toString());
						southPlayer.setText(players[0].toString());
						eastDollarSign.setForeground(Color.BLACK);
					}
					else if( diceStringNoTab.charAt(0) == 'R' && turn == 3 ) {
						players[3].moneyLeft--;
						players[2].moneyLeft++;
						eastPlayer.setText(players[3].toString());
						northPlayer.setText(players[2].toString());
						eastDollarSign.setForeground(Color.BLACK);
					} else if( diceStringNoTab.charAt(0) == 'C' && turn == 3 ) {
						players[3].moneyLeft--;
						centerPot.moneyInPot++;
						eastPlayer.setText(players[3].toString());
						centerPotPlayer.setText(centerPot.toString());
						eastDollarSign.setForeground(Color.BLACK);
					} else
						eastDollarSign.setForeground(Color.BLACK);
					
					if(turn >= 3)
						turn = 0;
					else
						turn++;
					
					if(turn == 0)
						southDollarSign.setForeground(Color.RED);
					else if(turn == 1)
						westDollarSign.setForeground(Color.RED);
					else if(turn == 2)
						northDollarSign.setForeground(Color.RED);
					else if(turn == 3)
						eastDollarSign.setForeground(Color.RED);
					
				}while(Game.checkGameWon(players));
			}
		});
		
	}
}
