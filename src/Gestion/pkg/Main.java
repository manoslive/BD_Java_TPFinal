/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.pkg;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author shaun
 */
public class Main extends Application{
    public static ConnectionOracle connection;

    @Override
    public void start(Stage primaryStage) throws Exception {
        connection = new ConnectionOracle();
        connection.setConnection("cooperch","ORACLE1");
        connection.connecter();
        Menu monMenu = new Menu(connection.getConnection());
        monMenu.setVisible(true);
    }
    
}
