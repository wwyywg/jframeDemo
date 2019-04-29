package com.ww.layoutdemo;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutDemoTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Java第五个GUI程序");
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		
		JPanel cards = new JPanel(new CardLayout());		//卡片式布局的面板
		jPanel1.add(new JButton("登录按钮"));
		jPanel1.add(new JButton("注册按钮"));
		jPanel1.add(new JButton("找回密码按钮"));
		jPanel2.add(new JTextField("用户名文本框",20));
		jPanel2.add(new JTextField("密码文本框",20));
		jPanel2.add(new JTextField("验证码文本框",20));
		
		cards.add(jPanel1, "card1");		//向卡片式布局面板中添加面板1
		cards.add(jPanel2, "card2");		//向卡片式布局面板中添加面板2
		CardLayout cl = (CardLayout)cards.getLayout();
		cl.show(cards, "card2");		////调用show()方法显示面板2
		jFrame.add(cards);
		jFrame.setBounds(300, 200, 400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
