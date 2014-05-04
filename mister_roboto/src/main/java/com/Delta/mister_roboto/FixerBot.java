package com.Delta.mister_roboto;

/**
 * Created by mollyrand on 2/13/14.
 */
public class FixerBot extends Robot {

    public FixerBot(){
        super();
    }

    public FixerBot(String newName, Body newBody, Leg leg1, Leg leg2, Leg leg3, Leg leg4, Arm arm1, Arm arm2) {
        super(newName, newBody, leg1, leg2, leg3, leg4, arm1, arm2);
    }

    public Robot fixIt(Robot bustedBot){
        //going to assume they only can have fewer than the correct number of arms/legs
        int a = bustedBot.numArms();
        int l = bustedBot.numLegs();
        while(a<2) {
            Arm newArm = new Arm();
            bustedBot.addArm(newArm);
            a++;
        }
        while(l<4) {
            Leg newLeg = new Leg();
            bustedBot.addLeg(newLeg);
            l++;
        }
        return bustedBot;
    }

    // This copy and paste should be able to be condensed, but I'm not sure how with different param/return types.
//  below is redundant
//
//    public FixerBot fixIt(FixerBot bustedBot){
//        //going to assume they only can have fewer than the correct number of arms/legs
//        int a = bustedBot.numArms();
//        int l = bustedBot.numLegs();
//        while(a<2) {
//            Arm newArm = new Arm();
//            bustedBot.addArm(newArm);
//            a++;
//        }
//        while(l<4) {
//            Leg newLeg = new Leg();
//            bustedBot.addLeg(newLeg);
//            l++;
//        }
//        return bustedBot;
//    }
}
