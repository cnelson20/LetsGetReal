abstract class Number implements Comparable<Number>{
  public abstract double getValue();

  public boolean equals(Number other) {
    if (this.getValue() == 0 || other.getValue() == 0) {
      return this.getValue() == 0 && other.getValue() == 0;
    }
    return Math.abs((this.getValue() - other.getValue()) / this.getValue()) < .00001;
  }

  public int compareTo(Number other) {
    if (this.equals(other)) {
      return 0;
    } else if (this.getValue() > other.getValue()) {
      return 1;
    } else {
      return -1;
    }

  }
}
