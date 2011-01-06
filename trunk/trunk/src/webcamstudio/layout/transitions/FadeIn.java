/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webcamstudio.layout.transitions;

import java.util.logging.Level;
import java.util.logging.Logger;
import webcamstudio.layout.LayoutItem;
import webcamstudio.sources.VideoSource;

/**
 *
 * @author pballeux
 */
public class FadeIn extends Transition {

    @Override
    public void doTransition(final LayoutItem item) {
        VideoSource source = item.getSource();
        if (!source.isPlaying()) {
            source.startSource();
        }
        source.setOpacity(0);
        source.setShowAtX(item.getX());
        source.setShowAtY(item.getY());
        source.setOutputWidth(item.getWidth());
        source.setOutputHeight(item.getHeight());
        source.fireSourceUpdated();
        for (int i = 0; i <= 20; i++) {
            try {
                source.setOpacity(i * 5);
                source.fireSourceUpdated();
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(LayoutItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}