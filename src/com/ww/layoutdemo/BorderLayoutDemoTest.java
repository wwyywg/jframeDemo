package com.ww.layoutdemo;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java第三个GUI程序");		//创建JFrame窗口
		jFrame.setSize(400, 200);		//设置窗口大小
		jFrame.setLayout(new BorderLayout());		//为JFrame窗口设置布局为Layout
		JButton jButton1 = new JButton("上");
		JButton jButton2 = new JButton("左");
		JButton jButton3 = new JButton("中");
		JButton jButton4 = new JButton("右");
		JButton jButton5 = new JButton("下");
		
		jFrame.add(jButton1,BorderLayout.NORTH);
		jFrame.add(jButton2, BorderLayout.WEST);
		jFrame.add(jButton3, BorderLayout.CENTER);
		jFrame.add(jButton4, BorderLayout.EAST);
		jFrame.add(jButton5, BorderLayout.SOUTH);
		
		jFrame.setBounds(300, 200, 600, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
