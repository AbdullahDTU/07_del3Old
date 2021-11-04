package spil;

import gui_fields.GUI_Field;

import java.awt.*;

public class Field extends GUI_Field {

    //Variables for field Price, Name and Text
    private int fieldPrice;
    private int fieldID;
    private String fieldName;
    private String fieldText;

    public int getFieldPrice() {
        return fieldPrice;
    }

    public void setFieldPrice(int fieldPrice) {
        this.fieldPrice = fieldPrice;
    }

    public int getFieldID() {
        return fieldID;
    }

    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldText() {
        return fieldText;
    }

    public void setFieldText(String fieldText) {
        this.fieldText = fieldText;
    }
/*
    public Field(int fieldID, int fieldPrice, String fieldName, String fieldText) {
        this.fieldID = fieldID;
        this.fieldPrice = fieldPrice;
        this.fieldName = fieldName;
        this.fieldText = fieldText;
    }

 */

    //public Field(Color bgColor, Color fgColor, String title, String subText, String description, int fieldPrice, int fieldID, String fieldName, String fieldText) {
    public Field(Color bgColor, Color fgColor, int fieldPrice, int fieldID, String fieldName, String fieldText) {
        //super(bgColor, fgColor, fieldName, subText, description);
        super(bgColor, fgColor, fieldName, "Hello", "Hello2");
        this.fieldPrice = fieldPrice;
        this.fieldID = fieldID;
        this.fieldName = fieldName;
        this.fieldText = fieldText;
    }
}
