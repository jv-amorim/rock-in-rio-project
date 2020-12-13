/*
 * Projeto de conclusão das disciplinas de BD e POO (Ciência da Computação/IFNMG).
 */
package br.edu.ifnmg.rockinrio.dao;

import br.edu.ifnmg.rockinrio.entity.Endereco;
import br.edu.ifnmg.rockinrio.entity.Pessoa;
import br.edu.ifnmg.rockinrio.helper.LocalDateHelper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public final class PessoaDao {
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    private PessoaDao() { }
    //</editor-fold>
    
    public static Boolean inserir(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Pessoa obter(String cpfPessoa) {
        Pessoa pessoa = null;
        
        String sqlStatement = "SELECT * FROM PESSOA WHERE CPF=?";
        
        try (PreparedStatement pstmt =  DatabaseManager.getConnection().prepareStatement(sqlStatement)) {
            pstmt.setString(1, cpfPessoa);
            ResultSet resultSet = pstmt.executeQuery();
            pessoa = gerarObjeto(resultSet);
        }
	catch (Exception e) {
            // TODO - Exibir mensagem de erro.
            e.printStackTrace();
        }
        
        return pessoa;
    }

    public static ArrayList<Pessoa> obterTodos() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        String sqlStatement = "SELECT CPF, NOME FROM PESSOA";
        
        try (PreparedStatement pstmt =  DatabaseManager.getConnection().prepareStatement(sqlStatement)) {
            ResultSet resultSet = pstmt.executeQuery();
            pessoas = gerarObjetos(resultSet);
        }
	catch (Exception e) {
            // TODO - Exibir mensagem de erro.
            e.printStackTrace();
        }
        
        return pessoas;
    }
    
    private static Pessoa gerarObjeto(ResultSet resultSet) {
        Pessoa pessoa = null;

        try {
            resultSet.next();
            
            pessoa = new Pessoa(
                resultSet.getString("CPF"),
                resultSet.getString("NOME"),
                resultSet.getString("TIPOPESSOA"),
                LocalDateHelper.sqlDateToLocalDate(resultSet.getDate("DATANASCIMENTO")),
                new Endereco(
                    resultSet.getString("CEP"),
                    resultSet.getString("BAIRRO"),
                    resultSet.getString("RUA"),
                    resultSet.getInt("NUMERO")
                )
            );
        }
        catch (SQLException e) {
            // TODO - Exibir mensagem de erro.
            e.printStackTrace();
        }

        return pessoa;
    }

    private static ArrayList<Pessoa> gerarObjetos(ResultSet resultSet) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        try {
            while (resultSet.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setCpf(resultSet.getString("CPF"));
                pessoa.setNome(resultSet.getString("NOME"));
                pessoas.add(pessoa);
            }
        }
        catch (SQLException e) {
            // TODO - Exibir mensagem de erro.
            e.printStackTrace();
        }

        return pessoas;
    }
}