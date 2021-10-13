package com.speedrun.appsb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class tabla1 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer REGid;
    private Integer REGIdentifica;
    private String REGNombres;
    private String REGApellidos;
    private String REGCorreo;
    private Integer REGMovil;
    private String REGDireccion;
    private Integer REGMunicipio;
    //getter setter REGid
    public Integer getREGid(){
        return REGid;
    }
    public void setREGid(Integer REGid){
        this.REGid=REGid;
    }
    //getter setter REGNombres
    public Integer getREGIdentifica(){
        return REGIdentifica;
    }
    public void setREGIdentifica(Integer REGIdentifica){
        this.REGIdentifica=REGIdentifica;
    }
    //getter setter REGNombres
    public String getREGNombres(){
        return REGNombres;
    }
    public void setREGNombres(String REGNombres){
        this.REGNombres=REGNombres;
    }
    //getter setter REGApellidos
    public String getREGApellidos(){
        return REGApellidos;
    }
    public void setREGApellidos(String REGApellidos){
        this.REGApellidos=REGApellidos;
    }
    //getter setter REGCorreo
    public String getREGCorreo(){
        return REGCorreo;
    }
    public void setREGCorreo(String REGCorreo){
        this.REGCorreo=REGCorreo;
    }
    //getter setter REGMovil
    public Integer getREGMovil(){
        return REGMovil;
    }
    public void setREGMovil(Integer REGMovil){
        this.REGMovil=REGMovil;
    }
    //getter setter REGDireccion
    public String getREGDireccion(){
        return REGDireccion;
    }
    public void setREGDireccion(String REGDireccion){
        this.REGDireccion=REGDireccion;
    }
    //getter setter REGMunicipio
    public Integer getREGMunicipio(){
        return REGMunicipio;
    }
    public void setREGMunicipio(Integer REGMunicipio){
        this.REGMunicipio=REGMunicipio;
    }
}
