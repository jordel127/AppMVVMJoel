package com.jordel.appmvvmjoel

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var _llistatAlumnes = mutableListOf<AlumnesModel>()
    val llistatAlumnes: List<AlumnesModel>
        get() = _llistatAlumnes

    private var _countEdat = ""
    val countEdat: String
        get() = _countEdat



    fun getAlumnesPorEdat(edat: String){
        val listaActual = AlumneProvider.getAlumnesPorEdat(edat)
        _llistatAlumnes.clear()
        _llistatAlumnes.addAll(listaActual)
    }

    fun getCantitatAlumnesPorEdat(edat: String){
        val listaActual = AlumneProvider.getAlumnesPorEdat(edat)
        _countEdat = listaActual.count().toString()
    }
}