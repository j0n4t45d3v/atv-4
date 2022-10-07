package entidade;

public class Node {
    private Aviao value;
    private Node next;

    public Node(Aviao value) {
        this.value = value;
        this.next = null;
    }

    public Aviao getValue() {
        return value;
    }

    public void setValue(Aviao value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
