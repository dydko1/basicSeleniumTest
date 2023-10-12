package pl.sii.javalambda.packageReference;

class Box35 {
  private int weight = 0;
  private String color = "";

  public Box35(int weight, String color) {
    this.weight = weight;
    this.color = color;
  }

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
  }
}