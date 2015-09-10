package roulette;

import util.ConsoleReader;

public class ThreeInRowBet extends Bet {
	
	private static final String DESCRIPTION = "Three in a Row";

	public ThreeInRowBet(int odds) {
		super(DESCRIPTION, odds);
	}
	
	public String getPrompt(){
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}

	@Override
	public boolean wonBet(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
