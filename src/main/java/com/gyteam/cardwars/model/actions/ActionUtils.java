package com.gyteam.cardwars.model.actions;

import lombok.experimental.UtilityClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@UtilityClass
public class ActionUtils {

    private final static String PATH = "com.gyteam.cardwars.model.actions";
    private final static String PACKAGE_NAME_RESOLVER = "%s.%s.%s";
    private final static String SPACE_REGULAR = "\\s";
    private final static String EMPTY_STRING = "";

    public static Action getActionClassByName(String name, String land) {

        Action actionClassInstance = null;
        Class<?> c = null;
        try {
            c = Class.forName(String.format(PACKAGE_NAME_RESOLVER, PATH, removeSpaces(land), removeSpaces(name)));
            Constructor<?> cons = c.getConstructor();
            actionClassInstance = (Action) cons.newInstance();

        } catch (ClassNotFoundException | IllegalAccessException
                | InvocationTargetException | NoSuchMethodException
                | InstantiationException e) {
            e.printStackTrace();
        }
        return actionClassInstance;
    }

    private String removeSpaces(String str) {
        return str.replaceAll(SPACE_REGULAR, EMPTY_STRING);
    }


}
