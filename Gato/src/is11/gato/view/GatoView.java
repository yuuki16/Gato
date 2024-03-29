package is11.gato.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */

public class GatoView extends javax.swing.JFrame {
    
    int turno;

    /**
     * Creates new form GatoView
     */
    public GatoView() {
        initComponents();
    }
    
    public void ingresarFicha(){
        
    }//ingresarFicha
    
    public void turnos(){
        
    }//turnos

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TicTacToeLb = new javax.swing.JLabel();
        XLb = new javax.swing.JLabel();
        PrimerCuadranteLb = new javax.swing.JLabel();
        StartBt = new javax.swing.JToggleButton();
        OLb = new javax.swing.JLabel();
        XEditableLb = new javax.swing.JLabel();
        OEditableLb = new javax.swing.JLabel();
        SegundoCuadranteLb = new javax.swing.JLabel();
        TercerCuadranteLb = new javax.swing.JLabel();
        CuartoCuadranteLb = new javax.swing.JLabel();
        QuintoCuadranteLb = new javax.swing.JLabel();
        SextoCuadranteLb = new javax.swing.JLabel();
        SetimoCuadranteLb = new javax.swing.JLabel();
        OctavoCuadranteLb = new javax.swing.JLabel();
        NovenoCuadranteLb = new javax.swing.JLabel();
        TableroLb = new javax.swing.JLabel();
        TurnoLb = new javax.swing.JLabel();
        TurnoEditableLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TicTacToeLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is11/gato/imgs/TicTacToe.png"))); // NOI18N
        TicTacToeLb.setText("Tic Tac Toe");
        getContentPane().add(TicTacToeLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 789, 190));

        XLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is11/gato/imgs/download.jpg"))); // NOI18N
        getContentPane().add(XLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 50));

        PrimerCuadranteLb.setText("PrimerC");
        PrimerCuadranteLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrimerCuadranteLbMouseClicked(evt);
            }
        });
        getContentPane().add(PrimerCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 90, 90));

        StartBt.setText("Start");
        StartBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtActionPerformed(evt);
            }
        });
        getContentPane().add(StartBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 150, 50));

        OLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is11/gato/imgs/download (1).jpg"))); // NOI18N
        getContentPane().add(OLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 70, 60));

        XEditableLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        XEditableLb.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(XEditableLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 90, 20));

        OEditableLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        OEditableLb.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(OEditableLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        SegundoCuadranteLb.setText("SegundoC");
        getContentPane().add(SegundoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 224, 70, 100));

        TercerCuadranteLb.setText("TercerC");
        getContentPane().add(TercerCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 224, 90, 100));

        CuartoCuadranteLb.setText("CuartoC");
        getContentPane().add(CuartoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 334, 100, 70));

        QuintoCuadranteLb.setText("QuintoC");
        getContentPane().add(QuintoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 70, 70));

        SextoCuadranteLb.setText("SextoC");
        getContentPane().add(SextoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 90, 70));

        SetimoCuadranteLb.setText("SetimoC");
        getContentPane().add(SetimoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 110, 80));

        OctavoCuadranteLb.setText("OctavoC");
        getContentPane().add(OctavoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 70, 100));

        NovenoCuadranteLb.setText("NovenoC");
        getContentPane().add(NovenoCuadranteLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 100, 100));

        TableroLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/is11/gato/imgs/img-thing.png"))); // NOI18N
        getContentPane().add(TableroLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 300, 310));

        TurnoLb.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        TurnoLb.setText("Turno:");
        getContentPane().add(TurnoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));
        getContentPane().add(TurnoEditableLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtActionPerformed
        // TODO add your handling code here:
        Object[] fichas= {"X", "O"};
        int n= JOptionPane.showOptionDialog(rootPane, "Escoja su ficha.", "Empezar Partida.", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, fichas, fichas[0]);
        System.out.println("El usuario escoje"+fichas[n]);
        
        if (n==0) {//el usuario escoge usar X
            XEditableLb.setText("Jugador");
            OEditableLb.setText("Computadora");
            
        }else if (n==1) {//el usuario usa O
            OEditableLb.setText("Jugador");
            XEditableLb.setText("Computadora");
        }
        
        
    }//GEN-LAST:event_StartBtActionPerformed

    private void PrimerCuadranteLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimerCuadranteLbMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PrimerCuadranteLbMouseClicked

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
            java.util.logging.Logger.getLogger(GatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GatoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GatoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuartoCuadranteLb;
    private javax.swing.JLabel NovenoCuadranteLb;
    private javax.swing.JLabel OEditableLb;
    private javax.swing.JLabel OLb;
    private javax.swing.JLabel OctavoCuadranteLb;
    private javax.swing.JLabel PrimerCuadranteLb;
    private javax.swing.JLabel QuintoCuadranteLb;
    private javax.swing.JLabel SegundoCuadranteLb;
    private javax.swing.JLabel SetimoCuadranteLb;
    private javax.swing.JLabel SextoCuadranteLb;
    private javax.swing.JToggleButton StartBt;
    private javax.swing.JLabel TableroLb;
    private javax.swing.JLabel TercerCuadranteLb;
    private javax.swing.JLabel TicTacToeLb;
    private javax.swing.JLabel TurnoEditableLb;
    private javax.swing.JLabel TurnoLb;
    private javax.swing.JLabel XEditableLb;
    private javax.swing.JLabel XLb;
    // End of variables declaration//GEN-END:variables
}
