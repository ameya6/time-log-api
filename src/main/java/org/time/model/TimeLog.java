package org.time.model;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TimeLog(long startTimeNs,
                      LocalDateTime startTime,
                      long endTimeNs,
                      LocalDateTime endTime) {
    public static TimeLog of(long startTimeNs,
                             LocalDateTime startTime,
                             long endTimeNs,
                             LocalDateTime endTime) {
        return TimeLog.builder()
                .startTimeNs(startTimeNs)
                .startTime(startTime)
                .endTimeNs(endTimeNs)
                .endTime(endTime)
                .build();
    }
}
