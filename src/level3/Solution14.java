package level3;

import java.time.LocalDate;

public class Solution14 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2016,5,24);
        System.out.println(today.getDayOfWeek().toString().substring(0, 3));
    }
}
