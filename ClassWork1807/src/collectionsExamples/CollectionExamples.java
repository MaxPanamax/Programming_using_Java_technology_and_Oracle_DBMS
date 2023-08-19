package collectionsExamples;

import java.util.*;

public class CollectionExamples {
    Collection<String> stringCollection = new ArrayList<>();

    public void AddToCollection(String data) {
        stringCollection.add(data);
    }

    public void getItemFromCollection() {
        System.out.println(stringCollection.iterator().next());
        System.out.println(stringCollection);
    }

    public void deleteItemFromConnection(String data) {
        stringCollection.remove(data);
        System.out.println(stringCollection);
    }

    public void collectionContains(String data) {
        System.out.println(stringCollection.contains(data));
    }

    //-----------------------------------------------------------------------//
    List<String> stringList = new ArrayList<>();

    public void addToList(String data) {
        stringList.add(data);
    }

    public void getItemFromList(Integer data) {
        System.out.println("Элемент списка под номером " + data + ": " + stringList.get(data));
    }

    public void deleteItemFromList(int data) {
        stringList.remove(data);
        System.out.println(stringList);
    }
    //-----------------------------------------------------------------------//

    Set<String> stringSet = new HashSet<>();

    public void addToSet(String data) {
        stringSet.add(data);
    }

    public void setContainsCheck(String data) {
        System.out.println(stringSet.contains(data));
    }

    public void removeFromSet(String data) {
        stringSet.remove(data);
        System.out.println(stringSet);
    }
    //-----------------------------------------------------------------------//

    Queue<String> queue = new LinkedList<>();

    public void addToQueue(String data) {
        queue.add(data);
    }

    public void getQueue() {
        System.out.println(queue);
    }

    public void deleteFromQueue(String data) {
        data = queue.remove();
        System.out.println(queue);
    }

//-----------------------------------------------------------------------//

    Map<Integer, String> map = new HashMap<>();

    public void addToMap(int key, String data) {
        map.put(key, data);
    }

    public void getItemFromMap(Object key) {
        String value = map.get(key);
        System.out.println(value);
    }

    public void deleteFromMap(Object key) {
        map.remove(key);
        System.out.println(map);
    }

    public void makeSynchronizedMap(){
        Map<Integer, String> syncMap = Collections.synchronizedMap(map);
        Set<Integer> s = syncMap.keySet();
        System.out.println(s + " s array");
        synchronized (map){
            Iterator<Integer> i = s.iterator();
            while (i.hasNext()){
                System.out.println(i.next() + " Synched");
            }
        }
    }

    //-----------------------------------------------------------------------//

    Set<String> set = new TreeSet<>();

    public void addToTreeSet(String data) {
        set.add(data);
    }

    public void removeFromTreeSet(String data) {
        set.remove(data);
        System.out.println(set);
    }

    //-----------------------------------------------------------------------//
}
