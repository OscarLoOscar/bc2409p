package APIE.Container;

import java.util.Objects;

public class Color {
  private String color;

  public Color(String color) {
    this.color = color.toUpperCase();
  }

  public String getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
      
    if (!(obj instanceof Color))
      return false;

    Color otherColor = (Color) obj;

    return Objects.equals(this.color, otherColor.getColor());
  }

  @Override
  public String toString(){
    return this.color;
  }
}
