package apples2017;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class SettingsWindow extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel playerSetBox;
	private JTextField cpu8name;
	private JCheckBox cardpack1;
	private JCheckBox cardpack2;
	private JCheckBox cardpack3;
	private JLabel cpu9;
	private JLabel cpu7;
	private JLabel cpu8;
	private JLabel cpu6;
	private JLabel cpu5;
	private JLabel cpu4;
	private JLabel cpu3;
	private JTextField cpu9name;
	private JTextField cpu7name;
	private JTextField cpu6name;
	private JTextField cpu5name;
	private JTextField humanName;
	private JLabel cpu1;
	private JTextField cpu4name;
	private JTextField cpu3name;
	private JTextField cpu2name;
	private JLabel cpu2;
	private JTextField cpu1name;
	private JLabel human;
	private JLabel setStringNames;
	private JLabel errorAlert;
	private JButton pressToPlay;
	private JTextField playerEnterer;
	private int players;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SettingsWindow inst = new SettingsWindow();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	/**
	 * Instantiates a new SettingsWindow to display. By
	 * default, there are 4 players.
	 */
	public SettingsWindow() {
		super();
		players = 4;
		initGUI();
	}
	
	/**
	 * Creates all text boxes and words on the GUI. Creates
	 * two card packs, one selected by default, the other 
	 * left unselected.
	 */
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			//START >>  playerSetBox
			playerSetBox = new JLabel();
			getContentPane().add(playerSetBox);
			playerSetBox.setText("Set # of players:");
			playerSetBox.setBounds(53, 16, 153, 13);
			//END <<  playerSetBox
			//START >>  playerEnterer
			playerEnterer = new JTextField();
			getContentPane().add(playerEnterer);
			playerEnterer.setBounds(155, 11, 39, 24);
			playerEnterer.setText("4");
			//END <<  playerEnterer
			//START >>  pressToPlay
			pressToPlay = new JButton();
			getContentPane().add(pressToPlay);
			pressToPlay.setText("Play!");
			pressToPlay.setBounds(125, 224, 225, 25);
			pressToPlay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					pressToPlayActionPerformed(evt);
				}
			});
			//END <<  pressToPlay
			//START >>  errorAlert
			errorAlert = new JLabel();
			getContentPane().add(errorAlert);
			errorAlert.setBounds(13, 35, 206, 19);
			errorAlert.setFont(new Font("Arial", Font.PLAIN, 10));
			errorAlert.setForeground(Color.RED);
			//END <<  errorAlert
			//START >>  setStringNames
			setStringNames = new JLabel();
			getContentPane().add(setStringNames);
			setStringNames.setText("Set player names:");
			setStringNames.setBounds(312, 13, 117, 18);
			//END <<  setStringNames
			//START >>  humanName
			humanName = new JTextField();
			getContentPane().add(humanName);
			humanName.setBounds(350, 31, 76, 17);
			humanName.setText("Human");
			//END <<  humanName
			//START >>  cpu1name
			cpu1name = new JTextField();
			getContentPane().add(cpu1name);
			cpu1name.setText("CPU 1");
			cpu1name.setBounds(350, 50, 76, 17);
			//END <<  cpu1name
			//START >>  cpu2name
			cpu2name = new JTextField();
			getContentPane().add(cpu2name);
			cpu2name.setText("CPU 2");
			cpu2name.setBounds(350, 69, 76, 17);
			//END <<  cpu2name
			//START >>  cpu3name
			cpu3name = new JTextField();
			getContentPane().add(cpu3name);
			cpu3name.setText("CPU 3");
			cpu3name.setBounds(350, 88, 76, 17);
			//END <<  cpu3name
			//START >>  cpu4name
			cpu4name = new JTextField();
			getContentPane().add(cpu4name);
			cpu4name.setText("CPU 4");
			cpu4name.setBounds(350, 107, 76, 17);
			//END <<  cpu4name
			//START >>  cpu5name
			cpu5name = new JTextField();
			getContentPane().add(cpu5name);
			cpu5name.setText("CPU 5");
			cpu5name.setBounds(350, 126, 76, 17);
			//END <<  cpu5name
			//START >>  cpu6name
			cpu6name = new JTextField();
			getContentPane().add(cpu6name);
			cpu6name.setText("CPU 6");
			cpu6name.setBounds(350, 145, 76, 17);
			//END <<  cpu6name
			//START >>  cpu7name
			cpu7name = new JTextField();
			getContentPane().add(cpu7name);
			cpu7name.setText("CPU 7");
			cpu7name.setBounds(350, 164, 76, 17);
			//END <<  cpu7name
			//START >>  cpu8name
			cpu8name = new JTextField();
			getContentPane().add(cpu8name);
			cpu8name.setText("CPU 8");
			cpu8name.setBounds(350, 183, 76, 17);
			//END <<  cpu8name
			//START >>  cpu9name
			cpu9name = new JTextField();
			getContentPane().add(cpu9name);
			cpu9name.setText("CPU 9");
			cpu9name.setBounds(350, 202, 76, 17);
			//END <<  cpu9name
			//START >>  human
			human = new JLabel();
			getContentPane().add(human);
			human.setText("Human:");
			human.setBounds(300, 32, 50, 15);
			//END <<  human
			//START >>  cpu1
			cpu1 = new JLabel();
			getContentPane().add(cpu1);
			cpu1.setText("CPU 1:");
			cpu1.setBounds(300, 51, 50, 15);
			//END <<  cpu1
			//START >>  cpu2
			cpu2 = new JLabel();
			getContentPane().add(cpu2);
			cpu2.setText("CPU 2:");
			cpu2.setBounds(300, 70, 50, 15);
			//END <<  cpu2
			//START >>  cpu3
			cpu3 = new JLabel();
			getContentPane().add(cpu3);
			cpu3.setText("CPU 3:");
			cpu3.setBounds(300, 89, 50, 15);
			//END <<  cpu3
			//START >>  cpu4
			cpu4 = new JLabel();
			getContentPane().add(cpu4);
			cpu4.setText("CPU 4:");
			cpu4.setBounds(300, 108, 50, 15);
			//END <<  cpu4
			//START >>  cpu5
			cpu5 = new JLabel();
			getContentPane().add(cpu5);
			cpu5.setText("CPU 5:");
			cpu5.setBounds(300, 127, 50, 15);
			//END <<  cpu5
			//START >>  cpu6
			cpu6 = new JLabel();
			getContentPane().add(cpu6);
			cpu6.setText("CPU 6:");
			cpu6.setBounds(300, 146, 50, 15);
			//END <<  cpu6
			//START >>  cpu7
			cpu7 = new JLabel();
			getContentPane().add(cpu7);
			cpu7.setText("CPU 7:");
			cpu7.setBounds(300, 165, 50, 15);
			//END <<  cpu7
			//START >>  cpu8
			cpu8 = new JLabel();
			getContentPane().add(cpu8);
			cpu8.setText("CPU 8:");
			cpu8.setBounds(300, 184, 50, 15);
			//END <<  cpu8
			//START >>  cpu9
			cpu9 = new JLabel();
			getContentPane().add(cpu9);
			cpu9.setText("CPU 9:");
			cpu9.setBounds(300, 203, 50, 15);
			//END <<  cpu9
			cardpack1 = new JCheckBox();
			setPack(cardpack1, 0, "Mrs. Miller's Class");
			cardpack1.setSelected(true);
			cardpack2 = new JCheckBox();
			setPack(cardpack2, 1, "Random Apples to Apples Cards");
			cardpack2.setSelected(true);
			cardpack3 = new JCheckBox();
			setPack(cardpack3, 2, "Annabelle and Friends Pack");
			cardpack3.setSelected(true);
			pack();
			this.setSize(500, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public int getPlayerNum(){
	    return players; 
	}
	
	/**
	 * returns true if the first check box is selected
	 */
	public boolean isMiller(){
		return cardpack1.isSelected();
	}
	
	/**
	 * returns true if the second check box is selected
	 */
	public boolean isApples(){
		return cardpack2.isSelected();
	}
	
	public boolean isAnnabelle(){
		return cardpack3.isSelected();
	}
	
	/**
	 * returns an array of all the player names
	 */
	public ArrayList<String> getPlayers(){
		ArrayList<String> playerList = new ArrayList<String>();
			playerList.add(humanName.getText());
			playerList.add(cpu1name.getText());
			playerList.add(cpu2name.getText());
			playerList.add(cpu3name.getText());
			if(players > 4){
				playerList.add(cpu4name.getText());
			}
			if(players > 5){
				playerList.add(cpu5name.getText());
			}
			if(players > 6){
				playerList.add(cpu6name.getText());
			}
			if(players > 7){
				playerList.add(cpu7name.getText());
			}
			if(players > 8){
				playerList.add(cpu8name.getText());
			}
			if(players > 9){
				playerList.add(cpu9name.getText());
			}
			return playerList;
		}
	
	/**
	 * pre: whichpk >= 0, packName is the name of a card pack
	 * sets up the check boxes for the card packs
	 */
	private void setPack(JCheckBox czechRepublic, int whichPk, String packName){
		getContentPane().add(czechRepublic);
		czechRepublic.setBounds(33, 79+(whichPk*20), 229, 17);
		czechRepublic.setText(packName);
	}

	/**
	 * Upon pressing the play button, all the data on the 
	 * window is checked for appropriateness. If all is so, 
	 * the SettingsWindow closes and its settings are applied
	 * to the GameView.
	 */
	private void pressToPlayActionPerformed(ActionEvent evt) {
		try{
		Integer.parseInt(playerEnterer.getText());
		}catch(NumberFormatException e){
			errorAlert.setText("That's not a number, dingus.");
			return;
		}
		int entered = Integer.parseInt(playerEnterer.getText());
		if((entered > 10) || (entered < 4)){
			errorAlert.setText("Please enter a number between 4 and 10.");
		}else{
			errorAlert.setText("");
			players = entered;
			setVisible(false);
			GameView.inst.makePlayers();
		}
	}

}