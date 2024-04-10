package ram.dev.crud.crud.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

@Data
public class StudentDto {
  private Long id;
  private String name;
  private String mobileNo;
  private String emailId;
}
