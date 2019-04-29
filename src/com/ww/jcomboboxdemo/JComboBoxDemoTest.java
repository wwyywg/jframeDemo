package com.ww.jcomboboxdemo;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java下拉列表组件示例");
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel("证件类型");
		JComboBox<String> jComboBox = new JComboBox<String>();
		jComboBox.addItem("--请选择--");
		jComboBox.addItem("身份证");
		jComboBox.addItem("军官证");
		jComboBox.addItem("驾驶证");
		
		jPanel.add(jLabel);
		jPanel.add(jComboBox);
		
		jFrame.add(jPanel);
		jFrame.setBounds(300, 200, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
