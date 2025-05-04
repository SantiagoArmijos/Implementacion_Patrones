package repository;

public class LugarInteres {
    private int id;
    private String nombre;
    private String descripcion;
    private String ubicacion;
    private String horario_atencion; // histórico, cultural, comercial, etc.

    public LugarInteres(int id, String nombre, String descripcion, String ubicacion, String horario_atencion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.horario_atencion = horario_atencion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getUbicacion() { return ubicacion; }
    public String gethorario_atencion() { return horario_atencion; }

    @Override
    public String toString() {
        return nombre + " - " + "\n" + descripcion + "\nUbicación: " + ubicacion;
    }
}
