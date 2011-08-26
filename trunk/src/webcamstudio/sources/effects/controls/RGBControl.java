/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MosaicControl.java
 *
 * Created on 2010-01-15, 01:51:51
 */

package webcamstudio.sources.effects.controls;

import webcamstudio.sources.effects.RGB;

/**
 *
 * @author pballeux
 */
public class RGBControl extends javax.swing.JPanel {

    RGB effect = null;
    /** Creates new form MosaicControl */
    public RGBControl(RGB effect) {
        initComponents();
        this.effect=effect;
        sliderR.setValue(effect.getRThreshold());
        sliderG.setValue(effect.getGThreshold());
        sliderB.setValue(effect.getBThreshold());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sliderR = new javax.swing.JSlider();
        sliderG = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();

        sliderR.setBackground(java.awt.Color.red);
        sliderR.setMaximum(200);
        sliderR.setMinorTickSpacing(20);
        sliderR.setPaintLabels(true);
        sliderR.setPaintTicks(true);
        sliderR.setValue(100);
        sliderR.setName("sliderR"); // NOI18N
        sliderR.setOpaque(true);
        sliderR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRStateChanged(evt);
            }
        });

        sliderG.setBackground(java.awt.Color.green);
        sliderG.setMaximum(200);
        sliderG.setMinorTickSpacing(20);
        sliderG.setPaintLabels(true);
        sliderG.setPaintTicks(true);
        sliderG.setValue(100);
        sliderG.setName("sliderG"); // NOI18N
        sliderG.setOpaque(true);
        sliderG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGStateChanged(evt);
            }
        });

        sliderB.setBackground(java.awt.Color.blue);
        sliderB.setMaximum(200);
        sliderB.setMinorTickSpacing(20);
        sliderB.setPaintLabels(true);
        sliderB.setPaintTicks(true);
        sliderB.setValue(100);
        sliderB.setName("sliderB"); // NOI18N
        sliderB.setOpaque(true);
        sliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderR, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(sliderG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(sliderB, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sliderR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sliderRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRStateChanged
        effect.setRThreshold(sliderR.getValue());
    }//GEN-LAST:event_sliderRStateChanged

    private void sliderGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGStateChanged
        effect.setGThreshold(sliderG.getValue());
    }//GEN-LAST:event_sliderGStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        effect.setBThreshold(sliderB.getValue());
    }//GEN-LAST:event_sliderBStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderG;
    private javax.swing.JSlider sliderR;
    // End of variables declaration//GEN-END:variables

}