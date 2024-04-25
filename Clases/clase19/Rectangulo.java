public class Rectangulo extends Figura implements Perimetro {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        super();
        this.numeroLados = 4;
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }

    @Override
    public float area() {
        int largo = Math.abs(esquina1.getX() - esquina2.getX());
        int ancho = Math.abs(esquina1.getY() - esquina2.getY());
        return largo * ancho;
    }

    @Override
    public float imprimePerimetro() {
        int largo = Math.abs(esquina1.getX() - esquina2.getX());
        int ancho = Math.abs(esquina1.getY() - esquina2.getY());
        return 2 * (largo + ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo con area: " + area() + ", perimetro: " + imprimePerimetro() + ", y numero de lados: " + getNumeroLados();
    }
}
