package application;
	
import javax.swing.ImageIcon;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("FreeTheFendt");
			
			
			Group root = new Group();
			Canvas canvas = new Canvas(1600, 800);
			GridPane gridpane = new GridPane();
			gridpane.getRowConstraints();
			GraphicsContext gc = canvas.getGraphicsContext2D();
			Scene theScene = new Scene(root);
			primaryStage.setScene(theScene);
					
			root.getChildren().add(canvas);
			Button l1 = new Button("Start");
			Button Lobby = new Button("LEAVE");
			l1.setPrefHeight(150);
			l1.setPrefWidth(400);
			l1.setLayoutX(625);
			l1.setLayoutY(350);			
			root.getChildren().add(l1);
		
			Image background = new Image("Images/neuerWald_back.jpg");
			
			gc.drawImage(background, 0, 0);
			
			Font theFont = new Font("Times New Roman", 60);
			gc.setFont(theFont);
			gc.setFill(Color.BLACK);
			gc.fillText("Free the Fendt", 650, 300);
			
			l1.setOnAction((ActionEvent e) -> {
				gc.drawImage(background, 0, 0);
				root.getChildren().remove(l1);
				root.getChildren().add(Lobby);
//			gc.fillText("LEVEL 1", 700, 50);			
				Image pg = new Image("Images/gh.png", 700, 700, false, false);
				gc.drawImage(pg, 450, 50);
				
				Punkt p1 = new Punkt(0, 0);
				Punkt p2 = new Punkt(70, 0);
				Punkt p3 = new Punkt(140, 0);
				Punkt p4 = new Punkt(210, 0);
				Punkt p5 = new Punkt(280, 0);
				
				Image Im1 = new Image("Images/Vogel_Auto.jpg", 140, 70, false, false);
				gc.drawImage(Im1, p1.getX(), p1.getY());
				gc.drawImage(Im1, p3.getX(), p3.getY());
				
			});
			
			Lobby.setOnAction((ActionEvent e) -> {
				gc.drawImage(background, 0, 0);
				gc.fillText("Free the Fendt", 650, 300);
				l1.setPrefHeight(150);
				l1.setPrefWidth(400);
				l1.setLayoutX(625);
				l1.setLayoutY(350);			
				root.getChildren().add(l1);
				root.getChildren().remove(Lobby);
			});
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void handle(ActionEvent event)
	{
	
	}
}



