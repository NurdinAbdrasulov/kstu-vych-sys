package kg.kstu.lb.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class UpsertService {
    private String name;
    private BigDecimal price;
    private String description;
    private Integer priority;
    private Integer activityPeriod;
    private String enableCommand;
    private String disableCommand;
    private String suspendCommand;
}
