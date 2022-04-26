package pe.edu.pucp.lp2soft.negocio.model;

import java.util.ArrayList;

public class Promocion extends ItemVendible{
    private int id_promocion;
    private ArrayList<LineaPromocion> lista_de_Comidas;//Incluye


    // SETTERS Y GETTERS ---------------------------------------------------
	public int getId_promocion(){
		return id_promocion;
	}
	public void setId_promocion(int id_promocion){
		this.id_promocion = id_promocion;
	}

    public ArrayList<LineaPromocion> getLista_de_Comidas() {
        return lista_de_Comidas;
    }
    
    public void setLista_de_Comidas(ArrayList<LineaPromocion> lista_de_Comidas) {
	this.lista_de_Comidas = lista_de_Comidas;
    }        
}
