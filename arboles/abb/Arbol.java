package abb;

public class Arbol {
    private nodo raiz;

    public Arbol(){
        raiz=null;

    }

    public boolean estavacio(){
        return raiz==null;
    }

    private void insert(nodo padre,nodo hijo , int dato){
        if (hijo==null){
            nodo nuevo=new nodo(null,dato,null);
            if (dato>= padre.getDato()){
                padre.setDer(nuevo);
            }else {
                padre.setIzq(nuevo);
            }
        }else {
            if (dato>= padre.getDato()){
                insert(hijo,hijo.getDer(),dato);
            }else {
                insert(hijo,hijo.getIzq(),dato);
            }
        }
    }
    public void insert( int dato){
        if (estavacio()){
            nodo nuevo =new nodo(null,dato,null);
            raiz=nuevo;
        }else {
            if (dato>=raiz.getDato()){
                insert(raiz,raiz.getDer(),dato);
            }else {
                insert(raiz,raiz.getIzq(),dato);
            }
        }
    }
    private void mostrarenorden(nodo nod){
        if (nod==null){

        }else {
            mostrarenorden(nod.getIzq());
            System.out.print(nod.getDato()+ "   ");
            mostrarenorden(nod.getDer());


        }
    }
    public void mostrarenorden(){
        nodo temp=raiz;
        mostrarenorden(raiz);
        System.out.println();
    }
}
