import anonymousExample.Group;
import collectionsExamples.CollectionExamples;
import concurentCollections.Reader;
import concurentCollections.Writer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        CollectionExamples name = new CollectionExamples();
        name.AddToCollection("Oleg");
        name.AddToCollection("Marat");
        name.AddToCollection("Maxim");
        name.AddToCollection("Vitaliy");
        name.AddToCollection("Daniil");

        name.getItemFromCollection();
        name.deleteItemFromConnection("Oleg");
        name.collectionContains("Oleg");

        System.out.println("--------------------------------------------------------------------");

        name.addToList("Oleg");
        name.addToList("Marat");
        name.addToList("Maxim");
        name.addToList("Vitaliy");
        name.addToList("Daniil");
        name.getItemFromList(1);
        name.deleteItemFromList(0);

        System.out.println("--------------------------------------------------------------------");

        name.addToSet("Oleg");
        name.addToSet("Marat");
        name.addToSet("Maxim");
        name.addToSet("Vitaliy");
        name.addToSet("Daniil");
        name.setContainsCheck("Oleg");
        name.removeFromSet("Oleg");

        System.out.println("--------------------------------------------------------------------");

        name.addToQueue("Oleg");
        name.addToQueue("Marat");
        name.addToQueue("Maxim");
        name.addToQueue("Vitaliy");
        name.addToQueue("Daniil");
        name.getQueue();
        name.deleteFromQueue("Oleg");

        System.out.println("--------------------------------------------------------------------");

        name.addToMap(0, "Oleg");
        name.addToMap(1, "Marat");
        name.addToMap(2, "Maxim");
        name.addToMap(3, "Vitaliy");
        name.addToMap(4, "Daniil");
        name.addToMap(5, "Andrei");
        name.addToMap(6, "Igor");
        name.addToMap(7, "Vener");

        name.getItemFromMap(4);
        name.deleteFromMap(4);
        name.makeSynchronizedMap();

        System.out.println("--------------------------------------------------------------------");

        name.addToTreeSet("Oleg");
        name.addToTreeSet("Marat");
        name.addToTreeSet("Maxim");
        name.addToTreeSet("Vitaliy");
        name.addToTreeSet("Daniil");
        name.removeFromTreeSet("Oleg");

        System.out.println("--------------------------------------------------------------------");

        List<String> someColl = new CopyOnWriteArrayList<>();
        someColl.add("Belgium");
        someColl.add("USA");
        someColl.add("Poland");
        someColl.add("Brazil");
        someColl.add("Canada");
        someColl.add("Russia");

//        Thread writer = new Writer("Writer", someColl);
//        writer.start();
//
//        Thread reader = new Reader("Reader", someColl);
//        reader.start();

        System.out.println("--------------------------------------------------------------------");

        Group pinkFloyd = new Group() {
            @Override
            public String bestAlbum() {
                return "Wish You Were Here";
            }
        };

        String album = pinkFloyd.bestAlbum();
        System.out.println(album);

        showGroup(pinkFloyd);
        showGroup(new Group() {
            @Override
            public String bestAlbum() {
                return "A night at the opera";
            }
        });

        //Лямбда-выражения
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "июль"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });

        arrays.sort((o1, o2)-> o1.length - o2.length);

    }

    public static void showGroup(Group group){
        System.out.println(group.bestAlbum());
    }
}