//import java.util.Random;
import java.util.Scanner;

//public class Rock {
       //int rock=0;
       //int paper=1;
       //int scissors=2;
       import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Rock extends JFrame implements ActionListener {
    private JButton rockButton, paperButton, scissorsButton;
    private JLabel resultLabel;

    public Rock() {
        setTitle("RPS");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");

        resultLabel = new JLabel("Result: ");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);

        setVisible(true);
    }


    public static void main(String[] args) {
       // int choice;
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();

        Random random = new Random();
        //String player = scanner.next().toLowerCase();

        int robot = random.nextInt(3);

        if(robot==player){
            System.out.println("its a tie");
        }
        else if(robot==0&&player==1||robot==1&&player==2||robot==2&&player==0){
            System.out.println("you are winner");
        }
        else{
            System.out.println("you lose!");
        }

        System.out.println("computer choice is "+robot);
        if(robot==0){
           System.out.println(" robot choice is rock");
        }
        else if(robot==1){
            System.out.println("robot choice  paper");
        }
        else{
           System.out.println("robot choice is scissors");

        }

    }
}
