/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.mantenimientoTPI.acceso;

import javax.ejb.Local;
import ues.edu.sv.mantenimientoLib.Peticion;

/**
 *
 * @author esperanza
 */
@Local
public interface PeticionFacadeLocal extends AbstractFacadeInterface<Peticion>{

   
    
    List<Peticion> findRange(int lower, int higher);
    
    List<Peticion> findByName(String nombre);
    
}
