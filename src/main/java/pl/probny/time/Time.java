package pl.probny.time;

import com.codeborne.selenide.Selenide;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Time {

    public static void main(String[] args) {

        Time.howLongDoYouWantToWait(120);

    }

    private static void howLongDoYouWantToWait(long seconds) {
        Instant start = Instant.now();
        Instant startEnd = start.plusSeconds(seconds);
        System.out.println(String.format("Start at %s waiting for %s min.", start, TimeUnit.SECONDS.toMinutes(seconds)));
        while (Instant.now().toEpochMilli() < startEnd.toEpochMilli()) {
            Selenide.sleep(1000);
            System.out.printf("*");
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMinutes();
        System.out.println(String.format("\nFinish at %s stopped after %s min.", finish, timeElapsed));
    }

}

