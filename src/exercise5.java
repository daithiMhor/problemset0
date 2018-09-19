import javax.swing.JOptionPane;


public class exercise5 {
    public static void main(String[] args) {
        int number1, number2, operator;
        String number1String, number2String, operatorString;
        double result =0;

        number1String = JOptionPane.showInputDialog("Please enter a first number ?");
        number1 = Integer.parseInt(number1String);

        number2String = JOptionPane.showInputDialog("Please enter a second number ?");
        number2 = Integer.parseInt(number2String);


        operatorString = JOptionPane.showInputDialog("Please Choice a function "+ "\n(1)Division\n(2)multiplication\n(3)addition\n(4)subtraction");
        operator=Integer.parseInt(operatorString);

        switch (operator)
        {
            case 1:
                result = number1 / number2;
                break;
            case 2:
                result = number1 * number2;
                break;
            case 3:
                result = number1 + number2;
                break;
            case 4:
                result = number1 - number2;
                break; }

            JOptionPane.showMessageDialog(null, "RESULT = " + result, "Answer", JOptionPane.INFORMATION_MESSAGE);



    }
}
