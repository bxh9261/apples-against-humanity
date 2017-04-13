package apples2017;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class GameView extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private JButton card1;
	private JButton card2;
	private JButton card3;
	private JButton card4;
	private JButton card5;
	private JButton card6;
	private JButton card7;
	private JButton greenCard;
	private JButton confirmer;
	private JButton pickedCard;
	private JButton settingsButton;
	private JLabel cpu1Name;
	private JLabel cpu2Name;
	private JLabel cpu3Name;
	private JLabel cpu4Name;
	private JLabel cpu5Name;
	private JLabel cpu6Name;
	private JLabel cpu7Name;
	private JLabel cpu8Name;
	private JLabel cpu9Name;
	private JLabel humanName;
	private JLabel humanWins;
	private JLabel cpu1Wins;
	private JLabel cpu2Wins;
	private JButton replay;
	private JLabel winnerName;
	private JLabel cpu3Wins;
	private JLabel cpu4Wins;
	private JLabel cpu5Wins;
	private JLabel cpu6Wins;
	private JLabel cpu7Wins;
	private JLabel cpu8Wins;
	private JLabel cpu9Wins;
	private JLabel greenC;
	private JLabel yourC;
	private ArrayList<CardPack> cardpks;
	private boolean cardConfirmed;
	private JButton tempCard;
	private ArrayList<JLabel> winPanels;
	private ArrayList<JButton> cards;
	private int[] wins;
	private int randyWin;
	private JLabel winsLabb;
	private ArrayList<String> players;
	private SettingsWindow set;
	public static GameView inst;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				inst = new GameView();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	/**
	 * creates a new GameView window. It first creates a new 
	 * JFrame window, then creates a default SettingsWindow,
	 * then adds packs of cards based on what were chosen from
	 * the (currently default) SettingsWindow, then creates
	 * all the fancy schmancy gizmos on the GUI, then makes 
	 * the leaderboard with the (also currently default) list 
	 * of player names
	 */
	public GameView() {
		super();
		set = new SettingsWindow();
		set.setVisible(true);
		makeCards();
		initGUI();
		makePlayers();
	}
	
	/**
	 * Creates individual buttons for the cards, all the text
	 * boxes and words of the GUI, and initialises some 
	 * variables
	 */
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			//START >>  settingsButton
			settingsButton = new JButton();
			getContentPane().add(settingsButton);
			settingsButton.setText("Settings");
			settingsButton.setBounds(27, 9, 134, 34);
			settingsButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					settingsButtonActionPerformed(evt);
				}
			});
			//END <<  settingsButton
			//START >>  winnerName
			winnerName = new JLabel();
			getContentPane().add(winnerName);
			winnerName.setBounds(1126, 69, 259, 36);
			//END <<  winnerName
			//START >>  winsLabb
			winsLabb = new JLabel();
			getContentPane().add(winsLabb);
			winsLabb.setBounds(1126, 108, 229, 36);
			//END <<  winsLabb
			//START >>  greenC
			greenC = new JLabel();
			getContentPane().add(greenC);
			greenC.setText("Green Card:");
			greenC.setFont(new Font("Arial", Font.PLAIN, 30));
			greenC.setBounds(525, 12, 168, 32);
			//END <<  greenC
			//START >>  yourC
			yourC = new JLabel();
			getContentPane().add(yourC);
			yourC.setText("Your Card:");
			yourC.setFont(new Font("Arial",Font.PLAIN,30));
			yourC.setBounds(735, 12, 168, 32);
			//END <<  yourC
			//START >> greenCard
			greenCard = new JButton();
			getContentPane().add(greenCard);
			int randyG = 0;
			greenCard.setText("<html>" + cardpks.get(randyG).getAGreenCard().replaceAll("\\n", "<br>") + "</html>");
			greenCard.setFont(new Font("Arial",Font.PLAIN,16));
			greenCard.setBounds(508, 50, 196, 300);
			greenCard.setBackground(Color.GREEN);
			//END << greenCard
			//START >> pickedCard
			pickedCard = new JButton();
			pickedCard.setText("");
			pickedCard.setBounds(710, 50, 196, 300);
			pickedCard.setBackground(Color.PINK);
			//END << pickedCard
			//START >>  confirmer
			confirmer = new JButton();;
			confirmer.setText("Confirm");
			confirmer.setBounds(710, 357, 196, 23);
			confirmer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					confirmerActionPerformed(evt);
				}
			});
			//END <<  confirmer
			//START >>  card1
			card1 = new JButton();
			getContentPane().add(card1);
			int randy1 = (int) (Math.random()*(cardpks.size()));
			card1.setText("<html>" + (cardpks.get(randy1).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			card1.setBounds(6, 400, 196, 300);
			card1.setBackground(Color.PINK);
			card1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card1);
				}
			});
			//END <<  card1
			//START >>  card2
			card2 = new JButton();
			getContentPane().add(card2);
			do{
				int randy2 = (int) (Math.random()*(cardpks.size()));
				card2.setText("<html>" + (cardpks.get(randy2).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			}while(card2.getText().equals(card1.getText()));
			card2.setBounds(208, 400, 196, 300);
			card2.setBackground(Color.PINK);
			card2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card2);
				}
			});
			//END <<  card2
			//START >>  card3
			card3 = new JButton();
			getContentPane().add(card3);
			do{
				int randy3 = (int) (Math.random()*(cardpks.size()));
				card3.setText("<html>" + (cardpks.get(randy3).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			}while(card3.getText().equals(card1.getText()) || 
				   card3.getText().equals(card2.getText()));
			card3.setBounds(410, 400, 196, 300);
			card3.setBackground(Color.PINK);
			card3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card3);
				}
			});
			//END <<  card3
			//START >>  card4
			card4 = new JButton();
			getContentPane().add(card4);
			do{
				int randy4 = (int) (Math.random()*(cardpks.size()-1));
				card4.setText("<html>" + (cardpks.get(randy4).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			}while(card4.getText().equals(card1.getText()) || 
				   card4.getText().equals(card2.getText()) ||
				   card4.getText().equals(card3.getText()));
			card4.setBounds(612, 400, 196, 300);
			card4.setBackground(Color.PINK);
			card4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card4);
				}
			});
			//END <<  card4
			//START >>  card5
			card5 = new JButton();
			getContentPane().add(card5);
			do{
				int randy5 = (int) (Math.random()*(cardpks.size()-1));
				card5.setText("<html>" + (cardpks.get(randy5).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			}while(card5.getText().equals(card1.getText()) || 
				   card5.getText().equals(card2.getText()) ||
				   card5.getText().equals(card3.getText()) ||
				   card5.getText().equals(card4.getText()));
			card5.setBounds(814, 400, 196, 300);
			card5.setBackground(Color.PINK);
			card5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card5);
				}
			});
			//END <<  card5
			//START >>  card6
			card6 = new JButton();
			getContentPane().add(card6);
			do{
				int randy6 = (int) (Math.random()*(cardpks.size()-1));
				card6.setText("<html>" + (cardpks.get(randy6).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			}while(card6.getText().equals(card1.getText()) || 
			    card6.getText().equals(card2.getText()) ||
			    card6.getText().equals(card3.getText()) ||
			    card6.getText().equals(card4.getText()) ||
			    card6.getText().equals(card5.getText()));
			card6.setBounds(1016, 400, 196, 300);
			card6.setBackground(Color.PINK);
			card6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card6);
				}
			});
			//END <<  card6
			//START >>  card7
			card7 = new JButton();
			getContentPane().add(card7);
			do{ 
				int randy7 = (int) (Math.random()*(cardpks.size()-1));
				card7.setText("<html>" + (cardpks.get(randy7).getARedCard()).replaceAll("\\n", "<br>") + "</html>");
			}while(card7.getText().equals(card1.getText()) || 
				    card7.getText().equals(card2.getText()) ||
				    card7.getText().equals(card3.getText()) ||
				    card7.getText().equals(card4.getText()) ||
				    card7.getText().equals(card5.getText()) ||
					card7.getText().equals(card6.getText()));
			card7.setBounds(1218, 400, 196, 300);
			card7.setBackground(Color.PINK);
			card7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					redCardActionPerformed(evt, card7);
				}
			});
			//END <<  card7
			cards = new ArrayList<JButton>();
			cards.add(card1);
			cards.add(card2);
			cards.add(card3);
			cards.add(card4);
			cards.add(card5);
			cards.add(card6);
			cards.add(card7);
			//START >>  test
//			test = new JLabel();
//			getContentPane().add(test);
//			test.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Resources/RedApple.gif")));
//			test.setBounds(360, 75, 150, 155);
			//END <<  test
			humanName = new JLabel();
			cpu1Name = new JLabel();
			cpu2Name = new JLabel();
			cpu3Name = new JLabel();
			cpu4Name = new JLabel();
			cpu5Name = new JLabel();
			cpu6Name = new JLabel();
			cpu7Name = new JLabel();
			cpu8Name = new JLabel();
			cpu9Name = new JLabel();
			humanWins = new JLabel();
			cpu1Wins = new JLabel();
			cpu2Wins = new JLabel();
			cpu3Wins = new JLabel();
			cpu4Wins = new JLabel();
			cpu5Wins = new JLabel();
			cpu6Wins = new JLabel();
			cpu7Wins = new JLabel();
			cpu8Wins = new JLabel();
			cpu9Wins = new JLabel();
			pack();
			setSize(1435, 750);
			cardConfirmed = false;
			getContentPane().add(pickedCard);
			pickedCard.setVisible(false);
			getContentPane().add(confirmer);
			confirmer.setVisible(false);
			
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	/**
	 * Adds each player name from the SettingsWindow to the
	 * leaderboard. Starts each player with 0 wins. Wins are
	 * reset upon reopening of the SettingsWindow.
	 */
	public void makePlayers(){
		players = set.getPlayers();
		winPanels = new ArrayList<JLabel>();
		wins = new int[set.getPlayerNum()];
		for(int i = 0; i < wins.length; i++){
			wins[i] = 0;
		}
		makeLeaderboardName(humanName, 0);
		makeLeaderboardWins(humanWins, 0);
		makeLeaderboardName(cpu1Name, 1);
		makeLeaderboardWins(cpu1Wins, 1);
		makeLeaderboardName(cpu2Name, 2);
		makeLeaderboardWins(cpu2Wins, 2);
		makeLeaderboardName(cpu3Name, 3);
		makeLeaderboardWins(cpu3Wins, 3);
		if(players.size() > 4){
			makeLeaderboardName(cpu4Name, 4);
			makeLeaderboardWins(cpu4Wins, 4);
		}if(players.size() > 5){
			makeLeaderboardName(cpu5Name, 5);
			makeLeaderboardWins(cpu5Wins, 5);
		}if(players.size() > 6){
			makeLeaderboardName(cpu6Name, 6);
			makeLeaderboardWins(cpu6Wins, 6);
		}if(players.size() > 7){
			makeLeaderboardName(cpu7Name, 7);
			makeLeaderboardWins(cpu7Wins, 7);
		}if(players.size() > 8){
			makeLeaderboardName(cpu8Name, 8);
			makeLeaderboardWins(cpu8Wins, 8);
		}if(players.size() > 9){
			makeLeaderboardName(cpu9Name, 9);
			makeLeaderboardWins(cpu9Wins, 9);
		}
	}
	/**
	 * Adds the cards of the card pack to an array of cards if
	 * it is checked on the SettingsWindow.
	 */
	public void makeCards(){
		cardpks = new ArrayList<CardPack>();
		if(set.isMiller()){
			cardpks.add(new MrsMillersClass());
		}
		if(set.isApples()){
			cardpks.add(new RandomApples());
		}
		if(set.isAnnabelle()){
			cardpks.add(new AnnabelleAndAidan());
		}
	}
	
	/**
	 * Upon clicking the "Settings" button, opens a new
	 * SettingsWindow.
	 */
	private void settingsButtonActionPerformed(ActionEvent evt) {
		set.setVisible(true);
	}
	
	/**
	 * pre: a red card with words on it
	 * puts a red card up near the green card. If one is
	 * already there, the card is replaced. Cards will not do
	 * anything after a card is confirmed for selection.
	 */
	private void redCardActionPerformed(ActionEvent evt, JButton card){
		String temp = card.getText();
		if(pickedCard.isShowing()){
			pickedCard.setText(temp);
			tempCard.setVisible(true);
		}
		if(!cardConfirmed){
			card.setVisible(false);
			pickedCard.setVisible(true);
			confirmer.setVisible(true);
			pickedCard.setText(temp);
		}
		tempCard = card;
	}
	
	/**
	 * Upon pressing the "Confirm" button, the GUI will pause
	 * as if the CPU is deciding which card to pick. The 
	 * winner is chosen at random and if the user wins, the
	 * user's card will be displayed and the she will get
	 * a point. Otherwise, a random red card will be 
	 * displayed and a random CPU will get a point.
	 * The GUI then displays the name of the winner and asks
	 * the user if she wants to play another round. 
	 */
	private void confirmerActionPerformed(ActionEvent evt) {
		cardConfirmed = true;
		String temp = pickedCard.getText();
		confirmer.setVisible(false);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			confirmerActionPerformed(evt);
		}
		winsLabb.setVisible(true);
		winnerName.setVisible(true);
		yourC.setText("Selected:");
		randyWin = (int)(Math.random() * players.size());
		if(randyWin == 0 || temp.contains("XKCD")){
			pickedCard.setText(temp);
			winnerName.setText("YOU");
			winsLabb.setText("WIN!");
			wins[0]++;
			humanWins.setText("" + wins[0]);
		}else{
			int randyW = (int) (Math.random() * cardpks.size());
			do{
				pickedCard.setText("<html>" + cardpks.get(randyW).getARedCard().replaceAll("\\n", "<br>") + "</html>");
			}while(pickedCard.getText().equals(temp));
			wins[randyWin]++;
			winPanels.get(randyWin).setText("" + wins[randyWin]);
			winnerName.setText(players.get(randyWin));
			winsLabb.setText("wins!");
		}
		Font winFont = new Font("Arial", Font.PLAIN, 36);
		winnerName.setFont(winFont);
		winsLabb.setFont(winFont);
		//START >>  replay
		replay = new JButton();
		getContentPane().add(replay);
		replay.setText("Play New Round");
		replay.setBounds(1066, 156, 199, 28);
		replay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				replayActionPerformed(evt);
			}
		});
		//END <<  replay
	}

	/**
	 * Upon pressing the replay button, the game will be reset
	 * for another round.
	 */
	private void replayActionPerformed(ActionEvent evt) {
		greenCard.setText("<html>" + cardpks.get(0).getAGreenCard().replaceAll("\\n", "<br>") + "</html>");
		pickedCard.setVisible(false);
		cardConfirmed = false;
		replay.setVisible(false);
		winsLabb.setVisible(false);
		winnerName.setVisible(false);
		for(int i = 0; i < cards.size(); i++){
			if(!(cards.get(i).isShowing())){
				cards.get(i).setVisible(true);
				int randyRes = (int)(Math.random()*cardpks.size());
					cards.get(i).setText("<html>" + cardpks.get(randyRes).getARedCard().replaceAll("\\n", "<br>") + "</html>");
			}
		}
		yourC.setText("Your Card:");
	}
	/**
	 * pre: num >= 0
	 * Adds a player's name to a JLabel
	 */
	private void makeLeaderboardName(JLabel labb, int num){
		getContentPane().add(labb);
		labb.setText(players.get(num));
		labb.setBounds(12, 60+(num*20), 131, 16);
	}
	
	/**
	 * pre: num >= 0
	 * Adds a player's number of wins to their 
	 * corresponding JLabel
	 */
	private void makeLeaderboardWins(JLabel winlabb, int num){
		getContentPane().add(winlabb);
		winPanels.add(winlabb);
		winlabb.setText("" + wins[num]);
		winlabb.setBounds(155, 60+(num*20), 20, 16);
	}

}	