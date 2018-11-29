/**
 * @author 王少刚
 * @create 2018-11-29 20:53
 */
package com.example.mybatis_spring.pojo;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String sex;
	private Date birthday;
	private String address;
}
