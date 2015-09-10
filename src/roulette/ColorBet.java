package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {
	
	private static final String DESCRIPTION = "Red or Black";

	public ColorBet(int odds) {
		super(DESCRIPTION, odds);
	}
	
	public String getPrompt(){
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean wonBet(Wheel wheel, String betChoice) {
		return wheel.getColor().equals(betChoice);
	}

}
