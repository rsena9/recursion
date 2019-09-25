package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static BigInteger fibonacci(int n) {
    BigInteger f;
    if (n <= 0) {
      f = BigInteger.ZERO;
    } else if (n == 1) {
      f = BigInteger.ONE;
    } else {
      f = fibonacci(n - 1).add(fibonacci(n - 2));
    }
    return f;
  }

}

