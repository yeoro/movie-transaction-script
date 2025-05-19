package org.eternity.script.movie.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.LocalTime;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter @Setter
public class TimeInterval {

    private LocalTime startTime;
    private LocalTime endTime;
}
