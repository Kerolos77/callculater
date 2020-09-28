/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casio;

import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.geometry.HorizontalDirection;
import javax.swing.*;

/**
 *
 * @author KOKO
 */
public class frmcasio extends JFrame{
    
    public frmcasio(){
        
        inti();
        setState(0);
    }
   
    private void inti (){
        setform();
        btn0=new JButton("0");
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btndot=new JButton(".");
        btnequal=new JButton("=");
        btnsum=new JButton("+");
        btnsub=new JButton("-");
        btnmulti=new JButton("×");
        btndiv=new JButton("/");
        btnnorp=new JButton("+/-");
        btnpowy=new JButton("x^y");
        btnpow2=new JButton("x²");
        btnpown1=new JButton("1/x");
        btnabs=new JButton("|x|");
        btnmod=new JButton("mod");
        btnrooty=new JButton("y√x");
        btnroot2=new JButton("√x");
        btnfact=new JButton("x!");
        btnsin=new JButton("sin");
        btncos=new JButton("cos");
        btntan=new JButton("tan");
        btnsec=new JButton("sec");
        btncsc=new JButton("csc");
        btncot=new JButton("cot");
        btnsinh=new JButton("sinh");
        btncosh=new JButton("cosh");
        btntanh=new JButton("tanh");
        btnsech=new JButton("sech");
        btncsch=new JButton("csch");
        btncoth=new JButton("coth");
        btnlog=new JButton("log");
        btnln=new JButton("ln");
        btndel=new JButton("←");
        btnclean=new JButton("c");
        btnexit=new JButton("Exit");
        btn10powx=new JButton("10^x");
        btnxpow3=new JButton("x³");
        btnepowx=new JButton("e^x");
        btnnpr=new JButton("npr");
        btncpr=new JButton("cpr");
        btne=new JButton("e");
        btnpi=new JButton("π");
        btnm=new JButton("(-)");
        txtscreen= new JTextField("0");
        pmain = new JPanel();
        num1=0.0;num2=0.0;result=0.0;ope=0;
        //txt detils
        txtscreen.setFont(new Font("Tahoma", Font.BOLD,14));
        txtscreen.setAutoscrolls(true);
        txtscreen.setEnabled(false);
        
        //actionlisner
        btndot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              if (txtscreen.getText().contains("."))
                  input("");
              else 
                  input(".");
            }
        });
        btn0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtscreen.getText().equals("0"))
                    input("");
              else 
                  input("0");
            }
        });
        btnequal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num2=Double.parseDouble(txtscreen.getText());
                switch(ope){
                    case 1 :
                        multi();
                        break;
                    case 2 :
                        div();
                        break;
                    case 3 :
                        xpowy();
                        break;
                    case 4 :
                        sub:
                        break;
                    case 5 :
                        sum();
                        break;
                    case 6 :
                        xpown1();
                        break;
                    case 7 :
                        mod();
                        break;
                    case 8 :
                        rooty();
                        break;
                    case 9 :
                        npr();
                        break;
                    case 10 :
                        cpr();
                        break;
                }
                txtscreen.setText(result+"");
            }
        });
        
        btnmulti.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(1);
                focus();
            }
        });
        
        btnnorp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtscreen.setText((Double.parseDouble(txtscreen.getText())*-1.0)+"");
            }
        });
        
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("1");
            }
        });
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("2");
            }
        });
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("3");
            }
        });
        btndiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(2);
                focus();
            }
        });
        btnpowy.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(3);
                focus();
            }
        });
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("4");
            }
        });
        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("5");
            }
        });
        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("6");
            }
        });
        btnsub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(4);
                focus();
            }
        });
        btnpow2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                xpow2();
                txtscreen.setText(result+"");
            }
        });
        btn7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("7");
            }
        });
        btn8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("8");
            }
        });
        btn9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("9");
            }
        });
        btnsum.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(5);
                focus();
            }
        });
        btnabs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                abs();
                txtscreen.setText(result+"");
            }
        });
        btnpown1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                xpown1();
                txtscreen.setText(result+"");
            }
        });
        btnmod.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(7);
                focus();
            }
        });
        btnrooty.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(8);
                focus();
            }
        });
        btnroot2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                root2();
                txtscreen.setText(result+"");
            }
        });
        btnfact.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                fact();
                txtscreen.setText(result+"");
            }
        });
        btnsin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                sin();
                txtscreen.setText(result+"");
            }
        });
        btncos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                cos();
                txtscreen.setText(result+"");
            }
        });
        btntan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                tan();
                txtscreen.setText(result+"");
            }
        });
        btnsec.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                sec();
                txtscreen.setText(result+"");
            }
        });
        btncsc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                csc();
                txtscreen.setText(result+"");
            }
        });
        btncot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                cot();
                txtscreen.setText(result+"");
            }
        });
        btnsinh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                sinh();
                txtscreen.setText(result+"");
            }
        });
        btncosh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                cosh();
                txtscreen.setText(result+"");
            }
        });
        btntanh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                tanh();
                txtscreen.setText(result+"");
            }
        });
        btnsech.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                sech();
                txtscreen.setText(result+"");
            }
        });
        btncsch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                csch();
                txtscreen.setText(result+"");
            }
        });
        btncoth.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                coth();
                txtscreen.setText(result+"");
            }
        });
        btnlog.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                log();
                txtscreen.setText(result+"");
            }
        });
        btnln.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                ln();
                txtscreen.setText(result+"");
            }
        });
        btnepowx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                epowx();
                txtscreen.setText(result+"");
            }
        });
        btnnpr.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(9);
                focus();
            }
        });
        btncpr.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                operations(10);
                focus();
            }
        });
        btnpi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input(Math.PI+"");
            }
        });
        btne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input(Math.E+"");
            }
        });
        btnclean.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                clean();
            }
        });
        btnexit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(WIDTH);
            }
        });
        btn10powx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                tenpowx();
                txtscreen.setText(result+"");
            }
        });
        btnxpow3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1=Double.parseDouble(txtscreen.getText());
                xpow3();
                txtscreen.setText(result+"");
            }
        });
        btnm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                input("-");
            }
        });
        btndel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                del();
                focus();
            }
        });
        
        //setbackgraund
        btn0.setBackground(Color.LIGHT_GRAY);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
        btndot.setBackground(Color.gray);
        btnequal.setBackground(Color.gray);
        btnmulti.setBackground(Color.gray);
        btndiv.setBackground(Color.gray);
        btnsum.setBackground(Color.gray);
        btnsub.setBackground(Color.gray);
        btnnorp.setBackground(Color.gray);
        btnpowy.setBackground(Color.gray);
        btnpow2.setBackground(Color.gray);
        btnpown1.setBackground(Color.gray);
        btnabs.setBackground(Color.gray);
        btnmod.setBackground(Color.gray);
        btnrooty.setBackground(Color.gray);
        btnroot2.setBackground(Color.gray);
        btnfact.setBackground(Color.gray);
        btnsin.setBackground(Color.gray);
        btncos.setBackground(Color.gray);
        btntan.setBackground(Color.gray);
        btnsec.setBackground(Color.gray);
        btncsc.setBackground(Color.gray);
        btncot.setBackground(Color.gray);
        btnsinh.setBackground(Color.gray);
        btncosh.setBackground(Color.gray);
        btntanh.setBackground(Color.gray);
        btnsech.setBackground(Color.gray);
        btncsch.setBackground(Color.gray);
        btncoth.setBackground(Color.gray);
        btnlog.setBackground(Color.gray);
        btnln.setBackground(Color.gray);
        btnepowx.setBackground(Color.gray);
        btnnpr.setBackground(Color.gray);
        btncpr.setBackground(Color.gray);
        btnpi.setBackground(Color.gray);
        btne.setBackground(Color.gray);
        btn10powx.setBackground(Color.gray);
        btnm.setBackground(Color.gray);
        btnxpow3.setBackground(Color.gray);
        btnclean.setBackground(Color.cyan);
        btndel.setBackground(Color.cyan);
        btnexit.setBackground(Color.cyan);
//add to mainpanel "pmain"
        pmain.setLayout(new GridBagLayout());
        this.add(pmain);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth= GridBagConstraints.REMAINDER;
        pmain.add(txtscreen,gbc);
        
        gbc.gridwidth = 1;//return gridwidth to defult =1
        pmain.add(btnexit,gbc);
        pmain.add(btn10powx,gbc);
        pmain.add(btnxpow3,gbc);
        pmain.add(btnm,gbc);
        gbc.gridwidth= GridBagConstraints.REMAINDER;
        pmain.add(btndel,gbc);
        
        gbc.gridwidth= 1;
        pmain.add(btnnpr,gbc);
        pmain.add(btncpr,gbc);
        pmain.add(btnpi,gbc);
        pmain.add(btne,gbc);
        gbc.gridwidth= GridBagConstraints.REMAINDER;
        pmain.add(btnclean,gbc);
        
        gbc.gridwidth= 1;
        pmain.add(btncsch,gbc);
        pmain.add(btncoth,gbc);
        pmain.add(btnlog,gbc);
        pmain.add(btnln,gbc);
        gbc.gridwidth= GridBagConstraints.REMAINDER;
        pmain.add(btnepowx,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btncot,gbc);
        pmain.add(btnsinh,gbc);
        pmain.add(btncosh,gbc);
        pmain.add(btntanh,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btnsech,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btnsin,gbc);
        pmain.add(btncos,gbc);
        pmain.add(btntan,gbc);
        pmain.add(btnsec,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btncsc,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btnabs,gbc);
        pmain.add(btnmod,gbc);
        pmain.add(btnrooty,gbc);
        pmain.add(btnroot2,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btnfact,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btn7,gbc);
        pmain.add(btn8,gbc);
        pmain.add(btn9,gbc);
        pmain.add(btnsum,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btnpown1,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btn4,gbc);
        pmain.add(btn5,gbc);
        pmain.add(btn6,gbc);
        pmain.add(btnsub,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btnpow2,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btn1,gbc);
        pmain.add(btn2,gbc);
        pmain.add(btn3,gbc);
        pmain.add(btndiv,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btnpowy,gbc);
        
        gbc.gridwidth=1;
        pmain.add(btndot,gbc);
        pmain.add(btn0,gbc);
        pmain.add(btnequal,gbc);
        pmain.add(btnmulti,gbc);
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        pmain.add(btnnorp,gbc);
       
    }
    
    private void multi(){
        result=num1*num2;
    }
    
    private void norp(){
        result=num1*-1;
    }
    
    private void div(){
        try{
        result=num1/num2;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    private void xpowy(){
        result=Math.pow(num1, num2);
    }
    
    private void sub(){
        result=num1-num2;
    }
    
    private void xpow2(){
        result=Math.pow(num1, 2);
    }
    
    private void sum(){
        result=num1+num2;
    }
    
    private void xpown1(){
        result=Math.pow(num1, -1);
    }
    
    private void abs(){
        result=Math.abs(num1);
    }
    
    private void mod(){
        result=num1%num2;
    }
    
    private void rooty(){
        result=Math.pow(num1, 1.0/num1);
    }
    
    private void root2(){
        result=Math.pow(num1,1.0/2);
    }
    
    private void fact(){
        result=factorial(num1);
    }
    
    private void sin(){
        result=Math.sin(Math.toRadians(num1));
    }
    
    private void cos(){
        result=Math.cos(Math.toRadians(num1));
    }
    
    private void tan(){
        result=Math.tan(Math.toRadians(num1));
    }
    
    private void sec(){
        result=1/(Math.sin(Math.toRadians(num1)));
    }
    
    private void csc(){
        result=1/(Math.cos(Math.toRadians(num1)));
    }
    
    private void cot(){
        result=1/(Math.tan(Math.toRadians(num1)));
    }
    
    private void sinh(){
        result=Math.sinh(Math.toRadians(num1));
    }
    
    private void cosh(){
        result=Math.cosh(Math.toRadians(num1));
    }
    
    private void tanh(){
        result=Math.tanh(Math.toRadians(num1));
    }
    
    private void sech(){
        result=1/(Math.sinh(Math.toRadians(num1)));
    }
    
    private void csch(){
        result=1/(Math.cosh(Math.toRadians(num1)));
    }
    
    private void coth(){
        result=1/(Math.tanh(Math.toRadians(num1)));
    }
    
    private void log(){
        result=Math.log10(num1);
    }
    
    private void ln(){
        result=Math.log(num1);
    }
    
    private void epowx(){
        result=Math.pow(Math.E, num1);
    }
    
    private void npr(){
        result=factorial(num1)/factorial(num1-num2);
    }
    
    private void cpr(){
        result=factorial(num1)/(factorial(num1-num2)*factorial(num2));
    }
    
    private void clean(){
        txtscreen.setText("0");
    }
    
    private void del(){
        String temp="";
        for(int i =0;i<txtscreen.getText().length()-1;i++){
            temp+=txtscreen.getText().charAt(i);
        }
        txtscreen.setText(temp);
    }
    
    private void xpow3(){
        result=Math.pow(num1, 3);
    }
    
    private void tenpowx(){
        result=Math.pow(10, num1);
    }
    
    private void input(String s){
        if(txtscreen.getText().equals("0")){
            txtscreen.setText("");
            input(s);
        }
        else{
            String all= txtscreen.getText()+s;
            txtscreen.setText(all);
        }
    }
    
    private void operations(int operation){
        num1= Double.parseDouble(txtscreen.getText());
        txtscreen.setText("");
        ope=operation;
        
        
    }
    
    private double factorial(double n ){
        int r=1;
        for(int i=1;i<=n;i++)
            r*=i;
        return r;
    }
    
    private void focus(){
        txtscreen.requestFocus();
    }
    
    private void setform(){
         
        setSize(400,500);
        setTitle("calculater");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.DARK_GRAY);
        setLocationRelativeTo(this);
        setResizable(false);
        setVisible(true);
        setState(1);
        
        
    }
    private JPanel pmain;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btndot;
    private JButton btnequal;
    private JButton btnsum;
    private JButton btnsub;
    private JButton btnmulti;
    private JButton btndiv;
    private JButton btnnorp;
    private JButton btnpowy;
    private JButton btnpow2;
    private JButton btnpown1;
    private JButton btnabs;
    private JButton btnmod;
    private JButton btnrooty;
    private JButton btnroot2;
    private JButton btnfact;
    private JButton btnsin;
    private JButton btncos;
    private JButton btntan;
    private JButton btnsec;
    private JButton btncsc;
    private JButton btncot;
    private JButton btnsinh;
    private JButton btncosh;
    private JButton btntanh;
    private JButton btnsech;
    private JButton btncsch;
    private JButton btncoth;
    private JButton btnlog;
    private JButton btnln;
    private JButton btn10powx;
    private JButton btnnpr;
    private JButton btncpr;
    private JButton btnxpow3;
    private JButton btnepowx;
    private JButton btnpi;
    private JButton btne;
    private JButton btnm;
    private JButton btndel;
    private JButton btnclean;
    private JButton btnexit;
    private JTextField txtscreen;
    private double num1,num2,result;
    private int ope;
    
    
}
