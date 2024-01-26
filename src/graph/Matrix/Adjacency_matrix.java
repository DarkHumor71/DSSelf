package graph.Matrix;
import graph.Matrix.Graphdep.Graph;
import graph.Matrix.Graphdep.Node;

public class Adjacency_matrix {
    public static void main(String[] args) {

        // Adjacency Matrix = An array to store 1's/0's to represent edges
        //				       # of rows =    # of unique nodes
        //				       # of columns = # of unique nodes

        //					  runtime complexity to check an Edge: O(1)
        //					  space complexity: O(v^2)
//        Breadth FS = Traverse a graph level by level
//        Utilizes a Queue
//        better if destination is on average close to start
//        Siblings are visited before children
//
//        Depth FS = Traverse a graph branch by branch
//        Utilizes a Stack
//        Better if destination is on average far from the start
//        Children are visited before siblings
//        More popular for games/puzzles
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4); // I forgot this line in the video
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
        graph.depthFirstSearch(0);
        graph.breadthFirstSearch(0);
        //System.out.println(graph.checkEdge(0, 1));
    }
}
