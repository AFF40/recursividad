import abb.Arbol;
public class inicio {
    public static void main(String[] args) {
        Arbol abb=new Arbol();

        abb.insert(3);
        abb.insert(2);
        abb.insert(4);
        abb.insert(1);
        abb.insert(3);
        abb.insert(5);
        abb.insert(7);
        abb.insert(6);
        abb.mostrarenorden();
    }
}
