package com.ww.jtextfielddemo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java文本框组件示例");
		JPanel jPanel = new JPanel();
		JTextField jTextField1 = new JTextField();
		jTextField1.setText("普通文本框");
		JTextField jTextField2 = new JTextField(30);
		jTextField2.setFont(new Font("宋体", Font.BOLD, 20));		//设置字体样式
		jTextField2.setText("指定文本长度和字体");
		JTextField jTextField3 = new JTextField(30);
		jTextField3.setText("居中对齐");
		jTextField3.setHorizontalAlignment(JTextField.CENTER);

		jPanel.add(jTextField1);
		jPanel.add(jTextField2);
		jPanel.add(jTextField3);

		jFrame.add(jPanel);
		jFrame.setBounds(300, 200, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
