package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Apptest {
@Test
public void testAdd() {
App app = new App();
assertEquals(5, app.add(2, 3));
}
}
