using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _01ObjetosConForm
{
    public partial class Form1 : Form
    {
        Serie s1;
        public Form1()
        {
            InitializeComponent();

        }

        private void btnGuardarSerie_Click(object sender, EventArgs e)
        {
            //Crear objeto Serie con los datos de las cajas de texto
            String titulo = txtTitulo.Text;
            float valoracion = Convert.ToSingle(txtValoracion.Text);

            s1 = new Serie(titulo, valoracion);

            s1.Titulo = "One piece";
            lblMostrarSerie.Text += " " + s1.Titulo;

        }
    }
}
