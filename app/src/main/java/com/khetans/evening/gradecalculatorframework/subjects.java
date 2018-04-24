package com.khetans.evening.gradecalculatorframework;

import java.io.Serializable;

/**
 * Created by Laptop on 07-07-2015.
 */
public class subjects{
    private String id;
    public String name;
    public String code;
    public int credit;

    public subjects(String name, String code, int credit){
        this.name = name;
        this.code = code;
        this.credit = credit;
    }


  /*  public class User {
        public String name;
        public String hometown;

        public User(String name, String hometown) {
            this.name = name;
            this.hometown = hometown;
        }
    }*/






   /* public void setName(char[] name){
        this.name = name;
    }

    public char[] getName(){
        return this.name;
    }


    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public int getCredit(){
        return this.credit;
    }*/

    public String getId(){
        return this.id;
    }

   }

