package com.thoughtworks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		String s = FizzBuzz.of(15);
        Assert.assertEquals("FizzBuzz",s );
	}

}
