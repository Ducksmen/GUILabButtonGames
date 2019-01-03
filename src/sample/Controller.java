package sample;

import javafx.event.ActionEvent;


import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

public class Controller
{
    public Label Score;
    public Label txt;
    private int score = 0;
    Timer timer = new Timer();

    TimerTask task = new TimerTask()
    {

    }
    public void pressButton(ActionEvent event)
    {
        score++;
        Score.setText("Score: " + String.valueOf(score));
    }
}
