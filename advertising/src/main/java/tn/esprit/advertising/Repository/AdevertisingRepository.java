package tn.esprit.advertising.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.advertising.Entities.Advertising;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public interface AdevertisingRepository extends JpaRepository<Advertising, Long> {
    List<Advertising> findByStartDateBetweenAndEndDateBetween(LocalDate startDate1, LocalDate endDate1, LocalDate startDate2, LocalDate endDate2);
    List<Advertising> findByStartDateBetween(Date start, Date end);
    List<Advertising> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(Date startDate, Date endDate);

}
