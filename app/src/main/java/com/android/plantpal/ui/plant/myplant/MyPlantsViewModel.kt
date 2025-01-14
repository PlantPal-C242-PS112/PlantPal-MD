package com.android.plantpal.ui.plant.myplant

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.android.plantpal.data.Repository
import com.android.plantpal.data.remote.response.UserPlant
import com.android.plantpal.ui.utils.Result

class MyPlantsViewModel(private val repository: Repository) : ViewModel() {

    fun getUserPlants(): LiveData<Result<List<UserPlant>>> {
        return repository.getUserPlants()
    }

}
