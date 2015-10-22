package roulette.bets;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import roulette.Bet;

public class BetFactory {

	public BetFactory() {
	}

	public Bet createBet(String s) {
		s = "roulette.bets." + s;
		Class clazz;
		try {
			clazz = Class.forName(s);
			Constructor con = clazz.getConstructor(String.class);
			return (Bet) con.newInstance(s);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
