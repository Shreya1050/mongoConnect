package org.example

import com.mongodb.ConnectionString
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document

class Resources {
    val connectionString = ConnectionString("mongodb://localhost:27017")
    val client = MongoClients.create(connectionString)
    val database: MongoDatabase = client.getDatabase("students")
    val collection: MongoCollection<Document> = database.getCollection("students.studentData")
}