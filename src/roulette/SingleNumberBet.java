package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet {
	
	private static final String DESCRIPTION = "Single Number";

	public SingleNumberBet(int odds) {
		super(DESCRIPTION, odds);
	}

	@Override
	public String getPrompt() {
		return "" + ConsoleReader.promptRange("Enter a number", 1, Wheel.NUM_SPOTS);
	}

	@Override
	public boolean wonBet(Wheel wheel, String betChoice) {
		int choice = Integer.parseInt(betChoice);
		return (wheel.getNumber() == choice);
	}

}
