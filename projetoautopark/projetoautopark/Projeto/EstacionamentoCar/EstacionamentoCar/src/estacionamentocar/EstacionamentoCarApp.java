/*
 * EstacionamentoCarApp.java
 */

package estacionamentocar;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;


/**
 * The main class of the application.
 */
public class EstacionamentoCarApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        
        try {
            show(new EstacionamentoCarView(this));
            
        } catch (SQLException ex) {
            Logger.getLogger(EstacionamentoCarApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     * @param root
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of EstacionamentoCarApp
     */
    public static EstacionamentoCarApp getApplication() {
        return Application.getInstance(EstacionamentoCarApp.class);
    }

    /**
     * Main method launching the application.
     * @param args
     */
    public static void main(String[] args) {
        launch(EstacionamentoCarApp.class, args);
    }
}
