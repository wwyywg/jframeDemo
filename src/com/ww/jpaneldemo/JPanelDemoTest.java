package com.ww.jpaneldemo;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame("Java第二个GUI程序");		//创建一个JFrame对象
		jFrame.setBounds(300, 100, 400, 200);		//设置窗口位置和大小
		JPanel jPanel = new JPanel();		//创建一个JPanel对象
		JLabel jLabel = new JLabel("这是放在JPanel上的标签");		//创建一个标签
		jPanel.setBackground(Color.white);		//设置背景颜色
		jPanel.add(jLabel);		//将标签添加到面板
		jFrame.add(jPanel);		//将面板添加到窗口
		jFrame.setVisible(true);

	}

}
