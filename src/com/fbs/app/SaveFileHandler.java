package com.fbs.app;

import com.fbs.util.*;

import java.io.File;

public class SaveFileHandler {

    private static VarName varName;
    private static VarValue varValue;
    private static SaveVar saveVar;
    private static SaveVarCreator saveVarCreator;

    public SaveFileHandler(File file, char startStopReadSymbolName, char startStopReadSymbolValue, char equalitySymbol){
        SaveFile saveFile = new SaveFile(file);
        varName = new VarName(saveFile, startStopReadSymbolName);
        varValue = new VarValue(saveFile, startStopReadSymbolValue, equalitySymbol);
        saveVarCreator = new SaveVarCreator(varName, varValue);
        initSaveVar();
    }

    public SaveFileHandler(File file, char startReadSymbolName,char stopReadSymbolName, char startReadSymbolValue,char stopReadSymbolValue, char equalitySymbol){
        SaveFile saveFile = new SaveFile(file);
        varName = new VarName(saveFile, startReadSymbolName, stopReadSymbolName);
        varValue = new VarValue(saveFile, startReadSymbolValue, stopReadSymbolValue, equalitySymbol);
        saveVarCreator = new SaveVarCreator(varName, varValue);
        initSaveVar();
    }

    private static void initSaveVar(){
        saveVar = saveVarCreator.getSaveVar();
    }

    public SaveVar getSaveVar(){
        return saveVar;
    }

}
