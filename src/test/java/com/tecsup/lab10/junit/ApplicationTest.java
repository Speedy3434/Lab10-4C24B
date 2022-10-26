package com.tecsup.lab10.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApplicationTest {
	@Test
    public void testRestar() {
        Application app = new Application();
        assertEquals(1 , app.restar(4, 3));
    }
	

}
