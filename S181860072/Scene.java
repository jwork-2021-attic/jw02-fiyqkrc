package S181860072;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

    public static void main(String[] args) throws IOException {

        Line line = new Line(7);
        line.put(new Monster(112,23,34), 6);
        line.put(new Monster(112, 78, 128), 3);
        line.put(new Monster(78, 23, 17), 1);
        line.put(new Monster(178, 23, 17), 5);
        line.put(new Monster(78, 123, 17), 2);
        line.put(new Monster(78, 23, 117), 4);
        line.put(new Monster(78, 93, 17), 0);

        Snake theSnake = Snake.getTheSnake();

        Sorter sorter = new SelectSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
