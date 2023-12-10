import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterVM : ViewModel() {
    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val userType = MutableLiveData<String>()

    private val _registrationResult = MutableLiveData<Boolean>()
    val registrationResult: LiveData<Boolean> = _registrationResult

    fun register() {
        // Implement Firebase authentication logic here
        // Use email.value, password.value, and userType.value

        // On successful registration, set _registrationResult to true
        _registrationResult.value = true
    }
}