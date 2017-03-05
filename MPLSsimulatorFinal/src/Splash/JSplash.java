/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splash;

public class JSplash extends javax.swing.JFrame {

    public JSplash() {
        initComponents();
       // setIconImage(new javax.swing.ImageIcon(this.getClass().getResource(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("/imagenes/splash_menu.png"))).getImage());
    }

    private void initComponents() {//GEN-BEGIN:initComponents
        Text = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        //getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        //setName(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("JSplash"));
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        //Text.setFont(new java.awt.Font(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Arial"), 0, 12));
        //Text.setText(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("Starting..."));
       // getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 16, 260, 20));

        //Image.setIcon(new javax.swing.ImageIcon(getClass().getResource(java.util.ResourceBundle.getBundle("simMPLS/lenguajes/lenguajes").getString("/imagenes/splash_inicio.png"))));
        //getContentPane().add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();

        java.awt.Dimension tamFrame=this.getSize();
        java.awt.Dimension tamPantalla=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((tamPantalla.width-tamFrame.width)/2, (tamPantalla.height-tamFrame.height)/2);

    }
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        this.dispose();
    }//GEN-LAST:event_exitForm

    
    public void ponerTexto(String txt) {
        Text.setText(txt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text;
    // End of variables declaration//GEN-END:variables
}

    
    
    

