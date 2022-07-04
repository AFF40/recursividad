package abb;

public class nodo {
    private nodo izq;
    private int dato;
    private nodo der;

    public nodo(nodo izq, int dato, nodo der) {
        this.setIzq(izq);
        this.setDato(dato);
        this.setDer(der);
    }

    public nodo getIzq() {
        return izq;
    }

    public void setIzq(nodo izq) {
        this.izq = izq;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getDer() {
        return der;
    }

    public void setDer(nodo der) {
        this.der = der;
    }
}
