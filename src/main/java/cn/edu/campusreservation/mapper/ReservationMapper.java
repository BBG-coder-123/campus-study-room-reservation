package cn.edu.campusreservation.mapper;

import cn.edu.campusreservation.entity.Reservation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper extends BaseMapper<Reservation> {
}
