
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

 public class Clients extends Application{
 
 public static void main(String[]args){
    launch(args);
	}
	
	public void start(Stage stage){
	Text text1= new Text("First name");
	Text text2= new Text("Last name");
	Text text3= new Text("Surname");
	Text text4= new Text("Date Of Birth");
	Text text6= new Text("Email");
	Text text7= new Text("Password");
	Text text8= new Text("Confirm password");
	Text text9= new Text("Phone number");
	Text text10= new Text("Address");
	Text text11= new Text("Arrival date");
	Text text12= new Text("Departure date ");
	
	TextField textField1 = new TextField();
	TextField textField2 = new TextField();
	TextField textField3 = new TextField();
	TextField textField6 = new TextField();
	PasswordField textField7 = new PasswordField();
	PasswordField textField8 = new PasswordField();
	TextField textField9 = new TextField();
	TextField textField10 = new TextField();
	
	DatePicker datePicker1 = new DatePicker();
	DatePicker datePicker2 = new DatePicker();
	DatePicker datePicker3 = new DatePicker();
	
	Button button1 = new Button("Register");
	Button button2 = new Button("Complete Registration");
	
	button2.setOnAction(e -> {
      System.out.print("Thank you for registering for the hotel reservation system"); 		
      button2.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
     	  
	});	  
	
	GridPane gridPane = new GridPane();
	gridPane.setMinSize(800, 400);
	gridPane.setPadding(new Insets(20, 20, 20, 20));
	
	gridPane.setVgap(5);
	gridPane.setHgap(5);
	
	gridPane.setAlignment(Pos.CENTER);
	
	gridPane.add(text1 ,0, 0);
	gridPane.add(textField1 ,1, 0);
	gridPane.add(text2 ,0, 1);
	gridPane.add(textField2 ,1, 1);
	gridPane.add(text3 ,0, 2);
	gridPane.add(textField3 ,1, 2);
	gridPane.add(text4 ,0, 3);
	gridPane.add(datePicker1, 1, 3);
	gridPane.add(text6 ,0, 5);
	gridPane.add(textField6 ,1, 5);
	gridPane.add(text7 ,0, 6);
	gridPane.add(textField7 ,1, 6);
	gridPane.add(text8 ,0, 7);
	gridPane.add(textField8 ,1, 7);
	gridPane.add(text9 ,0, 8);
	gridPane.add(textField9 ,1, 8);
	gridPane.add(text10 ,0, 9);
	gridPane.add(textField10 ,1, 9);
	gridPane.add(text11 ,0, 10);
	gridPane.add(datePicker2, 1, 10);
	gridPane.add(text12 ,0, 11);
	gridPane.add(datePicker3, 1, 11);
	gridPane.add(button1, 0, 12);
	gridPane.add(button2, 1, 12);
	
	button1.setStyle("-fx-background-color: maroon; -fx-text-fill: white;");
	button2.setStyle("-fx-background-color: maroon; -fx-text-fill: white;");
	
	
	text1.setStyle("-fx-font: normal bold 20px 'serif' ");
	text2.setStyle("-fx-font: normal bold 20px 'serif' ");
	text3.setStyle("-fx-font: normal bold 20px 'serif' ");
	text4.setStyle("-fx-font: normal bold 20px 'serif' ");
	
	text6.setStyle("-fx-font: normal bold 20px 'serif' ");
	text7.setStyle("-fx-font: normal bold 20px 'serif' ");
	text8.setStyle("-fx-font: normal bold 20px 'serif' ");
	text9.setStyle("-fx-font: normal bold 20px 'serif' ");
	text10.setStyle("-fx-font: normal bold 20px 'serif' ");
	text11.setStyle("-fx-font: normal bold 20px 'serif' ");
	text12.setStyle("-fx-font: normal bold 20px 'serif' ");
	gridPane.setStyle("-fx-background-color: BEIGE;");
	
	Scene scene = new Scene(gridPane);
	
	stage.setTitle(" Registration Page");
	stage.setScene(scene);
	stage.show();
	
	
	}
	
	}
	
	

