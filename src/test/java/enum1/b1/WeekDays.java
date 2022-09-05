package enum1.b1;

enum WeekDays {
    SUNDAY("Sunday Funday", true),
    MONDAY("Marketing Monday"),
    TUESDAY("Trendy Tuesday"),
    WEDNESDAY("Wellness Wednesday"),
    THURSDAY("Thankful Thursday"),
    FRIDAY("Foodie Friday"),
    SATURDAY("Social Saturday", true);

    private String daysGreeting;
    private boolean isWeekend;

    WeekDays(final String daysGreeting) {
        this.daysGreeting = daysGreeting;
    }

    WeekDays(final String daysGreeting, final boolean isWeekend) {
        this(daysGreeting);
        this.isWeekend = isWeekend;
    }

    public String getDaysGreeting() {
        return daysGreeting;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}