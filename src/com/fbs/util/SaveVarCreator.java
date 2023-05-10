package com.fbs.util;

public class SaveVarCreator {

    public SaveVar getSaveVar() {
        return saveVar;
    }

    private static VarName varName;
    private static VarValue varValue;
    private static SaveVar saveVar;

    public SaveVarCreator(VarName varName, VarValue varValue){
        this.varName = varName;
        this.varValue = varValue;
        this.saveVar.setName(varName.getData());
        this.saveVar.setValue(varValue.getData());
    }


}
