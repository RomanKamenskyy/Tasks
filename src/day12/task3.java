package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3   {
    public static void main(String[] args) {
        List<MusicBand> listMusic = new ArrayList<>();
        for(int i=1; i<=15; i++) {
            listMusic.add(new MusicBand("musicName"+i, 1990 + i));

        }

        System.out.println(listMusic.toString());
        Collections.shuffle(listMusic);

        List<MusicBand> listMusic2 = new ArrayList<>();
        for(MusicBand band : listMusic ){
            if (band.getYear() > 2000){
                listMusic2.add(band);
            }
        }


        //for(int i=0; i<listMusic.toArray().length; i++)
        System.out.println(listMusic.toString());
        System.out.println(listMusic2.toString());




    }
}
