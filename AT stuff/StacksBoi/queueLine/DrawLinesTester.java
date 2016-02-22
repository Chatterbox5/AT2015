package queueLine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;

public class DrawLinesTester extends JFrame {
	private final int delay;
	private final int maxLines;
	private Queue points= new LinkedList<Object>();
	public static final int LENGTH=720;
	public static final int WIDTH=720;

	public DrawLinesTester(int maxLines, int delay) {
		this.delay=delay;
		this.maxLines=maxLines;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(LENGTH,WIDTH);
		setVisible(true);
	}

	private Point2D.Double genPoint(){
		int x= (int)(Math.random() * ((LENGTH) + 1));
		int y= (int)(Math.random() * ((WIDTH) + 1));
		return new Point2D.Double(x,y);
	}

	@Override
	public void paint(Graphics g) {
		Point2D.Double firstPoint=genPoint();
		Point2D.Double point=genPoint();
		points.offer(firstPoint);
		points.offer(point);

		for(int i=0;i<=9;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			g.drawLine((int)firstPoint.getX(),(int) firstPoint.getY(), (int)point.getX(),(int) point.getY());
			firstPoint=point;
			points.offer(point);
			point=genPoint();
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		firstPoint=(Double) points.poll();
		point=(Double) points.poll();
		for(int i=0;i<=10;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			g.setColor(Color.WHITE);
			g.drawLine((int)firstPoint.getX(),(int) firstPoint.getY(), (int)point.getX(),(int) point.getY());
			firstPoint=point;
			point=(Double) points.poll();
		}

	}

	public static void main(String[] args) {
		new DrawLinesTester(15, 100); // max lines, delay
	}
}
