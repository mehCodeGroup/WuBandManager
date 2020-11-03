package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {
        this.wuMemberArray = wuMemberArray;
    }

    int counter = 0;
    public String whileLoop() {
        String result = "";
        while (counter < wuMemberArray.length){
            result += wuMemberArray[counter].toString();
            counter++;
        }
        
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < wuMemberArray.length; i++) {
            result += wuMemberArray[i];
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for ( WuMember w: wuMemberArray) {
            result += w.toString();
        }
        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
