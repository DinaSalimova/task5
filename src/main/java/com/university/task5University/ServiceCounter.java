package com.university.task5University;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.time.LocalDateTime;

@Component
@Data
public class ServiceCounter {

    @Autowired
    InfoUserDAO infoUserDAO;
    private int count = 0;

    public String saveUserInfo() {
        int oldValue = count;
        count++;
        TableCounter tableCounter = new TableCounter();
        tableCounter.setCountValue(oldValue);
        tableCounter.setDateTime(LocalDateTime.now().toString());
        tableCounter.setClientInfo(InetAddress.getLoopbackAddress().getHostAddress());
        infoUserDAO.save(tableCounter);
        return tableCounter.toString();
    }
}
