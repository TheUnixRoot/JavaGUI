package tarea;

public class Primos {

    private int primoSrc, primoDst;
    private int pos;

    public Primos(int primoSrc, int primoDst, int pos) {
        this.primoSrc = primoSrc;
        this.primoDst = primoDst;
        this.pos = pos;
    }


    public int pos() {
        return pos;
    }

    public String toString() {
        return pos + ":(" + primoSrc + ", " + primoDst + ") ";
    }

}
