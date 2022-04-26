package pe.edu.pucp.lp2soft.negocio.model;


public class ItemVendible {
    private int idItemVendible;
    private String nombre;
    private boolean estado; 
    private float precio;
    private String descripcion;

    public ItemVendible(String nombre, boolean estado, float precio, String descripcion) {
        this.nombre = nombre;
        this.estado = estado;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public int getIdItemVendible() {
        return idItemVendible;
    }

    public void setIdItemVendible(int idItemVendible) {
        this.idItemVendible = idItemVendible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
	
}
