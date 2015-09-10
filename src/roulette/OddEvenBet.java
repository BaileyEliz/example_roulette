package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {
	
	private static final String DESCRIPTION = "Odd or Even";

	public OddEvenBet(int odds) {
		super(DESCRIPTION, odds);
	}
	
	public String getPrompt(){
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}

	@Override
	public boolean wonBet(Wheel wheel, String betChoice) {
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
