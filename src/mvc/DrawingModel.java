package mvc;

import java.util.ArrayList;

public class DrawingModel {
	
	private ArrayList<Shape> shapes = new ArrayList<>();
	
	public void add(Shape p) {
		shapes.add(p);
	}
	
	public void remove(Shape p) {
		shapes.remove(p);
	}
	
	public void get(int index) {
		shapes.get(index);
	}
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}

}
