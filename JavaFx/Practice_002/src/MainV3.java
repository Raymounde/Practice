import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Alfie on 4/24/2017.
 *
 * MainV3.java
 *
 * This is a JavaFX practice based on Tutorial 2 from The New Boston
 *
 * EventHandler was called via method of the object button using lambda
 */
public class MainV3 extends Application {
    private Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Set Title of the Window
        primaryStage.setTitle("Window Title");

        //Button
        button = new Button();
        button.setText("Click Me!");

        //Implement Event Handler
        button.setOnAction(
                e -> {
                    System.out.println("button was pressed");
                    System.out.println("this is implemented using lambda");
                });

        //Layout
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        //Scene - inside Window
        Scene scene = new Scene(layout, 300, 200);

        // Stage is the Window
        // Scene is inside the window
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
