public abstract class Figura {

    protected int numeroLados;

    public Figura() {
        this.numeroLados = 0; 
    }

    public abstract float area();

    public int getNumeroLados() {
        return numeroLados;
    }
}
