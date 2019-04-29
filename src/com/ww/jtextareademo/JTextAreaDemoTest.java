package com.ww.jtextareademo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java文本域组件示例");
		JPanel jPanel = new JPanel();
		JTextArea jTextArea = new JTextArea("请输入内容", 7, 30);
		jTextArea.setLineWrap(true);		//设置文本域中的文本为自动换行
		jTextArea.setForeground(Color.BLACK);
		jTextArea.setFont(new Font("宋体", Font.BOLD, 20));
		jTextArea.setBackground(Color.YELLOW);
		JScrollPane jScrollPane =new JScrollPane(jTextArea);
		Dimension size = jTextArea.getPreferredSize();
		jScrollPane.setBounds(110, 90, size.width, size.height);
		jPanel.add(jScrollPane);		////将JScrollPane添加到JPanel容器中
		jFrame.add(jPanel);
		jFrame.setBackground(Color.LIGHT_GRAY);
		jFrame.setSize(400, 200);
		jFrame.setVisible(true);
	}

}
