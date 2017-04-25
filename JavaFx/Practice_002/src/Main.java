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
 * Main.java
 *
 * This is a JavaFX practice based on Tutorial 2 from The New Boston
 */
public class Main extends Application implements EventHandler<ActionEvent> {
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
        button.setOnAction(this);

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

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            System.out.println("Button was pressed");
        }
    }
}
