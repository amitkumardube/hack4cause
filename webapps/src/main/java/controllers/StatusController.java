package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import utils.DatabaseUtil;

import java.sql.SQLException;

@RestController
public class StatusController {

    @RequestMapping("/")
    public String status() {
        return "{\"status\": \"UP\"}";
    }

    @GetMapping("/database")
    public String databaseStatus() {
        try {
            boolean databaseIsUp = new DatabaseUtil().tryConnect();
            return "{\"status\": \"DATABASE UP\"}";
        } catch (Exception e) {
            return "{\"status\": \"DATABASE DOWN\"}";
        }
    }

}
