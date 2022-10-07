package programa;

import entidade.Aviao;
import entidade.List;

public class Main {
    public static void main(String[] args) {
        List l = new List();
        Aviao a = new Aviao(1,"boing777");
        Aviao a1 = new Aviao(2,"caça f14");
        Aviao a2 = new Aviao(3,"caça f15");

        l.add(a);
        l.add(a1);
        l.add(a2);
        l.printList();
        l.descricao();
        l.autorizar();
        l.printList();
        l.tamanhoDaFilaEspera();
    }
}
