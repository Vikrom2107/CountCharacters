package ru.romanovvb.CountCharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountCharactersApplicationTests {

	CounterChar counter = CounterChar.getInstance();
	@Test
	void contextLoads() {
		counter.counter("fdfgddg");
		int amount1 = counter.getAmountChar().get('f');
		int expect1 = 2;
		Assertions.assertEquals(expect1, amount1);

		counter.counter("WWWKFGfsgrw");
		int amount2 = counter.getAmountChar().get('W');
		int expect2 = 3;
		Assertions.assertEquals(expect2, amount2);
	}

}
