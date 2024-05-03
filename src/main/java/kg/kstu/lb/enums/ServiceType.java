package kg.kstu.lb.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ServiceType {
    KKM("ккм"),
    INVOICE_AND_ETTN("эсф и эттн"),
    ;

    String description;

    public static ServiceType getByName(String name) {
        for (ServiceType serviceType : ServiceType.values()) {
            if (serviceType.name().equalsIgnoreCase(name)) {
                return serviceType;
            }
        }
        return null;
    }
}
