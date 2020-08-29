package concurrentsortedlist;

public class App {
  public static void main(String[] args) {
    ConcurrentSortedList List = new ConcurrentSortedList();

    List.insert(1001234);
    System.out.println("Size: " + List.size());
    System.out.println("Is sorted: " + List.isSorted());
  }
}