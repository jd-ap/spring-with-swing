package com.example.demo.view;

import lombok.Getter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class GreetingView implements BaseView {

    @Getter
    private JPanel container;
    private JButton backButton;

    public GreetingView(JFrame windowFrame, @Lazy EmptyView emptyView) {
        backButton.addActionListener(e -> showView(windowFrame, emptyView.getContainer()));
    }
}
