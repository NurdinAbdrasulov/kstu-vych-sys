package kg.kstu.lb.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum TransactionType {
    TOP_UP("Пополнение"),
    WITHDRAWAL("Списание"),
    SERVICE_CHARGE("Оплата услуги"),
    REFUND("Возврат денежных средств"),
    CORRECTION("Корректировка баланса клиента"),
    OTHER("Другое"),
    ;

    String description;
}

