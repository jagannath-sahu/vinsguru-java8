package com.logicbig.usingFunction;

import com.logicbig.service.DataService;
import com.logicbig.service.UserInfo;

import java.util.List;
import java.util.function.Function;

/**
 * Method reference on Class Type example
 * Here we have modified ObjectRefExample logic to make use of
 * method reference on class type. It's a better approach
 */


public class TypeRefExample {

    public static void main (String[] args) {
        DataService dataService = new DataService();
        List<UserInfo> userInfoList = dataService.getAllUserInfoList();
        //using Method reference on Class Type
        displayUserInfo(userInfoList, UserInfo::getDisplayInfo);
    }

    private static void displayUserInfo (List<UserInfo> userInfoList,
                                         Function<UserInfo, String> displayFunction) {
        for (UserInfo userInfo : userInfoList) {
            System.out.println(displayFunction.apply(userInfo));
            System.out.println("--------------------");
        }
    }
}