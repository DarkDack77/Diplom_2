package utils;

import io.qameta.allure.Step;
import model.User;

import java.util.UUID;

public class UserData {

    @Step("Генерация данных для уникального пользователя")
    public static User getUniqueUser() {
        return new User(
                generateEmail(),
                "password123",
                "Test User"
        );
    }

    @Step("Генерация пользователя без email")
    public static User getUserWithoutEmail() {
        return new User(
                null,
                "password123",
                "Test User"
        );
    }

    @Step("Генерация пользователя без password")
    public static User getUserWithoutPassword() {
        return new User(
                generateEmail(),
                null,
                "Test User"
        );
    }

    @Step("Генерация пользователя без name")
    public static User getUserWithoutName() {
        return new User(
                generateEmail(),
                "password123",
                null
        );
    }

    private static String generateEmail() {
        return "test_" + UUID.randomUUID() + "@yandex.ru";
    }
}