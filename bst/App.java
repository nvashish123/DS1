package bst;

public class App {

    public static void main(String[] args) {

        Tree<Person> tree = new BinarySearchTree<>();
        
        tree.insert(new Person("Adam",34));
        tree.insert(new Person("Kevin",3));
        tree.insert(new Person("Joe",67));
        tree.insert(new Person("Mary",45));
       
        
        tree.traverseGraph();
        
    }
}
