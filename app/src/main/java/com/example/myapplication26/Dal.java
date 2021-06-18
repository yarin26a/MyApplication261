package com.example.myapplication26;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import android.view.View;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


    public class Dal extends SQLiteAssetHelper {


        public Dal(Context context){
            super(context, "my_db_contacts.db" , null , 1);
        }
        public boolean addContact(String name, String email, String password, int age, int weight){
            SQLiteDatabase db = getWritableDatabase();

            String st = "select * from contacts where email =\"" + email + "\"" ;
            Cursor cursor = db.rawQuery(st, null);
            if(cursor.getCount() == 0) {
                String sql_INSERT = "INSERT INTO contacts (name ,email ,password , age ,weight) values(?,?,?,?,?)";
                SQLiteStatement statement = db.compileStatement(sql_INSERT);

                statement.bindString(1, name);
                statement.bindString(2, email);
                statement.bindString(3, password);
                statement.bindLong(4, age);
                statement.bindLong(5, weight);
                statement.execute();
                return true;
            }
            return false;
        }

        public void addBoard_list(String date, String time, String train, int contactid){
            SQLiteDatabase db = getWritableDatabase();
            String sql_INSERT = "INSERT INTO board_list ( date, time, train, contactid) values(?,?,?,?)";
            SQLiteStatement statement = db.compileStatement(sql_INSERT);
            statement.bindString(1, date);
            statement.bindString(2, time);
            statement.bindString(3, train);
            statement.bindLong(4, contactid);
            statement.execute();
        }

        public boolean login(String email, String password)
        {
            SQLiteDatabase db = this.getWritableDatabase();

            String st = "select * from contacts where email=\"" + email + "\" and password=\"" + password +"\"";
            Cursor cursor = db.rawQuery(st, null);

            return cursor.getCount() != 0; // Check if user exists
        }
        //public void Getboard_list()//

        public Contact Getcontactinfo(String email)
        {
            SQLiteDatabase db = this.getWritableDatabase();

            String st = "select * from contacts where email=\"" + email +"\"";
            Cursor cursor = db.rawQuery(st, null);
            Contact c = new Contact();
            Log.i("yarin",String.valueOf(cursor.getCount()));
            Log.i("yarin", st);
            if (cursor.moveToFirst()){

                c.setName(cursor.getString(cursor.getColumnIndex("name")));
                c.setAge(cursor.getInt(cursor.getColumnIndex("age")));
                c.setweight(cursor.getInt(cursor.getColumnIndex("weight")));
                c.setId(cursor.getInt(cursor.getColumnIndex("_id")));

            }
            return c;
        }

        public int Gettrain(int id)
        {
            SQLiteDatabase db = this.getWritableDatabase();
            String st = "select * from board_list where contactid= "+id;
            Cursor cursor = db.rawQuery(st, null);
            return cursor.getCount();

        }

    }




