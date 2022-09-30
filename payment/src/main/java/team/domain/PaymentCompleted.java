package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentCompleted extends AbstractEvent {

    private Long id;
    private Long flowerId;
    private Date payDate;
    private String cardNo;
    private Long orderId;
    private Integer qty;
    private Double price;
    private String status;
    private Boolean isOffline;

    public PaymentCompleted(Payment aggregate){
        super(aggregate);
    }
    public PaymentCompleted(){
        super();
    }
}
