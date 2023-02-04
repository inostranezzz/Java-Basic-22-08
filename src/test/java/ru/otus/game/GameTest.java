package ru.otus.game;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class GameTest {

    @Parameterized.Parameters(name = "{index}: {1} -> {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Oleg", 1, "Andrey", 5,  "Andrey"},
                { "Oleg", 3, "Andrey", 2,  "Oleg"},
                { "Oleg", 4, "Andrey", 4,  "Andrey"},
                { "Oleg", 4, "Andrey", 4,  "Oleg"},
        });
    }

    private String nameFirstPlayer;
    private int countFirstPlayer;
    private String nameSecondPlayer;
    private int countSecondPlayer;
    String playWinner;
    private String expected;


    public GameTest(String nameFirstPlayer, int countFirstPlayer, String nameSecondPlayer, int countSecondPlayer, String expected) {
        this.nameFirstPlayer = nameFirstPlayer;
        this.countFirstPlayer = countFirstPlayer;
        this.nameSecondPlayer = nameSecondPlayer;
        this.countSecondPlayer = countSecondPlayer;
        this.expected = expected;
    }

    public class DiceStub implements Dice {
        private static boolean choice = true;
        @Override
        public int roll() {
            if(choice){
                choice = false;
                return countFirstPlayer;
            }
            else {
                choice = true;
                return countSecondPlayer;
            }
        }
    }

    public class GameWinnerPrinterStub implements GameWinnerPrinter {
        @Override
        public void printWinner(Player winner) {
            playWinner = winner.getName();
        }
    }


    @Test
    public void diceResult() {
        Game game = new Game(new DiceStub(), new GameWinnerPrinterStub());
        game.playGame(new Player(nameFirstPlayer), new Player(nameSecondPlayer));
        Assert.assertEquals(expected, playWinner);
    }
}
