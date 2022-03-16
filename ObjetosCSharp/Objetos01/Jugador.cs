using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Objetos01
{
    class Jugador
    {
        private String nombre;
        public int goles;
        public String equipo;

        //Métodos de acceso

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }

        public String getNombre()
        {
            return nombre;
        }


    }
}
