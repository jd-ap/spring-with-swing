package com.example.demo.view;

import javax.swing.*;

public interface BaseView {

    JPanel getContainer();

    default void showView(JFrame windowFrame, JPanel newPanel) {
        JPanel contentPane = (JPanel) windowFrame.getContentPane();

        contentPane.removeAll();
        contentPane.add(newPanel);
        contentPane.revalidate();
        contentPane.repaint();
    }

    default void showView(JFrame windowFrame) {
        showView(windowFrame, this.getContainer());
    }

}
