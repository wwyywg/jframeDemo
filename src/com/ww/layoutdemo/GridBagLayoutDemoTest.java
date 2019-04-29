package com.ww.layoutdemo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GridBagLayoutDemoTest {

	public static void makeButton(String title, JFrame jFrame, GridBagLayout gridBagLayout, GridBagConstraints constraints) {
		JButton jButton = new JButton(title);
		gridBagLayout.setConstraints(jButton, constraints);
		jFrame.add(jButton);
	}

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("键盘拨号");
		GridBagLayout gridBagLayout = new GridBagLayout();		//创建GridBagLayout布局管理器
		GridBagConstraints constraints=new GridBagConstraints();
		jFrame.setLayout(gridBagLayout);		//使用GridBagLayout布局管理器
		constraints.fill = GridBagConstraints.BOTH;		//组件填充显示区域
		constraints.weightx=0.0;    //恢复默认值
        constraints.gridwidth = GridBagConstraints.REMAINDER;    //结束行
        JTextField jTextField=new JTextField("13612345678");
		gridBagLayout.setConstraints(jTextField, constraints);
		jFrame.add(jTextField);
		constraints.weightx=0.5;    // 指定组件的分配区域
        constraints.weighty=0.2;
        constraints.gridwidth=1;
        makeButton("7", jFrame, gridBagLayout, constraints);    //调用方法，添加按钮组件
        makeButton("8",jFrame, gridBagLayout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;    //结束行
        makeButton("9", jFrame, gridBagLayout,constraints);
        constraints.gridwidth = 1;    //重新设置gridwidth的值
       
        makeButton("4", jFrame, gridBagLayout, constraints);
        makeButton("5", jFrame, gridBagLayout, constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("6", jFrame, gridBagLayout, constraints);
        constraints.gridwidth = 1;
       
        makeButton("1", jFrame, gridBagLayout, constraints);
        makeButton("2", jFrame, gridBagLayout, constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("3", jFrame, gridBagLayout, constraints);
        constraints.gridwidth = 1;
       
        makeButton("返回", jFrame, gridBagLayout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("拨号", jFrame, gridBagLayout, constraints);
        constraints.gridwidth = 1;
        jFrame.setBounds(400, 400, 400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
