package com.lsd.laboratorio3

import java.io.Serializable

class Postulante : Serializable {
    var nombre:String? = null
    var apellidoP:String? = null
    var apellidoM:String? = null
    var fechaN:String? = null
    var colegio:String? = null
    var carrera:String? = null

    constructor(_nombre:String,_apellidoP:String,_apellidoM: String, _fechaN:String,_colegio:String,_carrera:String){
        nombre = _nombre
        apellidoP = _apellidoP
        apellidoM = _apellidoM
        fechaN = _fechaN
        colegio = _colegio
        carrera = _carrera
    }
}