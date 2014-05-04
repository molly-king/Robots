package com.Delta.mister_roboto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mollyrand on 2/12/14.
 */
public class Robot {
    private String name = null;
    private List<Leg> legs = new ArrayList<Leg>();
    private List<Arm> arms = new ArrayList<Arm>();
    private Body roboBody;

    public Robot(){

    }

    public Robot(String newName, Body newBody, Leg leg1, Leg leg2, Leg leg3, Leg leg4, Arm arm1, Arm arm2){
        this.name = newName;
        this.roboBody = newBody;
        this.addArm(arm1);
        this.addArm(arm2);
        this.addLeg(leg1);
        this.addLeg(leg2);
        this.addLeg(leg3);
        this.addLeg(leg4);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setBody(Body newBody){
        this.roboBody = newBody;
    }

    public void addArm(Arm newArm){
        if(this.arms.size()<2){
            this.arms.add(newArm);
        } else {
            System.out.println(this.name + " doesn't have room for more arms.");
        }
    }

    public void addLeg(Leg newLeg){
        if(this.legs.size()<4){
            this.legs.add(newLeg);
        } else {
            System.out.println(this.name + " doesn't have room for more legs.");
        }
    }

    public void removeArm(int armNum){

        this.arms.remove(armNum);
    }

    public void removeLeg(int legNum){
//        int legNum = this.legs.indexOf(oldLeg);
        this.legs.remove(legNum);
    }

    public int numLegs(){
        return this.legs.size();
    }

    public int numArms(){
        return this.arms.size();
    }

    public String getName(){
        return this.name;
    }

    public boolean hasBody(){
//        boolean hasABody = false;
        if (this.roboBody != null){
            return true;
        }
        return false;
    }



}
