package com.fbs.util;

public class VarName extends FileElement implements SaveFileDefault{

    private static SaveFile file;
    private static String varName;
    private static char startReadSymbol;
    private static char stopReadSymbol;
    private static LineGetter lineGetter = new LineGetter();

    public VarName(SaveFile file, char startReadSymbol){
        this.file = file;
        this.startReadSymbol = startReadSymbol;
        this.stopReadSymbol = startReadSymbol;
    }

    public VarName(SaveFile file, char startReadSymbol, char stopReadSymbol){
        this.file = file;
        this.startReadSymbol = startReadSymbol;
        this.stopReadSymbol = stopReadSymbol;
    }

    public void initData(int lineId){

        StringBuilder returnName = new StringBuilder();

        String targetLine = lineGetter.readFromLine(lineId, file.getFilePath());
        char[] targetLineCh = targetLine.toCharArray();

        boolean reading = false;
        for (int i = 0; i < targetLineCh.length; i++) {

            if (startReadSymbol == targetLineCh[i]){
                reading = true;
            }
            else if (!(stopReadSymbol == targetLineCh[i]) && !(startReadSymbol == targetLineCh[i]) && reading) {
                returnName.append(targetLineCh[i]);
            }
            else if ((stopReadSymbol == targetLineCh[i]) && reading) {
                reading = false;
                break;
            }

        }

        varName = String.valueOf(returnName);

    }

    @Override
    public String getData() {
        return varName;
    }
}
