/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.mantenimientotpi.acceso;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.mantenimientolib.Marca;

/**
 *
 * @author esperanza
 */
@Local
public interface MarcaFacadeLocal extends AbstractFacadeInterface<Marca>{

    
    
    List<Marca> findRange(int lower, int higher);
    
    List<Marca> findByName(String nombre);
    
}
