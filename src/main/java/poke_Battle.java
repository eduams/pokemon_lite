import javax.swing.JButton;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eduar
 */
public class poke_Battle extends javax.swing.JFrame {
        int potion = 3;
        int foeHP = 100;
        int mypokeHP = 100;
        boolean attackEvent = false;
        int userLevel;
        int foeLevel;
        String userName;
        Pokemono myPoke = new Pokemono("Snivy","Plant",userLevel);//nome = string tipo = string level = int
        Pokemono foePoke = new Pokemono("Charizard","Fire",foeLevel);//nome = string tipo = string level = int

        /**
     * Creates new form poke_Battle
     */    

    public poke_Battle(int userLevel, String userName, int foeLevel) {
        
        this.userLevel = userLevel;
        this.foeLevel = foeLevel;
        this.userName = userName;
        initComponents();  
        
        jProgressBar2.setValue(100);
        jProgressBar3.setValue(100);

        winButton.setVisible(false);
        System.out.println(userLevel);
    }
    
    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    private poke_Battle() {
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winButton = new javax.swing.JToggleButton();
        myPokelabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        myPokelabel = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        charmander = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        winButton.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        winButton.setText("Você venceu!");
        winButton.setEnabled(false);
        winButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winButtonActionPerformed(evt);
            }
        });
        getContentPane().add(winButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 830, 500));

        myPokelabel1.setBackground(new java.awt.Color(255, 255, 255));
        myPokelabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        myPokelabel1.setForeground(new java.awt.Color(255, 255, 255));
        myPokelabel1.setText(String.valueOf(foeLevel));
        getContentPane().add(myPokelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 110, 40));

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText(String.valueOf(userName));
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 290, 50));

        myPokelabel.setBackground(new java.awt.Color(255, 255, 255));
        myPokelabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        myPokelabel.setForeground(new java.awt.Color(255, 255, 255));
        myPokelabel.setText(String.valueOf(userLevel));
        getContentPane().add(myPokelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 272, 120, 20));
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 240, 10));
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 240, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\OneDrive\\Desktop\\pokemonProject\\UI\\HPhero.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 550, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\OneDrive\\Desktop\\pokemonProject\\UI\\HPfoe.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 100, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jButton1.setText("RUN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 370, 50));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jButton2.setText("FIGHT!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 170, 50));

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jButton4.setText("POTION (3x)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 170, 50));

        charmander.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\OneDrive\\Desktop\\pokemonProject\\pokes\\charmander.gif")); // NOI18N
        getContentPane().add(charmander, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 180, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\OneDrive\\Desktop\\pokemonProject\\pokes\\snivy.gif")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\OneDrive\\Desktop\\pokemonProject\\background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 870, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        attackEvent = true;
        int damage = (int) ((userLevel *0.1 * myPoke.getAttack() * 0.1) + myPoke.getDefense()* 0.1);
        int foeDamage = (int) ((foeLevel *0.1 * foePoke.getAttack() * 0.1) + foePoke.getDefense()* 0.1);
        jProgressBar2.setValue(foeHP - damage);
        jProgressBar3.setValue(mypokeHP - foeDamage);
        foeHP = foeHP - damage;
        mypokeHP = mypokeHP - foeDamage;
        if (foeHP <= 0){
            winButton.setVisible(true);
            System.out.println("Você venceu!");
        }
        if (mypokeHP <= 0){
            winButton.setVisible(true);
            winButton.setText("Você perdeu!");
            System.out.println("Você perdeu!");
        }

       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (potion > 0){
        potion = potion - 1;
        mypokeHP = mypokeHP + 20;
        jProgressBar3.setValue(mypokeHP + 20);
        if (mypokeHP >100){
        mypokeHP = 100;
        }
        System.out.println(mypokeHP);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void winButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winButtonActionPerformed

    }//GEN-LAST:event_winButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double protagAtaque;
        double protagDefesa;
        
        //Pokemono myPoke = new Pokemono("Snivy","Plant",userLevel);//nome = string tipo = string level = int
        //protagAtaque = myPoke.getAttack();
        //protagDefesa = myPoke.getDefense();

    
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
            java.util.logging.Logger.getLogger(poke_Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(poke_Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(poke_Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(poke_Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new poke_Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel charmander;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JLabel myPokelabel;
    private javax.swing.JLabel myPokelabel1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JToggleButton winButton;
    // End of variables declaration//GEN-END:variables
}