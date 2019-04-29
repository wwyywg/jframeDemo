package com.ww.jlabeldemo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java标签组件示例");
		JPanel jPanel = new JPanel();
		JLabel jLabel1 = new JLabel("普通标签");
		JLabel jLabel2 = new JLabel();jLabel2.setText("调用setText()方法");
		ImageIcon img = new ImageIcon("/Users/ww/Documents/icom.png");
		//创建既含有文本又含有图标的JLabel对象
		JLabel jLabel3 = new JLabel("开始学习", img, JLabel.CENTER);
		jPanel.add(jLabel1);
		jPanel.add(jLabel2);
		jPanel.add(jLabel3);
		jFrame.add(jPanel);
		jFrame.setBounds(300, 200, 400, 100);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
