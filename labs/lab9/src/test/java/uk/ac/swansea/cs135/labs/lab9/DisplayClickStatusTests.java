package uk.ac.swansea.cs135.labs.lab9;

import javafx.scene.control.Labeled;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.junit.Assert.assertEquals;

/**
 * This file shows example test cases that you should
 * use as templates when creating your own.
 */
public class DisplayClickStatusTests extends ApplicationTest {
    // Holds the  current running game.
    private Game game;

    /**
     * This is called each time a test is run to start the game up.
     */
    public void start(Stage stage) throws Exception {
        // Create the JavaFX application by instantiating it and
        // manually calling the JavaFX start method.
        game = new Game();
        game.start(stage);
        stage.toFront();
    }

    public String observeDisplay() {
        Labeled display = lookup("#resultBox").queryLabeled();
        return display.getText();
    }

    @Test
    public void testTemplate() throws InterruptedException {
        Thread.sleep(500);
        int x = 1;
        int y = 1;
        game.displaySquare(x, y);
        clickOn("#button22");
        Thread.sleep(500);
        assertEquals("something", observeDisplay());
    }
}