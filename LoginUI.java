import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class LoginUI extends Application
{
	
	public TabPane tabPane;
	public TextField login;
	public TextField firstName;
	public TextField lastName;
	public TextField dateOB;
	public TextField username;
	public TextField password;
	public Button button1;
	public Button button2;
	public VBox order;
	public VBox orderTab1;
	public VBox orderTab2;
	public HBox orderHTab1;
	
	public void start(Stage stage) 
	{
		StackPane base = new StackPane();
		order = new VBox();
		tabPane = new TabPane();
		
		
		//Tab 1 start
		orderTab1 = new VBox();
		orderHTab1 = new HBox();
		
		
		
		orderTab1.setAlignment(Pos.CENTER);
		orderHTab1.setAlignment(Pos.CENTER);
		
		login = new TextField("Login");
		login.setAlignment(Pos.CENTER);
		login.setEditable(false);
		login.setStyle("-fx-font-weight: bold");
		
		firstName = new TextField();
		firstName.setPromptText("First Name");
		
		
		lastName = new TextField();
		lastName.setPromptText("Last Name");
		
		dateOB = new TextField();
		dateOB.setMaxWidth(150);
		dateOB.setPromptText("Date of birth (MM/DD/YY)");
		
		button1 = new Button("Login");
		dateOB.setAlignment(Pos.CENTER);
		
		orderHTab1.getChildren().addAll(firstName,lastName);
		
		orderTab1.getChildren().addAll(orderHTab1, dateOB, button1);
		
		orderTab1.setPadding(new Insets(80.0,0,0,0));
		orderTab1.setSpacing(10.0);
		
		Tab tab1 = new Tab();
        tab1.setText("Patient");
        tab1.setContent(orderTab1);
        
        //Tab 1 end
        
        
        //Tab 2 start
        orderTab2 = new VBox();
        
        username = new TextField();
        username.setPromptText("Username");
        username.setMaxWidth(150);
        
        password = new TextField();
        password.setPromptText("Password");
        password.setMaxWidth(150);
        
        button2 = new Button("Login");
        
        
        orderTab2.getChildren().addAll(username,password,button2);
        orderTab2.setAlignment(Pos.CENTER);
        orderTab2.setPadding(new Insets(80.0,0,0,0));
		orderTab2.setSpacing(10.0);
        
        Tab tab2 = new Tab();
		tab2.setText("Staff");
		tab2.setContent(orderTab2);
		
		//End of tab2
		
		
		//Setting up the tabs
		tabPane.getSelectionModel().select(0);
        tabPane.getTabs().addAll(tab1, tab2);
        
        
        //Setting up the format of the page
        order.getChildren().addAll(login,tabPane);

        base.getChildren().add(order);
        
		Scene scene = new Scene(base, 400, 300);
		stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
	}
	
	public static void main(String[] args)
    {
        launch(args);
    }

}
