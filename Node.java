package jurnal3;

public class Node<A> {
    A data;
    Node<A> next;

    public Node(A object){ data = object; this.next = null;
    }

    public A getData(){
        return data;
    }
}
