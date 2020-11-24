public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if(deno == 0){
      deno = 1;
      nume = 0;
    }
    if(deno < 0){
      deno = deno * -1;
      nume = nume * -1;
    }
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber result = new RationalNumber(denominator, numerator);
    return result;
  }

  public boolean equals(RationalNumber other){
    if(numerator == other.getNumerator() && denominator == other.getDenominator()){
      return true;
    }
    return false;
  }

  public String toString(){
    reduce();
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    if (a < b){
      int holder = a;
      a = b;
      b = holder;
    }
    if(b == 0){
      return 0;
    }
    if(a%b == 0){
      return b;
    }
    return(gcd(b, a%b));
  }

  private void reduce(){
    int a = gcd(numerator, denominator);
    if(a == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = numerator/a;
      denominator = denominator/a;
    }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber result = new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    return result;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber result = new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
    return result;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int holderD = denominator;
    numerator *= other.getDenominator();
    denominator *= other.getDenominator();
    RationalNumber holder = new RationalNumber(other.getNumerator()*holderD, other.getDenominator()*holderD);
    RationalNumber result = new RationalNumber(holder.getNumerator() + numerator, denominator);
    return result;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int holderD = denominator;
    numerator *= other.getDenominator();
    denominator *= other.getDenominator();
    RationalNumber holder = new RationalNumber(other.getNumerator()*holderD, other.getDenominator()*holderD);
    RationalNumber result = new RationalNumber(holder.getNumerator() - numerator, denominator);
    return result;
  }
}
