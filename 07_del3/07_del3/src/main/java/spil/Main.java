package spil;

import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

//The main Class which runs the game
public class Main {

    //Runs the different methods
    public static void main(String[] args) {
        GameController gameController = new GameController();

        GUI_Field guiField1 = new Field(Color.BLUE, Color.white, FieldConstants.TOWER_ID, FieldConstants.TOWER_AMOUNT, FieldConstants.TOWER_NAME, FieldConstants.TOWER_TEXT);
        GUI_Field guiField2 = new Field(Color.GRAY, Color.YELLOW, FieldConstants.CRATER_ID, FieldConstants.CRATER_AMOUNT, FieldConstants.CRATER_NAME, FieldConstants.CRATER_TEXT);

        GUI_Field[] guiFields = new GUI_Field[2];

        guiFields[0] = guiField1;
        guiFields[1] = guiField2;

        GUI gui = new GUI(guiFields);

        //Creating two players with 0 money
        Player playerOne = new Player("PlayerOne", null);
        Player playerTwo = new Player("PlayerTwo", null);

        //Setting up the players with their Variables
        gameController.setupPlayers(playerOne, playerTwo);
        gameController.initGame();
        gameController.startGame();
    }

}
