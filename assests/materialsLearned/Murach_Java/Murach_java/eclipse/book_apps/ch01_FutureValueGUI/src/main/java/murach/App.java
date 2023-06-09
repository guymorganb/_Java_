package murach;

import java.text.NumberFormat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {
    private TextField investmentField;
    private TextField interestRateField;
    private TextField yearsField;
    private TextField futureValueField;
	
    public static void main(String[] args) {
        launch(args);
    }
        
    @SuppressWarnings("exports")
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Future Value Calculator");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(10);
        grid.setVgap(10);

        Scene scene = new Scene(grid);
        
        grid.add(new Label("Monthly Investment:"), 0, 0);
        investmentField = new TextField();
        grid.add(investmentField, 1, 0);

        grid.add(new Label("Yearly Interest Rate:"), 0, 1);
        interestRateField = new TextField();
        grid.add(interestRateField, 1, 1);
		grid.add(new Label("Years:"), 0, 2);
        yearsField = new TextField();
        grid.add(yearsField, 1, 2);
        
        grid.add(new Label("Future Value:"), 0, 3);
        futureValueField = new TextField();
        futureValueField.setEditable(false);
        grid.add(futureValueField, 1, 3);

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> calculateButtonClicked());
        
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> exitButtonClicked());
        
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().add(calculateButton);
        buttonBox.getChildren().add(exitButton);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(buttonBox, 0, 4, 2, 1);
               
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void calculateButtonClicked() {
        // get data from text fields
        double investment = Double.parseDouble(investmentField.getText());
        double rate = Double.parseDouble(interestRateField.getText());
        int years = Integer.parseInt(yearsField.getText());

        // calculate future value
        double futureValue = calculateFutureValue(investment, rate, years);

        // set data in read-only text field
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        futureValueField.setText(currency.format(futureValue));            
    }

    public double calculateFutureValue(double investment, double rate, int years) {
        double futureValue = 0.0;
		
        // convert yearly values to monthly values
        double monthlyInterestRate = rate/12/100;
        int months = years * 12;

        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + investment) *
                          (1 + monthlyInterestRate);
        }
        return futureValue;
    }

    private void exitButtonClicked() {
        System.exit(0);   // 0 indicates a normal exit
    }
   
}