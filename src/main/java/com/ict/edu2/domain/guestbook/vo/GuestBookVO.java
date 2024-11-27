package com.ict.edu2.domain.guestbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestBookVO {
  private String gb2_idx, gb2_name, gb2_subject, gb2_content, gb2_email, gb2_pw, gb2_f_name, gb2_regdate;
}
