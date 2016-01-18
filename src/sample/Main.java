package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact, answer;
        System.out.print("Enter number to find factorial: ");
        fact = input.nextInt();

        answer = factorial(fact);

        System.out.print("The Factorial of the number you entered is " + answer +".");
    }

    public static int factorial(int n){
        int answer;
        if(n == 1){
            return 1;
        }
        answer = n *(factorial(n-1));

        return answer;
    }
}
