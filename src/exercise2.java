import javax.swing.JOptionPane;

public class exercise2 {
    public static void main(String[] args){
        String firstName, initial, secondName, distanceCycledAsAString = " ";
        int distanceCycled;
        double rateA, rateB;

        firstName = JOptionPane.showInputDialog("What is your first name ? ");
        initial = JOptionPane.showInputDialog("What is you initial ?");
        secondName = JOptionPane.showInputDialog("What is your second name ?  ");

        distanceCycledAsAString = JOptionPane.showInputDialog("what distance did you cycle ? " + "km");
        distanceCycled = Integer.parseInt(distanceCycledAsAString);



        rateA = distanceCycled * 0.07;
        rateB = (distanceCycled * 0.10)-0.3;



        if (distanceCycled >= 10){
            JOptionPane.showMessageDialog(null, "Your name is " + firstName+ " " + initial+ " " + secondName +" " +"\n the amount of money owed is " + (String.format("%.2f €", rateA)),
                    "Program Result", JOptionPane.INFORMATION_MESSAGE);}
        else{
            JOptionPane.showMessageDialog(null, "Your name is " + firstName +" "+ initial+ " " + secondName + " "+ "\n the amount of money owed is " + (String.format("%.2f €", rateB)),
                    "Program Result", JOptionPane.INFORMATION_MESSAGE);}

        System.exit(0);
    }

}






