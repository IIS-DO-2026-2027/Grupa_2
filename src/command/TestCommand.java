package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel();
		Point p1 = new Point(10, 10, Color.BLACK);
		
		//Testiranje dodavanja tačke
		AddPointCmd addPointCmd = new AddPointCmd(model, p1);
		addPointCmd.execute();
		System.out.println(addPointCmd.toString());
		
		System.out.println(model.getShapes());
		
		//Testiranje brisanja tačke
		RemovePointCmd removePointCmd = new RemovePointCmd(model, p1);
		removePointCmd.execute();
		
		System.out.println(model.getShapes());
		
		//Testiranje izmene tačke
		Point p2 = new Point(20, 20, Color.RED);
		
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		updatePointCmd.execute();

	}

}
