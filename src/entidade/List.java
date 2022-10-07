package entidade;

public class List {
    private Node head;
    private Node tail;
    private int size;

    public List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(Aviao value){
        Node node = new Node(value);

        if(this.head == null){
            this.head = node;
        }else{
            this.tail.setNext(node);
        }
        this.tail = node;
        this.size ++;
    }

    public void tamanhoDaFilaEspera(){
        System.out.println("tamanho da fila de espera "+this.size);
    }

    public void autorizar(){
        System.out.println("Decolagem autorizada para o "+this.head.getValue().getNome());
        this.head = this.head.getNext();
        size--;
    }

    public void descricao(){
        System.out.printf("Identificador: %d, Nome do aviao: %s%n",this.head.getValue().getId(),this.head.getValue().getNome());
    }

    public void printList(){
        Node p = this.head;

        while(p != null){
            System.out.println(p.getValue().getId()+", Nome: "+p.getValue().getNome());
            p = p.getNext();
        }
    }
}
