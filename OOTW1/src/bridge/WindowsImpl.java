package bridge;

import javax.swing.*;
import java.awt.*;


public class WindowsImpl implements WindowImpl{
    public WindowsImpl(){
        try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    @Override
    public Component DevDrawText() {

        DrawText mainPanel = new DrawText("Windows-DrawText");
        return mainPanel;
    }

    @Override
    public Component DevDrawRect() {
        DrawRect mainPanel = new DrawRect();
        return mainPanel;
    }
}
