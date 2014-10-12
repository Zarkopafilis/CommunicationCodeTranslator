import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	private static CCTranslator trans;
	private TextArea input;
	private TextArea output;
	
	public static void main(String[] args) {
		
		try {
			trans = new CCTranslator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		StackPane root = new StackPane();
		
		stage.setTitle("CCTranslator");
		
		stage.setWidth(800);
		
		stage.setHeight(600);
		
		VBox box = new VBox();
		
		box.setAlignment(Pos.CENTER);
		
		box.setSpacing(30);
		
		input = new TextArea("");
		input.setPromptText("Write stuff to encrypt here");
		
		output = new TextArea("");
		output.setPromptText("Write stuff to decrypt here");
		
		input.setMaxWidth(750);
		input.setPrefHeight(250);
		
		output.setMaxWidth(750);
		output.setPrefHeight(250);
		
		//todo listeners
		
		box.getChildren().addAll(input , output);
		
		root.getChildren().add(box);
		
		stage.setScene(new Scene(root));
		stage.show();
	}
	
}
