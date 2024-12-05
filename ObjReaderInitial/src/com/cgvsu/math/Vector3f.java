package com.cgvsu.math;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector3f {
    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Vector3f other) {
        // todo: желательно, чтобы это была глобальная константа
        final float eps = 1e-7f;
        return Math.abs(x - other.x) < eps && Math.abs(y - other.y) < eps && Math.abs(z - other.z) < eps;
    }

    //a = (a1, a2, a3)  b = (b1, b2, b3)
    //a × b = (a2 * b3 - a3 * b2, a3 * b1 - a1 * b3, a1 * b2 - a2 * b1)
    public Vector3f cross(Vector3f other) {
        return new Vector3f(
                y * other.z - z * other.y,
                z * other.x - x * other.z,
                x * other.y - y * other.x
        );
    }

    public Vector3f normalize() {
        float length = (float) Math.sqrt(x * x + y * y + z * z);
        return new Vector3f(x / length, y / length, z / length);
    }

    public Vector3f add(Vector3f other) {
        return new Vector3f(x + other.x, y + other.y, z + other.z);
    }

    public Vector3f subtract(Vector3f other) {
        return new Vector3f(x - other.x, y - other.y, z - other.z);
    }

    public Vector3f multiply(float scalar) {
        return new Vector3f(x * scalar, y * scalar, z * scalar);
    }

    public Vector3f divide(float scalar) {
        return new Vector3f(x / scalar, y / scalar, z / scalar);
    }

    public Vector3f copy() {
        return new Vector3f(this.x, this.y, this.z);
    }


    public float x;
    public float y;
    public float z;
}
