package com.Delta.mister_roboto;

/**
 * Created by mollyrand on 2/13/14.
 */
public class Dyslexosaur extends Destructosaur {

    public Dyslexosaur(){
        super();
    }

    public String getName(Dyslexosaur botBot){
        String name = super.getName();
        String eman = "";
        int length = name.length();
        for (int i = length; i >0; i--){
            eman.concat(name.substring(i-1, i));
        }
        return eman;
    }
}
