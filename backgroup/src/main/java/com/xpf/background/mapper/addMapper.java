package com.xpf.background.mapper;

import com.xpf.background.domain.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface addMapper {
    List<Address> list();
}
