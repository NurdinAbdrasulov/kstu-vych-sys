package kg.kstu.lb.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum CashRegisterStatus {
    ACTIVE("Активна"),
    PAUSE("На паузе, т.к. не оплатил"),
    SWITCHED_OFF("Отключена пользователем"),
    REMOVED("Снята с регистрации"),
    ;


    String description;
}
