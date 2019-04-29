package com.ww.jframedemo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemoTest extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFrameDemoTest() {
		setTitle("Java第一个GUI程序");		//设置显示窗口标题
		setSize(400, 200);		//设置窗口显示尺寸
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//设置是否可以关闭
		JLabel jLabel = new JLabel("这是使用JFrame类创建的窗口");	//创建一个标签
		Container container = getContentPane();		//获取当前窗口的内容窗格
		container.add(jLabel);		//将标签组件添加到内容窗格上
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JFrameDemoTest();
	}

}
