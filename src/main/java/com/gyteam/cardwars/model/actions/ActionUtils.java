package com.gyteam.cardwars.model.actions;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@UtilityClass
@Slf4j
public class ActionUtils {

    private final static String PATH = "com.gyteam.cardwars.model.actions";
    private final static String PACKAGE_NAME_RESOLVER = "%s.%s.%s";
    private final static String CHAR_REGULAR = "[\\s-]";
    private final static String EMPTY_STRING = "";

    public static Action getActionClassByName(String name, String land) {

        Action actionClassInstance = null;
        try {
            String fullPath = String.format(PACKAGE_NAME_RESOLVER, PATH, removeSpaces(land), removeSpaces(name));
            Class<?> c = Class.forName(fullPath);
            Constructor<?> cons = c.getConstructor();
            actionClassInstance = (Action) cons.newInstance();
            //log.debug("[~ com.gyteam.cardwars.model.actions.ActionUtils] Trying to get action method for card: {}", land + name);

        } catch (ClassNotFoundException | IllegalAccessException
                | InvocationTargetException | NoSuchMethodException
                | InstantiationException exp) {
            log.error("[~ com.gyteam.cardwars.model.actions.ActionUtils] Exception during get action " +
                    "method for card: {}, exception: {}", name, exp.getMessage());
        }
        return actionClassInstance;
    }

    private static String removeSpaces(String str) {
        return str.replaceAll(CHAR_REGULAR, EMPTY_STRING);
    }


}
