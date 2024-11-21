package com.android.plantpal.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.android.plantpal.data.Repository
import com.android.plantpal.data.remote.RegisterRequest
import com.android.plantpal.data.remote.response.RegisterResponse
import com.android.plantpal.ui.utils.Result

class RegisterViewModel(private val repository: Repository) : ViewModel() {

    fun register (username: String, email: String, password: String, fullname: String): LiveData<Result<RegisterResponse>> {
        return repository.register(username, email, password, fullname)
    }
}