package com.example.myapplication26;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Contact {

        private long id;
        private String name;
        private String email;
        private String password;
        private int age;
        private int weight;

        public Contact(long id, String name, String email, String password, int age, int weight)
        {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
            this.age = age;
            this.weight = weight;
        }
        public Contact()
        {}
        public long getId(){
            return id;
        }
        public void setId(long id){
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getEmail(){
            return name;
        }
        public void setEmail(String name){
            this.name = name;
        }
        public String getPassword(){
            return name;
        }
        public void setPassword(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }

        public int getweight() {
            return weight;
        }

        public void setweight(int weight) {
            this.weight = weight;
        }
        @Override
        public String toString() {
            return "Contact{ " +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", passwarod='" +password+ '\'' +
                    ",age='" + age + '\'' +
                    ",weight='" + weight + '\'' + '}';
            }
        }



