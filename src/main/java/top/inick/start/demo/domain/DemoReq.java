package top.inick.start.demo.domain;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoReq {
	
	@NotBlank(message="code不能为空")
	String code;
	
	@Length(max=10, message="name长度不能大于10")
	String name;
}
