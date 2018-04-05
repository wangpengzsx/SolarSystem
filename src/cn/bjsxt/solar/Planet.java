package cn.bjsxt.solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.util.GameUtil;

public class Planet extends Star{
	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	Star center;
	
	public void draw(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		
		x = (center.x+center.width/2) +longAxis*Math.cos(degree);
		y = (center.y+center.height/2)+shortAxis*Math.sin(degree);
		
		degree += speed;
	}
	
	

	public Planet(String imgpath, double longAxis, 
			double shortAxis, double speed, Star center) {
		super(GameUtil.getImage(imgpath));
		this.x = center.x+longAxis;
		this.y = center.y;
		
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	public Planet(Image img, double x, double y) {
		super(img, x, y);
		// TODO Auto-generated constructor stub
	}
	public Planet(String imgpath, double x, double y) {
		super(imgpath, x, y);
		// TODO Auto-generated constructor stub
	}
	

}
