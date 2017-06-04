package linkedList;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Istiak-Morsalin on 6/3/2017.
 */
public class LinkedListTest {

    private static LinkedList<Model> models = new LinkedList<Model>();
    private static Model myModel = new Model(4,"RHTDM","India");

    public static void main(String args[]) {
        initData();
        readList(models);
        addData();
        readList(models);
        searchData(models);
        removeData();
        readList(models);

        System.out.println("Sorting started");
        sortData(models);
        System.out.println("Sorted LinkedList");
        readList(models);
     }

     private static void initData() {
         Model arifKhan = new Model(1,"Arif Khan","Dhaka");
         Model heroAlam = new Model(2,"Hero Alam","Bogra");
         Model talKhan = new Model(3,"Tal Khan","Dhaka");

         models.add(arifKhan);
         models.add(heroAlam);
         models.add(talKhan);
     }

    private static void addData () {
         models.add(myModel);
         models.addFirst(myModel);
         models.add(3, myModel);
         models.addLast(myModel);
     }

    private static void removeData () {
        if (models.contains(myModel)) {
            models.removeFirst();
            models.removeLast();
            models.remove(2);

            //for removing all from linked list
            //models.removeAll(models);
        } else {
            System.out.println("clearing failed due to mymodel is not here");
        }
    }

    private static void searchData(List<Model> models){
        if(models.size() > 0) {
            System.out.print("Looking for myModel");
            models.indexOf(myModel);
//          can we perform binary search on linked lists?
//          You can do it in theory, but it will be horribly inefficient,
//          as you will have to keep iterating through the list to find the next midpoint.
//           int location = Collections.binarySearch(models,myModel);
        }else {
            System.out.println("No Data to search");
        }
    }

    private static void sortData(List<Model> models){
        Collections.sort(models, new Comparator<Model>() {
            public int compare(Model model1, Model model2) {
                return model1.name.compareTo(model2.name);
            }
        });
    }




      private static void readList(List<Model> models) {
          if (models.size() > 0 ) {
              models.forEach(model -> {
                  System.out.println(model.id +" "+ "Model Name:"+ " "+ model.name +"Model Address:"+ " " + model.address);
              });
          } else {
              System.out.println("NO data in list");
          }


      }

}
