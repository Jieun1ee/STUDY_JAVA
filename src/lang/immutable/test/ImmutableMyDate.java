package lang.immutable.test;

import lang.immutable.change.ImmutableObj;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int NewMonth) {
        return new ImmutableMyDate(year, NewMonth, day);
    }

    public ImmutableMyDate withDay(int NewDay) {
        return new ImmutableMyDate(year, month, NewDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
