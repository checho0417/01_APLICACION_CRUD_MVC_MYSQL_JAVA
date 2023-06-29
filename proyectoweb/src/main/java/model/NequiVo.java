package model;


/*creacion de la clase vo del paquete model */
public class NequiVo {
    

/*Atributos de usuario */
private int idBolsillon;
private float saldoNe;
private float retiroNe;
private float recargaNe;
private int usuarioNe;
private string contrasenaNe;


/*METODOS CONSTRUCTOR CON PARAMETROS*/
public NequiVo(int idBolsillon, float saldoNe, float retiroNe, float recargaNe, int usuarioNe, string contrasenaNe) {
    this.idBolsillon = idBolsillon;
    this.saldoNe = saldoNe;
    this.retiroNe = retiroNe;
    this.recargaNe = recargaNe;
    this.usuarioNe = usuarioNe;
    this.contrasenaNe = contrasenaNe;
}

/*METODOS CONSTRUCTOR SIN PARAMETROS*/
public NequiVo() {
}

/*METODO ACCESORES */  

public int getIdBolsillon() {
    return idBolsillon;
}
public void setIdBolsillon(int idBolsillon) {
    this.idBolsillon = idBolsillon;
}
public float getSaldoNe() {
    return saldoNe;
}
public void setSaldoNe(float saldoNe) {
    this.saldoNe = saldoNe;
}
public float getRetiroNe() {
    return retiroNe;
}
public void setRetiroNe(float retiroNe) {
    this.retiroNe = retiroNe;
}
public float getRecargaNe() {
    return recargaNe;
}
public void setRecargaNe(float recargaNe) {
    this.recargaNe = recargaNe;
}
public int getUsuarioNe() {
    return usuarioNe;
}
public void setUsuarioNe(int usuarioNe) {
    this.usuarioNe = usuarioNe;
}
public string getContrasenaNe() {
    return contrasenaNe;
}
public void setContrasenaNe(string contrasenaNe) {
    this.contrasenaNe = contrasenaNe;
}
}




