package com.example.dumon.carteiradeclientes.database;

/**
 * Created by dumon on 16/03/18.
 */

public class ScriptDDL {

    public static String getCreateTableCliente(){

        StringBuilder sql =  new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("    CODIGO INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,");
        sql.append("    NOME VARCHAR (250) DEFAULT ('') NOT NULL,");
        sql.append("    ENDERECO VARCHAR (255) DEFAULT ('') NOT NULL,");
        sql.append("    EMAIL VARCHAR (200) DEFAULT ('') NOT NULL,");
        sql.append("    TELEFONE VARCHAR (20) DEFAULT ('')  NOT NULL )");

        return sql.toString();
    }

}








