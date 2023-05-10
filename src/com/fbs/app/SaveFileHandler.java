package com.fbs.app;

import com.fbs.util.*;

import java.io.File;

public class SaveFileHandler {

    private static VarName varName;
    private static VarValue varValue;
    private static SaveVar saveVar;
    private static SaveVarCreator saveVarCreator;

    public SaveFileHandler(File file, char startStopReadSymbolName, char startStopReadSymbolValue, char equalitySymbol, int lineId){
        SaveFile saveFile = new SaveFile(file);
        varName = new VarName(saveFile, startStopReadSymbolName);
        varName.initData(lineId);
        varValue = new VarValue(saveFile, startStopReadSymbolValue, equalitySymbol);
        varValue.initData(lineId);
        saveVarCreator = new SaveVarCreator(varName, varValue);
        initSaveVar();
    }

    public SaveFileHandler(File file, char startReadSymbolName,char stopReadSymbolName, char startReadSymbolValue,char stopReadSymbolValue, char equalitySymbol, int lineId){
        SaveFile saveFile = new SaveFile(file);
        varName = new VarName(saveFile, startReadSymbolName, stopReadSymbolName);
        varName.initData(lineId);
        varValue = new VarValue(saveFile, startReadSymbolValue, stopReadSymbolValue, equalitySymbol);
        varValue.initData(lineId);
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
