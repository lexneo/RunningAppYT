package com.androiddevs.runningappyt.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

/*dodao exportScheme = false zbog warning: Schema export directory is not provided to the annotation processor so we cannot export the schema.
 You can either provide `room.schemaLocation` annotation processor argument OR set exportSchema to false.
public abstract class RunningDatabase extends androidx.room.RoomDatabase */
@Database(
    entities = [Run::class],
    version = 1,
    exportSchema = false
)

@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase(){

    abstract fun getRunDao() : RunDAO
}