package com.bling.service;

import com.bling.common.ServerResponse;
import com.bling.pojo.User;

/**
 * Created by leinan
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<User> checkUsername(String username);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);
}
