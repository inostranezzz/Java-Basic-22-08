package ru.otus.game;

import org.junit.*;

public class DiceImplTest {

    @Test
    public void diceResult(){
        int diceResult = new DiceImpl().roll();
        Assert.assertTrue(diceResult >= 1 & diceResult <= 6);
    }
}
