/* Richard Huang
   8-7-2014
   Beep - plays a beep sound when scheduled to
 */

package com.richardhuang.beeper;

import userclasses.StateMachine;
import com.codename1.media.Media;
import com.codename1.media.MediaManager;
import com.codename1.ui.util.UIBuilder;
import com.codename1.ui.util.Resources;
import java.util.TimerTask;
import java.io.InputStream;
import java.io.IOException;

public class Beep extends TimerTask
{
    private int delay;
    private int duration;
    private int count;
    private boolean go;     //used to schedule beep

    public Beep()
    {
        delay = 0;
        duration = 1000;
        count = 0;
        go = false;
    }

    public Beep(int delay, int duration)
    {
        this.delay = delay;
        this.duration = duration;
    }

    //Plays a beep
    public void run()
    {
        count++;
        if( (count >= duration / StateMachine.INTERVAL) && go)   //play beep at interval
        {
            InputStream clickAudio = StateMachine.getAudio();
            try
            {
                clickAudio.reset();     //start from beginning
                final Media m = MediaManager.createMedia(clickAudio, "audio/mp3");
                m.play();
                setCount(0);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void setDelay(int delay)
    {
        this.delay = delay;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }
        
    public void setCount(int count)
    {
        this.count = count;
    }
    
    public void setGo(boolean go)
    {
        this.go = go;
    }

    public int getDelay()
    {
        return delay;
    }

    public int getDuration()
    {
        return duration;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public boolean getGo()
    {
        return go;
    }
}