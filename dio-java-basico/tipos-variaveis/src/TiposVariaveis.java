public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        final int BASE_SALARY = 1_000;
        final int MAX_EXTRA_HOURS = 10;
        double bonusPerHour = 125.25;
        double mySalaryWithMaxBonus = BASE_SALARY + (MAX_EXTRA_HOURS * bonusPerHour);

        System.out.println(mySalaryWithMaxBonus);
    }
}
