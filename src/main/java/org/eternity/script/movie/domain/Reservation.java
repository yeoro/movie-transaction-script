package org.eternity.script.movie.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor
@Getter @Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long screeningId;
    private Integer audienceCount;
    private Long fee;

    public Reservation(Long customerId, Long screeningId, Integer audienceCount, Long fee) {
        this.customerId = customerId;
        this.screeningId = screeningId;
        this.audienceCount = audienceCount;
        this.fee = fee;
    }
}
