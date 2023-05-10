package com.fbs.util;

public class VarValue implements SaveFileDefault{

    private static SaveFile file;
    private static String varValue;
    private static char equalitySymbol;
    private static char startReadSymbol;
    private static char stopReadSymbol;
    private static LineGetter lineGetter = new LineGetter();

    public VarValue(SaveFile file, char startReadSymbol, char equalitySymbol){
        this.file = file;
        this.startReadSymbol = startReadSymbol;
        this.stopReadSymbol = startReadSymbol;
        this.equalitySymbol = equalitySymbol;
    }

    public VarValue(SaveFile file, char startReadSymbol, char stopReadSymbol, char equalitySymbol){
        this.file = file;
        this.startReadSymbol = startReadSymbol;
        this.stopReadSymbol = stopReadSymbol;
        this.equalitySymbol = equalitySymbol;
    }

    public void initData(int lineId){

        StringBuilder returnValue = new StringBuilder();

        String targetLine = lineGetter.readFromLine(lineId, file.getFilePath());
        char[] targetLineCh = targetLine.toCharArray();

        boolean reading = false;
        boolean equalitySymbolB = false;

        for (int i = 0; i < targetLineCh.length; i++) {

            if (equalitySymbol == targetLineCh[i]){
                equalitySymbolB = true;
            }
            if (startReadSymbol == targetLineCh[i]){
                reading = true;
            }
            else if (!(stopReadSymbol == targetLineCh[i]) && !(startReadSymbol == targetLineCh[i]) && reading && equalitySymbolB) {
                returnValue.append(targetLineCh[i]);
            }
            else if ((stopReadSymbol == targetLineCh[i]) && reading && equalitySymbolB) {
                reading = false;
                break;
            }

        }

        varValue = String.valueOf(returnValue);

    }

    @Override
    public String getData() {
        return varValue;
    }
}
