package com.example.demo;

import com.example.demo.view.EmptyView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class DemoDesktopApplication implements CommandLineRunner {

	private final JFrame windowFrame;
	private final EmptyView empty;

	public void run(String... args) {
		initializeDemoDesktopApplication();
	}

	public void initializeDemoDesktopApplication() {
		empty.showView(windowFrame);
	}

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(DemoDesktopApplication.class, args);
	}

}
