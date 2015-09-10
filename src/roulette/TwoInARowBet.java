package roulette;

import util.ConsoleReader;

public class TwoInARowBet extends Bet {
	
	private static final String DESCRIPTION = "Two in a Row";

	public TwoInARowBet(int odds) {
		super(DESCRIPTION, odds);
	}

	@Override
	public String getPrompt() {
		return "" + ConsoleReader.promptRange("Enter first of two consecutive numbers", 1, Wheel.NUM_SPOTS - 2);
	}

	@Override
	public boolean wonBet(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 2);
	}

}
