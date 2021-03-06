/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.mantenimientotpi.acceso;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.mantenimientolib.DetallePeticion;

/**
 *
 * @author esperanza
 */
@Local
public interface DetallePeticionFacadeLocal extends AbstractFacadeInterface<DetallePeticion>{
    
    List<DetallePeticion> findRange(int lower, int higher);
    
    List<DetallePeticion> findByName(String nombre);
    
}
