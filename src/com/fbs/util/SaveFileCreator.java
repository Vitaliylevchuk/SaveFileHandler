package com.fbs.util;

public class SaveFileCreator {

    public SaveVar getSaveVar() {
        return saveVar;
    }

    private static SaveVar saveVar;

    public SaveFileCreator(VarName varName, VarValue varValue){
        initVar(varName, varValue);
    }

    private static SaveVar initVar(VarName varName, VarValue varValue){
        SaveVar var = new SaveVar();
        var.setName(varName.getData());
        var.setValue(varValue.getData());
        return var;
    }

}
