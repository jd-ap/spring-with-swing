package com.example.demo.config;

import com.formdev.flatlaf.FlatLightLaf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.swing.*;

@Configuration
public class BeansConfig {

    @Bean
    public JFrame windowFrame(Environment environment) {
        JFrame window = new JFrame();

        window.setTitle(environment.getProperty("swing.main.title",
                environment.getProperty("spring.application.name",
                        "Spring Desktop Application")));

        window.setSize(environment.getProperty("swing.main.width", Integer.class, 100),
                environment.getProperty("swing.main.height", Integer.class, 100));
        window.setLocationRelativeTo(null);

        window.setVisible(Boolean.TRUE);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        System.setProperty( "apple.awt.application.name", window.getTitle() );
        System.setProperty( "apple.awt.application.appearance", "system" );

        FlatLightLaf.setup();

        return window;
    }

}
