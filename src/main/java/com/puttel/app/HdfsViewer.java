package com.puttel.app;

import java.awt.*;

public class HdfsViewer {
	public HdfsViewer(){
		System.out.println("Start..");
		new MainPanel();
	}
	 public static void main(String [] args) {
		 EventQueue.invokeLater(new Runnable() {
			 public void run() {
				 try {
					 new HdfsViewer();
				 } catch (Exception e) {
					 e.printStackTrace();
				 }
			 }
		 });

	 }

}
