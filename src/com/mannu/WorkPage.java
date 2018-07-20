package com.mannu;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class WorkPage extends JFrame{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new WorkPage();
			}
			
		});

	}

	public WorkPage(){
		setTitle("Manage DMS");
		setSize(300,200);
		setLayout(null);
		setVisible(true);
	}
	
}
