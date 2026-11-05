package mvc;

import java.util.ArrayList;

public class DrawingModel {
	
	private ArrayList<Point> shapes = new ArrayList<>();
	
	public void add(Point p) {
		shapes.add(p);
	}
	
	public void remove(Point p) {
		shapes.remove(p);
	}
	
	public void get(int index) {
		shapes.get(index);
	}
	
	public ArrayList<Point> getShapes(){
		return shapes;
	}

}
