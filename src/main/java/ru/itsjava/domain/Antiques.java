package ru.itsjava.domain;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Antiques {
    private final String name;
    private final String author;
}
