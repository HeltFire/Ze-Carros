package com.mycompany.zecarros; // Substitua pelo seu pacote

import com.mongodb.client.MongoClient;

import com.mongodb.client.MongoClients;

import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoException;

public class MongoDBConnection {

// SUBSTITUA PELA SUA CONNECTION STRING DO MONGODB ATLAS
private static final String CONNECTION_STRING = "mongodb+srv://Admin:Et1glr1UcviUWgBj@zecarros.m9ljtds.mongodb.net/?retryWrites=true&w=majority&appName=ZeCarros";
private static final String DATABASE_NAME = "Zecarros"; // O mesmo nome de banco de dados da sua string de conexão

private static MongoClient mongoClient = null;

public static MongoDatabase getDatabase() {
    if (mongoClient == null) {
        try {
            // Cria um cliente MongoDB
            mongoClient = MongoClients.create(CONNECTION_STRING);
            System.out.println("Conexão com MongoDB Atlas estabelecida com sucesso!");
        } catch (MongoException e) {
            System.err.println("Erro ao conectar com o MongoDB Atlas: " + e.getMessage());
            e.printStackTrace();
            // Em uma aplicação real, você poderia lançar uma exceção personalizada ou tratar o erro de forma mais robusta
            return null;
        }
    }
    // Retorna o banco de dados específico
    return mongoClient.getDatabase(DATABASE_NAME);
}

public static void closeConnection() {
    if (mongoClient != null) {
        mongoClient.close();
        mongoClient = null;
        System.out.println("Conexão com MongoDB Atlas fechada.");
    }
}

// Método principal para testar a conexão (opcional)
public static void main(String[] args) {
    MongoDatabase database = getDatabase();
    if (database != null) {
        System.out.println("Conectado ao banco de dados: " + database.getName());
        // Você pode tentar listar coleções aqui para um teste mais completo
        // for (String name : database.listCollectionNames()) {
        //    System.out.println("Coleção encontrada: " + name);
        // }
        closeConnection();
    } else {
        System.out.println("Falha ao obter o banco de dados.");
    }
}
}