package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Close extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}

class Cal implements ActionListener{
        
    TextField tf;
    Button b0 ,b1 ,b2 ,b3 ,b4 ,b5 ,b6 ,b7 ,b8 
            ,b9 ,bAdd ,bSub ,bMul ,bDiv ,bMod
            ,bEqu ,bDec ,bMC ,bMR ,bMS 
            ,bMAdd ,bMSub ,bBS ,bCE ,bC 
            ,bSign ,bSQRT ,b1X ,bEmp1 , bEmp2;
    
    String Mem,Op,Res,lastChr,lastChrs;
    boolean opUsed;
    
    
    Cal(){
        
        Frame f = new Frame();
        f.addWindowListener(new Close());
        f.setBackground(Color.white);
        f.setTitle("Calculator");
        f.setResizable(false);
        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        
     
        Font f1 = new Font("Impact",Font.BOLD,10);
        Font f2 = new Font("Impact",Font.BOLD,15);
        Font f3 = new Font("Impact",Font.BOLD,20);
        
        MenuBar mb1 = new MenuBar();
        
        
        Menu MenuHelp = new Menu("help");
        MenuItem MenuHelpItem1 = new MenuItem("View Help");
        MenuItem MenuHelpItem2 = new MenuItem("About Calculator");
        MenuHelp.add(MenuHelpItem1);
        MenuHelp.add(MenuHelpItem2);
        MenuHelpItem1.setFont(f1);
        MenuHelpItem2.setFont(f1);
        
        Menu MenuEdit = new Menu("edit");
        Menu MenuView = new Menu("View");
        
        
        
        mb1.add(MenuView);
        mb1.add(MenuEdit);
        mb1.add(MenuHelp);
        mb1.setFont(f1);
        
        
        f.setMenuBar(mb1);
        
        
        
        
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        
        tf = new TextField(20);
        tf.setFont(f3);
      
        //tf.setSize(450,100);
        
        p1.add(tf);
        
        
        GridLayout g1 = new GridLayout(6, 5, 1, 1);
        
        p2.setLayout(g1);
        p2.setBackground(Color.WHITE);
        
        
         
        f.add(p1,BorderLayout.NORTH);
         
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        bAdd = new Button("+");
        bSub = new Button("-");
        bMul = new Button("*");
        bDiv = new Button("/");
        bMod = new Button("%");
        bDec = new Button(".");
        b1X = new Button("1/x");
        bEqu = new Button("=");

        bEmp1 = new Button("");
        bEmp2 = new Button("");

        bMC = new Button("MC");
        bMR = new Button("MR");
        bMS = new Button("MS");
        bMAdd = new Button("M+");
        bMSub = new Button("M-");
        bBS = new Button("<-");
        bC = new Button("C");
        bCE = new Button("CE");
        bSign = new Button("+/-");
        bSQRT = new Button("SQRT");


        b0.setFont(f2);
        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);

        bAdd.setFont(f2);
        bSub.setFont(f2);
        bMul.setFont(f2);
        bDiv.setFont(f2);
        bMod.setFont(f2);
        bDec.setFont(f2);
        b1X.setFont(f2);
        bEqu.setFont(f2);

        bEmp1.setFont(f2);
        bEmp2.setFont(f2);

        bMC.setFont(f2);
        bMR.setFont(f2);
        bMS.setFont(f2);
        bMAdd.setFont(f2);
        bMSub.setFont(f2);
        bBS.setFont(f2);
        bC.setFont(f2);
        bCE.setFont(f2);
        bSign.setFont(f2);
        bSQRT.setFont(f2);
         
         
        b0.setBackground(Color.white);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);

        bAdd.setBackground(Color.lightGray);
        bSub.setBackground(Color.lightGray);
        bMul.setBackground(Color.lightGray);
        bDiv.setBackground(Color.lightGray);
        bMod.setBackground(Color.lightGray);
        bDec.setBackground(Color.lightGray);
        b1X.setBackground(Color.lightGray);
        bEqu.setBackground(Color.lightGray);

        bEmp1.setBackground(Color.white);
        bEmp2.setBackground(Color.white);

        bMC.setBackground(Color.lightGray);
        bMR.setBackground(Color.lightGray);
        bMS.setBackground(Color.lightGray);
        bMAdd.setBackground(Color.lightGray);
        bMSub.setBackground(Color.lightGray);
        bBS.setBackground(Color.lightGray);
        bC.setBackground(Color.lightGray);
        bCE.setBackground(Color.lightGray);
        bSign.setBackground(Color.lightGray);
        bSQRT.setBackground(Color.lightGray);

        p2.add(bMC);
        p2.add(bMR);
        p2.add(bMS);
        p2.add(bMAdd);
        p2.add(bMSub);
        p2.add(bBS);
        p2.add(bCE);
        p2.add(bC);
        p2.add(bSign);
        p2.add(bSQRT);

        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bDiv);
        p2.add(bMod);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bMul);
        p2.add(b1X);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bSub);
        p2.add(bEqu);
        p2.add(b0);
        p2.add(bEmp1);
        p2.add(bDec);
        p2.add(bAdd);
        p2.add(bEmp2);
        
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bMod.addActionListener(this);
        bDec.addActionListener(this);
        b1X.addActionListener(this);
        bEqu.addActionListener(this);

        bEmp1.addActionListener(this);
        bEmp2.addActionListener(this);

        bMC.addActionListener(this);
        bMR.addActionListener(this);
        bMS.addActionListener(this);
        bMAdd.addActionListener(this);
        bMSub.addActionListener(this);
        bBS.addActionListener(this);
        bC.addActionListener(this);
        bCE.addActionListener(this);
        bSign.addActionListener(this);
        bSQRT.addActionListener(this);

                  
        f.add(p2,BorderLayout.SOUTH);
       
        f.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent d){
        
        Object O = d.getSource();
        
        if(tf.getText().equals("0")){
            //b0
            
            if(O.equals(b1)){
                tf.setText(b1.getLabel());
            }else if(O.equals(b2)){
                tf.setText(b2.getLabel());
            }else if(O.equals(b3)){
                tf.setText(b3.getLabel());
            }else if(O.equals(b4)){
                tf.setText(b4.getLabel());
            }else if(O.equals(b5)){
                tf.setText(b5.getLabel());
            }else if(O.equals(b6)){
                tf.setText(b6.getLabel());
            }else if(O.equals(b7)){
                tf.setText(b7.getLabel());
            }else if(O.equals(b8)){
                tf.setText(b8.getLabel());
            }else if(O.equals(b9)){
                tf.setText(b9.getLabel());
            }
            
                        
            
            
        }else if(O.equals(b0)){
            tf.setText(tf.getText()+b0.getLabel());
            if(opUsed=true){
                //change operator
            }else{
                //set opUsed as true
                opUsed=true;
            }
        }else if(O.equals(b1)){
            tf.setText(tf.getText()+b1.getLabel());
        }else if(O.equals(b2)){
            tf.setText(tf.getText()+b2.getLabel());
        }else if(O.equals(b3)){
            tf.setText(tf.getText()+b3.getLabel());
        }else if(O.equals(b4)){
            tf.setText(tf.getText()+b4.getLabel());
        }else if(O.equals(b5)){
            tf.setText(tf.getText()+b5.getLabel());
        }else if(O.equals(b6)){
            tf.setText(tf.getText()+b6.getLabel());
        }else if(O.equals(b7)){
            tf.setText(tf.getText()+b7.getLabel());
        }else if(O.equals(b8)){
            tf.setText(tf.getText()+b8.getLabel());
        }else if(O.equals(b9)){
            tf.setText(tf.getText()+b9.getLabel());
            
        }else if(O.equals(bAdd)){
            if(opUsed==true){
                //change operator in tf
                tf.setText(removeChr(tf.getText()));
            }else{
                //set opUsed as true
                opUsed=true;
            }
            
            tf.setText(tf.getText()+bAdd.getLabel());
            Op="1";
            
        }else if(O.equals(bSub)){
            if(opUsed==true){
                //change operator in tf
                tf.setText(removeChr(tf.getText()));
            }else{
                //set opUsed as true
                opUsed=true;
            }
            
            tf.setText(tf.getText()+bSub.getLabel());
            Op="2";
            
        }else if(O.equals(bMul)){
            if(opUsed==true){
                //change operator in tf
                tf.setText(removeChr(tf.getText()));
            }else{
                //set opUsed as true
                opUsed=true;
            }
            
            tf.setText(tf.getText()+bMul.getLabel());
            Op="3";
            
        }else if(O.equals(bDiv)){
            
            if(opUsed==true){
                //change operator in tf
                tf.setText(removeChr(tf.getText()));
            }else{
                //set opUsed as true
                opUsed=true;
            }
            
            tf.setText(tf.getText()+bDiv.getLabel());
            Op="4";
            
        }else if(O.equals(bMod)){
            tf.setText(tf.getText()+bMod.getLabel());
            Op="5";
            if(opUsed==true){
                //change operator in tf
            }else{
                //set opUsed as true
                opUsed=true;
            }
            
            
        }else if(O.equals(bDec)){
            tf.setText(tf.getText()+bDec.getLabel());
        }else if(O.equals(bEqu)){
            
        }else if(O.equals(b1X)){
            
        }else if(O.equals(bMC)){
            
        }else if(O.equals(bMR)){
            
        }else if(O.equals(bMS)){
            
        }else if(O.equals(bMAdd)){
            
        }else if(O.equals(bSub)){
            
        }else if(O.equals(bBS)){
            tf.setText(removeChr(tf.getText()));
        }else if(O.equals(bC)){
            
        }else if(O.equals(bCE)){
            
        }else if(O.equals(bSign)){
            
        }else if(O.equals(bSQRT)){
            
        }
    }
    
    public String removeChr(String str) {
        if (str == null || str.length() <= 1) {
            return "0"; // Output an empty string if the string is null or has a length of 1 or less
        } else {
            return str.substring(0, str.length() - 1); // Remove the last character from the string
        }
    }

    
}
public class Calculator{
    public static void main(String Args[]){
        new Cal();
    }  
}