

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UppyUpender
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.image.*;
import java.io.*;

public class asss extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form asss
     */
    String d1 = "/home/killer/NetBeansProjects/soft/src/111.png";
    String d2 = "/home/killer/NetBeansProjects/soft/src/222.png";
    String d3 = "/home/killer/NetBeansProjects/soft/src/333.png";
    String d4 = "/home/killer/NetBeansProjects/soft/src/444.png";
    String d5 = "/home/killer/NetBeansProjects/soft/src/888.png";
    String winn = "/home/killer/NetBeansProjects/soft/src/WIN.png";
    String seklook = "/home/killer/NetBeansProjects/soft/srcseklook.png";
    String kill = "/home/killer/NetBeansProjects/soft/src/kill.png";
    String error = "/home/killer/NetBeansProjects/soft/src/error.png";
    String gotton = "/home/killer/NetBeansProjects/soft/src/gotan.png";
    BufferedImage image;
    String emg;
    String player1 = "xx";
    String player2 = "yy";
    boolean chance;
    boolean chkchance = false;
    int dice;
    boolean operation = false;
    asta6 asd;
    int dicebak = 0;
    int movenum = 0;
    int x, y, p, q;

    public asss(String a1, String a2) {
        initComponents();

        cnfrm.setVisible(false);

        player1 = a1;
        player2 = a2;
        chance = false;
        val(0);
        asd = new asta6(player1, player2);
        us1.setText(player1);
        us2.setText(player2);

    }
    char user = '2';
    tempa temp = new tempa();

    void val(int a) {
        boolean b;
        if (a == 0) {
            b = false;
        } else {
            b = true;
        }
        a00.setEnabled(b);
        a01.setEnabled(b);
        a02.setEnabled(b);
        a03.setEnabled(b);
        a04.setEnabled(b);
        a10.setEnabled(b);
        a11.setEnabled(b);
        a12.setEnabled(b);
        a13.setEnabled(b);
        a14.setEnabled(b);
        a20.setEnabled(b);
        a21.setEnabled(b);
        a22.setEnabled(b);
        a23.setEnabled(b);
        a24.setEnabled(b);
        a30.setEnabled(b);
        a31.setEnabled(b);
        a32.setEnabled(b);
        a33.setEnabled(b);
        a34.setEnabled(b);
        a40.setEnabled(b);
        a41.setEnabled(b);
        a42.setEnabled(b);
        a43.setEnabled(b);
        a44.setEnabled(b);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        msg = new javax.swing.JLabel();
        emsg = new javax.swing.JLabel();
        dicc = new javax.swing.JLabel();
        emo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        a00 = new javax.swing.JButton();
        a01 = new javax.swing.JButton();
        a02 = new javax.swing.JButton();
        a03 = new javax.swing.JButton();
        a04 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a20 = new javax.swing.JButton();
        a21 = new javax.swing.JButton();
        a22 = new javax.swing.JButton();
        a23 = new javax.swing.JButton();
        a24 = new javax.swing.JButton();
        a30 = new javax.swing.JButton();
        a31 = new javax.swing.JButton();
        a32 = new javax.swing.JButton();
        a33 = new javax.swing.JButton();
        a34 = new javax.swing.JButton();
        a40 = new javax.swing.JButton();
        a41 = new javax.swing.JButton();
        a42 = new javax.swing.JButton();
        a43 = new javax.swing.JButton();
        a44 = new javax.swing.JButton();
        start = new javax.swing.JButton();
        skip = new javax.swing.JButton();
        Rest = new javax.swing.JButton();
        Undo = new javax.swing.JButton();
        ou1 = new javax.swing.JButton();
        us1 = new javax.swing.JLabel();
        ou2 = new javax.swing.JButton();
        us2 = new javax.swing.JLabel();
        cnfrm = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(239, 248, 247));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        msg.setFont(new java.awt.Font("Century Schoolbook L", 3, 24)); // NOI18N
        msg.setForeground(new java.awt.Color(65, 80, 15));
        msg.setText("Press start to Start..!");

        emsg.setFont(new java.awt.Font("Century Schoolbook L", 2, 18)); // NOI18N
        emsg.setForeground(new java.awt.Color(232, 35, 11));
        emsg.setText(" ");

        dicc.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(855, 855, 855)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(609, 609, 609)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(emsg, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(emo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(dicc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dicc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(emo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emsg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(234, 238, 59));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.pink, java.awt.Color.red, null));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        a00.setText(" ");
        a00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a00ActionPerformed(evt);
            }
        });

        a01.setText(" ");
        a01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a01ActionPerformed(evt);
            }
        });

        a02.setBackground(new java.awt.Color(94, 94, 27));
        a02.setIcon(new javax.swing.ImageIcon("/home/killer/Desktop/ma.png")); // NOI18N
        a02.setBorder(null);
        a02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a02ActionPerformed(evt);
            }
        });

        a03.setText(" ");
        a03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a03ActionPerformed(evt);
            }
        });

        a04.setText(" ");
        a04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a04ActionPerformed(evt);
            }
        });

        a10.setText(" ");
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a11.setText(" ");
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a12.setText(" ");
        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a13.setText(" ");
        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        a14.setText(" ");
        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });

        a20.setBackground(new java.awt.Color(94, 94, 27));
        a20.setText(" ");
        a20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a20ActionPerformed(evt);
            }
        });

        a21.setText(" ");
        a21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a21ActionPerformed(evt);
            }
        });

        a22.setBackground(new java.awt.Color(231, 231, 79));
        a22.setText(" ");
        a22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a22ActionPerformed(evt);
            }
        });

        a23.setText(" ");
        a23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a23ActionPerformed(evt);
            }
        });

        a24.setBackground(new java.awt.Color(94, 94, 27));
        a24.setText(" ");
        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });

        a30.setText(" ");
        a30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a30ActionPerformed(evt);
            }
        });

        a31.setText(" ");
        a31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31ActionPerformed(evt);
            }
        });

        a32.setText(" ");
        a32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a32ActionPerformed(evt);
            }
        });

        a33.setText(" ");
        a33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a33ActionPerformed(evt);
            }
        });

        a34.setText(" ");
        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });

        a40.setText(" ");
        a40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a40ActionPerformed(evt);
            }
        });

        a41.setText(" ");
        a41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41ActionPerformed(evt);
            }
        });

        a42.setBackground(new java.awt.Color(94, 94, 27));
        a42.setText(" ");
        a42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a42ActionPerformed(evt);
            }
        });

        a43.setText(" ");
        a43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a43ActionPerformed(evt);
            }
        });

        a44.setText(" ");
        a44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(a40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(a10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a00, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a01, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(a11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a03, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(a13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a24, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(a34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a10, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(a11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(a20, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(a21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(a31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(a32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a41, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(a42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        skip.setText("Skip");
        skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipActionPerformed(evt);
            }
        });

        Rest.setText("Reset");
        Rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestActionPerformed(evt);
            }
        });

        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });

        ou1.setText("****");
        ou1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ou1ActionPerformed(evt);
            }
        });

        us1.setForeground(new java.awt.Color(40, 42, 17));
        us1.setText("jLabel2");

        ou2.setText("$$$$");
        ou2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ou2ActionPerformed(evt);
            }
        });

        us2.setForeground(new java.awt.Color(69, 68, 44));
        us2.setText("jLabel2");

        cnfrm.setVisible(true);
        cnfrm.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Yes ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cnfrm.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 78, -1, -1));

        jButton2.setText("No");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        cnfrm.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 78, 54, -1));

        jLabel2.setText(" are u sure to reset?");
        cnfrm.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, 228, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(ou2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(us2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Rest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(start, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(skip, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Undo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(us1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(ou1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addComponent(cnfrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(start)
                            .addComponent(skip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rest)
                            .addComponent(Undo))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ou1)
                            .addComponent(us1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cnfrm, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ou2)
                    .addComponent(us2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void changeuser() {
        dicecount = 0;
        String use = null;
        if (user == '1') {
            user = '2';
            use = "2";
        } else if (user == '2') {
            user = '1';
            use = "1";
        }

        dice = asd.generate();
        showplace(user, dice);
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (asd.car[i][j].contains(use)) {
                    String temp = "a" + i + j;
                }
            }
        }

        if (user == '1') {
            msg.setText(player1 + " ur dice is");
        } else if (user == '2') {
            msg.setText(player2 + " ur dice is");
        }

        setimag(dice);
    }
    String buf[] = new String[4];
    int lenn = 0;

    public void run() {
        try {
            Thread.sleep(900);
        } catch (Exception e) {
        }
    }

    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    void showplace(char user, int dice) {
        String use;
        int jk = asd.out1.length();
        int k = asd.out2.length();
        if (user == '1') {
            use = "1";
        } else {
            use = "2";
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (asd.car[i][j].contains(use)) {
                    if ((dice == 4) || (dice == 8)) {
                        if ((jk == 0) && (user == '1')) {
                            checkavail(i, j);
                        } else if (((k == 0) && (user == '2'))) {
                            checkavail(i, j);
                        }
                    } else if ((dice != 4) && (dice != 8)) {
                        checkavail(i, j);
                    }

                }
            }
        }
        if (((dice == 4) || (dice == 8)) && (user == '1' && jk > 0)) {
            ou1.setBackground(new java.awt.Color(224, 236, 22));
        } else if (((dice == 4) || (dice == 8)) && (user == '2' && k > 0)) {
            ou2.setBackground(new java.awt.Color(224, 236, 22));
        }
    }

    void checkavail(int i, int j) {
        String tmp = i + "$" + j;
        int k = 0;
        for (k = 0; k <= 24; k++) {
            if (user == '1') {
                if (tmp.equals(asd.travels1[k])) {
                    break;
                }
            }
            if (user == '2') {
                if (tmp.equals(asd.travels2[k])) {
                    break;
                }
            }

        }
        if (k < 24) {
            int tar = k + dice;
            if ((tar < 24)) {
                if (user == '1') {
                    if (((tar >= 16) && (asd.samp1 > 0)) || (tar < 16)) {
                        char b[] = new char[1];
                        b[0] = asd.travels1[tar].charAt(0);
                        String a = new String(b);
                        int n1 = Integer.parseInt(a);
                        System.out.print(a);
                        b[0] = asd.travels1[tar].charAt(2);
                        a = new String(b);
                        int n2 = Integer.parseInt(a);
                        System.out.print(a);
                        if (asd.car[n1][n2].charAt(0) == 's') {
                            chngec(i, j, 224, 236, 22);
                        } else {
                            if ((asd.car[n1][n2].charAt(0) == 'n') && (asd.car[n1][n2].length() == 1)) {
                                chngec(i, j, 224, 236, 22);
                            } else if ((asd.car[n1][n2].charAt(0) == 'n') && (asd.car[n1][n2].length() == 2)) {
                                if ((asd.car[n1][n2].charAt(1) == '2')) {
                                    chngec(i, j, 224, 236, 22);
                                }
                            }

                        }
                    }
                }
                if (user == '2') {
                    if (((tar >= 16) && (asd.samp2 > 0)) || (tar <= 16)) {
                        char b[] = new char[1];
                        b[0] = asd.travels2[tar].charAt(0);
                        String a = new String(b);
                        int n1 = Integer.parseInt(a);
                        b[0] = asd.travels2[tar].charAt(2);
                        a = new String(b);
                        int n2 = Integer.parseInt(a);
                        if (asd.car[n1][n2].charAt(0) == 's') {
                            chngec(i, j, 224, 236, 22);
                        } else {
                            if ((asd.car[n1][n2].charAt(0) == 'n') && (asd.car[n1][n2].length() == 1)) {
                                chngec(i, j, 224, 236, 22);
                            } else if ((asd.car[n1][n2].charAt(0) == 'n') && (asd.car[n1][n2].length() == 2)) {
                                if ((asd.car[n1][n2].charAt(1) == '1')) {
                                    chngec(i, j, 224, 236, 22);
                                }
                            }

                        }
                    }
                }
            }
        }
    }

    void chngec(int i, int j, int l, int m, int n) {
        switch (i) {
            case 0:
                switch (j) {
                    case 0:
                        a00.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 1:
                        a01.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 2:
                        a02.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 3:
                        a03.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 4:
                        a04.setBackground(new java.awt.Color(l, m, n));
                        break;

                }
                break;
            case 1:
                switch (j) {
                    case 0:
                        a10.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 1:
                        a11.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 2:
                        a12.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 3:
                        a13.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 4:
                        a14.setBackground(new java.awt.Color(l, m, n));
                        break;

                }
                break;
            case 2:
                switch (j) {
                    case 0:
                        a20.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 1:
                        a21.setBackground(new java.awt.Color(l, m, n));
                        break;

                    case 3:
                        a23.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 4:
                        a24.setBackground(new java.awt.Color(l, m, n));
                        break;

                }
                break;

            case 3:
                switch (j) {
                    case 0:
                        a30.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 1:
                        a31.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 2:
                        a32.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 3:
                        a33.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 4:
                        a34.setBackground(new java.awt.Color(l, m, n));
                        break;

                }
                break;

            case 4:
                switch (j) {
                    case 0:
                        a40.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 1:
                        a41.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 2:
                        a42.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 3:
                        a43.setBackground(new java.awt.Color(l, m, n));
                        break;
                    case 4:
                        a44.setBackground(new java.awt.Color(l, m, n));
                        break;

                }
                break;

        }

    }

    void backnormal() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                chngec(i, j, 255, 255, 255);
            }
        }
        a02.setBackground(new java.awt.Color(94, 94, 27));
        a42.setBackground(new java.awt.Color(94, 94, 27));
        a20.setBackground(new java.awt.Color(94, 94, 27));
        a24.setBackground(new java.awt.Color(94, 94, 27));
        ou1.setBackground(new java.awt.Color(255, 255, 255));
        ou2.setBackground(new java.awt.Color(255, 255, 255));

    }

    void setimag(int h) {

        switch (h) {
            case 1:
                dicc.setIcon(new javax.swing.ImageIcon(d1));
                break;
            case 2:
                dicc.setIcon(new javax.swing.ImageIcon(d2));
                break;
            case 3:
                dicc.setIcon(new javax.swing.ImageIcon(d3));
                break;
            case 4:
                dicc.setIcon(new javax.swing.ImageIcon(d4));
                break;

            case 8:
                dicc.setIcon(new javax.swing.ImageIcon(d5));
                break;

        }

    }
    int dicecount = 0;

    void changeuser2() {
        backnormal();
        dice = asd.generate();

        showplace(user, dice);
        if (dice == 4 || dice == 8) {
            dicecount++;
        }
        if (dicecount == 2) {
            while ((dice == 4) || (dice == 8)) {
                dice = asd.generate();
            }
            dicecount = 0;
        }
        if (user == '1') {
            msg.setText(player1 + " ur dice is" + dice);
        } else if (user == '2') {
            msg.setText(player2 + " ur dice is" + dice);
        }
        setimag(dice);

    }
    boolean win = false;

    void chkwin() {
        int u1 = 0;
        int uu2 = 0;
        if (asd.car[2][2].length() >= 4) {
            for (int i = 0; i < asd.car[2][2].length(); i++) {
                if (asd.car[2][2].charAt(i) == '1') {
                    u1++;
                } else if (asd.car[2][2].charAt(i) == '2') {
                    uu2++;
                }

            }
            if (u1 == 4) {
                win = true;
                msg.setText(player1 + " won");
                emo.setIcon(new javax.swing.ImageIcon(winn));
                val(0);
            } else if (uu2 == 4) {
                win = true;
                msg.setText(player2 + " won");
                emo.setIcon(new javax.swing.ImageIcon(winn));
                val(0);
            }
            if (win) {
                cnfrm.setVisible(true);
            }

        }
    }
    private void a03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a03ActionPerformed
        p = 0;
        q = 3;
        backnormal();
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));

            emg = asd.insert(user, dice, 0, 3);

            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));

                changeuser2();

            } else if (((dice != 4) || (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
            chkwin();
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();

    }//GEN-LAST:event_a03ActionPerformed


    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        val(1);
        changeuser();
        start.setEnabled(false);


    }//GEN-LAST:event_startActionPerformed
    public boolean chkout(char user) {
        boolean i = true;
        if (user == '1') {
            if ((asd.out1.length() > 0) && ((dice == 4) || (dice == 8))) {
                i = false;
            }

        } else if (user == '2') {
            if ((asd.out2.length() > 0) && ((dice == 4) || (dice == 8))) {
                i = false;
            }

        }

        return i;
    }

    private void a02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a02ActionPerformed
        backnormal();
        dicebak = dice;
        p = 0;
        q = 2;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 0, 2);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

            }

            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) || (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);

            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a02ActionPerformed
    int c1cou = 0;
    int c2cou = 0;

    public void count(String as) {
        c1cou = 0;
        c2cou = 0;
        String temp = as;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '1') {
                c1cou++;
            } else if (temp.charAt(i) == '2') {
                c2cou++;
            }

        }

    }

    public void showimage(int i, int j) {
        String imageadd = "/home/killer/Desktop/sc/";
        switch (i) {
            case 0:
                switch (j) {
                    case 0:
                        if (c1cou == 1) {
                            a00.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a00.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a00.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 1:
                        if (c1cou == 1) {
                            a01.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a01.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a01.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 3:
                        if (c1cou == 1) {
                            a03.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a03.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a03.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 4:
                        if (c1cou == 1) {
                            a04.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a04.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a04.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 2:
                        if ((c1cou == 0) && (c2cou == 0)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "mar.png"));
                        } else if ((c1cou == 0) && (c2cou == 1)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_1.png"));
                        } else if ((c1cou == 0) && (c2cou == 2)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_2.png"));
                        } else if ((c1cou == 0) && (c2cou == 3)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_3.png"));
                        } else if ((c1cou == 0) && (c2cou == 4)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 0)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_1.png"));
                        } else if ((c1cou == 2) && (c2cou == 0)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 0)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_3.png"));
                        } else if ((c1cou == 4) && (c2cou == 0)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 1)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2.png"));
                        } else if ((c1cou == 1) && (c2cou == 2)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_22.png"));
                        } else if ((c1cou == 1) && (c2cou == 3)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_222.png"));
                        } else if ((c1cou == 1) && (c2cou == 4)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2222.png"));
                        } else if ((c1cou == 2) && (c2cou == 1)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2.png"));
                        } else if ((c1cou == 2) && (c2cou == 2)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_22.png"));
                        } else if ((c1cou == 2) && (c2cou == 3)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_222.png"));
                        } else if ((c1cou == 2) && (c2cou == 4)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2222.png"));
                        } else if ((c1cou == 3) && (c2cou == 1)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 2)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_22.png"));
                        } else if ((c1cou == 3) && (c2cou == 3)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_222.png"));
                        } else if ((c1cou == 3) && (c2cou == 4)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2222.png"));
                        } else if ((c1cou == 4) && (c2cou == 1)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2.png"));
                        } else if ((c1cou == 4) && (c2cou == 2)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_22.png"));
                        } else if ((c1cou == 4) && (c2cou == 3)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_222.png"));
                        } else if ((c1cou == 4) && (c2cou == 4)) {
                            a02.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2222.png"));
                        }
                }
                break;
            case 3:
                switch (j) {
                    case 0:
                        if (c1cou == 1) {
                            a30.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a30.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a30.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 1:
                        if (c1cou == 1) {
                            a31.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a11.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a31.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 3:
                        if (c1cou == 1) {
                            a33.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a33.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a33.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 4:
                        if (c1cou == 1) {
                            a34.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a34.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a34.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 2:
                        if (c1cou == 1) {
                            a32.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a32.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a32.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                }
                break;
            case 1:
                switch (j) {
                    case 0:
                        if (c1cou == 1) {
                            a10.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a10.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a10.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 1:
                        if (c1cou == 1) {
                            a11.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a11.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a11.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 3:
                        if (c1cou == 1) {
                            a13.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a13.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a13.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 4:
                        if (c1cou == 1) {
                            a14.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a14.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a14.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 2:
                        if (c1cou == 1) {
                            a12.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a12.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a12.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                }
                break;
            case 4:
                switch (j) {
                    case 0:
                        if (c1cou == 1) {
                            a40.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a40.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a40.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 1:
                        if (c1cou == 1) {
                            a41.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a41.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a41.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 3:
                        if (c1cou == 1) {
                            a43.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a43.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a43.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 4:
                        if (c1cou == 1) {
                            a44.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a44.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a44.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 2:
                        if ((c1cou == 0) && (c2cou == 0)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "mar.png"));
                        } else if ((c1cou == 0) && (c2cou == 1)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_1.png"));
                        } else if ((c1cou == 0) && (c2cou == 2)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_2.png"));
                        } else if ((c1cou == 0) && (c2cou == 3)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_3.png"));
                        } else if ((c1cou == 0) && (c2cou == 4)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 0)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_1.png"));
                        } else if ((c1cou == 2) && (c2cou == 0)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 0)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_3.png"));
                        } else if ((c1cou == 4) && (c2cou == 0)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 1)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2.png"));
                        } else if ((c1cou == 1) && (c2cou == 2)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_22.png"));
                        } else if ((c1cou == 1) && (c2cou == 3)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_222.png"));
                        } else if ((c1cou == 1) && (c2cou == 4)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2222.png"));
                        } else if ((c1cou == 2) && (c2cou == 1)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2.png"));
                        } else if ((c1cou == 2) && (c2cou == 2)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_22.png"));
                        } else if ((c1cou == 2) && (c2cou == 3)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_222.png"));
                        } else if ((c1cou == 2) && (c2cou == 4)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2222.png"));
                        } else if ((c1cou == 3) && (c2cou == 1)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 2)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_22.png"));
                        } else if ((c1cou == 3) && (c2cou == 3)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_222.png"));
                        } else if ((c1cou == 3) && (c2cou == 4)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2222.png"));
                        } else if ((c1cou == 4) && (c2cou == 1)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2.png"));
                        } else if ((c1cou == 4) && (c2cou == 2)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_22.png"));
                        } else if ((c1cou == 4) && (c2cou == 3)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_222.png"));
                        } else if ((c1cou == 4) && (c2cou == 4)) {
                            a42.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2222.png"));
                        }
                }
                break;
            case 2:
                switch (j) {
                    case 0:
                        if ((c1cou == 0) && (c2cou == 0)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "mar.png"));
                        } else if ((c1cou == 0) && (c2cou == 1)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_1.png"));
                        } else if ((c1cou == 0) && (c2cou == 2)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_2.png"));
                        } else if ((c1cou == 0) && (c2cou == 3)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_3.png"));
                        } else if ((c1cou == 0) && (c2cou == 4)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 0)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_1.png"));
                        } else if ((c1cou == 2) && (c2cou == 0)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 0)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_3.png"));
                        } else if ((c1cou == 4) && (c2cou == 0)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 1)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2.png"));
                        } else if ((c1cou == 1) && (c2cou == 2)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_22.png"));
                        } else if ((c1cou == 1) && (c2cou == 3)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_222.png"));
                        } else if ((c1cou == 1) && (c2cou == 4)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2222.png"));
                        } else if ((c1cou == 2) && (c2cou == 1)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2.png"));
                        } else if ((c1cou == 2) && (c2cou == 2)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_22.png"));
                        } else if ((c1cou == 2) && (c2cou == 3)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_222.png"));
                        } else if ((c1cou == 2) && (c2cou == 4)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2222.png"));
                        } else if ((c1cou == 3) && (c2cou == 1)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 2)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_22.png"));
                        } else if ((c1cou == 3) && (c2cou == 3)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_222.png"));
                        } else if ((c1cou == 3) && (c2cou == 4)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2222.png"));
                        } else if ((c1cou == 4) && (c2cou == 1)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2.png"));
                        } else if ((c1cou == 4) && (c2cou == 2)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_22.png"));
                        } else if ((c1cou == 4) && (c2cou == 3)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_222.png"));
                        } else if ((c1cou == 4) && (c2cou == 4)) {
                            a20.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2222.png"));
                        }
                        break;
                    case 1:
                        if (c1cou == 1) {
                            a21.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a21.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;
                    case 2:
                        if ((c1cou == 0) && (c2cou == 0)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "mar.png"));
                        } else if ((c1cou == 0) && (c2cou == 1)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_1.png"));
                        } else if ((c1cou == 0) && (c2cou == 2)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_2.png"));
                        } else if ((c1cou == 0) && (c2cou == 3)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_3.png"));
                        } else if ((c1cou == 0) && (c2cou == 4)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 0)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_1.png"));
                        } else if ((c1cou == 2) && (c2cou == 0)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 0)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_3.png"));
                        } else if ((c1cou == 4) && (c2cou == 0)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 1)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2.png"));
                        } else if ((c1cou == 1) && (c2cou == 2)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_22.png"));
                        } else if ((c1cou == 1) && (c2cou == 3)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_222.png"));
                        } else if ((c1cou == 1) && (c2cou == 4)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2222.png"));
                        } else if ((c1cou == 2) && (c2cou == 1)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2.png"));
                        } else if ((c1cou == 2) && (c2cou == 2)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_22.png"));
                        } else if ((c1cou == 2) && (c2cou == 3)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_222.png"));
                        } else if ((c1cou == 2) && (c2cou == 4)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2222.png"));
                        } else if ((c1cou == 3) && (c2cou == 1)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 2)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_22.png"));
                        } else if ((c1cou == 3) && (c2cou == 3)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_222.png"));
                        } else if ((c1cou == 3) && (c2cou == 4)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2222.png"));
                        } else if ((c1cou == 4) && (c2cou == 1)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2.png"));
                        } else if ((c1cou == 4) && (c2cou == 2)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_22.png"));
                        } else if ((c1cou == 4) && (c2cou == 3)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_222.png"));
                        } else if ((c1cou == 4) && (c2cou == 4)) {
                            a22.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2222.png"));
                        }
                        break;
                    case 3:
                        if (c1cou == 1) {
                            a31.setIcon(new javax.swing.ImageIcon(imageadd + "um_1.png"));
                        } else if (c2cou == 1) {
                            a31.setIcon(new javax.swing.ImageIcon(imageadd + "um_2.png"));
                        } else {
                            a32.setIcon(new javax.swing.ImageIcon(imageadd + "unmatch.png"));
                        }
                        break;

                    case 4:
                        if ((c1cou == 0) && (c2cou == 0)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "mar.png"));
                        } else if ((c1cou == 0) && (c2cou == 1)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_1.png"));
                        } else if ((c1cou == 0) && (c2cou == 2)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_2.png"));
                        } else if ((c1cou == 0) && (c2cou == 3)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_3.png"));
                        } else if ((c1cou == 0) && (c2cou == 4)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u2_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 0)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_1.png"));
                        } else if ((c1cou == 2) && (c2cou == 0)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 0)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_3.png"));
                        } else if ((c1cou == 4) && (c2cou == 0)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1_4.png"));
                        } else if ((c1cou == 1) && (c2cou == 1)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2.png"));
                        } else if ((c1cou == 1) && (c2cou == 2)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_22.png"));
                        } else if ((c1cou == 1) && (c2cou == 3)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_222.png"));
                        } else if ((c1cou == 1) && (c2cou == 4)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_1_2222.png"));
                        } else if ((c1cou == 2) && (c2cou == 1)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2.png"));
                        } else if ((c1cou == 2) && (c2cou == 2)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_22.png"));
                        } else if ((c1cou == 2) && (c2cou == 3)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_222.png"));
                        } else if ((c1cou == 2) && (c2cou == 4)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u11_2222.png"));
                        } else if ((c1cou == 3) && (c2cou == 1)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2.png"));
                        } else if ((c1cou == 3) && (c2cou == 2)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_22.png"));
                        } else if ((c1cou == 3) && (c2cou == 3)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_222.png"));
                        } else if ((c1cou == 3) && (c2cou == 4)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u111_2222.png"));
                        } else if ((c1cou == 4) && (c2cou == 1)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2.png"));
                        } else if ((c1cou == 4) && (c2cou == 2)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_22.png"));
                        } else if ((c1cou == 4) && (c2cou == 3)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_222.png"));
                        } else if ((c1cou == 4) && (c2cou == 4)) {
                            a24.setIcon(new javax.swing.ImageIcon(imageadd + "m_u1111_2222.png"));
                        }

                }

        }

    }

    void shiiw() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                String temp = asd.give(asd.car[i][j]);
                count(temp);
                showimage(i, j);
            }
        }

        String b = "";
        String c = "";
        for (int i = 0; i < asd.out1.length(); i++) {
            b = b + "*";
        }
        for (int i = 0; i < asd.out2.length(); i++) {
            c = c + "$";
        }
        ou1.setText(b);
        ou2.setText(c);

    }
    private void a22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a22ActionPerformed
        emsg.setText("Not Possible");
    }//GEN-LAST:event_a22ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
        p = 1;
        q = 3;
        emsg.setText("");
        dicebak = dice;
        if (chkout(user)) {

            emg = asd.insert(user, dice, 1, 3);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
        }
        chkwin();
    }//GEN-LAST:event_a13ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed
        backnormal();
        p = 1;
        q = 4;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 1, 4);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a14ActionPerformed

    private void a21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a21ActionPerformed
        backnormal();
        p = 2;
        q = 1;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 2, 1);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);

            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a21ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        backnormal();
        p = 2;
        q = 4;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 2, 4);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a24ActionPerformed

    private void a33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a33ActionPerformed
        backnormal();
        p = 3;
        q = 3;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 3, 3);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a33ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
        backnormal();
        p = 3;
        q = 4;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 3, 4);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;
                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
        }
        chkwin();
    }//GEN-LAST:event_a34ActionPerformed

    private void a40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a40ActionPerformed
        backnormal();
        p = 4;
        q = 0;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 4, 0);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                showplace(user, dice);
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a40ActionPerformed

    private void a42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a42ActionPerformed
        backnormal();

        p = 4;
        q = 2;
        emsg.setText("");
        dicebak = dice;
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 4, 2);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a42ActionPerformed

    private void a43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a43ActionPerformed
        backnormal();
        p = 4;
        q = 3;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 4, 3);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                showplace(user, dice);
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a43ActionPerformed

    private void a44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44ActionPerformed
        backnormal();
        p = 4;
        q = 4;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 4, 4);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a44ActionPerformed

    private void a41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41ActionPerformed
        backnormal();
        p = 4;
        q = 1;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 4, 1);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a41ActionPerformed

    private void a04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a04ActionPerformed
        backnormal();
        p = 0;
        q = 4;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 0, 4);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a04ActionPerformed

    private void start2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start2ActionPerformed


    }//GEN-LAST:event_start2ActionPerformed

    private void ou1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ou1ActionPerformed
        backnormal();
        if (dice == 4 || dice == 8) {
            if (user == '1') {
                if ((dice == 4) || (dice == 8)) {
                    String md = asd.enter(user, dice);
                    emsg.setText(md);
                    if (asd.chance == true) {
                        dice = 4;
                        asd.chance = false;
                    }
                    changeuser2();
                } else {
                    changeuser();
                    movenum = 0;

                }
                shiiw();
            } else {
                emsg.setText("coin  not Found");
                showplace(user, dice);
            }
        } else {

            emsg.setText("Sorry Wrong Move");
            showplace(user, dice);
        }


    }//GEN-LAST:event_ou1ActionPerformed

    private void ou2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ou2ActionPerformed
        // TODO add your handling code here:
        backnormal();
        if (dice == 4 || dice == 8) {
            if (user == '2') {
                if ((dice == 4) || (dice == 8)) {
                    String md = asd.enter(user, dice);
                    emsg.setText(md);
                    if (asd.chance == true) {
                        dice = 4;
                        asd.chance = false;
                    }
                    changeuser2();
                } else {
                    changeuser();
                    movenum = 0;
                }
                shiiw();
            } else {
                emsg.setText("coin  not Found");
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry Wrong Move");
            showplace(user, dice);
        }

    }//GEN-LAST:event_ou2ActionPerformed

    private void RestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestActionPerformed
        if (win == true) {
            jLabel2.setText("ThanQ for Playing.");
            jButton1.setText("Replay");
            jButton2.setText("Exit");
        }
        cnfrm.setVisible(true);

    }//GEN-LAST:event_RestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        asss as = new asss(player1, player2);
        as.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cnfrm.setVisible(false);
        if (win) {
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void skipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipActionPerformed
        asd.getcoins(user);
        emo.setIcon(new javax.swing.ImageIcon(seklook));

        boolean kk = false;
        int le = asd.k - 1;
        System.out.println("skip k=" + le);

        int temp = 0;
        int count = 0;
        String g;
        if (((asd.out1.length() == 4) && (user == '1')) || (((asd.out2.length() == 4) && (user == '2')))) {
            if (user == '1') {
                if ((asd.out1.length() == 4) && ((dice != 4) && (dice != 8))) {
                    kk = true;
                }
            } else if (user == '2') {
                if ((asd.out2.length() == 4) && ((dice != 4) && (dice != 8))) {
                    kk = true;
                }
            }
        } else {
            while (temp <= le) {
                if (user == '1') {
                    for (int i = 0; i < asd.travels1.length; i++) {
                        if (asd.coinat[temp].equals(asd.travels1[i])) {
                            if ((i + dice >= 16) && (asd.samp1 == 0)) {
                                count++;
                            } else if ((i + dice > 25)) {
                                count++;
                            } else if (i == 24) {
                                count++;
                            } else {
                                StringBuffer sb = new StringBuffer(asd.travels1[i + dice]);
                                char b[] = new char[1];
                                b[0] = sb.charAt(0);
                                String bb = new String(b);
                                int i1 = Integer.parseInt(bb);
                                b[0] = sb.charAt(2);
                                bb = new String(b);
                                int i2 = Integer.parseInt(bb);
                                if ((asd.car[i1][i2].charAt(0) == 'n') && (asd.car[i1][i2].charAt(1) == '1')) {
                                    count++;
                                }
                            }
                            break;
                        }
                    }
                } else if (user == '2') {
                    for (int i = 0; i < 25; i++) {
                        if (asd.coinat[temp].equals(asd.travels2[i])) {
                            if ((i + dice > 16) && (asd.samp2 == 0)) {
                                count++;
                            } else if ((i + dice > 25)) {
                                count++;
                            } else if (i == 24) {
                                count++;
                            } else {
                                StringBuffer sb = new StringBuffer(asd.travels2[i + dice]);
                                char b[] = new char[1];
                                b[0] = sb.charAt(0);
                                String bb = new String(b);
                                int i1 = Integer.parseInt(bb);
                                b[0] = sb.charAt(2);
                                bb = new String(b);
                                int i2 = Integer.parseInt(bb);
                                if ((asd.car[i1][i2].charAt(0) == 'n') && (asd.car[i1][i2].charAt(1) == '2')) {
                                    count++;
                                }
                            }
                            break;
                        }
                    }
                }
                temp++;
            }

            for (int i = 0; i <= le; i++) {
                System.out.println("skip" + i + "jj" + asd.coinat[i]);
                System.out.println("count=" + count);

            }
            if (user == '1') {
                if ((4 - count) == asd.out1.length()) {
                    kk = true;
                }
            } else if (user == '2') {
                if ((4 - count) == asd.out2.length()) {
                    kk = true;
                }
            }
        }
        if (kk == true) {
            changeuser();
        } else if (kk == false) {
            emsg.setText("Skip Not Allowed..You can move ur  coin");
        }
    }//GEN-LAST:event_skipActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        System.out.println("unid" + p + "" + q + "" + x + "" + y);
        System.out.println("previous dice=" + dicebak);
        if (movenum > 0) {
            if (dicebak != 4 && dicebak != 8) {
                if (user == '1') {
                    user = '2';
                } else if (user == '2') {
                    user = '1';
                }
            }

            if (asd.killchk == false) {
                StringBuffer sb = new StringBuffer(asd.car[x][y]);

                char a = sb.charAt((asd.car[x][y].length()) - 1);

                sb.deleteCharAt((asd.car[x][y].length()) - 1);
                asd.car[x][y] = new String(sb);
                StringBuffer d = new StringBuffer(asd.car[p][q] + a);
                asd.car[p][q] = new String(d);

            } else if (asd.killchk == true) {

                if (user == '1') {
                    StringBuffer s = new StringBuffer(asd.out2);
                    s.deleteCharAt(0);
                    asd.out2 = new String(s);
                    asd.car[p][q] = asd.car[p][q] + "1";
                    s = new StringBuffer(asd.car[x][y]);
                    s.deleteCharAt(1);
                    asd.car[x][y] = new String(s);
                    asd.car[x][y] = asd.car[x][y] + "2";

                }
                if (user == '2') {
                    StringBuffer s = new StringBuffer(asd.out1);
                    s.deleteCharAt(0);
                    asd.out1 = new String(s);
                    asd.car[p][q] = asd.car[p][q] + "2";
                    s = new StringBuffer(asd.car[x][y]);
                    s.deleteCharAt(1);

                    asd.car[x][y] = new String(s);
                    asd.car[x][y] = asd.car[x][y] + "1";

                }
                System.out.println("old,new " + asd.car[p][q] + "   " + asd.car[x][y] + "   sdlsk");

            }

            shiiw();
            dice = dicebak;
            if (user == '1') {
                msg.setText(player1 + " ur dice is");
            } else {
                msg.setText(player2 + " ur dice  is");
            }
            setimag(dice);
            backnormal();
            showplace(user, dice);
            Undo.setEnabled(false);

        }


    }//GEN-LAST:event_UndoActionPerformed

    private void a23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a23ActionPerformed
        backnormal();
        p = 2;
        q = 3;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {

            emg = asd.insert(user, dice, 2, 3);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
        }
        chkwin();
    }//GEN-LAST:event_a23ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        backnormal();
        p = 1;
        q = 2;
        emsg.setText("");
        dicebak = dice;
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 1, 2);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));

            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));

                chkchance = true;
                changeuser2();
                showplace(user, dice);

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
            } else if (asd.chop == 0) {

                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a12ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        backnormal();
        p = 1;
        q = 1;
        emsg.setText("");
        dicebak = dice;
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 1, 1);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));

            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {

                emo.setIcon(new javax.swing.ImageIcon(error));
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a11ActionPerformed

    private void a32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a32ActionPerformed
        backnormal();
        p = 3;
        q = 2;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {

            emo.setIcon(new javax.swing.ImageIcon(seklook));

            emg = asd.insert(user, dice, 3, 2);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emsg.setText("try again");
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a32ActionPerformed

    private void a31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31ActionPerformed
        backnormal();
        p = 3;
        q = 1;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 3, 1);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
        }
        chkwin();
    }//GEN-LAST:event_a31ActionPerformed

    private void a30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a30ActionPerformed
        backnormal();
        p = 3;
        q = 0;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 3, 0);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);
                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
        }
        chkwin();
    }//GEN-LAST:event_a30ActionPerformed

    private void a20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a20ActionPerformed
        backnormal();
        p = 2;
        q = 0;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 2, 0);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();
                showplace(user, dice);

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();
                showplace(user, dice);
            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
        }
        chkwin();
    }//GEN-LAST:event_a20ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        backnormal();
        p = 1;
        q = 0;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 1, 0);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                chkchance = true;
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a10ActionPerformed

    private void a01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a01ActionPerformed
        backnormal();
        p = 0;
        q = 1;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 0, 1);
            emsg.setText(emg);
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            shiiw();
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emo.setIcon(new javax.swing.ImageIcon(error));
                showplace(user, dice);
                chkchance = true;
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a01ActionPerformed

    private void a00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a00ActionPerformed
        backnormal();
        p = 0;
        q = 0;
        dicebak = dice;
        emsg.setText("");
        if (chkout(user)) {
            emo.setIcon(new javax.swing.ImageIcon(seklook));
            emg = asd.insert(user, dice, 0, 0);
            emsg.setText(emg);
            shiiw();
            if (asd.killchk == true) {
                emo.setIcon(new javax.swing.ImageIcon(kill));

                changeuser2();

                emo.setIcon(new javax.swing.ImageIcon(gotton));
            }
            if (((dice == 4) || (dice == 8)) && (asd.chop == 1)) {
                emo.setIcon(new javax.swing.ImageIcon(gotton));
                chkchance = true;

                changeuser2();

            } else if (((dice != 4) && (dice != 8)) && (asd.chop == 1)) {

                changeuser();
                x = asd.i1;
                y = asd.i2;
                movenum++;
                Undo.setEnabled(true);
            } else if (asd.chop == 0) {
                emsg.setText("try again");
                showplace(user, dice);
            }
        } else {
            emsg.setText("Sorry :( move outer coin first");
            showplace(user, dice);
        }
        chkwin();
    }//GEN-LAST:event_a00ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(asss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asss("uppy", "upender").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Rest;
    public javax.swing.JButton Undo;
    public javax.swing.JButton a00;
    public javax.swing.JButton a01;
    public javax.swing.JButton a02;
    public javax.swing.JButton a03;
    public javax.swing.JButton a04;
    public javax.swing.JButton a10;
    public javax.swing.JButton a11;
    public javax.swing.JButton a12;
    public javax.swing.JButton a13;
    public javax.swing.JButton a14;
    public javax.swing.JButton a20;
    public javax.swing.JButton a21;
    public javax.swing.JButton a22;
    public javax.swing.JButton a23;
    public javax.swing.JButton a24;
    public javax.swing.JButton a30;
    public javax.swing.JButton a31;
    public javax.swing.JButton a32;
    public javax.swing.JButton a33;
    public javax.swing.JButton a34;
    public javax.swing.JButton a40;
    public javax.swing.JButton a41;
    public javax.swing.JButton a42;
    public javax.swing.JButton a43;
    public javax.swing.JButton a44;
    public javax.swing.JInternalFrame cnfrm;
    public javax.swing.JLabel dicc;
    public javax.swing.JLabel emo;
    public javax.swing.JLabel emsg;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JLabel msg;
    public javax.swing.JButton ou1;
    public javax.swing.JButton ou2;
    public javax.swing.JButton skip;
    public javax.swing.JButton start;
    public javax.swing.JLabel us1;
    public javax.swing.JLabel us2;
    // End of variables declaration//GEN-END:variables
}

class tempa {

    volatile String ab = null;

}
