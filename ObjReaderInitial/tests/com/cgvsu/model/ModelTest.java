package com.cgvsu.model;

import com.cgvsu.math.Vector2f;
import com.cgvsu.math.Vector3f;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ModelTest {

    @Test
    public void testComputeNormals() {
        Model model = new Model();
        model.vertices.add(new Vector3f(1, 0, 0));
        model.vertices.add(new Vector3f(0, 1, 0));
        model.vertices.add(new Vector3f(0, 0, 1));

        Polygon polygon = new Polygon();
        polygon.setVertexIndices(new ArrayList<>(Arrays.asList(0, 1, 2)));
        model.polygons.add(polygon);

        model.computeNormals();

        Vector3f normal = model.normals.get(0);
        assertEquals(1 / Math.sqrt(3), normal.x, 0.0001);
        assertEquals(1 / Math.sqrt(3), normal.y, 0.0001);
        assertEquals(1 / Math.sqrt(3), normal.z, 0.0001);
    }
}
