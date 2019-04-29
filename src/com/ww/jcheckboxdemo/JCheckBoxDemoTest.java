package com.ww.jcheckboxdemo;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JCheckBoxDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java复选框组件示例");
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel("流行编程语言有：");
		jLabel.setFont(new Font("楷体", Font.BOLD, 20));
		JCheckBox jCheckBox1 = new JCheckBox("C#", true);
		JCheckBox jCheckBox2 = new JCheckBox("Java");
		JCheckBox jCheckBox3 = new JCheckBox("C++");
		JCheckBox jCheckBox4 = new JCheckBox("Python");
		
		jPanel.add(jLabel);
		jPanel.add(jCheckBox1);
		jPanel.add(jCheckBox2);
		jPanel.add(jCheckBox3);
		jPanel.add(jCheckBox4);
		
		jFrame.add(jPanel);
		jFrame.setBounds(300, 200, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
