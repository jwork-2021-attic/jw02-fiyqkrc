package S181860072;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Scene {

    public static void main(String[] args) throws IOException {
        int length=50;
        Line line = new Line(length);
        Scene.createMonsters(line,length);

        Snake theSnake = Snake.getTheSnake();

        Sorter sorter = new QuickSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

    private static void createMonsters(Line line,int num){
        int[] place = new int[num]; 
        for(int i:place)
            place[i] = 0;
        int[] rgb={0,256,0};
        String[] changeRule={"bu","gd","ru","bd","gu","rd"};
        int deep = 1536/num;
        for(int i=0;i<num;i++){
            String action = changeRule[(i/(num/6))%6];
            int index=0;
            if(action.charAt(0)=='b'){
                index=2;
            }
            else if(action.charAt(0)=='g')
                index=1;
            else 
                index=0;
            if(action.charAt(1)=='u'){
                rgb[index]=(rgb[index]+deep)%256;
            }
            else
                rgb[index]=(rgb[index]-deep)%256;
            Monster monster = new Monster(rgb[0], rgb[1], rgb[2]);
            int rand = (new Random()).nextInt(num);
            while(place[rand%num]!=0){
                rand++;
            }
            line.put(monster,rand%num);
            place[rand%num]=1;
        }
    }

}
