package command;

import mvc.DrawingModel;
import mvc.Point;

public class AddPointCmd implements Command {
	private DrawingModel model;
	private Point p;

	public AddPointCmd(DrawingModel model, Point p) {
		this.model = model;
		this.p = p;
	}

	@Override
	public void execute() {
		model.add(p);

	}

	@Override
	public void unexecute() {
		model.remove(p);

	}

	@Override
	public String toString() {
		return "AddPointCmd: " + p;
	}
	
	
}
