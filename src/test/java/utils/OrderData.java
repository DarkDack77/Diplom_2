package utils;

import io.qameta.allure.Step;
import model.Order;

import java.util.Collections;
import java.util.List;

public class OrderData {

    @Step("Создание заказа с валидными ингредиентами")
    public static Order getOrderWithIngredients() {
        return new Order(List.of(
                "61c0c5a71d1f82001bdaaa6d",
                "61c0c5a71d1f82001bdaaa6f"
        ));
    }

    @Step("Создание заказа без ингредиентов")
    public static Order getEmptyOrder() {
        return new Order(null);
    }

    @Step("Создание заказа с невалидным ингредиентом")
    public static Order getOrderWithInvalidIngredients() {
        return new Order(Collections.singletonList("invalid"));
    }
}