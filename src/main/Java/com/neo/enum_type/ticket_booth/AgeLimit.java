package com.neo.enum_type.ticket_booth;// Note: enums enforce type safety

// The limit and prices for minors and adults
enum AgeLimit {
    MINOR_MAX(17), ADULT_MAX(60);

    private final int ageLimit;

    private AgeLimit(int limit) {
        this.ageLimit = limit;
    }
}