//Anthony Franklin afranklin18@cnm.edu
//RockPaperScissors Program2

//RockUI.java

import javax.swing.*;

public class RockUI {
    private RockPS rps;

    // other class variables

    //Constructor
    public RockUI(RockPS rock) {
        rps = rock;
    }

    public void play() {
        //Header in JOption Pane
        JOptionPane.showMessageDialog(null, "\nAnthony Franklin afranklin18@cnm.edu\nWelcome to Rock, Paper, Scissors! Each game is best of 3. Let's go and good luck! \n");

        do {
            rps.reset();
            do {
                // Get user choice
                int userChoice = JOptionPane.showOptionDialog(null, "Rock, Paper, Scissors", "Make your choice", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, rps.options, rps.options[0]);
                rps.setGameStart(userChoice);
                // Display computer choice
                JOptionPane.showMessageDialog(null, rps.getCompChoice());
                // Display round results
                JOptionPane.showMessageDialog(null, rps.getRoundWinLose());

                // when Game is over, display results
            }
            while (!(rps.getGameOver()));
        }
        while (JOptionPane.showConfirmDialog(null, rps.result + "Play again?", "Make your choice", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);


        //  Say goodbye
        JOptionPane.showMessageDialog(null, "\nThanks for playing with me! Final outcome: \nGames played: " + rps.games + "\nPlayer wins: " + rps.wins + "\nPlayer losses: " + rps.losses);
    }
}
