import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("handSanitizerBottleView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Hand Sanitizer Bottle Creation Tool");
        stage.show();
    }
}
//
//    HandSanitizerBottle bottle1 = new HandSanitizerBottle("Utsav's Elixer",13,75,
//            LocalDate.of(2021,12,25),60);
//    HandSanitizerBottle bottle2 = new HandSanitizerBottle("Coffee Scent",500,99,
//            LocalDate.of(2022,01,17),5.45);
//
//        System.out.printf("Bottle 1: %s%n", bottle1.toString());
//        System.out.printf("Bottle 2: %s", bottle2.toString());
//
//        System.out.printf("%nAmount dispensed: %d ml%n", bottle1.dispense());
//        System.out.printf("Amount dispensed: %d ml%n", bottle1.dispense());
//        System.out.printf("Amount dispensed: %d ml%n", bottle1.dispense());
//
//        System.out.printf("The bottle now has %d ml%n", bottle1.getVolumeRemaining());
//        bottle1.refill();
//        System.out.printf("The bottle now has %d ml", bottle1.getVolumeRemaining());

