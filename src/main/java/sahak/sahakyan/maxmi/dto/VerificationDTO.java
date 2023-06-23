package sahak.sahakyan.maxmi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class VerificationDTO {
    private Integer number;
    private Long userId;
    private String code;
}
