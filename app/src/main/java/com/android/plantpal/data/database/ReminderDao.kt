package com.android.plantpal.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.android.plantpal.data.remote.ReminderEntity

@Dao
interface ReminderDao {

    @Insert
    suspend fun insert(reminder: ReminderEntity)

    @Query("SELECT * FROM reminder_table ORDER BY time DESC")
    fun getAllReminders(): LiveData<List<ReminderEntity>>

    @Update
    suspend fun updateReminder(reminder: ReminderEntity)

    @Delete
    suspend fun deleteReminder(reminder: ReminderEntity)

    @Query("UPDATE reminder_table SET isDone = :status WHERE id = :reminderId")
    suspend fun updateIsDone(reminderId: Long, status: Boolean)

    @Query("SELECT * FROM reminder_table WHERE plantId = :plantId")
    fun getRemindersForPlant(plantId: Int): List<ReminderEntity>

}
