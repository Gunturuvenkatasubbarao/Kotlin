package com.ltts.student_information.DAO

import androidx.room.*
import androidx.room.Dao

import com.ltts.student_information.Registration.Reg

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(registration: Reg)

    @Query("select * from registration where email=:email and password=:pass")
    fun checkLogin(email:String,pass:String):List<Any> ;

    @Query("select * from registration where _id=:id")
    fun fetchUser(id:Int):Reg;

    @Delete
    fun deleteUser(registration:Reg):Int
}