/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaswingdev.swing.tittlebarv2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author doqua
 */
public class SimpleTitleBar extends javax.swing.JPanel {

    private javaswingdev.ComponentResizer resize;
    private int x;
    private int y;

    public SimpleTitleBar() {
        initComponents();
    }

    public void init(JFrame fram) {
        resize = new javaswingdev.ComponentResizer();
        resize.setSnapSize(new Dimension(10, 10));
        resize.setMinimumSize(new Dimension(300, 200));
        resize.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        resize.registerComponent(fram);
        initMoving(fram);
        simpleButtonBar1.initEvent(fram);
    }

    private void initMoving(JFrame fram) {
        panelMove.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (fram.getExtendedState() != JFrame.MAXIMIZED_BOTH && SwingUtilities.isLeftMouseButton(me)) {
                    x = me.getX() + 3;
                    y = me.getY() + 3;
                }
            }

            @Override
            public void mouseClicked(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me) && me.getClickCount() == 2) {
                    if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        fram.setExtendedState(JFrame.NORMAL);
                    } else {
                        fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    }
                }
            }

        });
        panelMove.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        fram.setExtendedState(JFrame.NORMAL);
                    }
                    fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
                }
            }
        });
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();
        simpleButtonBar1 = new javaswingdev.swing.tittlebarv2.SimpleButtonBar();

        setBackground(new java.awt.Color(255, 255, 255));

        panelMove.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        simpleButtonBar1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simpleButtonBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simpleButtonBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMove;
    private javaswingdev.swing.tittlebarv2.SimpleButtonBar simpleButtonBar1;
    // End of variables declaration//GEN-END:variables
}
