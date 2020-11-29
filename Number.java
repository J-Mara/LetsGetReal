public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if(this.getValue() > other.getValue()){
      return 1;
    }
    if(this.getValue() < other.getValue()){
      return -1;
    }
    return 0;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if(other.getValue() == 0){
      if(this.getValue() == 0){
        return true;
      }
      else{
        return false;
      }
    }
    if(Math.abs(other.getValue()-this.getValue()) <= Math.abs(this.getValue()/100000)){
      return true;
    }
    return false;
  }
    //TO BE IMPLEMENTED  }
}
