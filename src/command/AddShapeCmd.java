package command;

import mvc.DrawingModel;
import mvc.Shape;

public class AddShapeCmd implements Command {
	DrawingModel model;
	Shape shape;

	@Override
	public void execute() {
		model.add(shape);

	}

	@Override
	public void unexecute() {
		model.remove(shape);

	}

}
