using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Objetos01
{
    class Program
    {
        static void Main(string[] args)
        {
            //Crear objetos de la clase Jugador
            Jugador j1 = new Jugador();
            //Mostrar por consola info de este jugador
            Console.WriteLine("Nombre : " + j1.getNombre());
            Console.WriteLine("Goles : " + j1.goles);
            Console.ReadLine();
        }
    }
}
