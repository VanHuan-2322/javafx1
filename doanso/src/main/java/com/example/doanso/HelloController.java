package com.example.doanso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {

    @FXML
    TextField guessField;
    @FXML
    private Label resultLabel;

    private int randomNumber;

    @FXML
    private void initialize() {
        Random random = new Random();
        randomNumber = random.nextInt(101);
    }

    @FXML
    private void checkGuess() {
        String guessText = guessField.getText();
        int guess;
        try {
            guess = Integer.parseInt(guessText);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a number.");
            return;
        }

        if (guess == randomNumber) {
            resultLabel.setText("Congratulations! You guessed the correct number.");
        } else if (guess < randomNumber) {
            resultLabel.setText("Too low! Try a higher number.");
        } else {
            resultLabel.setText("Too high! Try a lower number.");
        }
    }
}