using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01ObjetosConForm
{
    class Serie
    {
        private String titulo;
        private float valoracion;

        //Propiedad
        public string Titulo { 
            get => titulo; 
            set => titulo = value; 
        }

        public Serie(String titulo,float valoracion)
        {
            this.Titulo = titulo;
            this.valoracion = valoracion;
        }

        
        public void setValoracion(float valoracion)
        {
            this.valoracion = valoracion;
        }

        public float getValoracion()
        {
            return valoracion;
        }
    }
}
