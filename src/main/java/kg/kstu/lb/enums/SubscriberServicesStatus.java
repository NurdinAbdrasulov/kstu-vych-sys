package kg.kstu.lb.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum SubscriberServicesStatus {
    ACTIVE("Активна"),
    SUSPEND("На паузе"),
    DISABLED("Отключен"),
    ;


    String description;
}
