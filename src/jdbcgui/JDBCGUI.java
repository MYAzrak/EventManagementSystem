package jdbcgui;

import com.formdev.flatlaf.FlatLightLaf;

public class JDBCGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatLightLaf.setup();
        (new LoginForm()).setVisible(true);
    }
}
