package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import command.AddShapeCmd;
import composite.Snowflake;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}
	
	//Testiranje MVC 
	public void addShape(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.BLACK);
		//model.add(p);
		AddPointCmd addPointCmd = new AddPointCmd(model, p);
		addPointCmd.execute();
		frame.repaint();
	}
	
	//Testiranje Composite
	public void addComposite(MouseEvent e) {
		
		
		int x = e.getX();
		int y = e.getY();
		
		Line line1 = new Line(
				new Point(x-40, y, Color.BLUE),
				new Point(x+40, y, Color.BLUE),
				Color.BLUE);
		
		Line line2 = new Line(
				new Point(x-20, y-35, Color.BLUE),
				new Point(x+20, y+35, Color.BLUE),
				Color.BLUE);
		
		Line line3 = new Line(
				new Point(x-20, y+35, Color.BLUE),
				new Point(x+20, y-35, Color.BLUE),
				Color.BLUE);
		
		Snowflake snowflake = new Snowflake();
		snowflake.add(line1);
		snowflake.add(line2);
		snowflake.add(line3);
		
		//model.add(snowflake);
		AddShapeCmd addShapeCmd = new AddShapeCmd(model, snowflake);
		addShapeCmd.execute();
		frame.repaint();
		System.out.println(snowflake);
		
		
	}
	
	
}
