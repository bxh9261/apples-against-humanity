package apples2017;

public abstract class CardPack {
	public String[] redCards;
	public String[] greenCards;
	
	/**
	 * gets a random red card from the card pack
	 */
	public String getARedCard(){
		int randy = (int) (Math.random()*(redCards.length));
		return redCards[randy];
	}
	
	/**
	 * gets a random green card from the card pack
	 */
	public String getAGreenCard(){
		int randy = (int) (Math.random()*(greenCards.length));
		return greenCards[randy];
	}
}

