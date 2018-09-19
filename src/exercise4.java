import javax.swing.JOptionPane;

public class exercise4 {
    public static void main(String[] args) {
        int number, counter=0;
        String numberString ="",list="";
        numberString = JOptionPane.showInputDialog("Loop " + (counter+1) + " - please enter any number positive or negative (press Q to quite) ");


        while (!numberString.equals("q"))
        {
            list += numberString + "\n";
            number = Integer.parseInt(numberString);


            numberString = JOptionPane.showInputDialog("Loop "+ (counter+1) +" - please enter any number positive or negative (press Q to quite) ");
            counter ++;


        }

        JOptionPane.showMessageDialog(null, "The numbers you entered were" + list + "\n\nand it looped" + " " + (counter+1)
                + "times", "Counter", JOptionPane.INFORMATION_MESSAGE);

    }
}
