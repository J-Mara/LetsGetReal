public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if(other.getValue() == 0){
      if(value == 0){
        return true;
      }
      else{
        return false;
      }
    }
    if(Math.abs(other.getValue()-value) <= Math.abs(value/100000)){
      return true;
    }
    return false;
  }

  public RealNumber add(RealNumber other){
    Double x = value + other.getValue();
    RealNumber result = new RealNumber(x);
    return result;
  }

  public RealNumber multiply(RealNumber other){
    Double x = value * other.getValue();
    RealNumber result = new RealNumber(x);
    return result;
  }

  public RealNumber divide(RealNumber other){
    Double x = value / other.getValue();
    RealNumber result = new RealNumber(x);
    return result;
  }

  public RealNumber subtract(RealNumber other){
    Double x = value - other.getValue();
    RealNumber result = new RealNumber(x);
    return result;
  }
}
