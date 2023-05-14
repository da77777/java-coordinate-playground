package coordinate.figure.dto;

import coordinate.figure.FigureEnum;

public class FigureResult {
  private FigureEnum figure;
  private double size;

  public FigureResult(FigureEnum figure, double size) {
    this.figure = figure;
    this.size = size;
  }

  public FigureEnum getFigure() {
    return figure;
  }

  public double getSize() {
    return size;
  }
}
