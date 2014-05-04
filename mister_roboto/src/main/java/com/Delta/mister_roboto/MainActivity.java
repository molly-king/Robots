package com.Delta.mister_roboto;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        String jname = "Jeeves";
        Body jBody = new Body();
        Arm jArm1 = new Arm();
        Arm jArm2 = new Arm();
        Leg jLeg1 = new Leg();
        Leg jLeg2 = new Leg();
        Leg jLeg3 = new Leg();
        Leg jLeg4 = new Leg();
        Robot jeevesTheRobot = new Robot(jname, jBody, jLeg1, jLeg2, jLeg3, jLeg4, jArm1, jArm2);
        jeevesTheRobot.setName(null);
        robotGreeting(jeevesTheRobot);
        FixerBot bot = new FixerBot();
//        Robot jeevesTheRobot = new Robot();
////        jeevesTheRobot.setName(jname);
//        jeevesTheRobot.setBody(jBody);
//        jeevesTheRobot.addArm(jArm1);
//        boolean testingIt = isComplete(jeevesTheRobot);
    }

    public boolean isComplete(Robot testRobot){
        boolean isWhole = true;

        testerLoop:
        do{
            if(testRobot.getName() == null){
                isWhole = false;
                break testerLoop;
            }
            if(testRobot.hasBody() == false){
                isWhole = false;
                break testerLoop;
            }
            if(testRobot.numArms() != 2){
                isWhole = false;
                break testerLoop;
            }
            if(testRobot.numLegs() != 4){
                isWhole = false;
                break testerLoop;
            }
        } while (1<1);

        return isWhole;
    }

    public boolean completeButNameless(Robot testRobot){
        boolean isWhole = true;

        testerLoop:
        do{
            if(testRobot.getName() != null){
                isWhole = false;
                break testerLoop;
            }
            if(testRobot.hasBody() == false){
                isWhole = false;
                break testerLoop;
            }
            if(testRobot.numArms() != 2){
                isWhole = false;
                break testerLoop;
            }
            if(testRobot.numLegs() != 4){
                isWhole = false;
                break testerLoop;
            }
        } while (1<1);

        return isWhole;
    }


    public void robotGreeting(Robot goodRobot){
        String botName = goodRobot.getName();
        if(isComplete(goodRobot)){
            Log.e("ROBOTO", "My name is " + botName + ". May I help you?");
        } else if(completeButNameless(goodRobot)){
            Log.e("ROBOTO", "Good morning, Dev.");
        } else {
            Log.e("ROBOTO", "ERROR: Incomplete Robot.");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
