package com.example.myapplication26;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.view.View;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


    public class Dal extends SQLiteAssetHelper {

        public Dal(Context context){
            super(context, "my_db_contacts.db" , null , 1);
        }
        public void addContact(String name, String email, String password, int age, int weight){
            SQLiteDatabase db = getWritableDatabase();
            String sql_INSERT = "INSERT INTO contacts (name ,email ,password , age ,weight) values(?,?,?,?,?)";
            SQLiteStatement statement = db.compileStatement(sql_INSERT);

            statement.bindString(1, name);
            statement.bindString(2, email);
            statement.bindString(3, password);
            statement.bindLong(4, age);
            statement.bindLong(5, weight);
            statement.execute();
        }

        public void addBoard_list(String date, String time, String train){
            SQLiteDatabase db = getWritableDatabase();
            String sql_INSERT = "INSERT INTO board_list ( date, time, train) values(?,?,?)";
            SQLiteStatement statement = db.compileStatement(sql_INSERT);
            statement.bindString(1, date);
            statement.bindString(2, time);
            statement.bindString(3, train);
            statement.execute();
        }

       // public void Getboard_list()//

    }




