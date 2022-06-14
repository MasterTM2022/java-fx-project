package ru.gb.perov.javafxproject_part2homework4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userAnswer;

    public void clickSendButton(ActionEvent actionEvent) {
        final String answer = userAnswer.getText();
        if (!answer.isBlank()) {
            historyArea.appendText(answer + "\n\n");
        }
        userAnswer.clear();
        userAnswer.requestFocus();
    }


}