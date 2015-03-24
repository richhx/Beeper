/*
 * This is an application that is currently being used as a beeper/metronome
 * It can be modified to become a music player or alarm clock. Creating a new
 * StateMachine is where the actual work occurs. 
 */

package com.richardhuang.beeper;

/**
 *
 * @author Richard
 */

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import userclasses.StateMachine;

public class Beeper {
    private Form current;

    public void init(Object context) {
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");        
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }
}
