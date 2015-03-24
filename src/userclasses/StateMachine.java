/**
 * StateMachine - handles ActionEvents
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.codename1.io.Storage;
import com.codename1.io.Preferences;
import com.codename1.media.Media;
import com.codename1.media.MediaManager;
import com.richardhuang.beeper.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Last change: 8-7-2014
 * @author Richard Huang
 */

public class StateMachine extends StateMachineBase
{
    private Timer timer;
    private Beep beep;
    private boolean start;
    private boolean timerStart;
    private static InputStream audio;
    public static final int INTERVAL = 20;
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * This method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     * @param res
     */
    @Override
    protected void initVars(Resources res) 
    {
        timer = new Timer();
        beep = new Beep();
        start = false;
        timerStart = false;
        audio = fetchResourceFile().getData("click.mp3");
    }
    
    /**
     * This method starts the timer on the creation of the main 
     */
    @Override
    protected void onCreateMain() 
    {
        timer.schedule(beep, 0, INTERVAL);
    }
    
    /**
     * Plays and stops beep
     * @param c
     * @param event
     */
    @Override
    protected void onMain_CenterAction(Component c, ActionEvent event)
    {
        start = !start;   //play and stop
        if(start)
        {
            beep.setGo(true);       //enables beep
            
            //Displays duration in durationText
            TextField durationText = findDuration();
            String str = durationText.getText();
            if(isNumeric(str)) 
                beep.setDuration(Integer.parseInt(str));
            int duration = beep.getDuration();
            durationText.setText(Integer.toString(duration));
        }
        else
        {
            beep.setGo(false);      //disables beep
        }
    }
    
    /**
     * Decreases the occurrence of beep by increasing beep duration
     * @param c
     * @param event 
     */
    @Override
    protected void onMain_UpAction(Component c, ActionEvent event) {
        int duration = beep.getDuration();
        duration += 20;
        beep.setDuration(duration);
        TextField durationText = findDuration();
        durationText.setText(Integer.toString(duration));
    }
    
    /**
     * Increases the occurrence of beep by decreasing beep duration
     * @param c
     * @param event 
     */
    @Override
    protected void onMain_DownAction(Component c, ActionEvent event) {
        int duration = beep.getDuration();
        duration -= 20;
        if(duration <= 0)       //cannot play at < 0 intervals
            duration = 10;
        beep.setDuration(duration);
        TextField durationText = findDuration();
        durationText.setText(Integer.toString(duration));
    }
    
    /**
     * Returns if str is a number
     * @param str
     * @return str
     */
    public boolean isNumeric(String str)
    {
        try
        {
            Double d = Double.parseDouble(str);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
    
    /**
     * A (bad) solution to obtaining "click.mp3" from resource file since it is 
     * protected by UIBuilder class
     * @return audio
     */
    public static InputStream getAudio()
    {
        return audio;
    }
    
    /**
     * Saves the text in durationText as String. Can be altered to store more
     * data
     * @param c
     * @param event 
     */
    @Override
    protected void onMain_SaveAction(Component c, ActionEvent event) 
    {
        String duration = findDuration().getText();
        ArrayList<String> data = new ArrayList<String>();
        data.add(duration);
        Storage.getInstance().writeObject("data", data);
    }

    /** 
     * Loads the first String in data. Can be altered to load more (loop)
     * @param c
     * @param event 
     */
    @Override
    protected void onMain_LoadAction(Component c, ActionEvent event) 
    {
        ArrayList<String> data = (ArrayList<String>)Storage.getInstance().readObject("data");
        if(data != null && data.size() > 0)
        {
            String str = data.get(0);
            findDuration().setText(str);
            c.getComponentForm().revalidate();
        }
    }
}
