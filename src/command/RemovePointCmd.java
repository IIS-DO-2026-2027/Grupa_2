package command;

import mvc.DrawingModel;
import mvc.Point;

public class RemovePointCmd implements Command {
	DrawingModel model;
	Point p;
	
	public RemovePointCmd(DrawingModel model, Point p) {
		this.model = model;
		this.p = p;
	}

	@Override
	public void execute() {
		model.remove(p);

	}

	@Override
	public void unexecute() {
		model.add(p);

	}

}
