package adventure.liya.mgr.com.liya.enumeration;

/**
 * Created by rbonhomme2016 on 03/04/2018.
 */

public enum DesEnum {

    FACE6(6, 1, 5),
    FACE100(100, 5, 96);

    private int nbFaces;
    private int tauxReussiteCritique;
    private int tauxEchecCritique;

    private DesEnum(int nbFaces, int txReuCrit, int txEcCrit) {
        this.nbFaces = nbFaces;
        this.tauxReussiteCritique = txReuCrit;
        this.tauxEchecCritique = txEcCrit;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int getTauxReussiteCritique() {
        return tauxReussiteCritique;
    }

    public int getTauxEchecCritique() {
        return tauxEchecCritique;
    }
}
