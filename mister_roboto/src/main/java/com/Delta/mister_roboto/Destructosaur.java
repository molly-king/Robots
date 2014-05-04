package com.Delta.mister_roboto;

/**
 * Created by mollyrand on 2/13/14.
 */
public class Destructosaur extends Robot {

    public Destructosaur(){
        super();
    }

//    this destructor method is going to just give you back a robot with no arms and no legs, because that's how I choose to interpret it.
    public Robot destroyIt(Robot victim){
        int a = victim.numArms();
        int l = victim.numLegs();
        while(a>0) {
            victim.removeArm(a-1); // added remove methods to Robot class
            a--;
        }
        while(l>0) {
            victim.removeLeg(l-1);
            l--;
        }
        return victim;
    }
}
