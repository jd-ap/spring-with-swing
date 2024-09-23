package com.example.demo.view;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class EmptyView implements BaseView {

    @Getter
    private JPanel container;
    private JButton nextButton;

    public EmptyView(JFrame windowFrame, GreetingView greetingView) {
        nextButton.addActionListener(e -> showView(windowFrame, greetingView.getContainer()));
    }

}
