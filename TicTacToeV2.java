import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeV2 implements ActionListener {
    /*Instance Variables*/
    private int[][] winCombinations = new int[][] {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, //horizontal wins
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, //virticle wins
            {0, 4, 8}, {2, 4, 6}             //diagonal wins
        };
    private JFrame window = new JFrame("Tic-Tac-Toe");
    private JButton buttons[] = new JButton[9];
    private int count = 0;
    private String letter = "";
    private boolean win = false;

    public TicTacToeV2(){
    /*Create Window*/
    window.setSize(300,300);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(new GridLayout(3,3));
    
    /*Add Buttons To The Window*/
    for(int i=0; i<=8; i++){
        buttons[i] = new JButton();
        window.add(buttons[i]);
        buttons[i].addActionListener(this);
    }
    
    /*Make The Window Visible*/
    window.setVisible(true);
    }
    
    /**
     When an object is clicked, perform an action.
     @param a action event object
     */
    public void actionPerformed(ActionEvent a) {
        count++;
        
        /*Calculate whose turn it is*/
        if(count % 2 == 0){
            letter = "O";
        } else {
            letter = "X";
        }

        /*Write the letter to the button and deactivate it*/
         JButton pressedButton = (JButton)a.getSource(); 
         pressedButton.setText(letter);
         pressedButton.setEnabled(false);
        
        /*Determine who won*/
        for(int i=0; i<=7; i++){
            if( buttons[winCombinations[i][0]].getText().equals(buttons[winCombinations[i][1]].getText()) && 
                buttons[winCombinations[i][1]].getText().equals(buttons[winCombinations[i][2]].getText()) && 
                buttons[winCombinations[i][0]].getText() != ""){
                win = true;
            }
        }
        
        /*Show a dialog when game is over*/
        if(win == true){
            JOptionPane.showMessageDialog(null, letter + " wins the game!");
            System.exit(0);
        } else if(count == 9 && win == false){
            JOptionPane.showMessageDialog(null, "The game was tie!");
            System.exit(0);
        }        
    }
    
    public static void main(String[] args){
        TicTacToeV2 starter = new TicTacToeV2();
    }
}