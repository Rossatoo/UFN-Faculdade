using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddNet
{
    internal class Banco
    {
        private String conec = "Data Source=localhost;Initial Catalog=adonet;User ID=usuario;password=senha1234;Language=Portuguese";

        private SqlConnection cn;

        private void conexao()
        {
            cn = new SqlConnection(conec);
        }

        public SqlConnection abrirConexao()
        {
            try
            {
                conexao();
                cn.Open();

                return cn;
            }
            catch (Exception ex)
            {

                return null;
            }
        }

        public DataTable executaConsulta(String sql)
        {
            try
            {
                abrirConexao();
                
                SqlCommand comando = new SqlCommand(sql, cn);
                comando.ExecuteNonQuery();

                SqlDataAdapter adapter = new SqlDataAdapter(comando);
                DataTable dt = new DataTable();

                adapter.Fill(dt);
                return dt;           
             }
            catch (Exception)
            {

                return null;
            }

            finally
            {
                cn.Close();
            }
        }
    }
}

       

    

