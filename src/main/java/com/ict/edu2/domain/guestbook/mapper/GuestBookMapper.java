package com.ict.edu2.domain.guestbook.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

@Mapper
public interface GuestBookMapper {

  // 간단한 DB의 쿼리 처리는 Mapper에서 가능
  @Select("select * from guestbook2 order by gb2_idx")
  public List<GuestBookVO> getGuestBookList();

  // xml에 가려면 메서드명이 id가 된다
  public GuestBookVO getGuestBookDetail(String gb2_idx);
}
