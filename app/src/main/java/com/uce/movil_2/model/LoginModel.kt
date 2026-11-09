package com.uce.movil_2.model

class LoginModel {

    fun checklogin(username:String , password: String): Boolean{
        return  username=="admin" && password=="admin"
    }
}