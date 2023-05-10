package com.fbs.util;

public class SaveVarCreator {

    public SaveVar getSaveVar() {
        return saveVar;
    }

    private static VarName varName;
    private static VarValue varValue;
    private static SaveVar saveVar;

    public SaveVarCreator(VarName varName, VarValue varValue){
        saveVar = new SaveVar();
        this.saveVar.setName(varName.getData());
        this.saveVar.setValue(varValue.getData());
    }


}
