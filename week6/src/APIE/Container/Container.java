package APIE.Container;

import java.util.Objects;

public abstract class Container {

  private String model;
  private Double capacity;
  private Color color;

  public String getModel() {
    return this.model;
  }

  public Double getCapacity() {
    return this.capacity;
  }

  public Color getColor() {
    return this.color;
  }

  public void setCapacity(Double capacity) {
    this.capacity = capacity;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(Color[] colorLists, Color color) {
    for (Color str : colorLists) {
      if (color.equals(str)) { // don't use == , use equals()
        this.color = str;
        return ; // we said void no return type , why return here ? 
        // exit the method once a match is found
      }
    }
    System.out.println("the color input not in Color List");
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Container))
      return false;

    Container container = (Container) obj;

    return Objects.equals(this.model, container.getModel())
        && Objects.equals(this.capacity, container.getCapacity())//
        && Objects.equals(this.color, container.getColor());
  }

  @Override
  public String toString() {
    return "[Model : " + this.model + //
        " , capacity : " + this.capacity + //
        " , Color ; " + this.color + "]";
  }
}
