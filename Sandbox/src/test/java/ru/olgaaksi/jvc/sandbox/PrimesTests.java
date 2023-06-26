package ru.olgaaksi.jvc.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimesTests {
  @Test
  public void testPrime() {
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }
  @Test
  public void testNotPrime() {
    Assert.assertFalse(Primes.isPrimeFast(Integer.MAX_VALUE - 2));
  }
  @Test (enabled = false)
  public void testPrimeLong() {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
}
