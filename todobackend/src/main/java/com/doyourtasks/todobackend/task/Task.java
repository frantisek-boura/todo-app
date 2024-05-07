package com.doyourtasks.todobackend.task;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Task(
        @Id
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startsOn,
        LocalDateTime endsOn,
        @NotEmpty
        TaskCategory category,
        @NotEmpty
        TaskStatus status
) {

    public Task {
        if (!endsOn.isAfter(startsOn)) {
            throw new IllegalArgumentException("Task end time must be after task start time");
        }
    }

}
