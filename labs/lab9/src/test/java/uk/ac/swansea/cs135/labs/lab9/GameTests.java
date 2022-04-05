package uk.ac.swansea.cs135.labs.lab9;

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.junit.Assert.assertEquals;

/**
 * This file shows example test cases that you should
 * use as templates when creating your own.
 * <p>
 * It also holds useful utility methods that you may
 * want to copy into your test suites.
 */
public class GameTests extends ApplicationTest {
    // Holds the  current running game.
    private Game game;

    /**
     * This is called each time a test is run to start the game up.
     * You need this exact method in every test suite.
     */
    public void start(Stage stage) throws Exception {
        // Create the JavaFX application by instantiating it and
        // manually calling the JavaFX start method.
        game = new Game();
        game.start(stage);
        stage.toFront();
    }

    @Test
    public void testTemplateOne() throws InterruptedException {
        Thread.sleep(500);
        int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(1, getNumberReds());
    }

    @Test
    public void testTemplateTwo() throws InterruptedException {
        Thread.sleep(500);
        int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        Thread.sleep(500);
        assertEquals(x, game.getDisplayedSquareX());
        assertEquals(y, game.getDisplayedSquareY());
    }

    @Test
    public void testTemplateThree() throws InterruptedException {
        Thread.sleep(500);
        int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        clickOn("#button5");
        Thread.sleep(500);
        assertEquals(x, game.getLastClickedSquareX());
        assertEquals(y, game.getLastClickedSquareY());
    }

    // ***************************
    // Utility Methods
    // ***************************

    /**
     * This is a utility method that can be used to find out
     * the number of squares that are red.
     *
     * @return The number of red squares.
     */
    public int getNumberReds() {
        int numberOfReds = 0;

        for (int i = 0; i < Game.GRID_SIZE * Game.GRID_SIZE; i++) {
            Button b = lookup("#button" + i).queryButton();

            if (b.getStyle().equals(Game.BUTTON_STYLE_RED)) {
                numberOfReds++;
            }
        }

        return numberOfReds;
    }

    /**
     * Access the result label's text in the game.
     *
     * @return The actual text being displayed as the result.
     */
    public String observeDisplay() {
        Labeled display = lookup("#resultBox").queryLabeled();
        return display.getText();
    }
}