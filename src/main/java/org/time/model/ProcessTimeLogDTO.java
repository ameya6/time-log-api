package org.time.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProcessTimeLogDTO {
    private UUID id;
    private Long startTimeNs;
    private Long endTimeNs;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String serviceName;
    private String hostName;
    private String ipAddress;
    private double processTime;
}
