package com.ww.layoutdemo;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java示例程序");
		Box box1 = Box.createHorizontalBox();		//创建横向Box容器
		Box box2 = Box.createVerticalBox();		//创建纵向Box容器
		jFrame.add(box1);		////将外层横向Box添加进窗体
		box1.add(Box.createVerticalStrut(200));		////添加高度为200的垂直框架
		box1.add(new JButton("西"));
		box1.add(Box.createHorizontalStrut(140));    //添加长度为140的水平框架 
		box1.add(new JButton("东"));    //添加按钮2
		box1.add(Box.createHorizontalGlue());    //添加水平胶水
		box1.add(box2);    //添加嵌套的纵向Box容器
        //添加宽度为100，高度为20的固定区域  
		box2.add(Box.createRigidArea(new Dimension(100,20))); 
		box2.add(new JButton("北"));    //添加按钮3
		box2.add(Box.createVerticalGlue());    //添加垂直组件
		box2.add(new JButton("南"));    //添加按钮4
		box2.add(Box.createVerticalStrut(40));    //添加长度为40的垂直框架
        //设置窗口的关闭动作、标题、大小位置以及可见性等  
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jFrame.setBounds(100,100,400,200); 
        jFrame.setVisible(true); 
	}

}
