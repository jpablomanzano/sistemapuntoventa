/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.vhabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fhabitacion {

    private conexion mysql= new conexion ();
    private Connection cn = mysql.conectar();
    private String sSQL ="";
    public Integer totalregistros;

    public DefaultTableModel mostrar (String buscar){
        DefaultTableModel modelo;
        String [] titulos = {"ID", "Número","Piso", "Descripción", "Características", "Precio", "Estado", "Tipo Habitación"};

        String [] registro = new String [8];

        totalregistros = 0;

        modelo = new DefaultTableModel (null, titulos);

        sSQL = "Select * from habitacion where piso like '% "+ buscar + "% ' order by idhabitacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);

            while (rs.next()){
                registro [0]=rs.getString("idhabitacion");
                registro [1]=rs.getString("numero_habitacion");
                registro [2]=rs.getString("piso");
                registro [3]=rs.getString("descripcion");
                registro [4]=rs.getString("caracteristicas");
                registro [5]=rs.getString("preciodiario_habitacion");
                registro [6]=rs.getString("estado");
                registro [7]=rs.getString("tipo_habitacion");

                totalregistros=totalregistros+1;
                modelo.addRow(registro);


            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar (vhabitacion dts) {
            sSQL = "insert into habitacion {numero_habitacion, piso, descripcion, caracteristicas, preciodiario_habitacion, estado, tipo_habitacion"+
                    "values (?,?,?,?,?,?,?)";
           try {

               PreparedStatement pst =cn.prepareStatement(sSQL);
               pst.setString(1, dts.getNumero_habitacion());
               pst.setString(2, dts.getPiso());
               pst.setString(3, dts.getDescripcion());
               pst.setString(4, dts.getCaracteristicas());
               pst.setDouble(5, dts.getPreciodiario_habitacion());
               pst.setString(6, dts.getEstado());
               pst.setString(7, dts.getTipo_habitacion());

               int n = pst.executeUpdate();

               if (n!=0){
                   return true;

               }
               else{
                   return false;
               }



           } catch (Exception e) {
               JOptionPane.showConfirmDialog(null, e);
               return false;
           }
    }


    public boolean editar (vhabitacion dts) {
           try {

           } catch (Exception e) {
               JOptionPane.showConfirmDialog(null, e);
           }


    }
    public boolean eliminar (vhabitacion dts) {
           try {

           } catch (Exception e) {
               JOptionPane.showConfirmDialog(null, e);
           }




    }
    
