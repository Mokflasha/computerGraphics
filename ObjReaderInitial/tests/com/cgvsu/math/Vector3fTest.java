package com.cgvsu.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class Vector3fTest {

    @Test
    public void testEquals() {
        Vector3f v1 = new Vector3f(1, 2, 3);
        Vector3f v2 = new Vector3f(1, 2, 3);
        Vector3f v3 = new Vector3f(1, 2, 4);

        assertTrue(v1.equals(v2));
        assertFalse(v1.equals(v3));
    }

    @Test
    public void testCross() {
        Vector3f v1 = new Vector3f(1, 0, 0);
        Vector3f v2 = new Vector3f(0, 1, 0);
        Vector3f result = v1.cross(v2);

        assertEquals(0, result.x, 0.0001);
        assertEquals(0, result.y, 0.0001);
        assertEquals(1, result.z, 0.0001);
    }

    @Test
    public void testNormalize() {
        Vector3f v = new Vector3f(1, 2, 2);
        Vector3f result = v.normalize();

        assertEquals(1 / 3.0, result.x, 0.0001);
        assertEquals(2 / 3.0, result.y, 0.0001);
        assertEquals(2 / 3.0, result.z, 0.0001);
    }

    @Test
    public void testAdd() {
        Vector3f v1 = new Vector3f(1, 2, 3);
        Vector3f v2 = new Vector3f(4, 5, 6);
        Vector3f result = v1.add(v2);

        assertEquals(5, result.x, 0.0001);
        assertEquals(7, result.y, 0.0001);
        assertEquals(9, result.z, 0.0001);
    }

    @Test
    public void testSubtract() {
        Vector3f v1 = new Vector3f(1, 2, 3);
        Vector3f v2 = new Vector3f(4, 5, 6);
        Vector3f result = v1.subtract(v2);

        assertEquals(-3, result.x, 0.0001);
        assertEquals(-3, result.y, 0.0001);
        assertEquals(-3, result.z, 0.0001);
    }

    @Test
    public void testMultiply() {
        Vector3f v = new Vector3f(1, 2, 3);
        Vector3f result = v.multiply(2);

        assertEquals(2, result.x, 0.0001);
        assertEquals(4, result.y, 0.0001);
        assertEquals(6, result.z, 0.0001);
    }
}

