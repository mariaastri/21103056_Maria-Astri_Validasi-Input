/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package crudmahasiswasederhana.interfc;

import crudmahasiswasederhana.models.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
import java.sql.SQLException;
public interface Mahasiswainterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    
    void update (Mahasiswa o) throws SQLException;
    
    void delete (String nim) throws SQLException;
    
    List<Mahasiswa> getAll() throws SQLException;
}
