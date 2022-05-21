/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat3Polimorphisme;

/**
 *
 * @author mimbu
 */
public class Staff extends Pegawai{
    private static final int gajiStaf=50_000;
    private static final int bonusStaf=10_000;

    @Override
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }

}