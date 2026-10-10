package cn.edu.campusreservation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.campusreservation.mapper")
public class CampusReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusReservationApplication.class, args);
    }
}
