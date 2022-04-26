/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.lp2soft.negocio.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.lp2soft.config.DBManager;
import pe.edu.pucp.lp2soft.negocio.dao.PromocionDAO;
import pe.edu.pucp.lp2soft.negocio.model.Promocion;

/**
 *
 * Jhosep Huaricallo Quispe
 * 20170398
 */
public class PromocionMySQL implements PromocionDAO{
    private Connection con; 
    private CallableStatement cs;
    private ResultSet rs;

    @Override
    public int insertar(Promocion promocion) {
        int resultado = 0;
        try{
            con= DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_PROMOCION(?,?,?,?,?)}");
            cs.registerOutParameter("_id_comida", java.sql.Types.INTEGER);
            cs.setString("_nombre", promocion.getNombre());
            cs.setDouble("_precio", comida.getPrecio());
            cs.setString("_descripcion", comida.getDescripcion());
            cs.setBoolean("_descripcion", comida.isEstado());
            cs.executeUpdate();
            comida.setIdComida(cs.getInt("_id_area"));
            comida.setIdItemVendible(cs.getInt("_id_area"));
            comida.setIdProducto(cs.getInt("_id_area"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex)
            {System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Promocion promocion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(int idPromocion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Promocion> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
