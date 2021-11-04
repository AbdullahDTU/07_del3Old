package spil.helpers;

import gui_fields.GUI_Field;
import spil.Field;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GUIHelper {
    public static GUI_Field[] transformFieldsToGuiFields(List<Field> fields) {
        GUI_Field[] guiFields = new GUI_Field[fields.size()];

        for (int i = 0; i < fields.size(); i++) {
            guiFields[i] = fields.get(i);
        }
        return guiFields;
    }
}
