package cn.bjsxt.solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.util.Constant;
import cn.bjsxt.util.GameUtil;
import cn.bjsxt.util.MyFrame;

public class SolarFrame extends MyFrame {
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/ball.png", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet earth = new Planet("images/ball.png",150,100,0.1,sun);
	
	public void paint(Graphics g) {
		g.drawImage(bg,0,0,null);
		sun.draw(g);
		earth.draw(g);
	}
	
	public static void main(String[] args) {
		new SolarFrame().launchframe();
	}

}
