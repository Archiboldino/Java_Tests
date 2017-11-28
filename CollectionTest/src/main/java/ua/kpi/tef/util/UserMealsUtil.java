package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2016, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 600)
        );
        List<UserMealWithExceed> filteredWithExceeded = getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);
        filteredWithExceeded.forEach(System.out::println);
//        .toLocalDate();
//        .toLocalTime();


    }

    public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        List<UserMealWithExceed> res = new ArrayList<>();
        Map<LocalDate, Integer> caloriesForDays = new HashMap<>();

        for (UserMeal meal : mealList) {
            LocalDate mealDate = LocalDate.from(meal.getDateTime());

            caloriesForDays.putIfAbsent(mealDate, 0);
            int newCalories = caloriesForDays.get(mealDate) + meal.getCalories();
            caloriesForDays.put(mealDate, newCalories);
        }

        for (UserMeal meal : mealList) {
            if (TimeUtil.isBetween(LocalTime.from(meal.getDateTime()), startTime, endTime)) {
                boolean exceed = caloriesForDays.get(LocalDate.from(meal.getDateTime())) > caloriesPerDay;
                UserMealWithExceed mealWithExceed = new UserMealWithExceed(meal.getDateTime(), meal.getDescription(), meal.getCalories(), exceed);
                res.add(mealWithExceed);
            }
        }

        return res;
    }
}
