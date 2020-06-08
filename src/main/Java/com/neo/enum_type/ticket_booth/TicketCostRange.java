package com.neo.enum_type.ticket_booth;

// All constants for ticket prices
enum TicketCostRange {
    // Note: The values that are assigned to constants are not final
    MINOR_TICKET_COST(17), ADULT_TICKET_COST(40), SENIOR_TICKET_COST(25);

    private final int ticketCost;

    private TicketCostRange(int cost) {
        this.ticketCost = cost;
    }

    public int getTicketCost() {
        return ticketCost;
    }
}

