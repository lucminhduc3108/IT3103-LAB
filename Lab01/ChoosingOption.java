/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapcoban;

/**
 *
 * @author admin
 */
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ChoosingOption {
    public static void main(String[] args) 
    {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?", null, JOptionPane.YES_NO_OPTION);
        //String[] options = {"I do", "I don't"};  
        //int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", null,  
        //JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You've chosen: " + ( option == JOptionPane.YES_OPTION ? "I do" : "I don't"));
        
        System.exit(0);
    }
}

//Question1: Chương trình sẽ coi đó là No tại vì phía đằng sau ta có đoạn lệnh "? "Yes" : "No". Nếu không phải lựa chọn Yes thì sẽ in ra No.


//Question2: 

/*Để có chính xác 2 lựa chọn Yes/No thay vì Yes/No/Cancel ta sẽ thêm parameter JOptionPane.YES_NO_OPTION 
 
    int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?", null, JOptionPane.YES_NO_OPTION);
*/

/*    Ta sẽ sử dụng showOptionDialog thay vì showConfirmDialog, vì showConfirmDialog không cho phép tùy chỉnh văn bản trên các nút Yes/No. 
    
        String[] options = {"I do", "I don't"};  
        int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", null,  
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You've chosen: " + ( option == JOptionPane.YES_OPTION ? "I do" : "I don't"));  
*/


