package homework.riddle_game;

import design_patterns.template_method.AbstractGame;
import design_patterns.template_method.Game;
import design_patterns.template_method.Pair;
import design_patterns.template_method.Player;

import javax.swing.*;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo
    private final int maxLimit;
    private int numberOfAttempts = 0;
    List<Pair> scores;

    public RiddleGame(int max) {
        this.maxLimit = max;
    }

    @Override
    public void play() {
        String playerName = JOptionPane.showInputDialog("Enter your name");
        Random random = new Random();
        int secretNumber = random.nextInt(this.maxLimit);
        int guess = Integer.parseInt(JOptionPane.showInputDialog(
                "I'm thinking of a number from 0 to " + this.maxLimit + ". Input your guess"));
        numberOfAttempts++;
        while (guess != secretNumber) {
            String inputText = "";
            if (guess < secretNumber) {
                inputText = "The number is higher. Input your guess";
            }
            else {
                inputText = "The number is lower. Input your guess";
            }
            guess = Integer.parseInt(JOptionPane.showInputDialog(
                    inputText));
            numberOfAttempts++;
        }
        int score  = calcScore();
        JOptionPane.showMessageDialog(null,
                "You guessed the number!\n" +
                        "Your score: " + score + ". " + "Best score: 100" +
                        "\nNumber of attempts: " + this.numberOfAttempts);
    }

    private int calcScore() {
        return 100 * (maxLimit - numberOfAttempts) / maxLimit;
    }


    public static void main(String[] args) {
        RiddleGame game = new RiddleGame(10);
        game.play();
    }
}
