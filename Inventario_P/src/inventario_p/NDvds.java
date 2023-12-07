
package inventario_p;

public class NDvds {
    private String genero;
    private String nombre;
    private int cantidad;
    private int codigo;
    NDvds izquierda, derecha;

    public NDvds(String genero, String nombre, int cantidad, int codigo) {
        this.genero = genero;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
