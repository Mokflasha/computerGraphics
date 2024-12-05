package com.cgvsu.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolygonTest {

    @Test
    public void testSetVertexIndices() {
        Polygon polygon = new Polygon();
        ArrayList<Integer> vertexIndices = new ArrayList<>(Arrays.asList(0, 1, 2));
        polygon.setVertexIndices(vertexIndices);

        assertEquals(vertexIndices, polygon.getVertexIndices());
    }

    @Test(expected = AssertionError.class)
    public void testSetVertexIndicesLessThanThree() {
        Polygon polygon = new Polygon();
        ArrayList<Integer> vertexIndices = new ArrayList<>(Arrays.asList(0, 1));
        polygon.setVertexIndices(vertexIndices);
    }

    @Test
    public void testSetTextureVertexIndices() {
        Polygon polygon = new Polygon();
        ArrayList<Integer> textureVertexIndices = new ArrayList<>(Arrays.asList(0, 1, 2));
        polygon.setTextureVertexIndices(textureVertexIndices);

        assertEquals(textureVertexIndices, polygon.getTextureVertexIndices());
    }

    @Test(expected = AssertionError.class)
    public void testSetTextureVertexIndicesLessThanThree() {
        Polygon polygon = new Polygon();
        ArrayList<Integer> textureVertexIndices = new ArrayList<>(Arrays.asList(0, 1));
        polygon.setTextureVertexIndices(textureVertexIndices);
    }

    @Test
    public void testSetNormalIndices() {
        Polygon polygon = new Polygon();
        ArrayList<Integer> normalIndices = new ArrayList<>(Arrays.asList(0, 1, 2));
        polygon.setNormalIndices(normalIndices);

        assertEquals(normalIndices, polygon.getNormalIndices());
    }

    @Test(expected = AssertionError.class)
    public void testSetNormalIndicesLessThanThree() {
        Polygon polygon = new Polygon();
        ArrayList<Integer> normalIndices = new ArrayList<>(Arrays.asList(0, 1));
        polygon.setNormalIndices(normalIndices);
    }
}

