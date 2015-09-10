package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet {
	
	private static final String DESCRIPTION = "High or Low";

	public HighLowBet(int odds) {
		super(DESCRIPTION, odds);
	}

	@Override
	public String getPrompt() {
		return ConsoleReader.promptOneOf("Please bet", "low", "high");
	}

	@Override
	public boolean wonBet(Wheel wheel, String betChoice) {
		if(wheel.getNumber() <= 19){
			return (betChoice.equals("low"));
		}
		else{
			return (betChoice.equals("high"));
		}
	}

}
