package figuras;

public class Main extends javax.swing.JFrame {

    private int figure;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lblAltura.setVisible(false);
        txtAltura.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlParametros = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        pnlDibujar = new javax.swing.JButton();
        pnlBorrar = new javax.swing.JButton();
        pnlParametros1 = new javax.swing.JPanel();
        lblPerimetro = new javax.swing.JLabel();
        pnlAltura1 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        pnlCanvas = new javax.swing.JPanel();
        mnbMain = new javax.swing.JMenuBar();
        mnuFiguras = new javax.swing.JMenu();
        mniCirculo = new javax.swing.JMenuItem();
        mniCuadrado = new javax.swing.JMenuItem();
        mniTriangulo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros"));

        lblRadio.setText("Radio");

        lblAltura.setText("Altura");

        javax.swing.GroupLayout pnlParametrosLayout = new javax.swing.GroupLayout(pnlParametros);
        pnlParametros.setLayout(pnlParametrosLayout);
        pnlParametrosLayout.setHorizontalGroup(
            pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametrosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRadio)
                    .addComponent(lblAltura))
                .addGap(18, 18, 18)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAltura)
                    .addComponent(txtRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlParametrosLayout.setVerticalGroup(
            pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadio)
                    .addComponent(txtRadio))
                .addGap(17, 17, 17)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(pnlParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 110));

        pnlDibujar.setText("Dibujar");
        pnlDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnlDibujarActionPerformed(evt);
            }
        });
        getContentPane().add(pnlDibujar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        pnlBorrar.setText("Borrar");
        getContentPane().add(pnlBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        pnlParametros1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        lblPerimetro.setText("Perimetro");

        pnlAltura1.setText("Area");

        javax.swing.GroupLayout pnlParametros1Layout = new javax.swing.GroupLayout(pnlParametros1);
        pnlParametros1.setLayout(pnlParametros1Layout);
        pnlParametros1Layout.setHorizontalGroup(
            pnlParametros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametros1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlParametros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerimetro)
                    .addComponent(pnlAltura1))
                .addGap(18, 18, 18)
                .addGroup(pnlParametros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtArea)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlParametros1Layout.setVerticalGroup(
            pnlParametros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametros1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlParametros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(txtPerimetro))
                .addGap(17, 17, 17)
                .addGroup(pnlParametros1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnlAltura1)
                    .addComponent(txtArea))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(pnlParametros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 110));

        javax.swing.GroupLayout pnlCanvasLayout = new javax.swing.GroupLayout(pnlCanvas);
        pnlCanvas.setLayout(pnlCanvasLayout);
        pnlCanvasLayout.setHorizontalGroup(
            pnlCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        pnlCanvasLayout.setVerticalGroup(
            pnlCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCanvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 360, 280));

        mnuFiguras.setText("Figuras");

        mniCirculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCirculo.setText("Circulo");
        mniCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCirculoActionPerformed(evt);
            }
        });
        mnuFiguras.add(mniCirculo);

        mniCuadrado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCuadrado.setText("Cuadrado");
        mniCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCuadradoActionPerformed(evt);
            }
        });
        mnuFiguras.add(mniCuadrado);

        mniTriangulo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniTriangulo.setText("Triangulo");
        mnuFiguras.add(mniTriangulo);

        mnbMain.add(mnuFiguras);

        jMenu2.setText("Edit");
        mnbMain.add(jMenu2);

        setJMenuBar(mnbMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnlDibujarActionPerformed
        Circulo circulo;
        Cuadrado cuadrado;
        if (figure == 0) {
            circulo = new Circulo(Integer.parseInt(txtRadio.getText()));
            txtPerimetro.setText(Float.toString(circulo.Perimetro()));
            txtArea.setText(Float.toString(circulo.Area()));
            circulo.drawFigure(pnlCanvas.getGraphics());
        } else if (figure == 1) {
            cuadrado = new Cuadrado(Integer.parseInt(txtRadio.getText()));
            txtPerimetro.setText(Float.toString(cuadrado.Perimetro()));
            txtArea.setText(Float.toString(cuadrado.Area()));
            cuadrado.drawFigure(pnlCanvas.getGraphics());
        }
    }//GEN-LAST:event_pnlDibujarActionPerformed

    private void mniCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCirculoActionPerformed
        if (evt.getSource().equals(mniCirculo)) {
            figure = 0;
            lblAltura.setVisible(false);
            txtAltura.setVisible(false);
            lblRadio.setText("Radio");
        }
    }//GEN-LAST:event_mniCirculoActionPerformed

    private void mniCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCuadradoActionPerformed
        if (evt.getSource().equals(mniCuadrado)) {
 figure = 1;
 lblAltura.setVisible(false);
 txtAltura.setVisible(false);
 lblRadio.setText("Lado");
         }
    }//GEN-LAST:event_mniCuadradoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniCirculo;
    private javax.swing.JMenuItem mniCuadrado;
    private javax.swing.JMenuItem mniTriangulo;
    private javax.swing.JMenu mnuFiguras;
    private javax.swing.JLabel pnlAltura1;
    private javax.swing.JButton pnlBorrar;
    private javax.swing.JPanel pnlCanvas;
    private javax.swing.JButton pnlDibujar;
    private javax.swing.JPanel pnlParametros;
    private javax.swing.JPanel pnlParametros1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
