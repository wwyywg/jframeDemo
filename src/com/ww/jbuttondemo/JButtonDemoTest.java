package com.ww.jbuttondemo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JButtonDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java按钮组件示例");
		jFrame.setSize(400, 200);
		JPanel jPanel = new JPanel();
		JButton jButton1 = new JButton("我是普通按钮");
		JButton jButton2 = new JButton("我是带背景颜色按钮");
		JButton jButton3 = new JButton("我是不可用按钮");
		JButton jButton4 = new JButton("我是底部对齐按钮");
		
		jPanel.add(jButton1);
		jButton2.setBackground(Color.YELLOW);		//设置按钮背景颜色
		jPanel.add(jButton2);
		jButton3.setEnabled(false);		//设置按钮禁用
		jPanel.add(jButton3);
		Dimension preferredSize = new Dimension(160, 60);
		jButton4.setPreferredSize(preferredSize);		//设置按钮大小
		jButton4.setVerticalAlignment(SwingConstants.BOTTOM);		//设置按钮垂直对齐方式
		jPanel.add(jButton4);
		jFrame.add(jPanel);
		jFrame.setBounds(300, 200, 600, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
