/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findBlank(Component root) {
        return (com.codename1.ui.Container)findByName("Blank", root);
    }

    public com.codename1.ui.Container findBlank() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Blank", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Blank", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCenter(Component root) {
        return (com.codename1.ui.Button)findByName("Center", root);
    }

    public com.codename1.ui.Button findCenter() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Center", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Center", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findDown(Component root) {
        return (com.codename1.ui.Button)findByName("Down", root);
    }

    public com.codename1.ui.Button findDown() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Down", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Down", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLoad(Component root) {
        return (com.codename1.ui.Button)findByName("Load", root);
    }

    public com.codename1.ui.Button findLoad() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Load", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Load", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLeft(Component root) {
        return (com.codename1.ui.Button)findByName("Left", root);
    }

    public com.codename1.ui.Button findLeft() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Left", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Left", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findGrid(Component root) {
        return (com.codename1.ui.Container)findByName("Grid", root);
    }

    public com.codename1.ui.Container findGrid() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Grid", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Grid", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findRight(Component root) {
        return (com.codename1.ui.Button)findByName("Right", root);
    }

    public com.codename1.ui.Button findRight() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Right", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Right", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findDuration(Component root) {
        return (com.codename1.ui.TextField)findByName("Duration", root);
    }

    public com.codename1.ui.TextField findDuration() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Duration", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Duration", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSave(Component root) {
        return (com.codename1.ui.Button)findByName("Save", root);
    }

    public com.codename1.ui.Button findSave() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Save", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Save", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findUp(Component root) {
        return (com.codename1.ui.Button)findByName("Up", root);
    }

    public com.codename1.ui.Button findUp() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Up", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Up", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("GUI 1".equals(f.getName())) {
            exitGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitGUI1(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("GUI 1".equals(f.getName())) {
            beforeGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeGUI1(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("GUI 1".equals(c.getName())) {
            beforeContainerGUI1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerGUI1(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("GUI 1".equals(f.getName())) {
            postGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postGUI1(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("GUI 1".equals(c.getName())) {
            postContainerGUI1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerGUI1(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("GUI 1".equals(rootName)) {
            onCreateGUI1();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateGUI1() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("GUI 1".equals(f.getName())) {
            getStateGUI1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateGUI1(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("GUI 1".equals(f.getName())) {
            setStateGUI1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateGUI1(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Main")) {
            if("Duration".equals(c.getName())) {
                onMain_DurationAction(c, event);
                return;
            }
            if("Up".equals(c.getName())) {
                onMain_UpAction(c, event);
                return;
            }
            if("Left".equals(c.getName())) {
                onMain_LeftAction(c, event);
                return;
            }
            if("Center".equals(c.getName())) {
                onMain_CenterAction(c, event);
                return;
            }
            if("Right".equals(c.getName())) {
                onMain_RightAction(c, event);
                return;
            }
            if("Down".equals(c.getName())) {
                onMain_DownAction(c, event);
                return;
            }
            if("Save".equals(c.getName())) {
                onMain_SaveAction(c, event);
                return;
            }
            if("Load".equals(c.getName())) {
                onMain_LoadAction(c, event);
                return;
            }
        }
    }

      protected void onMain_DurationAction(Component c, ActionEvent event) {
      }

      protected void onMain_UpAction(Component c, ActionEvent event) {
      }

      protected void onMain_LeftAction(Component c, ActionEvent event) {
      }

      protected void onMain_CenterAction(Component c, ActionEvent event) {
      }

      protected void onMain_RightAction(Component c, ActionEvent event) {
      }

      protected void onMain_DownAction(Component c, ActionEvent event) {
      }

      protected void onMain_SaveAction(Component c, ActionEvent event) {
      }

      protected void onMain_LoadAction(Component c, ActionEvent event) {
      }

}
