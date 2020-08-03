package fr.noctu.allatori;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecodeGui extends JFrame{
    private JPanel mainPanel;
    private JTextField obfuscatedStringTextField;
    private JButton convertButton;
    private JTextField unObfuscatedStringTextField;
    private JComboBox comboBox1;

    public DecodeGui(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        comboBox1.addItem("method1");
        comboBox1.addItem("method2");
        comboBox1.addItem("method3");
        comboBox1.addItem("method4");
        comboBox1.addItem("method5");
        pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String toObf = obfuscatedStringTextField.getText();
                if(comboBox1.getSelectedItem() == "method1")
                    unObfuscatedStringTextField.setText(method1(toObf));
                if(comboBox1.getSelectedItem() == "method2")
                    unObfuscatedStringTextField.setText(method2(toObf));
                if(comboBox1.getSelectedItem() == "method3")
                    unObfuscatedStringTextField.setText(method3(toObf));
                if(comboBox1.getSelectedItem() == "method4")
                    unObfuscatedStringTextField.setText(method4(toObf));
                if(comboBox1.getSelectedItem() == "method5")
                    unObfuscatedStringTextField.setText(method5(toObf));
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new DecodeGui("AllatoriDecoder");
        frame.setVisible(true);
    }

    public static String method1(String s){
        int n = s.length();
        int n2 = n - 1;
        char[] arrc = new char[n];
        int n3 = 5 << 3 ^ 2;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            arrc[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            arrc[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(arrc);
    }

    public static String method2(String a){
        final int n = (0x2 ^ 0x5) << 4;
        final int n2 = 2;
        final int n3 = n ^ (n2 << n2 ^ 0x1);
        final int n4 = (0x2 ^ 0x5) << 3 ^ 0x2;
        final int length = (a = a).length();
        final char[] array = new char[length];
        int n5;
        int i = n5 = length - 1;
        final char[] array2 = array;
        final char c = (char)n4;
        final int n6 = n3;
        while (i >= 0) {
            final char[] array3 = array2;
            final String s = a;
            final int n7 = n5;
            final char char1 = s.charAt(n7);
            --n5;
            array3[n7] = (char)(char1 ^ n6);
            if (n5 < 0) {
                break;
            }
            final char[] array4 = array2;
            final String s2 = a;
            final int n8 = n5--;
            array4[n8] = (char)(s2.charAt(n8) ^ c);
            i = n5;
        }
        return new String(array2);
    }

    public static String method3(String a){
        final int n = 4;
        final int n2 = n << n ^ 2 << 1;
        final int n3 = (0x3 ^ 0x5) << 4 ^ 0x3;
        final int length = (a = a).length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] array2 = array;
        final char c = (char)n3;
        final int n5 = n2;
        while (i >= 0) {
            final char[] array3 = array2;
            final String s = a;
            final int n6 = n4;
            final char char1 = s.charAt(n6);
            --n4;
            array3[n6] = (char)(char1 ^ n5);
            if (n4 < 0) {
                break;
            }
            final char[] array4 = array2;
            final String s2 = a;
            final int n7 = n4--;
            array4[n7] = (char)(s2.charAt(n7) ^ c);
            i = n4;
        }
        return new String(array2);
    }

    public static String method4(String a){
        final int n = 4;
        final int n2 = n << n ^ 3 << 1;
        final int n3 = (0x3 ^ 0x5) << 4;
        final int n4 = 1;
        final int n5 = n3 ^ n4 << n4;
        final int length = (a = a).length();
        final char[] array = new char[length];
        int n6;
        int i = n6 = length - 1;
        final char[] array2 = array;
        final char c = (char)n5;
        final int n7 = n2;
        while (i >= 0) {
            final char[] array3 = array2;
            final String s = a;
            final int n8 = n6;
            final char char1 = s.charAt(n8);
            --n6;
            array3[n8] = (char)(char1 ^ n7);
            if (n6 < 0) {
                break;
            }
            final char[] array4 = array2;
            final String s2 = a;
            final int n9 = n6--;
            array4[n9] = (char)(s2.charAt(n9) ^ c);
            i = n6;
        }
        return new String(array2);
    }

    public static String method5(String a){
        final int n = (0x3 ^ 0x5) << 3 ^ 0x5;
        final int n2 = 4;
        final int n3 = n2 << n2 ^ (0x3 ^ 0x5) << 1;
        final int length = (a = a).length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] array2 = array;
        final char c = (char)n3;
        final int n5 = n;
        while (i >= 0) {
            final char[] array3 = array2;
            final String s = a;
            final int n6 = n4;
            final char char1 = s.charAt(n6);
            --n4;
            array3[n6] = (char)(char1 ^ n5);
            if (n4 < 0) {
                break;
            }
            final char[] array4 = array2;
            final String s2 = a;
            final int n7 = n4--;
            array4[n7] = (char)(s2.charAt(n7) ^ c);
            i = n4;
        }
        return new String(array2);
    }
}
