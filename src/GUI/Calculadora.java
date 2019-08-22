package GUI;
public class Calculadora extends javax.swing.JFrame {
    String operador="";
    int num1;
    int num2;
 
    public Calculadora() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaResultado = new javax.swing.JTextField();
        limpiarBTN = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Básica ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(cajaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 270, 50));

        limpiarBTN.setText("Limpiar");
        limpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 40));

        dividir.setText("\\");
            dividir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dividirActionPerformed(evt);
                }
            });
            getContentPane().add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, 40));

            igual.setText("=");
            igual.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    igualActionPerformed(evt);
                }
            });
            getContentPane().add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 50, 40));

            nueve.setText("9");
            nueve.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nueveActionPerformed(evt);
                }
            });
            getContentPane().add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, 40));

            ocho.setText("8");
            ocho.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ochoActionPerformed(evt);
                }
            });
            getContentPane().add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 60, 40));

            siete.setText("7");
            siete.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sieteActionPerformed(evt);
                }
            });
            getContentPane().add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 40));

            cuatro.setText("4");
            cuatro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cuatroActionPerformed(evt);
                }
            });
            getContentPane().add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 40));

            cinco.setText("5");
            cinco.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cincoActionPerformed(evt);
                }
            });
            getContentPane().add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 60, 40));

            seis.setText("6");
            seis.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    seisActionPerformed(evt);
                }
            });
            getContentPane().add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 60, 40));

            multiplicar.setText("*");
            multiplicar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    multiplicarActionPerformed(evt);
                }
            });
            getContentPane().add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 60, 40));

            uno.setText("1");
            uno.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    unoActionPerformed(evt);
                }
            });
            getContentPane().add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 60, 40));

            cero.setText("0");
            cero.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ceroActionPerformed(evt);
                }
            });
            getContentPane().add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 60, 40));

            dos.setText("2");
            dos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dosActionPerformed(evt);
                }
            });
            getContentPane().add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, 40));

            tres.setText("3");
            tres.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tresActionPerformed(evt);
                }
            });
            getContentPane().add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 60, 40));

            restar.setText("-");
            restar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    restarActionPerformed(evt);
                }
            });
            getContentPane().add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 50, 40));

            sumar.setText("+");
            sumar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sumarActionPerformed(evt);
                }
            });
            getContentPane().add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 60, 40));

            pack();
        }// </editor-fold>//GEN-END:initComponents
   
    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        guardarOperacion(dividir.getText());   
    }//GEN-LAST:event_dividirActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        calcular();
    }//GEN-LAST:event_igualActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
         escribirEnCajaResultado(nueve.getText());
    }//GEN-LAST:event_nueveActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        escribirEnCajaResultado(ocho.getText());
    }//GEN-LAST:event_ochoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        escribirEnCajaResultado(siete.getText());
    }//GEN-LAST:event_sieteActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        escribirEnCajaResultado(cuatro.getText());
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
       escribirEnCajaResultado(cinco.getText());
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
       escribirEnCajaResultado(seis.getText());
    }//GEN-LAST:event_seisActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
       guardarOperacion(multiplicar.getText());     
    }//GEN-LAST:event_multiplicarActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
       escribirEnCajaResultado(uno.getText());
  
    }//GEN-LAST:event_unoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
      escribirEnCajaResultado(cero.getText());
    }//GEN-LAST:event_ceroActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
      escribirEnCajaResultado(dos.getText());
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
       escribirEnCajaResultado(tres.getText());
    }//GEN-LAST:event_tresActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
       guardarOperacion(restar.getText());      
    }//GEN-LAST:event_restarActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
       guardarOperacion(sumar.getText());              
    }//GEN-LAST:event_sumarActionPerformed

    private void limpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTNActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaResultado;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JButton limpiarBTN;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton restar;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton sumar;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables

    private void escribirEnCajaResultado(String num) {
      cajaResultado.setText(cajaResultado.getText()+num);     
    }

    private void limpiar() {
       operador=""; //Limpiamos lo que haya guardado
       cajaResultado.setText("");//Limpiamos la caja
    }

    private void guardarOperacion(String text) {          
        guardarNum(cajaResultado.getText());
        operador=text; 
        cajaResultado.setText(""); 
    }

    private void guardarNum(String text) {
        if (num1!=0){
         num2=Integer.valueOf(text);  
        }else{
          num1=Integer.valueOf(text);  
        }       
    }

    private void calcular() {           
        guardarNum(cajaResultado.getText());
        switch (operador){
            case "+":
                 cajaResultado.setText(String.valueOf(num1+num2));
                break;
            case "-":
                 cajaResultado.setText(String.valueOf(num1-num2));
                break;
            case "*":
                 cajaResultado.setText(String.valueOf(num1*num2));
                break;
            case "\\":
                 cajaResultado.setText(String.valueOf(num1/num2));
                break;
        }
        num1=Integer.valueOf(cajaResultado.getText());
       
    }
}
