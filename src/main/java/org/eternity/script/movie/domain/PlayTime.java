package org.eternity.script.movie.domain;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.DayOfWeek;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
public class PlayTime {

    private DayOfWeek dayOfWeek;

    @AttributeOverrides(
            value = {
                    @AttributeOverride(
                            name = "startTime",
                            column = @Column(name = "start_datetime")
                    ),
                    @AttributeOverride(
                            name = "entTime",
                            column = @Column(name = "end_datetime")
                    ),
            }
    )
    private TimeInterval interval;
}
