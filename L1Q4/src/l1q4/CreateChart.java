package l1q4;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.*;
import javafx.scene.Group;


public class CreateChart extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table 1: Total Sales of Product A");
        stage.setWidth(600);
        stage.setHeight(600);
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("January 2016, RM2500", 2500),
                        new PieChart.Data("February 2016,RM1600",1600),
                        new PieChart.Data("March 2016,RM2000", 2000),
                        new PieChart.Data("April 2016,RM2700", 2700),
                        new PieChart.Data("May 2016,RM3200", 3200),
                        new PieChart.Data("Jun 2016,RM800", 800));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Table 1: Total Sales of Product A");
        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();

    }

}