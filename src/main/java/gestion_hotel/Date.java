package gestion_hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class Date {
    private LocalDateTime debut;
    private LocalDateTime fin;
}
