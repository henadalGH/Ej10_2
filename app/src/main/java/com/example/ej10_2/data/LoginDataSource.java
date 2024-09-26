package com.example.ej10_2.data;

import com.example.ej10_2.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password)
    {

        try {
            // TODO: handle loggedInUser authentication
            if(username.equals("hernan") && password.equals("nadal")){
                LoggedInUser fakeUser =
                        new LoggedInUser(java.util.UUID.randomUUID().toString(), "hernan nadal");
                return new Result.Success<>(fakeUser);
            } else {
                return null;
            }
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}