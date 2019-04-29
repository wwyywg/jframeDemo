package com.ww.layoutdemo;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("GridLayout布局计算机");
		JPanel jPanel = new JPanel();
		//指定面板的布局为GridLayout，4行4列，间隙为5
		jPanel.setLayout(new GridLayout(4, 4, 5, 5));
		jPanel.add(new JButton("7"));    //添加按钮
		jPanel.add(new JButton("8"));
		jPanel.add(new JButton("9"));
		jPanel.add(new JButton("/"));
		jPanel.add(new JButton("4"));
		jPanel.add(new JButton("5"));
		jPanel.add(new JButton("6"));
		jPanel.add(new JButton("*"));
		jPanel.add(new JButton("1"));
		jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("-"));
        jPanel.add(new JButton("0"));
        jPanel.add(new JButton("."));
        jPanel.add(new JButton("="));
        jPanel.add(new JButton("+"));
        
        jFrame.add(jPanel);
        jFrame.setBounds(300, 200, 400, 300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
