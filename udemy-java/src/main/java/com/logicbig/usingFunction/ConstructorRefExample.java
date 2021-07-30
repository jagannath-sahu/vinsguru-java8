package com.logicbig.usingFunction;

import com.logicbig.service.DataService;
import com.logicbig.service.UserInfo;
import com.logicbig.service.UserRenderer;

import java.util.List;
import java.util.function.Function;

/**
 * Here we improved our TypeRefExample by separating the renderer logic.
 */

public class ConstructorRefExample {

    public static void main(String[] args) {
        DataService dataService = new DataService();
        List<UserInfo> userInfoList = dataService.getAllUserInfoList();
        //using constructor ref
        displayUser(userInfoList, UserRenderer::new);
    }

    private static void displayUser(List<UserInfo> userInfoList, Function<UserInfo, UserRenderer> rendererFunction) {
        userInfoList.forEach(u -> rendererFunction.apply(u).renderUserInfo());

    }
}