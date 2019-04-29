package com.ww.jradiobuttondemo;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java单选组件示例");
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel("现在是哪个季节：");
		JRadioButton jRadioButton1 = new JRadioButton("夏天");
		JRadioButton jRadioButton2 = new JRadioButton("春天");
		JRadioButton jRadioButton3 = new JRadioButton("秋天", true);
		JRadioButton jRadioButton4 = new JRadioButton("冬天");
		jLabel.setFont(new Font("楷体", Font.BOLD, 20));
		ButtonGroup bGroup = new ButtonGroup();
		
		bGroup.add(jRadioButton1);
		bGroup.add(jRadioButton2);
		bGroup.add(jRadioButton3);
		bGroup.add(jRadioButton4);
		
		jPanel.add(jLabel);
		
		jPanel.add(jRadioButton1);
		jPanel.add(jRadioButton2);
		jPanel.add(jRadioButton3);
		jPanel.add(jRadioButton4);
		
		jFrame.add(jPanel);
		jFrame.setBounds(300, 200, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
