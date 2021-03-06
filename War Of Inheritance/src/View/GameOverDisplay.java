
package View;

public class GameOverDisplay extends javax.swing.JFrame {

    public GameOverDisplay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_BG = new javax.swing.JPanel();
        jLabel_Percent = new javax.swing.JLabel();
        jLabel_Message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_BG.setBackground(new java.awt.Color(156, 184, 217));

        jLabel_Percent.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_Percent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_Message.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_BGLayout = new javax.swing.GroupLayout(jPanel_BG);
        jPanel_BG.setLayout(jPanel_BGLayout);
        jPanel_BGLayout.setHorizontalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Percent, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel_BGLayout.setVerticalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BGLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Percent, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel_Message;
    public javax.swing.JLabel jLabel_Percent;
    private javax.swing.JPanel jPanel_BG;
    // End of variables declaration//GEN-END:variables
}
