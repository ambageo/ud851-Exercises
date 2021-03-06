package com.example.android.todolist.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

// completed (2) Annotate the class with Entity. Use "task" for the table name
// Entity represents a single row of data in the table.
// We can also name the table with the tableName attribute
@Entity(tableName = "task")
public class TaskEntry {

    // completed (3) Annotate the id as PrimaryKey. Set autoGenerate to true.
    // It is mandatory to declare a PrimaryKey. With autoGenerate set to true we let the database to
    // automatically assign a different id to each row
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String description;
    private int priority;
    private Date updatedAt;

    // completed (4) Use the Ignore annotation so Room knows that it has to use the other constructor instead
    // Room will use the second constructor (the one with the id) to create a TaskEntry object.
    @Ignore
    public TaskEntry(String description, int priority, Date updatedAt) {
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
    }

    public TaskEntry(int id, String description, int priority, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
