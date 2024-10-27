import java.awt.*;
import java.awt.event.*;

public class Calculator {
    static Frame myFrame;
    static Label lbl_value1, lbl_value2, lbl_output ,lbl_result;
    static Font fontlblv1,fontTxtFv1,fontlblOutput, fontlblResult;

    static TextField tfv1, tfv2;
    static Button btn_add, btn_sub, btn_multiply, btn_divide;

    static void mainFrame() {
        // Object
        myFrame = new Frame("Basic Calculator by JV Negranza");
        myFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        lbl_value1 = new Label("Value 1 : ");
        fontlblv1 = new Font("Arial", Font.BOLD, 24);
        fontTxtFv1 = new Font("Arial", Font.BOLD, 34);
        fontlblOutput = new Font("Aptos Black", Font.ITALIC, 40);
        fontlblResult = new Font("Arial", Font.BOLD,40);
        lbl_value2 = new Label("Value 2 : ");
        lbl_result = new Label("Result : ");
        lbl_output = new Label("Null");
        tfv1 = new TextField();
        tfv2 = new TextField();
        btn_add = new Button("+");
        btn_sub = new Button("-");
        btn_multiply = new Button("*");
        btn_divide = new Button("/");

        // Setting
        myFrame.setSize(450,450);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
        myFrame.setBackground(Color.CYAN);
        lbl_value1.setBounds(25,45,100,50);
        lbl_value1.setFont(fontlblv1);
        lbl_value2.setFont(fontlblv1);
        lbl_value2.setBounds(25,125,100,50);
        tfv1.setBounds(150,45,200,50);
        tfv2.setBounds(150,125,200,50);
        tfv1.setFont(fontTxtFv1);
        tfv2.setFont(fontTxtFv1);
        btn_add.setBounds(45, 205,70,70);
        btn_add.setFont(fontTxtFv1);
        btn_sub.setBounds(135, 205,70,70);
        btn_sub.setFont(fontTxtFv1);
        btn_multiply.setBounds(235, 205,70,70);
        btn_multiply.setFont(fontTxtFv1);
        btn_divide.setBounds(335, 205,70,70);
        btn_divide.setFont(fontTxtFv1);
        lbl_result.setBounds(25,305,150,100);
        lbl_result.setFont(fontlblResult);
        lbl_output.setBounds(200, 305, 150, 100);
        lbl_output.setFont(fontlblOutput);

        // Add
        myFrame.add(lbl_value1);
        myFrame.add(tfv1);
        myFrame.add(lbl_value2);
        myFrame.add(tfv2);
        myFrame.add(btn_add);
        myFrame.add(btn_sub);
        myFrame.add(btn_multiply);
        myFrame.add(btn_divide);
        myFrame.add(lbl_result);
        myFrame.add(lbl_output);
    }
    static String calculate(char op) {
        String val1 = tfv1.getText();
        String val2 = tfv2.getText();
        int intVal1 = Integer.parseInt(val1);
        int intVal2 = Integer.parseInt(val2);
        double doubleVal1 = Double.parseDouble(val1);
        double doubleVal2 = Double.parseDouble(val2);
        String answer = "";
        if(op == '+'){
            answer = "" +(intVal1 + intVal2);
        }else if(op == '-'){
            answer = "" + (intVal1 - intVal2);
        }else if(op == '*'){
            answer = "" + (intVal1 * intVal2);
        } else if(op == '/'){
            answer = "" + (doubleVal1 / doubleVal2);
        }
        return answer;
    }

    public static void main(String[] args) {
        mainFrame();
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_output.setText(calculate('+'));
            }
        });
        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_output.setText(calculate('-'));
            }
        });
        btn_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_output.setText(calculate('*'));
            }
        });
        btn_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_output.setText(calculate('/'));
            }
        });
    }
}