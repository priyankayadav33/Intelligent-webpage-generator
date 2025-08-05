package com.priyanka.webgen.scheduler;

import com.priyanka.webgen.service.FacultyUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FacultyUpdateScheduler {

    @Autowired
    private FacultyUpdateService facultyUpdateService;

    // Runs every 6 hours (cron: second, minute, hour, day, month, weekday)
    @Scheduled(cron = "0 0 */6 * * *") 
    public void updateFacultyProfiles() {
        System.out.println("🔄 Running scheduled faculty update...");

        facultyUpdateService.updateAllFacultyProfiles();

        System.out.println("✅ Faculty update completed.");
    }
}
