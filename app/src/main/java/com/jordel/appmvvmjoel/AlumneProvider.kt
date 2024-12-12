package com.jordel.appmvvmjoel

class AlumneProvider {
    companion object {
        fun getAlumnesPorEdat(edat: String): List<AlumnesModel> {
            val listaActual = alumnes.filter { it.edat == "25" }
            return alumnes.filter { it.edat == edat }
        }

        private val alumnes = listOf(
            AlumnesModel(
                nom = "Joel",
                edat = "19"
            ),
            AlumnesModel(
                nom = "Maria",
                edat = "20"
            ),
            AlumnesModel(
                nom = "Pepe",
                edat = "25"
            ),
            AlumnesModel(
                nom = "Juan",
                edat = "22"
            ),
            AlumnesModel(
                nom = "Luis",
                edat = "23"
            ),
            AlumnesModel(
                nom = "Carlos",
                edat = "25"
            ),
            AlumnesModel(
                nom = "Jose",
                edat = "25"
            ),
            AlumnesModel(
                nom = "Antonio",
                edat = "25"
            )
        )
    }
}