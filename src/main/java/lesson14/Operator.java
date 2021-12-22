package lesson14;

public enum Operator {
    // Создаем операторов связи с пулами кодов (пулы выбраны случайно)
    MTS(900, 925, true),
    MEGAFON(926, 950, true),
    TELE2(951, 975, true),
    BEELINE(976, 999, true),
    CITY(812, 812, false);  // Городской код Санкт-Петербурга

    private int from;
    private int to;
    private boolean mobile;

    Operator(int from, int to, boolean mobile) {
        this.from = from;
        this.to = to;
        this.mobile = mobile;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public boolean isMobile() {
        return mobile;
    }
}
