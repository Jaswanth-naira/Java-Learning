package app;

public class PhonePlan
{
    private final ChargeRule weekdayRule;
    private final ChargeRule weekendRule;

    public PhonePlan(ChargeRule weekdayRule, ChargeRule weekendRule)
    {
        this.weekdayRule = weekdayRule;
        this.weekendRule = weekendRule;
    }

    public int charge(int minutes, int messages, boolean isWeekend)
    {
        if (isWeekend)
        {
            return weekendRule.calculate(minutes, messages);
        }
        return weekdayRule.calculate(minutes, messages);
    }
}