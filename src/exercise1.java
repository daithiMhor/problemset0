import javax.swing.JOptionPane;

public class exercise1 {
    public static void main(String[] args) {
        String firstName, secondName, snacksToAString;
        int snacks;
        float priceToPay;
        final float COST = 2.00f;

        // creating input dialogs

        firstName = JOptionPane.showInputDialog("What is your name ?");
        secondName = JOptionPane.showInputDialog("What is your second name ?");
        snacksToAString = JOptionPane.showInputDialog("How many snacks would you like ?");
        snacks = Integer.parseInt(snacksToAString);

        priceToPay = snacks * COST;

        //creating the final show dialog box

        JOptionPane.showMessageDialog(null, "Your name is " + firstName + "and your second name is " + " " + secondName + " the amount you owe is € " + priceToPay, "Output Info", JOptionPane.INFORMATION_MESSAGE);


    }
    }
