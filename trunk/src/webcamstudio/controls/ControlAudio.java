/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ControlAudio.java
 *
 * Created on 2010-01-12, 23:54:38
 */

package webcamstudio.controls;

import webcamstudio.components.SourceListener;
import webcamstudio.sources.VideoSource;

/**
 *
 * @author pballeux
 */
public class ControlAudio extends javax.swing.JPanel implements Controls{
    VideoSource source = null;
    String label = "Audio";
    private SourceListener listener=null;
    /** Creates new form ControlAudio */
    public ControlAudio(VideoSource source) {
        initComponents();
        this.source=source;
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("webcamstudio.Languages");
        label = bundle.getString("AUDIO");
        slideVolume.setValue(source.getVolume());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVolume = new javax.swing.JLabel();
        slideVolume = new javax.swing.JSlider();
        chkMute = new javax.swing.JCheckBox();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("webcamstudio/Languages"); // NOI18N
        lblVolume.setText(bundle.getString("VOLUME")); // NOI18N
        lblVolume.setName("lblVolume"); // NOI18N

        slideVolume.setMajorTickSpacing(20);
        slideVolume.setMinorTickSpacing(5);
        slideVolume.setPaintLabels(true);
        slideVolume.setPaintTicks(true);
        slideVolume.setName("slideVolume"); // NOI18N
        slideVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideVolumeStateChanged(evt);
            }
        });

        chkMute.setText(bundle.getString("MUTE")); // NOI18N
        chkMute.setName("chkMute"); // NOI18N
        chkMute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slideVolume, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkMute)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slideVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkMute)
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkMuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMuteActionPerformed
        if (chkMute.isSelected()){
            source.setVolume(0);
        }
        else{
            source.setVolume(slideVolume.getValue());
        }
    }//GEN-LAST:event_chkMuteActionPerformed

    private void slideVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideVolumeStateChanged
        source.setVolume(slideVolume.getValue());
        chkMute.setSelected(false);
    }//GEN-LAST:event_slideVolumeStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkMute;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JSlider slideVolume;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void removeControl() {
        source=null;
    }

    @Override
    public void setListener(SourceListener l) {
        listener=l;
    }

}