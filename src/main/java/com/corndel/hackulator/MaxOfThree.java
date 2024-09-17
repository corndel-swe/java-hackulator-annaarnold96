package com.corndel.hackulator;

public class MaxOfThree {

  static int maxOfThree(int x, int y, int z) {
    if (x == y && x == z) {
      return x;
    }

    if (x != y && x == z) {
      if (x > y){
        return x;
      }
      else {
        return y;
      }
    }

    if (x == y && x != z) {
      if (x > z){
        return x;
      }
      else {
        return z;
      }
    }

    if (y == z && y != x) {
      if (y > x){
        return y;
      }
      else {
        return x;
      }
    }

    if (x == z && x < y) {
      return x;
    }

    if (x > y && x > z) {
      return x;
    }

    if (y > z && y > x) {
      return y;
    }

    if (z > x && z > y) {
      return z;
    }

    throw new Error("Is this reachable?");
  }
}
