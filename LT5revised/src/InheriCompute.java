import javax.swing.*;

import javax.swing.*;
public class InheriCompute {


    public static int compute( String value1,String value2){

    int giv1 = Integer.parseInt(value1);
    int giv2 = Integer.parseInt(value2);
    int total = giv1 + giv2;
    return total;
}


public static void displayMessage(String total){
    JOptionPane.showMessageDialog(null, "Message: " +  total, total ,JOptionPane.INFORMATION_MESSAGE);
 }
}




