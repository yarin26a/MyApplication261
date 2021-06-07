package com.example.myapplication26;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.view.View;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


    public class Dal extends SQLiteAssetHelper {

        public Dal(Context context){
            super(context, " my_db_contacts.db" , null , 1);
        }
        public void addContact(String name, String email, String password, int age, int wheight){
            SQLiteDatabase db = getWritableDatabase();
            String sql_INSERT = "INSERT INTO contacts (name ,email ,password , age ,wheight) values(?,?,?,?,?)";
            SQLiteStatement statement = db.compileStatement(sql_INSERT);

            statement.bindString(1, name);
            statement.bindString(2, email);
            statement.bindString(3, password);
            statement.bindLong(4, age);
            statement.bindLong(5, wheight);
            statement.execute();
        }

      //  public void saveContactButtonListener(View v)//
      //  {//
         //   Dal dal = new Dal(this);
          //  dal.addContact(
           //         nameEditText.getText().toS
        //    );

      //  } //

    }




