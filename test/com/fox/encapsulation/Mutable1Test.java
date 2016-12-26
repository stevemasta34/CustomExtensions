package com.fox.encapsulation;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Created by Stephen on 10/13/2016.
 */
public class Mutable1Test {
  @Test
  public void lockTest() {
    Mutable1<Integer> mutableInteger = new Mutable1<>(1);

    Assert.assertEquals("Should contain a 1", 1, mutableInteger.get().intValue());

    mutableInteger.lock();
    for (int i = 0; i < 10; i++) {
      mutableInteger.set(i);
    }

    Assert.assertEquals("Should STILL be a 1", 1, mutableInteger.get().intValue());
  }

  @Test
  public void getValue() {
    Mutable1<Integer> mutableInteger = new Mutable1<>(1);

    Assert.assertEquals("Should contain a 1", 1, mutableInteger.get().intValue());
  }

  @Test
  public void setValue() {
    Mutable1<Integer> mutableInteger = new Mutable1<>(1);

    Assert.assertEquals("Should contain a 1", 1, mutableInteger.get().intValue());

    mutableInteger.set(20);

    Assert.assertEquals("Should contain a 20", 20, mutableInteger.get().intValue());
  }

  @Test
  public void setValueMultiple() {
    Mutable1<Integer> mutableInteger = new Mutable1<>();
    mutableInteger.set(20);

    Assert.assertEquals("Should contain a 20", 20, mutableInteger.get().intValue());

    for (int i = 0; i < 10; i++) {
      mutableInteger.set(i);
    }

    Assert.assertEquals("Should STILL contain a 20", 20, mutableInteger.get().intValue());
  }

}