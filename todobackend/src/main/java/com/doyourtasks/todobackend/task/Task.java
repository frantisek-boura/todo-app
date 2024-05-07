package com.doyourtasks.todobackend.task;

import java.time.LocalDateTime;

public record Task(
        Integer id,
        String title,
        LocalDateTime startsOn,
        LocalDateTime endsOn,
        TaskCategory category,
        TaskStatus status
) {
}
