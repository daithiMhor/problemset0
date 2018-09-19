import javax.swing.JOptionPane;

public class exercise3 {
    public static void main(String[] args) {
        String firstName, secondName, incomeASAString = "";
        int income, rateA = 0, rateB = 20, rateC =41;
        double finalIncomeA, finalIncomeB, finalIncomeC, taxPaidA, taxPaidB, taxpaidC;


        // creating input dialogs

        firstName = JOptionPane.showInputDialog("What is your first name ?");
        secondName = JOptionPane.showInputDialog("What is your second name ?");
        incomeASAString = JOptionPane.showInputDialog("How much of an income do you earn €?  ");
        income = Integer.parseInt(incomeASAString);

        finalIncomeA = income;
        finalIncomeB = (income - (income * rateB)/100);
        finalIncomeC = (income - (income * rateC)/100);

        taxPaidA = 0;
        taxPaidB = (income * rateB/100);
        taxpaidC = (income * rateC/100);


        //creating the final show dialog box
        if(income <= 20000) {
            JOptionPane.showMessageDialog(null, "Your name is "+ " " + firstName + " " + "and your second name is" + " " + secondName +
                    "\nthe amount you earn is € " + income +   "your rate of tax is" + rateA +"%" + "the amount of tax you paid was €" + taxPaidA +
                    "\nyour final income is €" + finalIncomeA , "Tax Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (income >=20000.01 && income <= 36000.00)
        {
            JOptionPane.showMessageDialog(null, "Your name is "+ " " + firstName + "and your second name is" + " " + secondName +
                    "\nthe amount you earn is € " + income + "your rate of tax is" + rateB +"%"+ "the amount of tax you paid was €" + taxPaidB +
                    "\nyour final income is €" + finalIncomeB , "Tax Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Your name is " + " " + firstName + "and your second name is  " + " "  + secondName +
                    "\nthe amount you earn is € " + income + "your rate of tax is" + " " + rateC +"%"+ "the amount of tax you paid was €" + " " + taxpaidC +
                    "\nyour final income is" + finalIncomeC , "Tax Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }



}





