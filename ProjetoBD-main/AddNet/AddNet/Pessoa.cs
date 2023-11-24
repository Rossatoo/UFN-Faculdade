using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddNet
{
    internal class Pessoa
    {
        public int id;
        public String nome;
        public int idade;

        public bool gravar()
        {
            Banco bd = new Banco();
            SqlConnection cn = bd.abrirConexao();
            SqlTransaction tran = cn.BeginTransaction();

            SqlCommand comando = new SqlCommand();
            comando.Connection = cn;
            comando.Transaction= tran;  
            comando.CommandType = System.Data.CommandType.Text;
            comando.CommandText = "insert into pessoa values (@nome, @idade)";
            comando.Parameters.Add("@nome", System.Data.SqlDbType.VarChar);
            comando.Parameters.Add("@idade", System.Data.SqlDbType.Int);
            comando.Parameters[0].Value = nome;
            comando.Parameters[1].Value = idade;

            try
            {
                comando.ExecuteNonQuery();
                tran.Commit();
                return true;
            }
            catch (Exception)
            {

                tran.Rollback();
                return false;
            }

            finally
            {
                cn.Close();
            }

        }

        public bool deletar()
        {
            Banco bd = new Banco();
            SqlConnection cn = bd.abrirConexao();
            SqlTransaction tran = cn.BeginTransaction();

            SqlCommand comando = new SqlCommand();
            comando.Connection = cn;
            comando.Transaction = tran;
            comando.CommandType = System.Data.CommandType.Text;
            comando.CommandText = "delete pessoa where id = @id";
            comando.Parameters.Add("@id", System.Data.SqlDbType.Int);
            comando.Parameters[0].Value = id;

            try
            {
                comando.ExecuteNonQuery();
                tran.Commit();
                return true;
            }
            catch (Exception)
            {

                tran.Rollback();
                return false;
            }

            finally
            {
                cn.Close();
            }


        }

    }
}
