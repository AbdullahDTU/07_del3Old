package spil;

import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

//The main Class which runs the game
public class Main {

    //Runs the different methods
    public static void main(String[] args) {
        GameController gameController = new GameController();

        // Transforming fields into GUI field's, so the GUI can display them
        GUI_Field guiField1 = new Field(Color.BLUE, Color.white, FieldConstants.TOWER_ID, FieldConstants.TOWER_AMOUNT, FieldConstants.TOWER_NAME, FieldConstants.TOWER_TEXT);
        GUI_Field guiField2 = new Field(Color.GRAY, Color.YELLOW, FieldConstants.CRATER_ID, FieldConstants.CRATER_AMOUNT, FieldConstants.CRATER_NAME, FieldConstants.CRATER_TEXT);
        GUI_Field guiField3 =new Field(Color.BLUE, Color.white,FieldConstants.PALACE_GATES_ID, FieldConstants.PALACE_GATES_AMOUNT, FieldConstants.PALACE_GATES_NAME, FieldConstants.PALACE_GATES_TEXT);
        GUI_Field guiField4 =new Field(Color.BLUE, Color.white,FieldConstants.COLD_DESERT_ID, FieldConstants.COLD_DESERT_AMOUNT, FieldConstants.COLD_DESERT_NAME, FieldConstants.COLD_DESERT_TEXT);
        GUI_Field guiField5 =new Field(Color.BLUE, Color.white,FieldConstants.WALLED_CITY_ID, FieldConstants.WALLED_CITY_AMOUNT, FieldConstants.WALLED_CITY_NAME, FieldConstants.WALLED_CITY_TEXT);
        GUI_Field guiField6 =new Field(Color.BLUE, Color.white,FieldConstants.MONASTARY_ID, FieldConstants.MONASTARY_AMOUNT, FieldConstants.MONASTARY_NAME, FieldConstants.MONASTARY_TEXT);
        GUI_Field guiField7 =new Field(Color.BLUE, Color.white,FieldConstants.BLACK_CAVE_ID, FieldConstants.BLACK_CAVE_AMOUNT, FieldConstants.BLACK_CAVE_NAME, FieldConstants.BLACK_CAVE_TEXT);
        GUI_Field guiField8 =new Field(Color.BLUE, Color.white,FieldConstants.HUTS_IN_THE_MOUNTAIN_ID, FieldConstants.HUTS_IN_THE_MOUNTAIN_AMOUNT, FieldConstants.HUTS_IN_THE_MOUNTAIN_NAME, FieldConstants.HUTS_IN_THE_MOUNTAIN_TEXT);
        GUI_Field guiField9 =new Field(Color.BLUE, Color.white,FieldConstants.THE_WEREWALL_ID, FieldConstants.THE_WEREWALL_AMOUNT, FieldConstants.THE_WEREWALL_NAME, FieldConstants.THE_WEREWALL_TEXT);
        GUI_Field guiField10 =new Field(Color.BLUE, Color.white,FieldConstants.THE_PIT_ID, FieldConstants.THE_PIT_AMOUNT, FieldConstants.THE_PIT_NAME, FieldConstants.THE_PIT_TEXT);
        GUI_Field guiField11 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField12 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField13 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField14 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField15 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField16 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField17 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField18 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField19 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField20 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField21 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField22 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField23 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);
        GUI_Field guiField24 =new Field(Color.BLUE, Color.white,FieldConstants.GOLD_MINE_ID, FieldConstants.GOLD_MINE_AMOUNT, FieldConstants.GOLD_MINE_NAME, FieldConstants.GOLD_MINE_TEXT);

        // We are making an Array list for GU Field
        GUI_Field[] guiFields = new GUI_Field[24];

        guiFields[0] = guiField1;
        guiFields[1] = guiField2;
        guiFields[2] = guiField3;
        guiFields[3] = guiField4;
        guiFields[4] = guiField5;
        guiFields[5] = guiField6;
        guiFields[6] = guiField7;
        guiFields[7] = guiField8;
        guiFields[8] = guiField9;
        guiFields[9] = guiField10;
        guiFields[10] = guiField11;
        guiFields[11] = guiField12;
        guiFields[12] = guiField13;
        guiFields[13] = guiField14;
        guiFields[14] = guiField15;
        guiFields[15] = guiField16;
        guiFields[16] = guiField17;
        guiFields[17] = guiField18;
        guiFields[18] = guiField19;
        guiFields[19] = guiField20;
        guiFields[20] = guiField21;
        guiFields[21] = guiField22;
        guiFields[22] = guiField23;
        guiFields[23] = guiField24;


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
