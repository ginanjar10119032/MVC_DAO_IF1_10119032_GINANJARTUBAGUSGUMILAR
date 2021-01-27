/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ginanjartubagus.latihanmvcjdbc.event;

import id.ginanjartubagus.latihanmvcjdbc.entity.Pelanggan;
import id.ginanjartubagus.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Ginanjar
 * NIM : 10119032
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
}
