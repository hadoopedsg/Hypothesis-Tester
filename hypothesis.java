
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface z1 
{
        public void data();
        public void tester();
        
        
}

class z extends JFrame
{
    z()
    {
        super("Z_TEST");
    }
    
    void ztest()
        {
            
		         
                Font font1 = new Font("Calibri", Font.PLAIN,20);
                
                
                JRadioButton A= new JRadioButton("Hypothesis Testing for Single Population Mean");
                JRadioButton B= new JRadioButton("Hypothesis Testing for Difference Between Two Population Mean");
                JRadioButton C= new JRadioButton("Hypothesis Testing for Single Population Proportion");
                JRadioButton D= new JRadioButton("Hypothesis Testing for Difference Between Two Population Proportion");
                JRadioButton E= new JRadioButton("Hypothesis Testing for Difference Between Two Population Standard Deviation");
                JPanel zpanel = new JPanel();
                zpanel.setLayout(null);
                A.setFont(font1);
                A.setBounds(10,10,1000,35);
                B.setBounds(10,60,1000,35);
                C.setBounds(10,110,1000,35);
                D.setBounds(10,160,1000,35);
                E.setBounds(10,210,1000,35);
                B.setFont(font1);
                C.setFont(font1);
                D.setFont(font1);
                E.setFont(font1);
                zpanel.add(A);
                zpanel.add(B);
                zpanel.add(C);
                zpanel.add(D);
                zpanel.add(E);
                add(zpanel);
                A.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ztest1 zt1=new ztest1();
                        zt1.data();
                        zt1.setSize(400,710);
                        
                    }
                });
                
                B.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ztest2 zt2=new ztest2();
                        zt2.data();
                        zt2.setSize(400,800);
                    }
                });
                C.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ztest3 zt3=new ztest3();
                        zt3.data();
                        zt3.setSize(400,720);
                    }
                });
                D.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ztest4 zt4=new ztest4();
                        zt4.data();
                        zt4.setSize(600,750);
                    }
                });
                E.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ztest5 zt5=new ztest5();
                        zt5.data();
                        zt5.setSize(430,730);
                    }
                });
                setVisible(true);
                
        }     
                
}
 class ztest1 extends JFrame  
{
    
   
     
    public  double n,zo,z,zz1,x,u,sd,lo;
    
    
    public  void data()
    {
            
            JPanel z1panel=new JPanel();
            z1panel.setLayout(null);
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(100,350,150,50);            
            JRadioButton two=new JRadioButton("TWO TAILED TEST");
            two.setFont(font1);
            two.setBounds(10,480,200,25);
            JRadioButton rt=new JRadioButton("RIGHT TAILED TEST");
            rt.setFont(font1);
            rt.setBounds(10,510,200,25);
            JRadioButton lt=new JRadioButton("LEFT TAILED TEST");
            lt.setFont(font1);
            lt.setBounds(10,540,200,25);            
            JLabel z1ho=new JLabel("Ho");
            z1ho.setFont(font);
	    z1ho.setBounds(10,10,30,30);
            JLabel z1h1=new JLabel("H1");
            z1h1.setFont(font);
	    z1h1.setBounds(10,60,30,30);
            JLabel z1lo=new JLabel("Level Of Significance");
            z1lo.setFont(font);
	    z1lo.setBounds(10,110,200,30);
            JLabel z1n=new JLabel("Sample Size");
            z1n.setFont(font);
            z1n.setBounds(10,160,120,30);
            JLabel z1x=new JLabel("Sample Mean");
            z1x.setFont(font);
            z1x.setBounds(10,210,145,30);
            JLabel z1u=new JLabel(" Population Mean");
            z1u.setFont(font);
            z1u.setBounds(5,260,150,30);
            JLabel z1sd=new JLabel("Population Standard Deviation");
            z1sd.setFont(font);
            z1sd.setBounds(10,310,290,30);
            JLabel zo1=new JLabel("zo");
            zo1.setFont(font);
            zo1.setBounds(10,580,120,25);
            JLabel Z=new JLabel("z");
            Z.setFont(font);
            Z.setBounds(10,430,250,30);
            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,630,70,25);
            JTextField z1=new JTextField(6);
            z1.setFont(font);
            z1.setBounds(50,430,310,25);
            JTextField z1o=new JTextField(6);
            z1o.setFont(font);
            z1o.setBounds(50,580,310,25);
            JTextField R=new JTextField(20);
            R.setFont(font);
            R.setBounds(80,630,280,25);
            JTextField Ho=new JTextField(40);
            Ho.setFont(font);
            Ho.setBounds(60,10,300,25);
		
            JTextField H1=new JTextField(40);
            H1.setFont(font);
            H1.setBounds(60,60,300,25);
            JTextField lo=new JTextField(4);
            lo.setFont(font);
            lo.setBounds(200,110,160,25);
            JTextField n=new JTextField(5);
            n.setFont(font);
            n.setBounds(140,160,220,25);
            JTextField x=new JTextField(6);
            x.setFont(font);
            x.setBounds(150,210,210,25);
            JTextField u=new JTextField(6);
            u.setFont(font);
            u.setBounds(170,260,190,25);
            JTextField sd=new JTextField(5);
            sd.setFont(font);
            sd.setBounds(290,310,70,25);
            
            z1panel.add(z1ho);
            z1panel.add(Ho);
            z1panel.add(z1h1);
            z1panel.add(H1);
            z1panel.add(z1lo);
            z1panel.add(lo);
            z1panel.add(z1n);
            z1panel.add(n);
            z1panel.add(z1x);
            z1panel.add(x);
            z1panel.add(z1u);
            z1panel.add(u);
            z1panel.add(z1sd);
            z1panel.add(sd);
            z1panel.add(two);
            z1panel.add(rt);
            z1panel.add(lt);
            z1panel.add(sub);
            z1panel.add(zo1);
            z1panel.add(z1o);
            z1panel.add(Z);
            z1panel.add(z1);
            z1panel.add(re);
            z1panel.add(R);
            
            two.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double l1=Double.parseDouble(lo.getText());
                    if(l1==0.01)
                            zo=2.58;
                            else if(l1==0.05)
                                zo=1.966;
                                else 
                                    zo=1.645;
                    z1o.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                            
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        
                        }
                    
                }
            });
    
            rt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double l1=Double.parseDouble(lo.getText());
                    if(l1==0.01)
                            zo=2.33;
                            else if(l1==0.05)
                                zo=1.645;
                                else 
                                    zo=1.28;
                    z1o.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        
                        }
                }
            });
            
            lt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double l1=Double.parseDouble(lo.getText());
                    if(l1==0.01)
                            zo=-2.33;
                            else if(l1==0.05)
                                zo=-1.645;
                                else 
                                    zo=-1.28;
                    z1o.setText(zo+"");
                    if(zz1>zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                }
            });
            
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       Double n1=Double.parseDouble(n.getText());
                       Double x1=Double.parseDouble(x.getText());
                       Double u1=Double.parseDouble(u.getText());
                       Double sd1=Double.parseDouble(sd.getText());
                       z=(x1-u1)/(float)(sd1/Math.sqrt(n1));
                       
                        zz1=z;
                        if(z<0)
                            z=z*(-1);
                        z1.setText(z+"");
                    }
                });
            
            
            add(z1panel);
            setVisible(true);
    }
    
}


class ztest2 extends JFrame
{
    public double n2,sd2,z,zo,z1;
    public float x2;
    
    
        public  void data()
    {
            
            JPanel z2panel=new JPanel();
            z2panel.setLayout(null);
            
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JRadioButton two=new JRadioButton("TWO TAILED TEST");
            two.setFont(font1);
            two.setBounds(10,560,200,25);
            JRadioButton rt=new JRadioButton("RIGHT TAILED TEST");
            rt.setFont(font1);
            rt.setBounds(10,590,200,25);
            JRadioButton lt=new JRadioButton("LEFT TAILED TEST");
            lt.setFont(font1);
            lt.setBounds(10,620,200,25);
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(100,460,150,50);
            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,710,70,25);
            JLabel Z=new JLabel("z");
            Z.setFont(font);
            Z.setBounds(10,530,30,25);
            JLabel zo2=new JLabel("zo");
            zo2.setFont(font);
            zo2.setBounds(10,660,30,25);
            JTextField z2=new JTextField(6);
            z2.setFont(font);
            z2.setBounds(50,530,310,25);
            JTextField z1o=new JTextField(6);
            z1o.setFont(font);
            z1o.setBounds(50,660,310,25);
            JTextField R=new JTextField(20);
            R.setFont(font);
            R.setBounds(90,710,270,25);            
            JLabel z2ho=new JLabel("Ho:");
            z2ho.setFont(font);
            z2ho.setBounds(10,10,30,30);
            JTextField ho=new JTextField(30);
            ho.setFont(font);
            ho.setBounds(60,10,300,25);
            JLabel z2h1=new JLabel("H1:");
            z2h1.setFont(font);
            z2h1.setBounds(10,60,30,30);
            JTextField h1=new JTextField(30);
            h1.setFont(font);
            h1.setBounds(60,60,300,25);
            JLabel z2lo=new JLabel("Level Of Significance:");
            z2lo.setFont(font);
            z2lo.setBounds(10,110,200,30);
            JTextField lo=new JTextField(5);
            lo.setFont(font);
            lo.setBounds(200,110,160,25);
            JLabel z2s1=new JLabel("Sample1 Size:");
            z2s1.setFont(font);
            z2s1.setBounds(10,160,120,30);
            JTextField s1=new JTextField(5);
            s1.setFont(font);
            s1.setBounds(150,160,210,25);
            JLabel z2s2=new JLabel("Sample2 Size:");
            z2s2.setFont(font);
            z2s2.setBounds(10,210,145,30);
            JTextField s2=new JTextField(5);
            s2.setFont(font);
            s2.setBounds(150,210,210,25);
            JLabel z2x1=new JLabel("Sample1 Mean:");
            z2x1.setFont(font);
            z2x1.setBounds(5,260,150,30);
            JTextField x1=new JTextField(6);
            x1.setFont(font);
            x1.setBounds(150,260,210,25);
            JLabel z2x2=new JLabel("Sample2 Mean:");
            z2x2.setFont(font);
            z2x2.setBounds(5,310,150,25);
            JTextField x2=new JTextField(6);
            x2.setFont(font);
            x2.setBounds(150,310,210,25);
            JLabel z2sd1=new JLabel("Sample1 Standard Deviation:");
            z2sd1.setFont(font);
            z2sd1.setBounds(10,360,290,25);
            JTextField sd1=new JTextField(6);
            sd1.setFont(font);
            sd1.setBounds(270,360,90,25);
            JLabel z2sd2=new JLabel("Sample2 Standard Deviation:");
            z2sd2.setFont(font);
            z2sd2.setBounds(10,410,290,25);
            JTextField sd2=new JTextField(6);
            sd2.setFont(font);
            sd2.setBounds(270,410,90,25);
            z2panel.add(z2ho);
            z2panel.add(ho);
            z2panel.add(z2h1);
            z2panel.add(h1);
            z2panel.add(z2lo);
            z2panel.add(lo);
            z2panel.add(z2s1);
            z2panel.add(s1);
            z2panel.add(z2s2);
            z2panel.add(s2);
            z2panel.add(z2x1);
            z2panel.add(x1);
            z2panel.add(z2x2);
            z2panel.add(x2);
            z2panel.add(z2sd1);
            z2panel.add(sd1);
            z2panel.add(z2sd2);
            z2panel.add(sd2);
            z2panel.add(two);
            z2panel.add(rt);
            z2panel.add(lt);
            z2panel.add(sub);
            z2panel.add(Z);
            z2panel.add(z2);
            z2panel.add(zo2);
            z2panel.add(z1o);
            z2panel.add(re);
            z2panel.add(R);
            
            
            two.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double l1=Double.parseDouble(lo.getText());
                    if(l1==0.01)
                            zo=2.58;
                            else if(l1==0.05)
                                zo=1.966;
                                else 
                                    zo=1.645;
                    z1o.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        
                        }
                    
                }
            });
            
            
            rt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double l1=Double.parseDouble(lo.getText());
                    if(l1==0.01)
                            zo=2.33;
                            else if(l1==0.05)
                                zo=1.645;
                                else 
                                    zo=1.28;
                    z1o.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        
                        }
                }
            });
            
            
            lt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double l1=Double.parseDouble(lo.getText());
                    if(l1==0.01)
                            zo=-2.33;
                            else if(l1==0.05)
                                zo=-1.645;
                                else 
                                    zo=-1.28;
                    z1o.setText(zo+"");
                    if(z1>zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                }
            });
            
            
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       
                       Double n1=Double.parseDouble(s1.getText());
                       Double n2=Double.parseDouble(s2.getText());
                       Double m1=Double.parseDouble(x1.getText());
                       Double m2=Double.parseDouble(x2.getText());
                       Double sd=Double.parseDouble(sd1.getText());
                       Double ssd=Double.parseDouble(sd2.getText());
                       z=(m1-m2)/(float)(Math.sqrt(((sd*sd)/n1)+((ssd*ssd)/n2)));
                       
                       if(z<0)
                        z=z*(-1);
                       z2.setText(z+"");
                    }
                });
            add(z2panel);
            setVisible(true);
            
    }
    
}
    


 
class ztest3 extends JFrame
{
        
        
        public Double z,zo,z1,Q,lo3,lr1,p3;
        
        
        public void data()
        {
            
            JPanel z3panel=new JPanel();
            z3panel.setLayout(null);
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JRadioButton two3=new JRadioButton("TWO TAILED TEST");
            two3.setFont(font1);
            two3.setBounds(10,420,200,25);
            JRadioButton rt3=new JRadioButton("RIGHT TAILED TEST");
            rt3.setFont(font1);
            rt3.setBounds(10,450,200,25);
            JRadioButton lt3=new JRadioButton("LEFT TAILED TEST");
            lt3.setFont(font1);
            lt3.setBounds(10,480,200,25);
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(100,310,150,50);
            JLabel zo3=new JLabel("zo");
            zo3.setFont(font);
            zo3.setBounds(10,530,30,25);
            JTextField Zo=new JTextField(6);
            Zo.setBounds(40,530,320,25);
            Zo.setFont(font);         
            JLabel z3=new JLabel("z");
            z3.setFont(font);

            z3.setBounds(10,380,30,30);
            JTextField Z=new JTextField(6);
            Z.setBounds(40,380,320,25);
            Z.setFont(font);
            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,630,70,25);
            JTextField R=new JTextField(15);
            R.setBounds(90,630,270,25);
            R.setFont(font);
            JLabel ra=new JLabel("RANGE");
            ra.setFont(font);
            ra.setBounds(10,580,70,25);
            JTextField l1=new JTextField(6);
            l1.setBounds(90,580,130,25);
            l1.setFont(font);
            JTextField l3=new JTextField(6);
            l3.setBounds(230,580,130,25);
            l3.setFont(font);
            JLabel z3ho=new JLabel("Ho");
            z3ho.setBounds(10,10,30,30);

            z3ho.setFont(font);
            JTextField ho=new JTextField(40);
            ho.setBounds(60,10,300,25);
            ho.setFont(font);
            JLabel z3h1=new JLabel("H1");
            z3h1.setFont(font);
            z3h1.setBounds(10,60,30,30);
            JTextField h1=new JTextField(40);
            h1.setBounds(60,60,300,25);
            h1.setFont(font);
            JLabel z3lo=new JLabel("Level Of Significance");
            z3lo.setFont(font);
            z3lo.setBounds(10,110,200,30);
            JTextField lo=new JTextField(5);
            lo.setBounds(200,110,160,25);
            lo.setFont(font);
            JLabel z3p=new JLabel("Probability Of Success Of Trial");
            z3p.setFont(font);
            z3p.setBounds(10,160,300,30);
            JTextField p=new JTextField(5);
            p.setBounds(270,160,90,25);
            p.setFont(font);
            JLabel z3n=new JLabel("Number Of Independent Trials");
            z3n.setFont(font);
            z3n.setBounds(10,210,280,30);
            JTextField n=new JTextField(5);
            n.setBounds(280,210,80,25);
            n.setFont(font);
            JLabel z3x=new JLabel("Number Of Success");
            z3x.setBounds(10,260,180,25);
            z3x.setFont(font);
            JTextField x=new JTextField(5);
            x.setBounds(190,260,170,25);
            x.setFont(font);            
            z3panel.add(z3ho);
            z3panel.add(ho);
            z3panel.add(z3h1);
            z3panel.add(h1);
            z3panel.add(z3lo);
            z3panel.add(lo);
            z3panel.add(z3p);
            z3panel.add(p);
            z3panel.add(z3n);
            z3panel.add(n);
            z3panel.add(z3x);
            z3panel.add(x);
            z3panel.add(sub);
            z3panel.add(z3);
            z3panel.add(Z);
            z3panel.add(two3);
            z3panel.add(rt3);
            z3panel.add(lt3);
            z3panel.add(zo3);
            z3panel.add(Zo);
            z3panel.add(ra);
            z3panel.add(l1);
            z3panel.add(l3);
            z3panel.add(re);
            z3panel.add(R);
            
            
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       
                       Double P=Double.parseDouble(p.getText());
                       Double N=Double.parseDouble(n.getText());
                       Double X=Double.parseDouble(x.getText());
                       Q=1-P;
                       p3=(X/N);
                       z=(p3-P)/(Math.sqrt(((P*Q)/N)));
                       
                       z1=z;
                       if(z<0)
                       z=z*(-1);
            
                       lo3=P + (3*(Math.sqrt(((P*Q)/N))));
                       lr1=P - (3*(Math.sqrt(((P*Q)/N))));
                        
                       Z.setText(z+"");
                    }
                });
            
            
            two3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                  
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=2.58;
                            else if(los==0.05)
                                zo=1.966;
                                else 
                                    zo=1.645;
                    Zo.setText(zo+"");
                    if(z<zo)
                        {
                            
                            R.setText("Ho is Accepted");
                            l1.setText(lo3+"");
                            l3.setText(lr1+"");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                            l1.setText("NIL");
                            l3.setText("NIL");
                        
                        }
                    
                }
            });
            rt3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=2.33;
                            else if(los==0.05)
                                zo=1.645;
                                else 
                                    zo=1.28;
                    Zo.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                            l1.setText(lo3+"");
                            l3.setText(lr1+"");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                            l1.setText("NIL");
                            l3.setText("NIL");
                        
                        }
                }
            });
            
            lt3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=-2.33;
                            else if(los==0.05)
                                zo=-1.645;
                                else 
                                    zo=-1.28;
                    Zo.setText(zo+"");
                    if(z1>zo)
                        {
                            R.setText("Ho is Accepted");
                            l1.setText(lo3+"");
                            l3.setText(lr1+"");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                            l1.setText("NIL");
                            l3.setText("NIL");
                        }
                }
            });
            
            add(z3panel);
            setVisible(true);
            
              
        }
        
        
        
}

class ztest4 extends JFrame 
{
        
        public double p41,p42,p,q,z,zo,z1,n1,n2,n11,n22,los;
        
        
        
        public void data()
        {
            
            JPanel z4panel=new JPanel();
            z4panel.setLayout(null);
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JRadioButton two4=new JRadioButton("TWO TAILED TEST");
            two4.setFont(font1);
            two4.setBounds(10,520,200,25);
            JRadioButton rt4=new JRadioButton("RIGHT TAILED TEST");
            rt4.setFont(font1);
            rt4.setBounds(10,550,200,25);
            JRadioButton lt4=new JRadioButton("LEFT TAILED TEST");
            lt4.setFont(font1);
            lt4.setBounds(10,580,200,25);
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(230,400,150,50);
            JLabel zo4=new JLabel("zo");
            zo4.setFont(font);
            zo4.setBounds(10,620,30,25);
            JTextField Zo=new JTextField(6);
            Zo.setBounds(40,620,520,25);
            Zo.setFont(font);
            JLabel z4=new JLabel("z");
            z4.setBounds(10,470,30,30);
            z4.setFont(font);
            JTextField Z=new JTextField(6);
            Z.setBounds(40,470,520,25);
            Z.setFont(font);

            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,670,70,25);
            JTextField R=new JTextField(6);
            R.setBounds(90,670,470,25);
            R.setFont(font);

            JLabel z4ho=new JLabel("Ho");
            z4ho.setFont(font);
            z4ho.setBounds(10,10,30,30);
            JTextField ho=new JTextField(40);
            ho.setBounds(60,10,500,25);
            ho.setFont(font);

            JLabel z4h1=new JLabel("H1");
            z4h1.setFont(font);
            z4h1.setBounds(10,60,30,30);
            JTextField h1=new JTextField(40);
            h1.setBounds(60,60,500,25);
            h1.setFont(font);
            JLabel z4lo=new JLabel("Level Of Significance");
            z4lo.setFont(font);
            z4lo.setBounds(10,110,200,30);
            JTextField lo=new JTextField(5);
            lo.setBounds(200,110,360,25);
            lo.setFont(font);
            JLabel z4n1=new JLabel("Sample1 Size");
            z4n1.setFont(font);
            z4n1.setBounds(10,160,150,30);
            JTextField n1=new JTextField(5);
            n1.setBounds(140,160,420,25);
            n1.setFont(font);
            JLabel z4n2=new JLabel("Sample2 Size");
            z4n2.setFont(font);
            z4n2.setBounds(10,210,150,30);
            JTextField n2=new JTextField(5);
            n2.setBounds(140,210,420,25);
            n2.setFont(font);

            JLabel z4p1=new JLabel("Proportion From Sample1");
            z4p1.setFont(font);
            z4p1.setBounds(10,260,220,25);
            JTextField p1=new JTextField(5);
            p1.setBounds(250,260,310,25);
            p1.setFont(font);

            JLabel z4p2=new JLabel("Proportion From Sample2");
            z4p2.setFont(font);
            z4p2.setBounds(10,310,220,25);
            JTextField p2=new JTextField(5);
            p2.setBounds(250,310,310,25);
            p2.setFont(font);

            JLabel z4p4=new JLabel("Pooled estimate of the actual proportion in population");
            z4p4.setFont(font);
            z4p4.setBounds(10,360,500,25);
            JTextField p4=new JTextField(5);
            p4.setBounds(490,360,70,25);            
            p4.setFont(font);

            z4panel.add(z4ho);
            z4panel.add(ho);
            z4panel.add(z4h1);
            z4panel.add(h1);
            z4panel.add(z4lo);
            z4panel.add(lo);
            z4panel.add(z4n1);
            z4panel.add(n1);
            z4panel.add(z4n2);
            z4panel.add(n2);
            z4panel.add(z4p1);
            z4panel.add(p1);
            z4panel.add(z4p2);
            z4panel.add(p2);
            z4panel.add(sub);
            z4panel.add(z4p4);
            z4panel.add(p4);
            z4panel.add(z4);
            z4panel.add(Z);
            z4panel.add(two4);
            z4panel.add(rt4);
            z4panel.add(lt4);
            z4panel.add(zo4);
            z4panel.add(Zo);
            z4panel.add(re);
            z4panel.add(R);
            
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       
                       Double N1=Double.parseDouble(n1.getText());
                       Double N2=Double.parseDouble(n2.getText());
                       Double P1=Double.parseDouble(p1.getText());
                       Double P2=Double.parseDouble(p2.getText());
                       
                       p41=P1/N1;
                       p42=P2/N2;
                       p=((N1*p41)+(N2*p42))/(N1+N2);
                       q=1-p;
                       
                       z=(p41-p42)/(Math.sqrt((p*q)*((1/N1)+(1/N2))));
                       z1=z;
                       if(z<0)
                           z=z*(-1);
                       p4.setText(p+"");
                       Z.setText(z+"");
                    }
                });
            
            two4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                 
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=2.58;
                            else if(los==0.05)
                                zo=1.966;
                                else 
                                    zo=1.645;
                    Zo.setText(zo+"");
                    if(z<zo)
                        {
                            
                            R.setText("Ho is Accepted");
                            
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                            
                        
                        }
                    
                }
            });
            rt4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=2.33;
                            else if(los==0.05)
                                zo=1.645;
                                else 
                                    zo=1.28;
                    Zo.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                            
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                }
            });
            lt4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=-2.33;
                            else if(los==0.05)
                                zo=-1.645;
                                else 
                                    zo=-1.28;
                    Zo.setText(zo+"");
                    if(z1>zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                }
            });
            
            add(z4panel);
            setVisible(true);
        }
        
        
        
}

class ztest5 extends JFrame
{
    public double n1,sd1,z,lo,n2,sd2,zo,z1;
    
    
    
    public  void data()
    {
            
            
            JPanel z5panel=new JPanel();
            z5panel.setLayout(null);
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JRadioButton two5=new JRadioButton("TWO TAILED TEST");
            two5.setFont(font1);
            two5.setBounds(10,480,200,25);

            JRadioButton rt5=new JRadioButton("RIGHT TAILED TEST");
            rt5.setFont(font1);
            rt5.setBounds(10,510,200,25);

            JRadioButton lt5=new JRadioButton("LEFT TAILED TEST");
            lt5.setFont(font1);
            lt5.setBounds(10,540,200,25);

            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(120,360,150,50);
            JLabel zo5=new JLabel("zo");
            zo5.setFont(font);
            zo5.setBounds(10,590,30,30);

            JTextField Zo=new JTextField(6);
            Zo.setBounds(50,590,330,25);
            Zo.setFont(font);
            JLabel z5=new JLabel("z");
            z5.setFont(font);
            z5.setBounds(10,430,30,30);
            JTextField Z=new JTextField(6);
            Z.setBounds(40,430,340,25);
            Z.setFont(font);
            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,640,70,30);

            JTextField R=new JTextField(15);
            R.setBounds(90,640,290,25);
            R.setFont(font);
            JLabel z5ho=new JLabel("Ho");
            z5ho.setFont(font);
            z5ho.setBounds(10,10,30,30);
            JTextField ho=new JTextField(40);
            ho.setBounds(60,10,320,25);
            ho.setFont(font);
            JLabel z5h1=new JLabel("H1");
            z5h1.setFont(font);
            z5h1.setBounds(10,60,30,30);
            JTextField h1=new JTextField(40);
            h1.setBounds(60,60,320,25);
            h1.setFont(font);

            JLabel z5lo=new JLabel("Level Of Significance");
            z5lo.setFont(font);
            z5lo.setBounds(10,110,200,30);
            JTextField lo=new JTextField(5);
            lo.setBounds(200,110,180,25);
            lo.setFont(font);

            JLabel z5n1=new JLabel("Sample1 Size");
            z5n1.setFont(font);
            z5n1.setBounds(10,160,150,30);
            JTextField n1=new JTextField(5);
            n1.setBounds(140,160,240,25);
            n1.setFont(font);

            JLabel z5n2=new JLabel("Sample2 Size");
            z5n2.setFont(font);
            z5n2.setBounds(10,210,150,30);
            JTextField n2=new JTextField(5);
            n2.setBounds(140,210,240,25);
            n2.setFont(font);

            JLabel z5s1=new JLabel("Sample 1 Standard Deviation");
            z5s1.setFont(font);
            z5s1.setBounds(10,260,250,25);
            JTextField s1=new JTextField(5);
            s1.setBounds(280,260,100,25);
            s1.setFont(font);

            JLabel z5s2=new JLabel("Sample 2 Standard Deviation");
            z5s2.setFont(font);
            z5s2.setBounds(10,310,250,25);
            JTextField s2=new JTextField(5);
            s2.setBounds(280,310,100,25);
            s2.setFont(font);

            
            z5panel.add(z5ho);
            z5panel.add(ho);
            z5panel.add(z5h1);
            z5panel.add(h1);
            z5panel.add(z5lo);
            z5panel.add(lo);
            z5panel.add(z5n1);
            z5panel.add(n1);
            z5panel.add(z5n2);
            z5panel.add(n2);
            z5panel.add(z5s1);
            z5panel.add(s1);
            z5panel.add(z5s2);
            z5panel.add(s2);
            z5panel.add(sub);
            z5panel.add(z5);
            z5panel.add(Z);
            z5panel.add(two5);
            z5panel.add(rt5);
            z5panel.add(lt5);
            z5panel.add(zo5);
            z5panel.add(Zo);
            z5panel.add(re);
            z5panel.add(R);
            
            
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       
                       Double N1=Double.parseDouble(n1.getText());
                       Double N2=Double.parseDouble(n2.getText());
                       Double S1=Double.parseDouble(s1.getText());
                       Double S2=Double.parseDouble(s2.getText());
                       z=(S1-S2)/Math.sqrt(((S1*S1)/(2*N1))+((S2*S2)/(2*N2)));
                       z1=z;
                       if(z<0)
                        z=z*(-1);
                       
                       Z.setText(z+"");
                    }
                });
            
            two5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=2.58;
                            else if(los==0.05)
                                zo=1.966;
                                else 
                                    zo=1.645;
                    Zo.setText(zo+"");
                    if(z<zo)
                        {
                            
                            R.setText("Ho is Accepted");
                            
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                            
                        
                        }
                    
                }
            });
            rt5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=2.33;
                            else if(los==0.05)
                                zo=1.645;
                                else 
                                    zo=1.28;
                    Zo.setText(zo+"");
                    if(z<zo)
                        {
                            R.setText("Ho is Accepted");
                            
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                }
            });
            lt5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    Double los=Double.parseDouble(lo.getText());
                    if(los==0.01)
                            zo=-2.33;
                            else if(los==0.05)
                                zo=-1.645;
                                else 
                                    zo=-1.28;
                    Zo.setText(zo+"");
                    if(z1>zo)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                }
            });
     add(z5panel);
     setVisible(true);
    }
}


class t extends JFrame
{
   
    t()
    {
            super("t-TESt");
    }
    void ttests()
        {
            
               	
                Font font1 = new Font("Calibri", Font.PLAIN,20);
                
                JRadioButton A= new JRadioButton("Hypothesis Testing for Significance of the mean of a random Sample");
                A.setFont(font1);
                A.setBounds(10,10,600,50);
                
                JRadioButton B= new JRadioButton("Hypothesis Testing for Difference Between Mean Of Two Independent Sample");
                B.setFont(font1);
                B.setBounds(10,60,680,50);
                
                JRadioButton C= new JRadioButton("Hypothesis Testing for the Significance of an observed correlation coefficient");
                C.setFont(font1);
                C.setBounds(10,110,700,50);                
                
                JPanel tpanel = new JPanel();
                tpanel.setLayout(null);
                
                
                tpanel.add(A);
                tpanel.add(B);
                tpanel.add(C);
                 
                
                
                A.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ttest1 tc1=new ttest1();
                        tc1.data();
                        tc1.setSize(420,720);
                        
                    }
                });
                B.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ttest2 tc2=new ttest2();
                        tc2.data();
                        tc2.setSize(430,810);
                        
                    }
                });
                C.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        ttest3 tc3=new ttest3();
                        tc3.data();
                        tc3.setSize(410,600);
                        
                    }
                });
                add(tpanel);
                setVisible(true);
                

                       
        }
 
}

class ttest1 extends JFrame
{
    
    public double sd,t,to1,v;
    
    
    public String ho,h1;    
    
        
        
        public void data()
        {
            
            
		            
            JPanel t1panel=new JPanel();
            t1panel.setLayout(null);
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JLabel tv=new JLabel("Degree Of Freedom");
            tv.setFont(font);
            tv.setBounds(10,420,190,30);
            JTextField V=new JTextField(5);
            V.setBounds(190,420,190,25);
            V.setFont(font);
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(90,570,200,40);
            JButton ca=new JButton("CALCULATE");
            ca.setFont(font1);
            ca.setBounds(90,360,200,40);
            JLabel t1t=new JLabel("t");
            t1t.setBounds(10,470,30,30);
            t1t.setFont(font);
            JTextField T=new JTextField(5);
            T.setBounds(40,470,340,25);
            T.setFont(font);
            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,630,70,30);
            JTextField R=new JTextField(15);
            R.setBounds(90,630,290,25);
            R.setFont(font);
            JLabel t1to=new JLabel("Tabulated Value");
            t1to.setFont(font);
            t1to.setBounds(10,520,170,30);
            JTextField to=new JTextField(5);
            to.setBounds(170,520,210,25);
            to.setFont(font);
            JLabel t1ho=new JLabel("Ho");

            t1ho.setBounds(10,10,30,30);
            t1ho.setFont(font);
            JTextField ho=new JTextField(40);
            ho.setFont(font);
            ho.setBounds(60,10,320,25);
            JLabel t1h1=new JLabel("H1");
            t1h1.setFont(font);
            t1h1.setBounds(10,60,30,30);
            JTextField h1=new JTextField(40);
            h1.setBounds(60,60,320,25);
            h1.setFont(font);
            JLabel t1lo=new JLabel("Level Of Significance");
            t1lo.setFont(font);
            t1lo.setBounds(10,110,200,30);
            JTextField lo=new JTextField(5);
            lo.setBounds(200,110,180,25);
            lo.setFont(font);
            JLabel t1n=new JLabel("Sample Size");
            t1n.setFont(font);
            t1n.setBounds(10,160,150,30);
            JTextField n=new JTextField(5);
            n.setBounds(140,160,240,25);
            n.setFont(font);
            JLabel t1m=new JLabel("Sample Mean");
            t1m.setFont(font);
            t1m.setBounds(10,210,150,30);
            JTextField m=new JTextField(5);
            m.setBounds(150,210,230,25);
            m.setFont(font);
            JLabel t1p=new JLabel("Population Mean");
            t1p.setFont(font);
            t1p.setBounds(10,260,250,25);
            JTextField p=new JTextField(5);
            p.setBounds(180,260,200,25);
            p.setFont(font);
            JLabel t1s=new JLabel("Sample Standard Deviation");
            t1s.setFont(font);
            t1s.setBounds(10,310,250,30);
            JTextField s=new JTextField(5);
            s.setFont(font);
            s.setBounds(250,310,130,25);
            
            t1panel.add(t1ho);
            t1panel.add(ho);
            t1panel.add(t1h1);
            t1panel.add(h1);
            t1panel.add(t1lo);
            t1panel.add(lo);
            t1panel.add(t1n);
            t1panel.add(n);
            t1panel.add(t1m);
            t1panel.add(m);
            t1panel.add(t1p);
            t1panel.add(p);
            t1panel.add(t1s);
            t1panel.add(s);
            t1panel.add(ca);
            t1panel.add(tv);
            t1panel.add(V);
            t1panel.add(t1t);
            t1panel.add(T);
            t1panel.add(t1to);
            t1panel.add(to);
            t1panel.add(sub);
            t1panel.add(re);
            t1panel.add(R);
            
            ca.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       Double N=Double.parseDouble(n.getText());
                       Double M=Double.parseDouble(m.getText());
                       Double P=Double.parseDouble(p.getText());
                       Double S=Double.parseDouble(s.getText());
                       
                       sd=(Math.sqrt((N*S*S)/(N-1)));
                       t=(M-P)/(sd/(Math.sqrt(N)));
                       v=N-1;
                       if(t<0)
                       {
                             t*=-1;
                       }
                      
                       T.setText(t+"");
                       V.setText(v+"");
                    }
                });
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       to1=Double.parseDouble(to.getText());
                       if(t<to1)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                       
                    }
                });
            add(t1panel);
            setVisible(true);
         }
}


class ttest2 extends JFrame
{
    
    
    public double v,S,t,to1;
   
    
    
    
    public void data()
        {
            
            JPanel t2panel=new JPanel();
            t2panel.setLayout(null);
            
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JButton ca=new JButton("CALCULATE");
            ca.setFont(font1);
            ca.setBounds(90,460,200,40);
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(90,660,200,40);
            JLabel re=new JLabel("RESULT");
            re.setFont(font);
            re.setBounds(10,720,70,25);
            JTextField R=new JTextField(15);
            R.setBounds(90,720,290,30);
            R.setFont(font);
            JLabel t2to=new JLabel("Tabulated Value");
            t2to.setFont(font);
            t2to.setBounds(10,610,170,30);

            JTextField to=new JTextField(5);
            to.setBounds(170,610,210,25);
            to.setFont(font);
            JLabel t2t=new JLabel("t");
            t2t.setFont(font);
            t2t.setBounds(10,560,30,30);
            JTextField T=new JTextField(5);
            T.setBounds(40,560,340,25);
            T.setFont(font);
            JLabel t2v=new JLabel("Degree Of Freedom");
            t2v.setFont(font);
            t2v.setBounds(10,510,190,30);
            JTextField V=new JTextField(3);
            V.setBounds(190,510,190,25);
            V.setFont(font);
            JLabel t2ho=new JLabel("Ho");
            t2ho.setFont(font);
            t2ho.setBounds(10,10,30,30);

            JTextField ho=new JTextField(40);
            ho.setBounds(60,10,320,25);
            ho.setFont(font);
            JLabel t2h1=new JLabel("H1");
            t2h1.setFont(font);
            t2h1.setBounds(10,60,30,30);

            JTextField h1=new JTextField(40);
            h1.setBounds(60,60,320,25);
            h1.setFont(font);
            JLabel t2lo=new JLabel("Level Of Significance");
            t2lo.setFont(font);
            t2lo.setBounds(10,110,200,30);

            JTextField lo=new JTextField(5);
            lo.setBounds(200,110,180,25);
            lo.setFont(font);
            JLabel t2n1=new JLabel("Sample1 Size");
            t2n1.setFont(font);     
            t2n1.setBounds(10,160,150,30);

            JTextField n1=new JTextField(5);
            n1.setBounds(140,160,240,25);
            n1.setFont(font);
            JLabel t2n2=new JLabel("Sample2 Size");
            t2n2.setFont(font);
            t2n2.setBounds(10,210,150,30);

            JTextField n2=new JTextField(5);
            n2.setBounds(140,210,240,25);
            n2.setFont(font);
            JLabel t2m1=new JLabel("Sample1 Mean");
            t2m1.setFont(font);
            t2m1.setBounds(10,260,150,30);

            JTextField m1=new JTextField(5);
            m1.setBounds(150,260,230,25);
            m1.setFont(font);
            JLabel t2m2=new JLabel("Sample2 Mean");
            t2m2.setFont(font);
            t2m2.setBounds(10,310,150,30);

            JTextField m2=new JTextField(5);
            m2.setBounds(150,310,230,25);
            m2.setFont(font);
            JLabel t2s1=new JLabel("Sample1 Standard Deviation");
            t2s1.setFont(font);
            t2s1.setBounds(10,360,270,30);

            JTextField s1=new JTextField(5);
            s1.setBounds(270,360,110,25);
            s1.setFont(font);
            JLabel t2s2=new JLabel("Sample2 Standard Deviation");
            t2s2.setFont(font);
            t2s2.setBounds(10,410,270,30);

            JTextField s2=new JTextField(5);
            s2.setBounds(270,410,110,25);
            s2.setFont(font);            
            t2panel.add(t2ho);
            t2panel.add(ho);
            t2panel.add(t2h1);
            t2panel.add(h1);
            t2panel.add(t2lo);
            t2panel.add(lo);
            t2panel.add(t2n1);
            t2panel.add(n1);
            t2panel.add(t2n2);
            t2panel.add(n2);
            t2panel.add(t2m1);
            t2panel.add(m1);
            t2panel.add(t2m2);
            t2panel.add(m2);
            t2panel.add(t2s1);
            t2panel.add(s1);
            t2panel.add(t2s2);
            t2panel.add(s2);
            t2panel.add(ca);
            t2panel.add(t2v);
            t2panel.add(V);
            t2panel.add(t2t);
            t2panel.add(T);
            t2panel.add(t2to);
            t2panel.add(to);
            t2panel.add(sub);
            t2panel.add(re);
            t2panel.add(R);
            
            ca.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        Double N1=Double.parseDouble(n1.getText());
                       Double N2=Double.parseDouble(n2.getText());
                       Double M1=Double.parseDouble(m1.getText());
                       Double M2=Double.parseDouble(m2.getText());
                       Double S1=Double.parseDouble(s1.getText());
                       Double S2=Double.parseDouble(s2.getText());
                       
                       v=N1+N2-2;
                        
                       S=Math.sqrt(((N1*S1*S1)+(N2*S2*S2))/(v));
                       t=(M1-M2)/(S*(Math.sqrt((1/N1)+(1/N2))));
			if(t<0)
			{
				t*=-1;
			}
                       T.setText(t+"");
                       V.setText(v+"");
                    }
                });
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        to1=Double.parseDouble(to.getText());
                       if(t<to1)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                       
                    }
                });
        add(t2panel);
        setVisible(true);
        }
}

class ttest3 extends JFrame
{
    
        
    public double n,r,t,to3,lo,v;
    
    
    public void data()
    {
            
            JPanel t3frame=new JPanel();
           
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,16);
            t3frame.setLayout(null);
            JButton ca=new JButton("CALCULATE");
            ca.setFont(font1);
            ca.setBounds(90,260,200,40);
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(90,460,200,40);
            JLabel re=new JLabel("RESULT");
            re.setBounds(10,510,70,25);
            JTextField R=new JTextField(15);
            R.setBounds(90,510,290,25);
            re.setFont(font);
            
            JLabel t3to=new JLabel("Tabulated Value");
            t3to.setBounds(10,410,170,30);
            JTextField to=new JTextField(5);
            to.setBounds(170,410,210,25);            
            to.setFont(font);
            t3to.setFont(font);
            JLabel t3t=new JLabel("t");
            t3t.setBounds(10,360,30,30);
            JTextField T=new JTextField(5);
            T.setBounds(40,360,340,25);
            T.setFont(font);
            t3t.setFont(font);
            JLabel t3v=new JLabel("Degree Of Freedom");
            t3v.setBounds(10,310,190,30);

            JTextField V=new JTextField(3);
            V.setBounds(190,310,190,25);
            V.setFont(font);
            t3v.setFont(font);
            JLabel t3ho=new JLabel("Ho");
            JTextField ho=new JTextField(40);
            t3ho.setFont(font);
            t3ho.setBounds(10,10,30,30);
            ho.setBounds(60,10,320,25);
            ho.setFont(font); 
           JLabel t3h1=new JLabel("H1");
            t3h1.setBounds(10,60,30,30);

            JTextField h1=new JTextField(40);
            h1.setBounds(60,60,320,25);
            h1.setFont(font);
            t3h1.setFont(font);
            JLabel t3lo=new JLabel("Level Of Significance");
            t3lo.setBounds(10,110,200,30);
            JTextField lo=new JTextField(5);
            lo.setBounds(200,110,180,25);
            t3lo.setFont(font);
            lo.setFont(font);
            JLabel t3n=new JLabel("Sample Size");
            t3n.setBounds(10,160,150,30);
            JTextField n=new JTextField(5);
            t3n.setFont(font);
            n.setBounds(130,160,250,25);
            n.setFont(font);
            JLabel t3r=new JLabel("Coefficient Of Correlation");
            t3r.setBounds(10,210,270,30);
            t3r.setFont(font);
            JTextField r=new JTextField(5);
            r.setFont(font);
            r.setBounds(240,210,140,25);

            t3r.setFont(font);
            t3frame.add(t3ho);
            t3frame.add(ho);
            t3frame.add(t3h1);
            t3frame.add(h1);
            t3frame.add(t3lo);
            t3frame.add(lo);
            t3frame.add(t3n);
            t3frame.add(n);
            t3frame.add(t3r);
            t3frame.add(r);
            t3frame.add(ca);
            t3frame.add(t3v);
            t3frame.add(V);
            t3frame.add(t3t);
            t3frame.add(T);
            t3frame.add(t3to);
            t3frame.add(to);
            t3frame.add(sub);
            t3frame.add(re);
            t3frame.add(R);
            ca.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       Double N=Double.parseDouble(n.getText());
                       Double r3=Double.parseDouble(r.getText());
                       v=N-2;
                       t=(r3*(Math.sqrt(v)))/(Math.sqrt(1-(r3*r3)));
                       
                       
                       T.setText(t+"");
                       V.setText(v+"");
                    }
                });
            sub.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        to3=Double.parseDouble(to.getText());
                       if(t<to3)
                        {
                            R.setText("Ho is Accepted");
                        }
                        else
                        {
                            R.setText("Ho is Rejected");
                        }
                       
                    }
                });
        add(t3frame);
        setVisible(true);
    }
}

class ftest1 extends JFrame
{
    public double S1,S2,sd1,sd2,N1,N2,f,fo,v1,v2,lo;
    
    
    ftest1()
    {
        super("Variance Ratio Test");
    }
        
    public void data()
    
    {
            
            JPanel f1panel=new JPanel();
           
            Font font = new Font("Calibri", Font.PLAIN,20);
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            f1panel.setLayout(null);
            
            JButton sub=new JButton("SUBMIT");
            sub.setFont(font1);
            sub.setBounds(90,710,200,40);
            JButton ca=new JButton("CALCULATE");
            ca.setFont(font1);
            ca.setBounds(90,360,200,40);            
            JLabel re=new JLabel("RESULT");
            re.setBounds(10,760,70,30);
            JTextField R=new JTextField(15);
            re.setFont(font);
            R.setFont(font);
            R.setBounds(90,760,290,25);
            
            JLabel f1fo=new JLabel("fo");
            f1fo.setBounds(10,660,30,30);
            JTextField ffo=new JTextField(6);
            ffo.setBounds(40,660,340,25);
            f1fo.setFont(font);
            ffo.setFont(font);
            
            JLabel f1f=new JLabel("f");
            f1f.setBounds(10,610,30,30);
            JTextField ff=new JTextField(6);
            ff.setBounds(40,610,340,25);
            f1f.setFont(font);
            ff.setFont(font);
            
            JLabel f1S1=new JLabel("S1");
            f1S1.setBounds(10,410,30,30);
            JTextField fS1=new JTextField(6);
            fS1.setBounds(40,410,340,25);
            f1S1.setFont(font);
            fS1.setFont(font);
            
            JLabel f1S2=new JLabel("S2");
            f1S2.setBounds(10,460,30,30);

            JTextField fS2=new JTextField(6);
            f1S2.setFont(font);
            fS2.setFont(font);
            fS2.setBounds(40,460,340,25);
            
            JLabel f1v1=new JLabel("v1");
            f1v1.setBounds(10,510,30,30);
            JTextField fv1=new JTextField(6);
            fv1.setBounds(40,510,340,25);
            f1v1.setFont(font);
            fv1.setFont(font);
            
            JLabel f1v2=new JLabel("v2");
            f1v2.setBounds(10,560,30,30);
            JTextField fv2=new JTextField(6);
            fv2.setBounds(40,560,340,25);
            f1v2.setFont(font);
            fv2.setFont(font);
            
            JLabel f1ho=new JLabel("Ho");
            JTextField ho=new JTextField(40);
            f1ho.setFont(font);
            ho.setFont(font);
	        f1ho.setBounds(10,10,30,30);
	        ho.setBounds(60,10,320,25);
            
            JLabel f1h1=new JLabel("H1");
            JTextField h1=new JTextField(40);
            f1h1.setFont(font);
            h1.setFont(font);
            f1h1.setBounds(10,60,30,30);
	        h1.setBounds(60,60,320,25);
	
            JLabel f1lo=new JLabel("Level Of Significance");
            JTextField lo=new JTextField(6);
            f1lo.setFont(font);
            lo.setFont(font);
		    f1lo.setBounds(10,110,200,30);
		    lo.setBounds(200,110,180,25);            
            
	        JLabel f1n1=new JLabel("Sample1 Size");
            JTextField n1=new JTextField(6);
            f1n1.setFont(font);
            f1n1.setBounds(10,160,150,30);            
            n1.setFont(font);
            n1.setBounds(140,160,240,25);
            
            JLabel f1n2=new JLabel("Sample2 Size");
            f1n2.setBounds(10,210,150,30);
            JTextField n2=new JTextField(6);
            n2.setBounds(140,210,240,25);
            f1n2.setFont(font);
            n2.setFont(font);
            
            JLabel f1s1=new JLabel("Sample1 Standard Deviation");
            f1s1.setBounds(10,260,270,30);
            JTextField s1=new JTextField(6);
            s1.setBounds(270,260,110,25);
            f1s1.setFont(font);
            s1.setFont(font);
            
            JLabel f1s2=new JLabel("Sample2 Standard Deviation");
            f1s2.setBounds(10,310,270,30);
            JTextField s2=new JTextField(6);
            s2.setBounds(270,310,110,25);
            f1s2.setFont(font);
            s2.setFont(font);
            
            f1panel.add(f1ho);
            f1panel.add(ho);
            f1panel.add(f1h1);
            f1panel.add(h1);
            f1panel.add(f1lo);
            f1panel.add(lo);
            f1panel.add(f1n1);
            f1panel.add(n1);
            f1panel.add(f1n2);
            f1panel.add(n2);
            f1panel.add(f1S1);
            f1panel.add(fS1);
            f1panel.add(f1S2);
            f1panel.add(fS2);
            f1panel.add(f1s1);
            f1panel.add(s1);
            f1panel.add(f1s2);
            f1panel.add(s2);
            f1panel.add(ca);
            f1panel.add(f1v1);
            f1panel.add(fv1);
            f1panel.add(f1v2);
            f1panel.add(fv2);
            f1panel.add(f1f);
            f1panel.add(ff);
            f1panel.add(f1fo);
            f1panel.add(ffo);
            f1panel.add(sub);
            f1panel.add(re);
            f1panel.add(R);
            
            ca.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    N1=Double.parseDouble(n1.getText());
                    N2=Double.parseDouble(n2.getText());
                    S1=Double.parseDouble(s1.getText());
                    S2=Double.parseDouble(s2.getText());
                    sd1=(N1*S1*S1)/(N1-1);
                    sd2=(N2*S2*S2)/(N2-1);
                    fS1.setText(sd1+"");
                    fS2.setText(sd2+"");
                    if(sd1>sd2)
                    {
                        f=sd1/sd2;
                        v1=N1-1;
                        v2=N2-1;
                        ff.setText(f+"");
                        fv1.setText(v1+"");
                        fv2.setText(v2+"");
                        
                    }

                    else
                    {
                        f=sd2/sd1;
                        v1=N2-1;
                        v2=N1-1;
                        ff.setText(f+"");
                        fv1.setText(v1+"");
                        fv2.setText(v2+"");
                    }
                }
            });
            sub.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    
                    fo=Double.parseDouble(ffo.getText());
                    if(f<fo)
                    {
                        R.setText("Ho is Accepted");
                    }
                
                    else
                    {
                        R.setText("Ho is Rejected");
                    }
                }
            });
            add(f1panel);
            setVisible(true);
    }
    
    
    
}

class hypothesis extends JFrame
 {
        public hypothesis()
        {
            super("HYPOTHESIS TESTER");
         
            
            JPanel panel = new JPanel();
            panel.setLayout(null);
            
            
            Font font1 = new Font("Arial Black", Font.BOLD,14);
            
            JButton zt=new JButton("z-test");
            JButton tt=new JButton("t-test");
            JButton ft=new JButton("f-test");
            zt.setBounds(30,30,100,50);
            tt.setBounds(160,30,100,50);
            ft.setBounds(290,30,100,50);
            zt.setFont(font1);
            tt.setFont(font1);
            ft.setFont(font1);
            
            panel.add(zt);
            panel.add(tt);
            panel.add(ft);
            
            add(panel);
            zt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    z tchek=new z();
                    
                      tchek.ztest();
                      tchek.setSize(720,300);
                }
            });
            
            tt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    t tchek=new t();
                    
                      tchek.ttests();
                      tchek.setSize(730,220);
                }
            });
            ft.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    ftest1 tchek=new ftest1();
                    
                      tchek.data();
                      tchek.setSize(410,850);
                }
            });
            setVisible(false);
        }
       
}

