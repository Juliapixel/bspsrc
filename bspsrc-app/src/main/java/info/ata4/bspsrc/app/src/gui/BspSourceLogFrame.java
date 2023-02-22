/*
** 2011 April 5
**
** The author disclaims copyright to this source code.  In place of
** a legal notice, here is a blessing:
**    May you do good and not evil.
**    May you find forgiveness for yourself and forgive others.
**    May you share freely, never taking more than you give.
*/

package info.ata4.bspsrc.app.src.gui;

import info.ata4.bspsrc.app.util.TextAreaHandler;
import info.ata4.log.ConsoleFormatter;

import java.util.logging.Logger;

/**
 * Decompiler output frame.
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public class BspSourceLogFrame extends javax.swing.JFrame {

    private final TextAreaHandler handler;

    /**
     * Creates new form BspSourceLogFrame
     */
    public BspSourceLogFrame() {
        initComponents();
        handler = new TextAreaHandler(messageTextArea, errorTextArea);
        handler.setFormatter(new ConsoleFormatter());
    }

    public void setLogging(boolean logging) {
        Logger log = Logger.getLogger("");
        if (logging) {
            log.addHandler(handler);
        } else {
            log.removeHandler(handler);
        }
    }

    public void clear() {
        messageTextArea.setText("");
        errorTextArea.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messageScrollPane = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        errorScrollPane = new javax.swing.JScrollPane();
        errorTextArea = new javax.swing.JTextArea();

        setTitle("BSPSource output");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(160, 256));

        messageScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Progress"));

        messageTextArea.setEditable(false);
        messageTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        messageTextArea.setRows(1);
        messageTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        messageScrollPane.setViewportView(messageTextArea);

        errorScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Errors & Warnings"));

        errorTextArea.setEditable(false);
        errorTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        errorTextArea.setForeground(new java.awt.Color(153, 0, 0));
        errorTextArea.setLineWrap(true);
        errorTextArea.setRows(1);
        errorTextArea.setWrapStyleWord(true);
        errorTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        errorScrollPane.setViewportView(errorTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addComponent(messageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane errorScrollPane;
    private javax.swing.JTextArea errorTextArea;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JTextArea messageTextArea;
    // End of variables declaration//GEN-END:variables
}