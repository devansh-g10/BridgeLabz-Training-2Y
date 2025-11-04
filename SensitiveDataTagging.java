interface SensitiveData {}  // custom marker

class UserData implements SensitiveData {
    String name;
    String password;
}
