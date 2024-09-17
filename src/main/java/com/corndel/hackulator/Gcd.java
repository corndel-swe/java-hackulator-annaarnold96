package com.corndel.hackulator;

public class Gcd {

  /**
   * Works out the greatest common divisor of two numbers Uses the euclidean algorithm:
   * https://www.youtube.com/watch?v=JUzYl1TYMcU
   *
   * <p>gcd(8, 12) => 4
   */

   // y = remainder. x = divisible by. 
  static int gcd(int a, int b) {
    var y = b % a;
    while (y != 0) {
      //var temp = a;
      b = a;
      a = y;
      y = b % a;
      //int x = b/a;

    }
    return a;
  }
}
