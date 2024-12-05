package com.cgvsu;

import com.cgvsu.math.Vector3f;
import com.cgvsu.model.Model;
import com.cgvsu.objreader.ObjReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String fileContent = new String(Files.readAllBytes(Paths.get("C:/Users/Admin/IdeaProjects/Task3/ObjReaderInitial/src/com/cgvsu/objreader/model.obj")));
            Model model = ObjReader.read(fileContent);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номера вершин для удаления, разделяя их пробелами:");
            String[] input = scanner.nextLine().split("\\s+");

            ArrayList<Integer> verticesToDelete = new ArrayList<>();
            for (String index : input) {
                try {
                    verticesToDelete.add(Integer.parseInt(index) - 1);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: " + index + " не является допустимым числом.");
                }
            }
            
            ObjReader.deleteVertices(model, verticesToDelete);

            // Вывод обновлённой модели (например, вершины и полигоны)
            System.out.println("\nОставшиеся вершины:");
            for (int i = 0; i < model.vertices.size(); i++) {
                Vector3f vertex = model.vertices.get(i);
                System.out.printf("%d: (%.3f, %.3f, %.3f)%n", i + 1, vertex.x, vertex.y, vertex.z);
            }

            System.out.println("\nОставшиеся полигоны:");
            for (int i = 0; i < model.polygons.size(); i++) {
                System.out.printf("%d: %s%n", i + 1, model.polygons.get(i).getVertexIndices());
            }

            // (Опционально) Вывод нормалей для проверки
            model.computeNormals();
            System.out.println("\nНормали:");
            for (Vector3f normal : model.normals) {
                System.out.println("Normal: (" + normal.x + ", " + normal.y + ", " + normal.z + ")");
            }

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}



