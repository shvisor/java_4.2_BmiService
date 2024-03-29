public class BmiService {
    /**
     * Расчет индекса массы тела
     * @param height рост в метрах. Тип double, чтоб в промежуточных расчетах не было округления иначе результат улетает
     * @param weight вес в килограммах
     * @return индекс массы тела приведенный к типу int
     */
    public int calculate(double height, int weight) {
        int index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}